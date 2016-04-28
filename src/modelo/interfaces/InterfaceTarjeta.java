package modelo.interfaces;

import java.util.List;

import modelo.dto.TarjetaDTO;;

public interface InterfaceTarjeta {
	public List<TarjetaDTO> getTarjetas();
	public boolean createTarjeta(TarjetaDTO t);
	public boolean deleteTarjeta(Object key);
	public boolean updateTarjeta(Object key);
	public TarjetaDTO getTarjeta(Object key);
}