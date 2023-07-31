package com.mx.Dulceria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.Dulceria.domain.Producto;
import com.mx.Dulceria.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	private final ProductoRepository productoRepository;
	
	public ProductoServiceImpl(ProductoRepository productoRepository) {
		super();
		this.productoRepository = productoRepository;
	}

	@Override
	public void insert(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public void edit(Producto producto) {
		productoRepository.save(producto);
	}

	@Override
	public void delete(long id) {
		productoRepository.deleteById(id);
	}

	@Override
	public Producto search(long id) {
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public List<Producto> list() {
		return productoRepository.findAll();
	}

}
