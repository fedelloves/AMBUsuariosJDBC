package main;

import conexion.UsuarioDAO;
import dominio.Usuario;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Usuario> usuarios = UsuarioDAO.obtenerUsuarios();

        usuarios.forEach(us -> {
            System.out.println(us);
        });

        Usuario user = new Usuario(0, "user1989", "clave123", "Anibal", "Cruz", "anibalc90@gmail.com");
        Usuario user4 = new Usuario(4, "mafalda11", "clanenueva234", "Anabela", "Simon", "a.simon@gmail.com");

        //UsuarioDAO.insertarUsuario(user);
        //UsuarioDAO.modificarUsuario(user4);
        //UsuarioDAO.eliminarUsuario(user4);

    }
}
