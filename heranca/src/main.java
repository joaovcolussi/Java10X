public class main {

    public static void main(String[] args) {
        // Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome  = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 19;
        Naruto.ModoSabioAtivado();

        //Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 20;
        Sasuke.SharinganAtivado();

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 20;
        Sakura.AtivarCura();
    }


}
