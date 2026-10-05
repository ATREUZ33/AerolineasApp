package dao;

import entity.Vuelo;
import java.util.ArrayList;
import java.util.List;

public class VueloDAO implements IVueloDAO {

    private ArrayList<Vuelo> lstVuelo = new ArrayList<>();

    @Override
    public void agregar(Vuelo vuelo) {
        lstVuelo.add(vuelo);
    }

    @Override
    public List<Vuelo> listar() {
        return lstVuelo;
    }

    @Override
    public void eliminar(int posicion) {
        lstVuelo.remove(posicion);
    }
}