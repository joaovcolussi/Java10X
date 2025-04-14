public class lacos {
    public static void main(String[] args) {
        /*
        Laços de Repetição : Vão repetir infinitamente ou até você parar
        WHILE = FOR
         */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones){
            System.out.println("O naruto fez um clone das sombras " + numeroDeClones);
            numeroDeClones++;
        }
        
        //FOR

        for (int iCount = 0; iCount <= numeroDeClones ; iCount++) {
            System.out.println("O naruto fez um clone das sombras: " + iCount);
        }
    }
}
