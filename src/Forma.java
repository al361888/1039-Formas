import java.util.ArrayList;

public class Forma extends FormaComponent{
    String nombre;
    ArrayList<FormaComponent> listaFormas = new ArrayList<>();

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void dibuja() {
        System.out.print(profundidad()*' ');
        System.out.println("Forma("+this.nombre+") {");
        for (FormaComponent f: listaFormas){
            f.dibuja();
        }
        System.out.println("}");
    }

    @Override
    public void desplazaRelativo(int x, int y) {
        for (FormaComponent f: listaFormas){
            f.desplazaRelativo(x,y);
        }
    }

    @Override
    public void anade(FormaComponent fc) {
        listaFormas.add(fc);
    }

    @Override
    public void elimina(FormaComponent fc) {
        listaFormas.remove(listaFormas.indexOf(fc));
    }
}
