public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Criar um metodo publico personalizado
    public String euSouUmNinja(){
        return "Eu sou um ninja!";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
