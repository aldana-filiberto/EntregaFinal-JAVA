package com.techlab.eccomerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.techlab.eccomerce.model.Producto;
import com.techlab.eccomerce.service.ProductoService;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "http://localhost:5173/")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Obtener todos los productos
    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    // Obtener un producto por ID
    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Long id) {
        return productoService.getProductoById(id);
    }

    // Crear un producto
    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.crearProducto(producto);
    }

    // Actualizar un producto
    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id,
            @RequestBody Producto producto) {

        return productoService.actualizarProducto(id, producto);
    }

    // Eliminar un producto
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Producto> getProductosPorCategoria(@PathVariable String categoria) {
        return productoService.getProductosPorCategoria(categoria);
    }

    @GetMapping("/mas-vendidos")
    public List<Producto> getMasVendidos() {
        return productoService.getMasVendidos();
    }

    @GetMapping("/buscar/{nombre}")
    public List<Producto> buscarProducto(@PathVariable String nombre) {
        return productoService.buscarProductos(nombre);
    }
}