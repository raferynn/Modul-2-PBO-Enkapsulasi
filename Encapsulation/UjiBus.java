package Encapsulation;

public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus(15);

        busMini.addPenumpang(1);
        busMini.addBerat(60);
        busMini.getAverage();
        busMini.cetak();

        busMini.addPenumpang(1);
        busMini.addBerat(57);
        busMini.getAverage();
        busMini.cetak();

        busMini.addPenumpang(2);
        busMini.addBerat(117);
        busMini.getAverage();
        busMini.cetak();

        busMini.addPenumpang(3);
        busMini.addBerat(195);
        busMini.getAverage();
        busMini.cetak();
    }
}

