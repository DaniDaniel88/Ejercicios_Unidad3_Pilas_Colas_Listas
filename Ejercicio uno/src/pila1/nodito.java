
package pila1;

public class nodito {
    // Variable en la cual se va a guardar el valor.
    private String valor;
    // Variable para enlazar los nodos.
    private nodito siguiente;
    
     //Constructor que inicializamos el valor de las variables.
    
    public void nodoDPila(){
        this.valor = "";
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public nodito getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodito siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
