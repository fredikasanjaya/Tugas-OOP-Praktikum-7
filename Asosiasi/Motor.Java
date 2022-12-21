package Asosiasi;

public class Motor implements RodaDua{
    public String brand;
    public int Tahun;

    @Override
    public void powerON(){
        System.out.println("(ON) Motor Menyala");
    }

    @Override
    public void powerOFF(){
        System.out.println("(OFF) Motor Dimatikan");
    }
}