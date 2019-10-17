import java.util.ArrayList;

public abstract class FormaComponent {

    FormaComponent padre;

    public void dibuja(){
        throw new UnsupportedOperationException();
    }

    public int profundidad(){
        if (padre==null) return 0;
        return padre.profundidad()+1;
    }

    public void desplazaRelativo(int x, int y){
        throw new UnsupportedOperationException();
    }

    public void anade(FormaComponent fc){
        throw new UnsupportedOperationException();
    }

    public void elimina(FormaComponent fc){
        throw new UnsupportedOperationException();
    }


}
