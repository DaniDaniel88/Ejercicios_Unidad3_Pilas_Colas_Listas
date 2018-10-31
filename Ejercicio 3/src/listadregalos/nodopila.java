

package listadregalos;

public class nodopila {
    private String valor;
    // Variable para enlazar los nodos.
    private nodopila siguiente;
    
     //Constructor que inicializamos el valor de las variables.
    
    public void nodopila(){
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

    public nodopila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodopila siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
