public class recorridoInOrden {
    Nodo nodo, String posicion) 
        if (nodo != null) {
            recorridoInorden(nodo.izquierdo, "Izquierda");
            System.out.println("Nodo: " + nodo.dato + ", Posición: " + posicion);
            recorridoInorden(nodo.derecho, "Derecha");
        }
    }
