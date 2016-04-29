package modelo.interfaces;

import java.util.List;

import modelo.dto.PropietarioDTO;

public interface InterfacePropietario {
	public List<PropietarioDTO> getPropietarios();
	public boolean createPropietario(PropietarioDTO p);
	public boolean deletePropietario(Object key);
	public boolean updatePropietario(PropietarioDTO p);
	public PropietarioDTO getPropietario(Object key);
}
