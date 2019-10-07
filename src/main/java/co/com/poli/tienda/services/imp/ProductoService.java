package co.com.poli.tienda.services.imp;

import co.com.poli.tienda.dao.IProductoDao;
import co.com.poli.tienda.model.Producto;
import co.com.poli.tienda.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoDao iProductoDao;

    @Override
    public List<Producto> getProductos() {
        return iProductoDao.getProductos();
    }

    @Override
    public Producto getProducto(Long id) {
        if(getProductos().contains(new Producto(id))){
            return iProductoDao.getProducto(id);
        }else{
            return null;
        }
    }

    @Override
    public Producto addProducto(Producto producto) {
        if(!getProductos().contains(producto)){
            return iProductoDao.addProducto(producto);
        }else{
            return null;
        }
    }

    @Override
    public Producto updateProducto(Producto producto) {
        if(getProductos().contains(producto)){
            return iProductoDao.updateProducto(producto);
        }else{
            return null;
        }
    }

    @Override
    public Boolean deleteProducto(Long id) {
        if(getProductos().contains(new Producto(id))){
            return iProductoDao.deleteProducto(id);
        }else{
            return false;
        }
    }
}
