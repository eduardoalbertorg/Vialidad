package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.dto.Conexion;
import modelo.dto.PropietarioDTO;
import modelo.dto.RecaudadoraDTO;
import modelo.dto.TarjetaDTO;
import modelo.dto.VehiculoDTO;
import modelo.interfaces.DBQueries;

public class TarjetaDAO implements DBQueries<TarjetaDTO> {
	private static final String SQL_INSERT = "INSERT INTO tarjetas "
			+ "(fecha, idRecaudadora, idVehiculo, idPropietario) "
			+ "VALUES (?, ?, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM tarjetas WHERE id = ?";
	private static final String SQL_UPDATE = "UPDATE tarjetas SET fecha= ?, "
			+ "idRecaudadora = ?, idVehiculo = ?, idPropietario = ? WHERE id = ?";
	private static final String SQL_READ = "SELECT * FROM tarjetas WHERE id = ?";
	private static final String SQL_READALL = "SELECT tarjetas.idTarjeta, recaudadoras.nombre,"
			+ " propietarios.nombre, propietarios.apellido, vehiculos.placas, vehiculos.marca, vehiculos.submarca,"
			+ " vehiculos.modelo, vehiculos.color1 FROM tarjetas, recaudadoras, vehiculos, propietarios"
			+ " WHERE tarjetas.idVehiculo = vehiculos.idVehiculo AND tarjetas.idRecaudadora ="
			+ " recaudadoras.idRecaudadora AND tarjetas.idPropietario = propietarios.idPropietario";
	private static final Conexion cnn = Conexion.saberEstado();
	
	@Override
	public boolean create(TarjetaDTO t) {
		PreparedStatement ps;
		try {			
			ps = cnn.getConnection().prepareStatement(SQL_INSERT);
			ps.setDate(1, t.getDate());
			ps.setInt(2, t.getIdRecaudadora());
			ps.setInt(3, t.getIdVehiculo());
			ps.setInt(4, t.getIdPropietario());
			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return false;
	}
	
	@Override
	public boolean delete(Object key) {
		PreparedStatement ps;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_DELETE);
			ps.setString(1, key.toString());
			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return false;
	}
	
	@Override
	public boolean update(TarjetaDTO t) {
		PreparedStatement ps;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_UPDATE);
			ps.setDate(1, t.getDate());
			ps.setInt(2, t.getIdRecaudadora());
			ps.setInt(3, t.getIdVehiculo());
			ps.setInt(4, t.getIdPropietario());
			ps.setInt(5, t.getId());
			if (ps.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return false;
	}
	
	@Override
	public TarjetaDTO read(Object key) {
		PreparedStatement ps;
		ResultSet rs;
		TarjetaDTO t = null;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				t = new TarjetaDTO(rs.getInt(1), rs.getDate(2), rs.getInt(3),
						rs.getInt(4), rs.getInt(5));
			}
			//return p;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return t;
	}
	
	@Override
	public List<TarjetaDTO> readAll() {
		PreparedStatement ps;
		ResultSet rs;
		ArrayList<TarjetaDTO> tarjetas = new ArrayList<TarjetaDTO>();
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				PropietarioDTO propietario = new PropietarioDTO();
				RecaudadoraDTO recaudadora = new RecaudadoraDTO();
				VehiculoDTO vehiculo = new VehiculoDTO();
				recaudadora.setNombre(rs.getString("recaudadoras.nombre"));
				propietario.setNombre(rs.getString("propietarios.nombre"));
				propietario.setApellido(rs.getString("apellido"));
				vehiculo.setPlacas(rs.getString("placas"));
				vehiculo.setMarca(rs.getString("marca"));
				vehiculo.setSubmarca(rs.getString("submarca"));
				vehiculo.setModelo(rs.getString("modelo"));
				vehiculo.setColor1(rs.getString("color1"));
				tarjetas.add(new TarjetaDTO(rs.getInt("idTarjeta"), recaudadora, vehiculo, propietario));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return tarjetas;
	}
}