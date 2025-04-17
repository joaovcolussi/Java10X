public class objetos {
    public static void main(String[] args) {
        //Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 18;
        System.out.println(Naruto.nome);

        //Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia= "Aldeia da Folha";
        Sasuke.idade = 20;
        Sasuke.SharinganAtivado();
        System.out.println(Sasuke.nome);
        System.out.println(Sasuke.euSouUmNinja());
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        //Sakura Harumi
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Harumi";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        System.out.println(Sakura.nome);
    }
}
