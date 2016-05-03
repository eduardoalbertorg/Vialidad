package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.dto.Conexion;
import modelo.dto.PropietarioDTO;
import modelo.dto.VehiculoDTO;
import modelo.interfaces.DBQueries;

public class VehiculoDAO implements DBQueries<VehiculoDTO> {
	private static final String SQL_INSERT = "INSERT INTO vehiculos "
			+ "(placas, color1, mov, clase, marca, color2, proced, tipo, "
			+ "cc, submarca, numeroSerie, comb, cilindros, version, numeroMotor, "
			+ "servicio, puertas, modelo, nrpv, uso, pasaj, idPropietario, idRecaudadora) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
			+ "?, ?)";
	private static final String SQL_DELETE = "DELETE FROM vehiculos WHERE id = ?";
	private static final String SQL_UPDATE = "UPDATE vehiculos SET "
			+ "placas = ?, color1 = ?, mov = ?, clase = ?, marca = ?, color2 = ?, proced = ?, tipo = ?, "
			+ "cc = ?, submarca = ?, numeroSerie = ?, comb = ?, cilindros = ?, version = ?, numeroMotor = ?, "
			+ "servicio = ?, puertas = ?, modelo = ?, nrpv = ?, uso = ?, pasaj = ?, idPropietario = ?, idRecaudadora = ? "
			+ "WHERE id = ?";
	private static final String SQL_READ = "SELECT * FROM vehiculos WHERE id = ?";
	private static final String SQL_READALL = "SELECT * FROM vehiculos";
	private static final Conexion cnn = Conexion.saberEstado();
	
	@Override
	public boolean create(VehiculoDTO t) {
		PreparedStatement ps;
		try {			
			ps = cnn.getConnection().prepareStatement(SQL_INSERT);
			ps.setString(1, t.getPlacas());
			ps.setString(2, t.getColor1());
			ps.setString(3, t.getMov());
			ps.setString(4, t.getClase());
			ps.setString(5, t.getMarca());
			ps.setString(6, t.getColor2());
			ps.setString(7, t.getProced());
			ps.setString(8, t.getTipo());
			ps.setString(9, t.getCc());
			ps.setString(10, t.getSubmarca());
			ps.setString(11, t.getNumeroSerie());
			ps.setString(12, t.getComb());
			ps.setString(13, t.getCilindros());
			ps.setString(14, t.getVersion());
			ps.setString(15, t.getNumeroMotor());
			ps.setString(16, t.getServicio());
			ps.setString(17, t.getPuertas());
			ps.setString(18, t.getModelo());
			ps.setString(19, t.getNrpv());
			ps.setString(20, t.getUso());
			ps.setString(21, t.getPasaj());
			ps.setInt(22, t.getIdPropietario());
			ps.setInt(23, t.getIdRecaudadora());
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
	public boolean update(VehiculoDTO t) {
		PreparedStatement ps;
		try {			
			ps = cnn.getConnection().prepareStatement(SQL_UPDATE);
			ps.setString(1, t.getPlacas());
			ps.setString(2, t.getColor1());
			ps.setString(3, t.getMov());
			ps.setString(4, t.getClase());
			ps.setString(5, t.getMarca());
			ps.setString(6, t.getColor2());
			ps.setString(7, t.getProced());
			ps.setString(8, t.getTipo());
			ps.setString(9, t.getCc());
			ps.setString(10, t.getSubmarca());
			ps.setString(11, t.getNumeroSerie());
			ps.setString(12, t.getComb());
			ps.setString(13, t.getCilindros());
			ps.setString(14, t.getVersion());
			ps.setString(15, t.getNumeroMotor());
			ps.setString(16, t.getServicio());
			ps.setString(17, t.getPuertas());
			ps.setString(18, t.getModelo());
			ps.setString(19, t.getNrpv());
			ps.setString(20, t.getUso());
			ps.setString(21, t.getPasaj());
			ps.setInt(22, t.getIdPropietario());
			ps.setInt(23, t.getIdRecaudadora());
			ps.setInt(24, t.getId());
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
	public VehiculoDTO read(Object key) {
		PreparedStatement ps;
		ResultSet rs;
		VehiculoDTO v = null;
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READ);
			ps.setString(1, key.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				v = new VehiculoDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12),
						rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16),
						rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20),
						rs.getString(21), rs.getString(22), rs.getInt(23), rs.getInt(24));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return v;
	}

	@Override
	public List<VehiculoDTO> readAll() {
		PreparedStatement ps;
		ResultSet rs;
		ArrayList<VehiculoDTO> vehiculos = new ArrayList<VehiculoDTO>();
		try {
			ps = cnn.getConnection().prepareStatement(SQL_READALL);
			rs = ps.executeQuery();
			while (rs.next()) {
				vehiculos.add(new VehiculoDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
						rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12),
						rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16),
						rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20),
						rs.getString(21), rs.getString(22), rs.getInt(23), rs.getInt(24)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cnn.cerrarConexion();
		}
		return vehiculos;
	}

}
