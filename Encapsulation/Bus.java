package Encapsulation;

public class Bus {

    public int penumpang;
    public int maxPenumpang;
    public int berat;
    public double average;

    public Bus(int maxPenumpang)
    {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void addPenumpang(int penumpang)
    {
        int temp;
        temp = this.penumpang + penumpang;

        if (temp > maxPenumpang) {
            System.out.println("full");
        }else {
            this.penumpang = temp;
        }
    }

    public void addBerat(int berat)
    {
        int temp;
        temp = this.berat + berat;
        this.berat = temp;
    }

    public void getAverage()
    {
        average = this.berat / this.penumpang;

    }

    public void cetak() {
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah "+ maxPenumpang);
        System.out.println("Berat penumpang rata-rata adalah "+ average +"kg");
        System.out.println(" ");
    }

}
