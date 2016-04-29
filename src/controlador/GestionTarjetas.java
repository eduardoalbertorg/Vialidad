package controlador;

import java.awt.GridLayout;
import java.util.List;

import modelo.dao.TarjetaDAO;
import modelo.dto.TarjetaDTO;
import modelo.interfaces.InterfaceTarjeta;
import vista.TarjetasPnl;

public class GestionTarjetas implements InterfaceTarjeta {
	private TarjetaDAO tarjetaDAO;
	private TarjetasPnl tarjetasPnl;
	
	public GestionTarjetas() {
		tarjetaDAO = new TarjetaDAO();
		tarjetasPnl = new TarjetasPnl(this);
		Main.ventanaPrincipal.getContentPane().removeAll();
		Main.ventanaPrincipal.getContentPane().add(tarjetasPnl);
	}

	@Override
	public List<TarjetaDTO> getTarjetas() {
		return tarjetaDAO.readAll();
	}

	@Override
	public boolean createTarjeta(TarjetaDTO t) {
		return tarjetaDAO.create(t);
	}

	@Override
	public boolean deleteTarjeta(Object key) {
		return tarjetaDAO.delete(key);
	}

	@Override
	public boolean updateTarjeta(TarjetaDTO t) {
		return tarjetaDAO.update(t);
	}

	@Override
	public TarjetaDTO getTarjeta(Object key) {
		return tarjetaDAO.read(key);
	}
	
}
