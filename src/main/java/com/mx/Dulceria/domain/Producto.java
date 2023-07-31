package com.mx.Dulceria.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos_dulceria")
public class Producto {
	
	@Id
	@Column(name = "id", columnDefinition = "NUMBER", nullable = false)
	long id;
	
	@Column(name = "nombre", columnDefinition = "VARCHAR(50)", nullable = false)
	String nombre;
	
	@Column(name = "marca", columnDefinition = "VARCHAR(50)", nullable = false)
	String marca;
	
	@Column(name = "sabor", columnDefinition = "VARCHAR(50)", nullable = false)
	String sabor;
	
	@Column(name = "existencia", columnDefinition = "NUMBER", nullable = false)
	int existencia;
	
	@Column(name = "precio", columnDefinition = "NUMBER", nullable = false)
	float precio;
	
	@Column(name = "caducidad", columnDefinition = "DATE", nullable = false)
	Date caducidad;

	public Producto() {
		
	}
	
	public Producto(long id) {
		
	}
	
	public Producto(String nombre, String marca, String sabor, int existencia, float precio, Date caducidad) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.sabor = sabor;
		this.existencia = existencia;
		this.precio = precio;
		this.caducidad = caducidad;
	}
	
	public Producto(long id, String nombre, String marca, String sabor, int existencia, float precio, Date caducidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.sabor = sabor;
		this.existencia = existencia;
		this.precio = precio;
		this.caducidad = caducidad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Date getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", sabor=" + sabor + ", existencia="
				+ existencia + ", precio=" + precio + ", caducidad=" + caducidad + "]\n";
	}
}
