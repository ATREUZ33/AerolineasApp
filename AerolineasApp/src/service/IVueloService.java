package service;

import entity.Vuelo;
import java.util.List;

public interface IVueloService {
    void agregar(Vuelo vuelo);
    void eliminar(int posicion);
    List<Vuelo> listar();
}