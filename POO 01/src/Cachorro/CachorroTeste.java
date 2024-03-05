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

            System.out.println("Raça: " + c1.raca);
            System.out.println("Cor: " + c1.cor);
            System.out.println("Tamanho: " + c1.tamanho);
            System.out.println("Tamanho do rabo: " + c1.tamRabo);

            System.out.println("Raça: " + c2.raca);
            System.out.println("Cor: " + c2.cor);
            System.out.println("Tamanho: " + c2.tamanho);
            System.out.println("Tamanho do rabo: " + c2.tamRabo);
        }
}
