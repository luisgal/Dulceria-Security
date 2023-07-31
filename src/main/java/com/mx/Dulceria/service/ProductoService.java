package com.mx.Dulceria.service;

import java.util.List;

import com.mx.Dulceria.domain.Producto;

public interface ProductoService {
	void insert(Producto producto);
	
	void edit(Producto producto);
	
	void delete(long id);
	
	Producto search(long id);
	
	List<Producto> list();
}
