package controlador;

import java.awt.Dialog;
import java.util.List;

import modelo.dao.RecaudadoraDAO;
import modelo.dto.RecaudadoraDTO;
import modelo.interfaces.InterfaceRecaudadora;
import vista.AltaRecaudadora;

public class GestionRecaudadoras implements InterfaceRecaudadora {
	private RecaudadoraDAO recaudadoraDAO;
	private AltaRecaudadora altaRecaudadora;
	
	public GestionRecaudadoras() {
		recaudadoraDAO = new RecaudadoraDAO();
		altaRecaudadora = new AltaRecaudadora(this);
		altaRecaudadora.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		altaRecaudadora.setVisible(true);
	}

	@Override
	public List<RecaudadoraDTO> getRecaudadoras() {
		return recaudadoraDAO.readAll();
	}

	@Override
	public boolean createRecaudadora(RecaudadoraDTO r) {
		return recaudadoraDAO.create(r);
	}

	@Override
	public boolean deleteRecaudadora(Object key) {
		return recaudadoraDAO.delete(key);
	}

	@Override
	public boolean updateRecaudadora(RecaudadoraDTO r) {
		return recaudadoraDAO.update(r);
	}

	@Override
	public RecaudadoraDTO getRecaudadora(Object key) {
		return recaudadoraDAO.read(key);
	}

}
