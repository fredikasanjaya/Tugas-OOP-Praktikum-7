package Asosiasi;

public class Human {
    public String brand;
    public Motor Kendaraan;

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