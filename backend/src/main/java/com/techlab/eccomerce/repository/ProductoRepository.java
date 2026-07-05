package com.techlab.eccomerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlab.eccomerce.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByCategoria(String categoria);

    List<Producto> findByMasVendidoTrue();

    List<Producto> findByNombreContainingIgnoreCase(String nombre);

}