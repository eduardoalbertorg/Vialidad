package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.dto.Conexion;
import modelo.dto.PropietarioDTO;
import modelo.interfaces.DBQueries;

public class PropietarioDAO implements DBQueries<PropietarioDTO>{
	private static final String SQL_INSERT = "INSERT INTO propietarios "
			+ "(nombre, apellido, direccion, telefono, codigoPostal) "
			+ "VALUES (?, ?, ?, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM propietarios WHERE id = ?";
	private static final String SQL_UPDATE = "UPDATE propietarios SET nombre = ?, apellido = ?, "
			+ "direccion = ?, telefono = ?, codigoPostal = ? WHERE id = ?";
	private static final String SQL_READ = "SELECT * FROM propietarios WHERE id = ?";
	private static final String SQL_READALL = "SELECT * FROM propietarios";
	private static final Conexion cnn = Conexion.saberEstado();
	
	@Override
	public boolean create(PropietarioDTO t) {
		PreparedStatement ps;
		try {			
			ps = cnn.getConnection().prepareStatement(SQL_INSERT);
			ps.setString(1, t.getNombre());
			ps.setString(2, t.getApellido());
			ps.setString(3, t.getDireccion());
			ps.setString(4, t.getTelefono());
			ps.setString(5, t.getCodigoPostal());
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
	public boolean update(PropietarioDTO t) {
		PreparedStatement ps;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_UPDATE);
			ps.setString(1, t.getNombre());
			ps.setString(2, t.getApellido());
			ps.setString(3, t.getDireccion());
			ps.setString(4, t.getTelefono());
			ps.setString(5, t.getCodigoPostal());
			ps.setInt(6, t.getId());
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
	public PropietarioDTO read(Object key) {
		PreparedStatement ps;
		ResultSet rs;
		PropietarioDTO p = null;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				p = new PropietarioDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6));
			}
			//return p;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return p;
	}

	@Override
	public List<PropietarioDTO> readAll() {
		PreparedStatement ps;
		ResultSet rs;
		ArrayList<PropietarioDTO> propietarios = new ArrayList<PropietarioDTO>();
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				propietarios.add(new PropietarioDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return propietarios;
	}

}