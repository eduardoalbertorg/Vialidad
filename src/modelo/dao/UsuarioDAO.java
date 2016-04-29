package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.dto.Conexion;
import modelo.dto.UserDTO;
import modelo.interfaces.DBQueries;

public class UsuarioDAO implements DBQueries<UserDTO>{
	private static final String SQL_INSERT = "INSERT INTO usuarios "
			+ "(username, password) "
			+ "VALUES (?, ?)";
	private static final String SQL_DELETE = "DELETE FROM usuarios WHERE id = ?";
	private static final String SQL_UPDATE = "UPDATE usuarios SET username = ?, password = ? "
			+ "WHERE id = ?";
	private static final String SQL_READ = "SELECT * FROM usuarios WHERE id = ?";
	private static final String SQL_READALL = "SELECT * FROM usuarios";
	private static final String SQL_READWHERE = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
	private static final Conexion cnn = Conexion.saberEstado();
	
	@Override
	public boolean create(UserDTO t) {
		PreparedStatement ps;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_INSERT);
			ps.setString(1, t.getUsername());
			ps.setString(2, t.getPassword());
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
	public boolean update(UserDTO t) {
		PreparedStatement ps;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_UPDATE);
			ps.setString(1, t.getUsername());
			ps.setString(2, t.getPassword());
			ps.setInt(3, t.getId());
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
	public UserDTO read(Object key) {
		PreparedStatement ps;
		ResultSet rs;
		UserDTO u = null;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				u = new UserDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return u;
	}

	@Override
	public List<UserDTO> readAll() {
		PreparedStatement ps;
		ResultSet rs;
		ArrayList<UserDTO> usuarios = new ArrayList<UserDTO>();
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				usuarios.add(new UserDTO(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return usuarios;
	}
	
	public UserDTO read(String username, String password) {
		PreparedStatement ps;
		ResultSet rs;
		UserDTO u = null;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READWHERE);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while (rs.next()) {
				u = new UserDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return u;
	}

}
