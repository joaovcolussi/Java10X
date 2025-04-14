import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa");
        int idade = scanner.nextInt();

        //Usando operador ternário para verificar a maior idade

        String resultado = (idade>= 18) ? "Maior de idade" : "Menor de Idade";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}

