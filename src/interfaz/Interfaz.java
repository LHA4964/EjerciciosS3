package interfaz;
import mates.Matematicas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Interfaz {
    private Scanner sc;

    public Interfaz() {
        this.sc = new Scanner(System.in);
    }

    public String[] instruccion() {
        String instruccion = sc.nextLine();
        return instruccion.split(",");
    }
    public void menu(){ //menu
        help();
        boolean continuar = true;
        while(continuar == true){
            System.out.print("\nEscriba la instrucción: ");
            String[] instr = instruccion();
            int n;

            switch (instr[0].toLowerCase()) {
                case "1":
                    n = Integer.parseInt(instr[1]);
                    System.out.println(Matematicas.suma1n(n));
                    break;
                case "2":
                    n = Integer.parseInt(instr[1]);
                    System.out.println(Matematicas.factorial(n));
                    break;
                case "3":
                    n = Integer.parseInt(instr[1]);
                    int n1 = Integer.parseInt(instr[2]);
                    System.out.println(Matematicas.potencia(n,n1));
                    break;
                case "4":
                    n = instr.length;
                    int [] comandos = new int[n];
                    for (int i = 1; i < n; i++) {
                        comandos[i] = Integer.parseInt(instr[i]);
                    }
                    System.out.println(Matematicas.sumaLista(comandos));
                    break;
                case "5":
                    n = instr.length;
                    int [] comandos1 = new int[n-1];
                    for (int i = 1; i < n; i++) {
                        comandos1[i-1] = Integer.parseInt(instr[i]);
                    }
                    System.out.println(Matematicas.mediaLista(comandos1));
                    break;
                case "6":
                    n = Integer.parseInt(instr[1]);
                    System.out.println(Matematicas.sumaPares(n));
                    break;
                case "7":
                    n = instr.length;
                    int [] comandos3 = new int[n];
                    for (int i = 1; i < n; i++) {
                        comandos3[i] = Integer.parseInt(instr[i]);
                    }
                    System.out.println(Matematicas.sumaParesLista(comandos3));
                    break;
                case "0":
                    System.out.println("Saliendo");
                    continuar = false;
                    break;
                default:
                    System.out.println("\nInstruccion no valida\n");
                    help();
                    break;
            }
        }
    }
    public void help(){
        System.out.println("Instrucciones disponibles (1-8):\n" +
                "Ej.1: Suma de 1 a n\n" +
                "Ej.2: Factorial de n\n" +
                "Ej.3: Potencia de un número (n^p)\n" +
                "Ej.4: Suma de numeros en una lista\n" +
                "Ej.5: Media aritmetica de una lista\n" +
                "Ej.6: Suma pares hasta n\n" +
                "Ej.7: Suma pares de una lista\n" +
                "0 = salir del programa\n");
    }
}