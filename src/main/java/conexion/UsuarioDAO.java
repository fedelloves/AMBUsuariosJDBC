package conexion;

import dominio.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, clave, nombre, apellido, email) VALUES (?,?,?,?,?)";

    public static List<Usuario> obtenerUsuarios() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String nombreUsuario = rs.getString("usuario");
                String clave = rs.getString("clave");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");

                usuario = new Usuario(idUsuario, nombreUsuario, clave, nombre, apellido, email);

                usuarios.add(usuario);

            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return usuarios;

    }

    public static int insertarUsuario(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getClave());
            stmt.setString(3, usuario.getNombre());
            stmt.setString(4, usuario.getApellido());
            stmt.setString(5, usuario.getEmail());

            rows = stmt.executeUpdate();

            System.out.println("Usuario insertado");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;

    }
}
