package com.idat.proyecto.model;

public class Producto {
	
	private Integer id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private double precio;
	private int stock;
	
	
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(Integer id, String nombre, String descripcion, String tipo, double precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.precio = precio;
		this.stock = stock;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo
				+ ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	

}
