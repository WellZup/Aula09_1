package Exercicio03;
import java.util.Scanner;
public class Ler_5_numeros_e_somar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 5 números e veja suas somas: ");

        int soma = 0;
        for (int i= 0; i < 5; i ++){
            int n = entrada.nextInt();

            soma += n;
        }

        System.out.println("O resultado dos números escolhidos foi :\n" + soma);
    }
}
