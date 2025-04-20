public class objetos {
    public static void main(String[] args) {
        //Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 18;
        System.out.println(Naruto.nome);

        //Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Aldeia da Folha";
        System.out.println(Sasuke.nome);
        Sasuke.SharinganAtivado();

        //Sakura Harumi
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Harumi";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        System.out.println(Sakura.nome);
    }
}
