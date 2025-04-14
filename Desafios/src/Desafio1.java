public class Desafio1 {
    public static void main(String[] args) {

        //Ninja1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Encontrar o bandido";
        String statusDaMissao = "Em Andamento";
        char nivelDaMissao = 'S';

        if(idade < 15){
            if(nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "Concluída";
            }else {
                statusDaMissao = "Não Concluida, idade insuficiente";
            }
        }else{
            statusDaMissao = "Concluída";
        }

        System.out.println("----------------------------------");

        System.out.println("Nome do Ninja :" + nomeNinja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel da Missao: " + nivelDaMissao);
        System.out.println("Status da Missao: " + statusDaMissao);

        System.out.println("-----------------------------------");


        //Ninja2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 14;
        String missao2 = "Encontrar o Naruto";
        String statusDaMissao2 = "Em Andamento";
        char nivelDaMissao2 = 'D';

        if(idade < 15){
            if(nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "Concluída";
            }else {
                statusDaMissao = "Não Concluida, idade insuficiente";
            }
        }else{
            statusDaMissao = "Concluída";
        }

        System.out.println("----------------------------------");

        System.out.println("Nome do Ninja :" + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Nivel da Missao: " + nivelDaMissao2);
        System.out.println("Status da Missao: " + statusDaMissao2);

        System.out.println("-----------------------------------");

        //Ninja3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 20;
        String missao3 = "Curar Feridos";
        String statusDaMissao3 = "Concluido";
        char nivelDaMissao3= 'D';

        if(idade < 15){
            if(nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "Concluída";
            }else {
                statusDaMissao = "Não Concluida, idade insuficiente";
            }
        }else{
            statusDaMissao = "Concluída";
        }

        System.out.println("----------------------------------");

        System.out.println("Nome do Ninja :" + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Nivel da Missao: " + nivelDaMissao3);
        System.out.println("Status da Missao: " + statusDaMissao3);

        System.out.println("-----------------------------------");

    }
}
