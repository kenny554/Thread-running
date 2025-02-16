package modelo;

public class caballo {

    private int codigo;
    private String nombre;
    private int coorX, coorY;

    public caballo(int codigo, String nombre, int coorX, int coorY, long tiempo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCoorX() {
        return coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

}
