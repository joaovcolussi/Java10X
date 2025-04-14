public class ifEelse {
    public static void main(String[] args) {
        /*
        IF e ELSE - Condições
        else if
        Objetivo: Passar o ninja de nivel de acordo com o numero de missões
         */

        //Ninja Naruto
        String nome = "Naruto Uzumaki";
        String Rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissões = 9;

        /*
        if (condicao) {resultado}
        else if (condicao) {resultado}
        else {resultado caso nada seja verdadeiro}
         */

        // se (condicao) {faça isso}
        if (numeroDeMissões == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissões >=20) {
            System.out.println("Rank: Jounin");
        }else{
            System.out.println("Rank: Gennim");
        }
    }
}
