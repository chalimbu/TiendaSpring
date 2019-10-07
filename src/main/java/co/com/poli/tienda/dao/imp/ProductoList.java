package co.com.poli.tienda.dao.imp;

import co.com.poli.tienda.dao.IProductoDao;
import co.com.poli.tienda.data.ProductoData;
import co.com.poli.tienda.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoList implements IProductoDao {

    @Override
    public List<Producto> getProductos() {
        return ProductoData.getListado();
    }

    @Override
    public Producto getProducto(Long id) {
        return ProductoData.getListado().get(ProductoData.getListado().indexOf(new Producto(id)));
    }

    @Override
    public Producto addProducto(Producto producto){
        List<Producto> listado=ProductoData.getListado();
        listado.add(producto);
        ProductoData.setListado(listado);
        return producto;
    }

    @Override
    public Producto updateProducto(Producto producto) {
        List<Producto> listado=ProductoData.getListado();
        listado.add(producto);
        ProductoData.setListado(listado);
        return producto;
    }

    @Override
    public Boolean deleteProducto(Long id) {
        ProductoData.getListado().remove(new Producto(id));
        return true;
    }
}
