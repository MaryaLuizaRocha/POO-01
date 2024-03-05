package Cachorro;

public class CachorroTeste {

        public static void main(String[] args) {
            Cachorro c1 = new Cachorro();
            Cachorro c2 = new Cachorro();

            c1.raca = "Lulu da Pomerânia";
            c1.cor = "Branco";
            c1.tamanho = 50;
            c1.tamRabo = true;

            c2.raca = "Poodle";
            c2.cor = "Branco";
            c2.tamanho = 30;
            c2.tamRabo = false;

            c1.latir();
            c2.latir();

            System.out.println(" eu sou da Raça " + c1.raca + " e minha cor é " + c1.cor + " e meu tamanho é " + c1.tamanho + " e tenho rabo: " + c1.tamRabo);
            System.out.println(" eu sou da Raça " + c2.raca + " e minha cor é " + c2.cor + " e meu tamanho é " + c2.tamanho + " e tenho rabo: " + c2.tamRabo);
        }
}
