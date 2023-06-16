public class Main{
    public static void main(String[] args) {
        Arbol arbol = new Arbol(5);
        arbol.agregarDato(3);
        arbol.agregarDato(8);
        arbol.agregarDato(1);
        arbol.agregarDato(2);
        arbol.agregarDato(4);
        arbol.agregarDato(7);
        arbol.agregarDato(6);
        arbol.elegirRecorrido(arbol.raiz);
    }
}