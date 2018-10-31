package ejercicio2_depilaacola;

import java.util.Scanner;

public class SegundoEjercicioPilaYCola {

    public static void main(String[] args) {
        Scanner Boton = new Scanner(System.in);
        ClasePila ObjetoPila = new ClasePila();
        ClaseCola ObjetoCola = new ClaseCola();
        System.out.println("Cuantos elementos va a ingresar a la pila  ");
        System.out.print("R = ");
        int n = Boton.nextInt();
        System.out.println("Digite cada valor en la posicion indicada");
        String e;
        for (int l = 1; l <= n; l++) {
            System.out.print( l + ": ");
            e = Boton.next(); ObjetoPila.insertar(e);
        }
        
        System.out.println("Operacion finalizada");

        System.out.println("Pasando los elementos a la cola");
        for (int i = 1; i <= n; i++) {
            ObjetoCola.insertar(ObjetoPila.quitar());
            System.out.print(ObjetoCola.quitar()+", ");
        }
        System.out.println("Operacion terminada");
    }

}
