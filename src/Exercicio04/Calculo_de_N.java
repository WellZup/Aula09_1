package Exercicio04;
import java.util.Scanner;
public class Calculo_de_N {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int soma = 0;
        int qtnr = 0; // qtnr = quantidade de números
        int media;

        System.out.println("Digite a quantidade de numeros desejados: \n");
        qtnr = entrada.nextInt();

        System.out.println("Digite os números: \n");

        while (contador < qtnr){
            int num = entrada.nextInt(); // num = numeros
            soma += num;
            contador++;
        }
        media = soma / qtnr;

        System.out.println(media);


    }
}
