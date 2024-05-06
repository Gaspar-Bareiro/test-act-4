package act4;

import java.util.Arrays;
import java.util.List;

public class Principial {

    public static int dividir(int a, int b) {
        return a / b;
    }

    //C
    public static int dividirC(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("EJERCICIO DE EXCEPIONES");
        int result;
        
        //A
        System.out.println("A");
        result = dividir(10, 2);
        System.out.println("resultado = " + result);
        result = dividir(21, 3);
        System.out.println("resultado = " + result);
        //result = dividir(1,4);
        ///System.out.println("resultado = "+result);  // muestra cero xq devuelve int la funcion
        System.out.println("");
    
        //B
        //System.out.println("B");
        //result = dividir(10,0);    //cuando b es cero lanza la excepcion: java.lang.ArithmeticException:
        //System.out.println("resultado = "+result);
        //System.out.println("");
        
        //C
        System.out.println("C");
        result = dividirC(4, 0);
        System.out.println("resultado = " + result);
        System.out.println("");

        //D  La excepcion mas adecuada es 'no comprobada'
        System.out.println("D");
        try {
            result = dividir(10, 0);
            System.out.println("resultado = " + result);
        } catch (ArithmeticException e) {
            System.out.println("ERROR, no se pudo dividir. Excepcion: " + e.getMessage());
        }
        System.out.println("");






        
        //Ejercicio de streams
        //https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        System.out.println("EJERCICIO DE STREAMS");
        List<String> myList = Arrays.asList("a1", "b1", "c2", "c1");
        myList.stream()
                .filter(s -> s.startsWith("c")) // = c2, c1
                .map(String::toUpperCase)       // = C2, C1
                .sorted()                       // = C1, C2
                .forEach(System.out::println);  //muestra en pantalla
        
        //A Retorna C1 TAB C2
        
        //B
        /*En Java, un Stream es una secuencia de elementos que permite operaciones secuenciales 
        y paralelas en colecciones de datos.
        
        A sequence of elements supporting sequential and parallel aggregate operations.
        FUENTE: JAVA API
        */
        
        //C
        //https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // filtrar numeros pares
        //https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        
        System.out.println("numeros pares:");
        numbers.stream()
                .filter(n -> n % 2 == 0)        // = 2, 4, 6, 8, 10
                .forEach(System.out::println);  //muestra en pantalla
    }

}
