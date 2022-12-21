package Agregasi;

public class Main {
    public static void main(String[] args){

        Motor Kendaraan = new Motor();

        Kendaraan.brand = "Beat";
        Kendaraan.Tahun = 2022;

        Human Fredika = new Human(Kendaraan);

        Fredika.brand = "Beat";
        Fredika.Kendaraan = Kendaraan;
        Fredika.powerON();
        Fredika.run();
        Fredika.powerOFF();
    }
}