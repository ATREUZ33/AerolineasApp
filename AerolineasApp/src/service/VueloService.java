package service;

import dao.IVueloDAO;
import entity.Vuelo;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class VueloService implements IVueloService {
    
    private IVueloDAO vuelodao;
    
    public VueloService(IVueloDAO vuelodao) {
        this.vuelodao = vuelodao;
    }

    public double calcularCosto(String destino) {
        switch (destino) {
            case "BOGOTÁ":
                return 860.00;
            case "CARACAS":
                return 1300.00;
            case "BUENOS AIRES":
                return 1250.00;
            case "SANTIAGO":
                return 900.00;
            default:
                return 0.00;
        }
    }

    public double calcularIncremento(double costo, LocalDate fechaViaje) {
        if (fechaViaje.getMonthValue() == 12) {
            return costo * 0.15;
        }
        return 0.00;
    }

    public double calcularDescuento(double costo, LocalDate fechaCompra) {
        DayOfWeek dia = fechaCompra.getDayOfWeek();
        if (dia == DayOfWeek.TUESDAY || dia == DayOfWeek.THURSDAY) {
            return costo * 0.05;
        }
        return 0.00;
    }

    public double calcularTotal(double costo, double descuento, double incremento, int cantidadBoletos) {
        return (costo - descuento + incremento) * cantidadBoletos;
    }
    
    @Override
    public void agregar(Vuelo vuelo) {
        double costo = calcularCosto(vuelo.getDestino());

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaViaje  = LocalDate.parse(vuelo.getFechaViaje(), formato);
        LocalDate fechaCompra = LocalDate.parse(vuelo.getFechaCompra(), formato);

        double incremento = calcularIncremento(costo, fechaViaje);
        double descuento  = calcularDescuento(costo, fechaCompra);
        int boletos       = vuelo.getCatidadBoletos();
        double total      = calcularTotal(costo, descuento, incremento, boletos);

        vuelo.setCosto(costo);
        vuelo.setIncremento(incremento);
        vuelo.setDescuento(descuento);
        vuelo.setTotalPagar(total);

        vuelodao.agregar(vuelo);
    }

    @Override
    public void eliminar(int posicion) {
        if (posicion >= 0) {
            vuelodao.eliminar(posicion);
        }
    }

    @Override
    public List<Vuelo> listar() {
        return vuelodao.listar();
    }
}