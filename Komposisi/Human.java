package Komposisi;

public class Human {
    public String brand;
    public Motor Kendaraan;

    public Human(String brandKendaraan, int Tahun){
        Kendaraan = new Motor();
        Kendaraan.brand = brandKendaraan;
        Kendaraan.Tahun = Tahun;
    }

    public void powerON(){
        Kendaraan.powerON();
    }
    public void powerOFF(){
        Kendaraan.powerOFF();
    }

    public void run(){
        System.out.println("Motor sedang dijalankan oleh manusia");
    } 
}