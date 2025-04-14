import java.util.Scanner;

public class Jutso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o número do Jutso (1: Resengan, 2: Chidori, 3: Kage Bunshin) :");
        int jutso = scanner.nextInt();
        switch (jutso){
            case 1:
                System.out.println("Naruto usa Rasengan!");
                break;
            case 2:
                System.out.println("Naruto usa Chidori! (Mesmo que não seja dele)");
                break;
            case 3:
                System.out.println("Naruto usa Kage Bunshin no Jutsu!");
                break;
            default:
                System.out.println("Jutsu desconhecido. Tente novamente");
                break;
        }
        scanner.close();
    }
}
