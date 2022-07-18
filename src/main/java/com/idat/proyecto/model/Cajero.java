package com.idat.proyecto.model;


public class Cajero {

	private Integer id;
	private String nombre;
	private String apellido;
	private String correo;
	private String usuario;
	private String contrasena;
	private String dni;
	
	public Cajero() {
		
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", usuario=" + usuario + ", contrasena=" + contrasena + ", dni=" + dni + "]";
	}
	
	
	
}
