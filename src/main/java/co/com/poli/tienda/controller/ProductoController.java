package co.com.poli.tienda.controller;

import co.com.poli.tienda.model.Producto;
import co.com.poli.tienda.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService iproductoservice;

    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return iproductoservice.getProductos();
    }

    @GetMapping("/productos/{id}")
    public Producto getProducto(@PathVariable Long id){
        return iproductoservice.getProducto(id);
    }

    @PostMapping("/productos")
    public Producto addProducto(@RequestBody Producto producto){
        return iproductoservice.addProducto(producto);
    }

    @PutMapping("/productos/{id}")
    public Producto updateProducto(@RequestBody Producto producto){
        return iproductoservice.updateProducto(producto);
    }

    @DeleteMapping("/productos/{id}")
    public Boolean deleteProducto(@PathVariable Long id){
        return iproductoservice.deleteProducto(id);
    }
}
