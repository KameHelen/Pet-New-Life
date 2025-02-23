package petnewlife;

public class Cliente extends Persona{
    protected int satisfaccion;
    protected ArrayList <Dialogos> dialogo = new ArrayList <Dialogos>();

    public Cliente(String nombre, String genero, String modelo, String reputacion){
         super(nombre, genero, modelo, reputacion);
    }
    @Override
    public void mover() {

    }


        public void anadirDialogo() {
            String dialogo = Dialogos.lista();
            Dialogo nuevoDialogo = new Dialogo(dialogo);
            dialogo.add(nuevoDialogo);
        }

    }


