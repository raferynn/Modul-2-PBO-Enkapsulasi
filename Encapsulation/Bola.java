package Encapsulation;
import java.math.*;
public class Bola {
    public double diameter;
    public double volume;
    public double luasPermukaan;
    public double jarijari;


    public Bola(double jarijari){
        this.jarijari = jarijari;
        }

    public void showDiameter()
    {
        this.diameter = 2*jarijari;
        System.out.println("Panjang diameter adalah :\t\t"+ diameter);
    }

    public void showLuasPermukaan()
    {
        this.luasPermukaan = 4 * 22/7 * Math.pow(jarijari,2);
        System.out.println("Luas permukaan bola adalah :\t"+ luasPermukaan);
    }

    public void showVolume()
    {
        this.volume = 4/3 * 22/7 * Math.pow(jarijari,3);
        System.out.println("Volume bola adalah :\t\t\t"+ volume);
    }

}

