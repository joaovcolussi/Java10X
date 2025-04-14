import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade, jovem ninja: ");
        int idade = scanner.nextInt();
        if(idade >= 12){
            System.out.println("Parabéns! Você pode participar od exame Chunin!");
        }else{
            System.out.println("Você ainda não pode participar, tente daqui algum tempo");
        }
        scanner.close();
    }
}
