package ejercicio2_depilaacola;

public class ClaseCola {

    protected nodo inicioCola;//indica el inicio de la cola, posicion 
    protected nodo finaL;//indica la posicion final de la cola

    public ClaseCola() {//contructor de la cola
        inicioCola = finaL = null;
    }
    
    //metodo donde se inserta los valores de tipo cadena
    public void insertar(String elemento) {
        nodo a;
        a = new nodo(elemento);
        if (colaVacia()) {
            inicioCola = a;
        } else {
            finaL.siguiente = a;
        }
        finaL = a;
    }
    //metodo para remover cada elemento de la cola
    public String quitar() {
        String aux;
        if (!colaVacia()) {
            aux = inicioCola.elemento;
            inicioCola = inicioCola.siguiente;
        } else {
            return "";
        }
        return aux;
    }
    //indica si la cola esta vacia devolviendo un true si es verdadero o un falso
    public boolean colaVacia() {
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

}
