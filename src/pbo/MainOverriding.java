package pbo;

public class MainOverriding {
    public static void main(String[] args){
        Mahasiswa m = new Mahasiswa();
        m.nim = "20149879871";
        m.nama = "Mahmud Sunandar"; //dari class orang
        
        m.panggilNama();
    }
}
