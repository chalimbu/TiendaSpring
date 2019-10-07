package co.com.poli.tienda.data;

import co.com.poli.tienda.model.Producto;

import java.util.*;

public class ProductoData {
    private static List<Producto> listado;

    static{
        listado=new ArrayList<Producto>() {{
            add(new Producto(1L,"carne","fresca y deliciosa",true));
            add(new Producto(2L,"huevos","fresca y deliciosa",true));
            add(new Producto(3L,"arepa","fresca y deliciosa",true));
            add(new Producto(4L,"leche","fresca y deliciosa",true));
            add(new Producto(5L,"mantequilla","fresca y deliciosa",true));
        }};
    }

    public static List<Producto> getListado() {
        return listado;
    }

    public static void setListado(List<Producto> listado) {
        ProductoData.listado = listado;
    }
}
