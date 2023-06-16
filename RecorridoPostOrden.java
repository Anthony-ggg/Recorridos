//Metodo creado para el recorrido postOrden

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