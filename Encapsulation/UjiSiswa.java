package Encapsulation;

public class UjiSiswa {
    public static void main(String[] args) {

        Siswa siswa = new Siswa();
        siswa.setName("Rafi");
        siswa.setAbsen(30);
        siswa.setAddress("Malang");

        System.out.print("Nama : "+ siswa.getName() +
        "\tAbsen : "+ siswa.getAbsen() +
        "\tAddress : "+ siswa.getAddress());
    }
}
