package com.mx.Dulceria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.mx.Dulceria.domain.Producto;
import com.mx.Dulceria.service.ProductoService;

@RestController
@RequestMapping("producto")
@CrossOrigin
public class ProductoController {
	
	private final ProductoService productoService;
	
	public ProductoController(ProductoService productoService) {
		super();
		this.productoService = productoService;
	}

	@GetMapping("list")
	public List<Producto> list(){
		return productoService.list();
	}
	
	@PostMapping("insert")
	public void insert(@RequestBody Producto producto) {
		productoService.insert(producto);
	}
	
	@GetMapping("search/{id}")
	public Producto search(@PathVariable(name = "id", required = true) long id) {
		return productoService.search(id);
	}
	
	@PutMapping("edit")
	public void edit(@RequestBody Producto producto) {
		productoService.edit(producto);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable long id) {
		productoService.delete(id);
	}
}
