package controlador;

import java.util.List;

import modelo.dao.TarjetaDAO;
import modelo.dto.TarjetaDTO;
import modelo.interfaces.InterfaceTarjeta;

public class GestionTarjetas implements InterfaceTarjeta {
	private TarjetaDAO tarjetaDAO;
	
	public GestionTarjetas() {
		tarjetaDAO = new TarjetaDAO();
	}

	@Override
	public List<TarjetaDTO> getTarjetas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createTarjeta(TarjetaDTO t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTarjeta(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTarjeta(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TarjetaDTO getTarjeta(Object key) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
