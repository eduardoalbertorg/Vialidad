package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.dto.Conexion;
import modelo.dto.RecaudadoraDTO;
import modelo.interfaces.DBQueries;;

public class RecaudadoraDAO implements DBQueries<RecaudadoraDTO> {
	private static final String SQL_INSERT = "INSERT INTO recaudadoras "
			+ "(nombre, direccion, telefono, codigoPostal) "
			+ "VALUES (?, ?, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM recaudadoras WHERE idRecaudadora = ?";
	private static final String SQL_UPDATE = "UPDATE recaudadoras SET nombre = ?, "
			+ "direccion = ?, telefono = ?, codigoPostal = ? WHERE idRecaudadora = ?";
	private static final String SQL_READ = "SELECT * FROM recaudadoras WHERE idRecaudadora = ?";
	private static final String SQL_READALL = "SELECT * FROM recaudadoras";
	private static final Conexion cnn = Conexion.saberEstado();	
	
	@Override
	public boolean create(RecaudadoraDTO t) {
		PreparedStatement ps;
		try {			
			ps = cnn.getConnection().prepareStatement(SQL_INSERT);
			ps.setString(1, t.getNombre());
			ps.setString(2, t.getDireccion());
			ps.setString(3, t.getTelefono());
			ps.setString(4, t.getCodigoPostal());
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
			ps.setInt(1, Integer.parseInt(key.toString()));
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
	public boolean update(RecaudadoraDTO t) {
		PreparedStatement ps;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_UPDATE);
			ps.setString(1, t.getNombre());
			ps.setString(2, t.getDireccion());
			ps.setString(3, t.getTelefono());
			ps.setString(4, t.getCodigoPostal());
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
	public RecaudadoraDTO read(Object key) {
		PreparedStatement ps;
		ResultSet rs;
		RecaudadoraDTO r = null;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				r = new RecaudadoraDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return r;
	}

	@Override
	public List<RecaudadoraDTO> readAll() {
		PreparedStatement ps;
		ResultSet rs; 
		ArrayList<RecaudadoraDTO> recaudadoras = new ArrayList<RecaudadoraDTO>();
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				recaudadoras.add(new RecaudadoraDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return recaudadoras;
	}

}
