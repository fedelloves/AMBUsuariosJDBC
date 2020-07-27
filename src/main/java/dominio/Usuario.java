package dominio;

public class Usuario {

    private int idUsuario;
    private String usuario;
    private String clave;
    private String nombre;
    private String apellido;
    private String email;

    public Usuario(int idUsuario, String usuario, String clave, String nombre, String apellido, String email) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Usuario(){

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", clave=" + clave + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + '}';
    }
}
