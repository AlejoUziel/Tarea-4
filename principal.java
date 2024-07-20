package tarea.módulo.pkg2;

public class principal {
    public static void main(String[] args) {
         Recursos recursos = new Recursos();
      
        String mensaje = recursos.obtenerMensaje();
        System.out.println("Mensaje: " + mensaje);

        int edad = 19; 
        String resultadoEdad = recursos.verificarEdad(edad);
        System.out.println("Resultado de edad (" + edad + " años): " + resultadoEdad);

        
        int num1 = 9;
        int num2 = 8;
        int resultadoMultiplicacion = recursos.multiplicar(num1, num2);
        System.out.println("Multiplicacion de " + num1 + " y " + num2 + ": " + resultadoMultiplicacion);

       
        int x = 19; 
        int[] listaNumeros = recursos.generarLista(x);
        System.out.print("Lista de numeros del 1 al " + x + ": ");
        for (int num : listaNumeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
}
