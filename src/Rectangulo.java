import java.util.Collections;

public class Rectangulo extends FormaComponent{
    int x1;
    int y1;
    int x2;
    int y2;

    public Rectangulo(){
    }

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void dibuja() {
        System.out.print(String.join("", Collections.nCopies(profundidad(), "  ")));
        System.out.println(String.format("Rectangulo(%d, %d, %d, %d) ", this.x1, this.y1, this.x2, this.y2));
    }

    @Override
    public void desplazaRelativo(int x, int y) {
        this.x1 = x1 + x;
        this.y1 = y1 + y;
        this.x2 = x2 + x;
        this.y2 = y2 + y;
    }
}
