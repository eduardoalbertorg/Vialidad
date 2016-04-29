package controlador;

import java.awt.Dialog;
import java.util.List;

import modelo.dao.PropietarioDAO;
import modelo.dto.PropietarioDTO;
import modelo.interfaces.InterfacePropietario;
import vista.NuevoPropietarioFrm;

public class GestionPropietarios implements InterfacePropietario{
	private PropietarioDAO propietarioDAO;
	private NuevoPropietarioFrm nuevoPropietarioScreen;
	
	public GestionPropietarios() {
		propietarioDAO = new PropietarioDAO();
		nuevoPropietarioScreen = new NuevoPropietarioFrm(this);
		nuevoPropietarioScreen.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		nuevoPropietarioScreen.setVisible(true);
	}
	
	public List<PropietarioDTO> getPropietarios() {
		return propietarioDAO.readAll();
	}

	@Override
	public boolean createPropietario(PropietarioDTO p) {
		return propietarioDAO.create(p);
	}

	@Override
	public boolean deletePropietario(Object key) {
		return propietarioDAO.delete(key);
	}

	@Override
	public boolean updatePropietario(PropietarioDTO p) {
		return propietarioDAO.update(p);
	}

	@Override
	public PropietarioDTO getPropietario(Object key) {
		return propietarioDAO.read(key);
	}
	
}
