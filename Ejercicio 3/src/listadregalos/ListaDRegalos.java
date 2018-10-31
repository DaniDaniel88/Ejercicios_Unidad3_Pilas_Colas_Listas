
package listadregalos;

import java.util.ArrayList;
import java.util.List;

public class ListaDRegalos {

    public static void main(String[] args) throws Exception {
        
        
         listaE lista = new listaE();
         listaE listaResultados = new listaE();
         pilas pila = new pilas();
         int l1=0, l2=1,l3=2,l4=3;
         
         //lista de regalos de los clientes
         
         pila.apilar("motocicleta");//4
         pila.apilar("lavadora");//3
         pila.apilar("casa");//2
         pila.apilar("tableta");//1
         
         System.out.println("lista de regalos de los clientes");
         pila.listar();
         System.out.println("<<--lista de clientes -->>\n");
        
        // Agregar in inicio de la lista
        lista.agregarAlInicio("Hammer","988383978");//nombre de los clientes//0
        lista.agregarAlFinal("Stark","985125380");//1
        lista.agregarAlFinal("Stark","985125380");//2
        lista.agregarAlFinal("Jostin","678444555");//3
        
        lista.listar();
        System.out.println("");
        
         
        if (!lista.getValor(l1).equals(lista.getValor(l2)) && !lista.getValor(l1).equals(lista.getValor(l3)) &&
                !lista.getValor(l1).equals(lista.getValor(l4))){
              listaResultados.agregarAlFinal(lista.getValor(l1),pila.GetDato(l1));
              
        }
        if (!lista.getValor(l2).equals(lista.getValor(l1)) && !lista.getValor(l2).equals(lista.getValor(l3)) &&
                !lista.getValor(l2).equals(lista.getValor(l4))){
              listaResultados.agregarAlFinal(lista.getValor(l2),pila.GetDato(l2));
              
        }
        if (!lista.getValor(l3).equals(lista.getValor(l1)) || !lista.getValor(l3).equals(lista.getValor(l2)) ||
                !lista.getValor(l3).equals(lista.getValor(l3))){
              listaResultados.agregarAlFinal(lista.getValor(l3),pila.GetDato(l3));
              
        }
        if (!lista.getValor(l4).equals(lista.getValor(l1)) || !lista.getValor(l4).equals(lista.getValor(l2)) ||
                !lista.getValor(l4).equals(lista.getValor(l3))){
              listaResultados.agregarAlFinal(lista.getValor(l4),pila.GetDato(l4));
              
        }
        
         System.out.println("Resultado cliente mas un regalo :");
         
        listaResultados.listar();
        
    }
    
}
