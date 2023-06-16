import java.util.Scanner;

public class Arbol {
    public Nodo raiz;
    Scanner in = new Scanner(System.in);

    public Arbol(int dato) {
        this.raiz = new Nodo(dato);
    }

    public void agregarDato(int dato){
        Nodo nuevo = new Nodo(dato);
        Nodo aux = raiz;
        while (aux != null){
            if (dato < aux.dato){
                if (aux.izquierdo == null){
                    aux.izquierdo = nuevo;
                    return;
                }
                aux = aux.izquierdo;
            } else {
                if (aux.derecho == null){
                    aux.derecho = nuevo;
                    return;
                }
                aux = aux.derecho;
            }
        }
    }

    //Recorridos
    public void postOrden(Nodo nodo){
        if (nodo == null) {
            return;
        }
        if (nodo.izquierdo != null) {
            System.out.println("SubArbol Izquierdo");
            printNodos(nodo.izquierdo);
        }

        if (nodo.derecho != null) {
            System.out.println("SubArbol Derecho");
            printNodos(nodo.derecho);
        }

        System.out.println("Raiz");
        System.out.println("Raiz: " + nodo.dato);
    }

    public void recorridoInorden(Nodo nodo, String posicion) {
        if (nodo != null) {
            recorridoInorden(nodo.izquierdo, "Izquierda");
            System.out.println("Nodo: " + nodo.dato + ", Posición: " + posicion);
            recorridoInorden(nodo.derecho, "Derecha");
        }
    }

    public void preOrden(Nodo nodo){
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

    //Elegir recorrido

    public void elegirRecorrido(Nodo nodo) {
        System.out.println("Recorridos disponibles: \n1 PreOrden\n2 PostOrden\n3 InOrden\n4 Todos los recorridos");
        int opcion = in.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.println("Recorrido PreOrden");
                preOrden(nodo);
            }
            case 2 -> {
                System.out.println("Recorrido PostOrden");
                postOrden(nodo);
            }
            case 3 -> {
                System.out.println("Recorrido InOrden");
                recorridoInorden(nodo, "Raiz");
            }
            case 4 -> {
                System.out.println("\nRecorrido PreOrden");
                preOrden(nodo);
                System.out.println("\nRecorrido PostOrden");
                postOrden(nodo);
                System.out.println("\nRecorrido InOrden");
                recorridoInorden(nodo, "Raiz");
            }
            default -> System.out.println("Opción no válida");
        }
    }


    //Imprimir los valores de los nodos
    public void printNodos(Nodo nodo) {
        if (nodo == null)
            return;
        System.out.println("Nodo: " + nodo.dato);
        printNodos(nodo.izquierdo);
        printNodos(nodo.derecho);
    }

    //ToString
    @Override
    public String toString(){
        return "Árbol " + raiz;
    }

}
