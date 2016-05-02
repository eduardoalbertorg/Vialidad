package modelo.interfaces;

import java.util.List;

import modelo.dto.RecaudadoraDTO;

public interface InterfaceRecaudadora {
	public List<RecaudadoraDTO> getRecaudadoras();
	public boolean createRecaudadora(RecaudadoraDTO r);
	public boolean deleteRecaudadora(Object key);
	public boolean updateRecaudadora(RecaudadoraDTO r);
	public RecaudadoraDTO getRecaudadora(Object key);
}
