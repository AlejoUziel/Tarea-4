/*
comentarios del ejercicio. Alejandro Velasquez.
Primer método: Retornar un mensaje que diga: "Programación Orientada a Objetos".

Segundo método: Declarar una variable de tipo entero y asignarle un número X que represente 
la edad del estudiante. Retornar un mensaje dependiendo de esa variable si es mayor o igual a 21, 
el mensaje debe decir Mayor de edad, de lo contrario Menor de edad.

Tercer método: Retornar el resultado de una Multiplicación de dos enteros que proporcionemos como 
parámetros.

Cuarto método:  Debe retornar una lista de numeros del 1 al X. Donde X es un parámetro de entrada 
del método a crear.
*/

package tarea.módulo.pkg2;
public class Recursos {
  
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos";
    }

    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int[] generarLista(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}
