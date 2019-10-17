public class Demo {
    public static void main(String[] args) {
        //Crea la forma principal
        FormaComponent formaPrin = new Forma("Principal");
        formaPrin.anade(new Rectangulo(10,10,20,20));
        formaPrin.anade(new Circulo(10,10,20));

        //Crea la forma interior
        FormaComponent formaInt = new Forma("Interna");
        Rectangulo r1 = new Rectangulo(2,2,3,3);
        Rectangulo r2 = new Rectangulo(3,3,4,4);
        formaInt.anade(r1);
        formaInt.anade(r2);
        formaInt.anade(new Circulo(1,1,20));

        //Anyade la forma interior a la principal
        formaPrin.anade(formaInt);

        System.out.println("\nDibujo INICIAL:");
        formaPrin.dibuja();

        System.out.println("\nDibujo tras desplazar:");
        formaPrin.desplazaRelativo(100,100);
        formaPrin.dibuja();

        System.out.println("\nDibujo tras eliminar:");
        formaInt.elimina(r1);
        formaInt.elimina(r2);
        formaPrin.dibuja();
    }
}
