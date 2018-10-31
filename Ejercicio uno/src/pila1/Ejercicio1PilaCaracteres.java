
package pila1;

import java.util.Scanner;


public class Ejercicio1PilaCaracteres {

    
    public static void main(String[] args) throws Exception {
        //primer ejercicio Alumno: Dany Daniel Uch Noh
        //un programa que lea en una sequencia de caracteres y los imprima en orden inverso
        clasePila pila = new clasePila();
        nodito data = new nodito();
        String texto1;
        Scanner boton = new Scanner (System.in);
        System.out.println("Digite una palabra"); texto1=boton.nextLine();
        pila.Separar(texto1);
        
        String palabras[] = new String [pila.Separar(texto1).length]; palabras=pila.Separar(texto1);
        
        for (int i=0; i<pila.Separar(texto1).length; i++){
            pila.apilar(palabras[i]);
        }
        
        System.out.print("Palabra = "); pila.imprimelista();
        System.out.println("");
        System.out.println("imprimir pila");
        pila.listar();
        
        
        
    }
    
}
