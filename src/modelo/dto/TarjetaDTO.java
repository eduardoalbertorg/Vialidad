package modelo.dto;

import java.sql.Date;

public class TarjetaDTO {
	private String id;
	private Date date;
	private String idRecaudadora;
	private String idVehiculo;
	private String idPropietario;
	
	public TarjetaDTO() {
		
	}
	
	public TarjetaDTO(String id) {
		this.id = id;
	}

	public TarjetaDTO(String id, Date date, String idRecaudadora, String idVehiculo, String idPropietario) {
		super();
		this.id = id;
		this.date = date;
		this.idRecaudadora = idRecaudadora;
		this.idVehiculo = idVehiculo;
		this.idPropietario = idPropietario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIdRecaudadora() {
		return idRecaudadora;
	}

	public void setIdRecaudadora(String idRecaudadora) {
		this.idRecaudadora = idRecaudadora;
	}

	public String getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(String idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}
	
}