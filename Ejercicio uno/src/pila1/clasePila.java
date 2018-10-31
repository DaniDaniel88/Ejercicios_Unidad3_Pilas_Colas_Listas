
package pila1;

public class clasePila {
    // Puntero que indica el inicio de la pila o tambein conocida como el
    // tope de la pila.
    private nodito inicio;
    // Variable para registrar el tamaño de la pila.
    private int tamanio;
    
    
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public String[] Separar(String cadena){
        String[] cadenas = cadena.split("");

        String array[] = new String[cadenas.length];//para almacenar las palabras extraidas del texto dinamicamente
        int contar = 0;
        for (int i = 0; i < cadenas.length; i++) {
            array[i] = cadenas[i];
            contar = cadenas.length;

        }
        
        return array;
    }
    
    
    public int getTamanio(){
        return tamanio;
    }
    
    
    
    public void apilar(String valor){
        // Define un nuevo nodo.
        nodito nuevo = new nodito();
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
    // Elimina el elemento que se encuentra en el tope de la piala.
     
    public void retirar(){
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            inicio = inicio.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            tamanio--;
        }
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
        nodito aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println(aux.getValor());
            System.out.println("--");
            aux = aux.getSiguiente();
        }
    }
    
    //String temoral[] = new String[10];
    //int x=0;
    public void imprimelista(){
        // Crea una copia de la pila.
        
        
        nodito aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
           // x++;
            //System.out.println("|\t" + aux.getValor() + "\t|");
            //System.out.println("-----------------");
            
            System.out.print(aux.getValor());
            //System.out.println(temoral[x]);
            
            aux = aux.getSiguiente();
            
        }
        
    } 
    
}
