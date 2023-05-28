package Exercicio05;
import java.util.Scanner;

public class FilaDoBanco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int quantidade = 0; // qtnr =
        int fila;
        String opcao = "S";

        System.out.println("Digite a quantidade de pessoas na fila: \n");
        quantidade = entrada.nextInt();


        while (opcao.equalsIgnoreCase("S") ){


            contador ++;
            System.out.println("Chamando a primeira pessoa da fila. \n");

            fila = quantidade - contador;
            System.out.println("Quantas pessoa ainda na fila: " + fila +"\n");

            System.out.println("Deseja chamar mais uma pessoa? (S/N) \n");
            opcao = entrada.next();

        }

        System.out.println("Fila encerrada.");
    }
}
