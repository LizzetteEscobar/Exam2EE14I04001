package entidades;

public class objeto {

    private String nombre;
    private String apellido;
    private int numero1;
    private int numero2;
    private int favorito;

    public objeto() {
    }

    public objeto(String nombre, String apellido, int numero1, int numero2, int favorito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.favorito = favorito;
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

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }
}
