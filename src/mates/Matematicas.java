package mates;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

public class Matematicas{
    public static int suma1n(int num){
        IntUnaryOperator suma1n = n -> IntStream.rangeClosed(0,n).sum();
        int n = num;
        int resltado = suma1n.applyAsInt(n);
        return resltado;
    }
    public static int factorial(int num){
        IntUnaryOperator factorial = n -> {int resultado = 1;for(int i=1;i<=num;i++){resultado *= i;};return resultado;};
        int n = num;
        int resltado = factorial.applyAsInt(n);
        return resltado;
    }
    public static int potencia(int num, int p){
        IntUnaryOperator resultado = n -> (int) Math.pow(n, p);
        int n = num;
        int result = resultado.applyAsInt(n);
        return result;
    }
    public static int sumaLista(int [] comandos){
        IntUnaryOperator resultado = (n) -> {int suma=0;for(int i=0;i<=n;i++){suma+=comandos[i];}return suma;};
        int n = comandos.length;
        int result = resultado.applyAsInt(n);
        return result;
    }
    public static double mediaLista(int [] comandos){
        int elementos = comandos.length;
        IntUnaryOperator sum = (n) -> {int suma=0;for(int i=0;i<=n;i++){suma+=comandos[i];}return suma;};
        int suma = sum.applyAsInt(elementos);
        return suma/elementos;
    }
    public static int sumaPares(int num){
        IntUnaryOperator sumaPares = n -> IntStream.iterate(n % 2 == 0 ? n : n - 1, i -> i >= 2, i -> i - 2).sum();
        int n = num;
        int resultado = sumaPares.applyAsInt(n);
        return resultado;
    }
    public static int sumaParesLista(List<Integer> comandos){
        return comandos.stream()
                .filter(num -> num % 2 == 0) // Filtra los pares
                .mapToInt(Integer::intValue) // Convierte a int
                .sum();
    }
}