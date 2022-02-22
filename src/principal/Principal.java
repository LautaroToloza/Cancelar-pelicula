package principal;

import java.util.Scanner;
/**
 * @author Lautaro Toloza
 */
public class Principal {

    public static void main(String[] args) {
        /* Consigna: 
        Cargar una lista de peliculas de forma dinamica 
        y cargar una pelicula cancelada
        mostrar todas las peliculas hasta que se llegue a la cancelada
        */
        
        boolean flag = false;
        int indice = 0;
        int cantidad = cargarNumero("Ingrese la cantidad de la lista: ");
        String[] pelicula = new String[cantidad];
        cargarLista(pelicula);
        String cancelada = cargarTexto("Ingrese el nombre de la pelicula que quiere cancelar: ");
        System.out.println("***************************************************************************");
        System.out.println("Resultados..\n ");
        // Mostrar peliculas hasta la cancelada.
        while (flag == false) {
            if (pelicula[indice].equals(cancelada)) {
                flag = true;
            } else {
                System.out.println("Pelicula: " + pelicula[indice]);
            }
            indice++;
        }

    }

    public static String cargarTexto(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        String ingresar = leer.nextLine();

        return ingresar;
    }

    public static int cargarNumero(String texto) {
        Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        int numero = leer.nextInt();

        return numero;
    }

    public static void cargarLista(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            String texto = "Ingrese el nombre de una pelicula en la posición (" + (i + 1) + ") :";
            lista[i] = cargarTexto(texto);

        }
    }
    
}
