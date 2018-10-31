
package listadregalos;

public class nodo {
    private String valor;
    private String num;
    // Variable para enlazar los nodos.
    private nodo siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void nodo(){
        this.valor = "";
        this.num ="";
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public String getValor() {
        return valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public String getNumero() {
        return num;
    }

    
    public void setNumero(String numer) {
        this.num = numer;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }   
}

