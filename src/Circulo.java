import java.util.Collections;

public class Circulo extends FormaComponent {
    int x1;
    int y1;
    int radio;

    public Circulo(){
    }


    public Circulo(int x1, int y1, int radio) {
        this.x1 = x1;
        this.y1 = y1;
        this.radio = radio;
    }

    @Override
    public void dibuja() {
        System.out.print(String.join("", Collections.nCopies(profundidad(), "  ")));
        System.out.println(String.format("Circulo(%d, %d, %d) ", this.x1, this.y1, this.radio));
    }

    @Override
    public void desplazaRelativo(int x, int y) {
        this.x1 = x1 + x;
        this.y1 = y1 + y;
    }
}
