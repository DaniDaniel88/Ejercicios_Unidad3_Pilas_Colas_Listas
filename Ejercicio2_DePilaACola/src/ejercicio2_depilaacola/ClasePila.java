package ejercicio2_depilaacola;

public class ClasePila {

    private nodo cima;

    public ClasePila() {
        cima = null;
    }
    //metodo para insertar cada elemento en la pila
    public void insertar(String elemento) {
        nodo nuevo;
        nuevo = new nodo(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    //metodo que elimina o remueve cada elemento de la pila, se extrae uno de la pila
    public String quitar() {
        String aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }
}
