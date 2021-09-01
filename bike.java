package Semana3;

public class BikeTester {
    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.marca = "Caloi";
        bike.qtdMarchas = 21;
        bike.cor = "Branca";

        bike.andar();
        bike.frear();
    }
}