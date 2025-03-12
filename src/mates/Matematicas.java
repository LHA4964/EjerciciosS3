package mates;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.*;

public class Matematicas{
    public static int suma1n(int n){ //ej1
        return IntStream.rangeClosed(0,n).sum();
    }
    public static int factorial(int num){ //ej2
        return IntStream.rangeClosed(1, num)
                .reduce(1, (x, y) -> x*y);
    }
    public static double potencia(int n, int p){ //ej3
        return Math.pow(n,p);
    }
    public static int sumaLista(int [] comandos){ //ej4
        return Arrays.stream(comandos)
                .sum();
    }
    public static double mediaLista(int [] comandos){ //ej5
        return Arrays.stream(comandos).average().orElse(0.0);
    }
    public static int sumaPares(int n){ //ej6
        return IntStream.rangeClosed(1,n).
                filter(x -> x%2==0).sum();
    }
    public static int sumaParesLista(int [] comandos){ //ej7
        return Arrays.stream(comandos)
                .filter(num -> num % 2 == 0)
                .sum();
    }
}