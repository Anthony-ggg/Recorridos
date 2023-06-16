//Este es la clase arbol, donde se encuentra el metodo preOrden y printNodos . No contiene nada mas que eso.

public class Arbol {

    public void preOrden(Nodo nodo){
        System.out.println("Recorrido PreOrden");
        if (nodo == null)
            return;

        System.out.println("Raiz: " + nodo.dato);

        if (nodo.izquierdo != null) {
            System.out.println("Nodos Izquierdos");
            preOrden(nodo.izquierdo);
        }

        if (nodo.derecho != null) {
            System.out.println("Nodos Derechos");
            preOrden(nodo.derecho);
        }
    }

    public void printNodos(Nodo nodo) {
        if (nodo == null)
            return;
        System.out.println("Nodo: " + nodo.dato);
        printNodos(nodo.izquierdo);
        printNodos(nodo.derecho);
    }
}

  