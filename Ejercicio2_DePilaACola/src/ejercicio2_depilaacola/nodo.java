package ejercicio2_depilaacola;

public class nodo {

    String elemento;//dato de cada nodo
    nodo siguiente;// Apunta al siguiente nodo

    public nodo(String x) {//Contructor que inicializa las variables
        elemento = x;
        siguiente = null;
    }
}
