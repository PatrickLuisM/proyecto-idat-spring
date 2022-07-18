package com.idat.proyecto.model;

public class DetalleVenta {
	private Integer id;
	private Integer ventaId;
	private Integer productoId;
	private double cantidad;
	private double igv;
	private double descuento;
	
	
	public DetalleVenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetalleVenta(Integer id, Integer ventaId, Integer productoId, double cantidad, double igv,
			double descuento) {
		super();
		this.id = id;
		this.ventaId = ventaId;
		this.productoId = productoId;
		this.cantidad = cantidad;
		this.igv = igv;
		this.descuento = descuento;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVentaId() {
		return ventaId;
	}
	public void setVentaId(Integer ventaId) {
		this.ventaId = ventaId;
	}
	public Integer getProductoId() {
		return productoId;
	}
	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", ventaId=" + ventaId + ", productoId=" + productoId + ", cantidad="
				+ cantidad + ", igv=" + igv + ", descuento=" + descuento + "]";
	}
	
	

}
