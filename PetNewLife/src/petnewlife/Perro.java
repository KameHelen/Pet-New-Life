package petnewlife;

public class Perro extends Animal{
    protected String nombre = "";
    protected String raza = "";
    protected String color = "";
    protected String personalidad = "";
    protected String tamanio = "";
    protected String estado = "";
    protected int valoracion = 0; //estrellitas

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getRaza() {
        return super.getRaza();
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getPersonalidad() {
        return super.getPersonalidad();
    }

    @Override
    public void setPersonalidad(String personalidad) {
        super.setPersonalidad(personalidad);
    }

    @Override
    public String getTamanio() {
        return super.getTamanio();
    }

    @Override
    public void setTamanio(String tamanio) {
        super.setTamanio(tamanio);
    }

    @Override
    public String getEstado() {
        return super.getEstado();
    }

    @Override
    public void setEstado(String estado) {
        super.setEstado(estado);
    }

    @Override
    public int getValoracion() {
        return super.getValoracion();
    }

    @Override
    public void setValoracion(int valoracion) {
        super.setValoracion(valoracion);
    }

    @Override
    public void mover() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void beber() {

    }

    @Override
    public void jugar() {

    }

    @Override
    public void limpiar() {

    }

    @Override
    public void sonido() {

    }
}
