package modelo.dto;

public class RecaudadoraDTO {
	private int id;
	private String nombre;
	private String direccion;
	private String telefono;
	private String codigoPostal;
	
	public RecaudadoraDTO() {
		
	}
	
	public RecaudadoraDTO(int id) {
		this.id = id;
	}
	
	public RecaudadoraDTO(String nombre, String direccion, String telefono, String codigoPostal) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.codigoPostal = codigoPostal;
	}

	public RecaudadoraDTO(int id, String nombre, String direccion, String telefono, String codigoPostal) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.codigoPostal = codigoPostal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
}
