import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de missões desse ninja: ");
        int nivel = scanner.nextInt();
        String nivelDoNinja = (nivel >=10 ) ? "Esse ninja tem mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println("Número de Missões : " + nivelDoNinja);
    }
}
