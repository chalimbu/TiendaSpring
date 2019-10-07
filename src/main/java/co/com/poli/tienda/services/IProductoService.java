package co.com.poli.tienda.services;

import co.com.poli.tienda.model.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> getProductos();
    Producto getProducto(Long id);
    Producto addProducto(Producto producto);
    Producto updateProducto(Producto producto);
    Boolean deleteProducto(Long id);
}
