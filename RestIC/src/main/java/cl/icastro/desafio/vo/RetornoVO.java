package cl.icastro.desafio.vo;

import java.io.Serializable;
import java.util.List;

public class RetornoVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8467379446371967477L;
	private Integer id;
	private String fechaCreacion;
	private String fechaFin;
	private List<String> fechasFaltantes;
	
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
	public List<String> getFechasFaltantes() {
		return fechasFaltantes;
	}
	public void setFechasFaltantes(List<String> fechasFaltantes) {
		this.fechasFaltantes = fechasFaltantes;
	}
	
	

}
