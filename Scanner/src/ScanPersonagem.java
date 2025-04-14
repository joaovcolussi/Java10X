import java.util.Scanner;

public class ScanPersonagem {
    public static void main(String[] args) {
        /*SwitchCases: Que servem para gerar casos específicos
        Objetivo: Pedir pro usuário escolher entre os ninjas
        SwitchCase
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);


        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu Sakura Haruno");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        scanner.close();

    }
}

