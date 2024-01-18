package Prueba63Sanchez.sanchez.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	@Id
	private int codigo;
	private String cedula;
	private String deuda;


public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public String getDeuda() {
	return deuda;
}
public void setDeuda(String deuda) {
	this.deuda = deuda;
}


}
