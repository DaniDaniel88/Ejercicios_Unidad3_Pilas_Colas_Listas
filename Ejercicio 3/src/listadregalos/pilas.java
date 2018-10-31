
package listadregalos;

public class pilas {
    
    private nodopila inicio;
    // Variable para registrar el tamaño de la pila.
    private int tamanio;
    
    
    public void Pilas(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void apilar(String valor){
        // Define un nuevo nodo.
        nodopila nuevo = new nodopila();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        
        // Consulta si la pila esta vacia.
        if (esVacia()) {
            // Inicializa la pila con el nuevo valor.
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamanio++;
    } 
    
    
     // Consulta el valor del nodo que se encuentra en la cima de la pila
     
    public String cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    
    public void listar(){
        // Crea una copia de la pila.
        nodopila aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|" + aux.getValor() + "|");
            
            aux = aux.getSiguiente();
        }
    }
    
    //obtener una variable de la pila en una determinada posisicion
    
    public String GetDato(int posicion) throws Exception{
        
        if (posicion >= 0 && posicion < getTamanio()) {
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return inicio.getValor();
            } else {
                // Crea una copia de la lista.
                nodopila aux = inicio;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Retorna el valor del nodo.
                return aux.getValor();
            }
            // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
        
        
    }
    
    
}
