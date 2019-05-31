package cl.icastro.desafio.vo;

import java.io.Serializable;
import java.util.List;

public class DatosVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5688131889250148750L;
	private Integer id;
	private String fechaCreacion;
	private String fechaFin;
	private List<String> fechas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public List<String> getFechas() {
		return fechas;
	}
	public void setFehas(List<String> fechas) {
		this.fechas = fechas;
	}	

}
