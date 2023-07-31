package com.mx.Dulceria.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Dulceria.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	 
}
