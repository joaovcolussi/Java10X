public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        //Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*Dados nao primitivos: String, Array, Class, Enum
        Objetivo: Criar um ninja e atribuir metodos a ele.
         */

        //Declarando a variavel como NARUTO UZUMAKI

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); //ToUpperCase vai colocar tudo em capslock
        System.out.println("Esse texto está em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaEmCaixaBaixa = aldeia.toLowerCase(); //ToLowerCase vai colocar tudo em caixa baixa/minusculo
        System.out.println(aldeiaEmCaixaBaixa);
    }
}
