package entity;


public class Vuelo {

    public Vuelo() {
    }

    public Vuelo(String destino, int catidadBoletos, String nombreCliente, String fechaViaje, String fechaCompra, double costo, double incremento, double descuento, double totalPagar) {
        this.destino = destino;
        this.catidadBoletos = catidadBoletos;
        this.nombreCliente = nombreCliente;
        this.fechaViaje = fechaViaje;
        this.fechaCompra = fechaCompra;
        this.costo = costo;
        this.incremento = incremento;
        this.descuento = descuento;
        this.totalPagar = totalPagar;
    }
    
    private String destino;
    private int catidadBoletos;
    private String nombreCliente;
    private String fechaViaje;
    private String fechaCompra;
    private double costo ;
    private double incremento;
    private double descuento;
    private double totalPagar;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCatidadBoletos() {
        return catidadBoletos;
    }

    public void setCatidadBoletos(int catidadBoletos) {
        this.catidadBoletos = catidadBoletos;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
}
