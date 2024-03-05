package Pessoa;
public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();


        p1.nome = "Ana";
        p1.idade = 30;
        p1.cidade = "São Paulo";

        p2.nome = "João";
        p2.idade = 25;
        p2.cidade = "Rio de Janeiro";

        p1.apresentar();
        p2.apresentar();
    }
}