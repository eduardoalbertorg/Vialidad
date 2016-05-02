package modelo.dto;

public class PropietarioDTO {
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String codigoPostal;
	
	public PropietarioDTO() {
		
	}
	
	public PropietarioDTO(int id) {
		this.id = id;
	}
	
	public PropietarioDTO(String nombre, String apellido, String direccion, String telefono, String codigoPostal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.codigoPostal = codigoPostal;
	}

	public PropietarioDTO(int id, String nombre, String apellido, String direccion, String telefono,
			String codigoPostal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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