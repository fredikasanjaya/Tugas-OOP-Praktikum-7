package Komposisi;

public class Main {
    public static void main(String[] args){

        // Membuat Objek Manusia
        Human Fredika = new Human ("Beat", 2022);

        /* Memanggil atribut dan nilai */
        Fredika.brand = "Beat";
        Fredika.powerON();
        Fredika.run();
        Fredika.powerOFF(); 
    } 
}