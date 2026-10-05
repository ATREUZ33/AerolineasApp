package dao;

import entity.Vuelo;
import java.util.List;

public interface IVueloDAO {
    void agregar(Vuelo vuelo);
    void eliminar(int posicion);
    List<Vuelo> listar();
}