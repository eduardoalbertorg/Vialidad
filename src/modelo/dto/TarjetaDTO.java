package modelo.dto;

import java.sql.Date;

public class TarjetaDTO {
	private int id;
	private Date date;
	private int idRecaudadora;
	private int idVehiculo;
	private int idPropietario;
	private RecaudadoraDTO recaudadora;
	private VehiculoDTO vehiculo;
	private PropietarioDTO propietario;

	public TarjetaDTO() {
		
	}
	
	public TarjetaDTO(int id) {
		this.id = id;
	}
	
	public TarjetaDTO(int id, RecaudadoraDTO recaudadora, VehiculoDTO vehiculo, PropietarioDTO propietario) {
		super();
		this.id = id;
		this.recaudadora = recaudadora;
		this.vehiculo = vehiculo;
		this.propietario = propietario;
	}

	public TarjetaDTO(int id, Date date, int idRecaudadora, int idVehiculo, int idPropietario) {
		super();
		this.id = id;
		this.date = date;
		this.idRecaudadora = idRecaudadora;
		this.idVehiculo = idVehiculo;
		this.idPropietario = idPropietario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getIdRecaudadora() {
		return idRecaudadora;
	}

	public void setIdRecaudadora(int idRecaudadora) {
		this.idRecaudadora = idRecaudadora;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}
	
	public RecaudadoraDTO getRecaudadora() {
		return recaudadora;
	}

	public void setRecaudadora(RecaudadoraDTO recaudadora) {
		this.recaudadora = recaudadora;
	}

	public VehiculoDTO getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoDTO vehiculo) {
		this.vehiculo = vehiculo;
	}

	public PropietarioDTO getPropietario() {
		return propietario;
	}

	public void setPropietario(PropietarioDTO propietario) {
		this.propietario = propietario;
	}
	
}