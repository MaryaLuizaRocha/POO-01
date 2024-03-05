package Circulo;
public class Circulo {

    public double raio;

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void imprimir() {
        System.out.println("Raio: deste circulo: " + raio + " Area: " + calcularArea() + " Perimetro: " + calcularPerimetro());
    }
}
