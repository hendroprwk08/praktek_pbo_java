package pbo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Karyawan {
    String nik, nama, bagian;
    double gaji_pokok;
    
    double getGajiPokok(){
        if(bagian == "Keuangan"){
            gaji_pokok = 12000;
        }else if(bagian == "Produksi"){
            gaji_pokok = 11000;
        }else{
            gaji_pokok = 10000;
        }
        
        return gaji_pokok;
    }
    
    void cetak(){
        DecimalFormat df = new DecimalFormat("##0,000");
        
        System.out.println("------ Detil Karyawan ------");
        System.out.println("No: "+ this.nik);
        System.out.println("Nama: "+ this.nama);
        System.out.println("Bagian: "+ this.bagian);
        System.out.println("Gaji Pokok: "+ df.format(getGajiPokok()));
    }
}

class MainKaryawan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Karyawan k = new Karyawan();
        
        System.out.print("Nomer Karyawan: ");
        k.nik = sc.next();
        
        System.out.print("Nama: ");
        k.nama = sc.next();
        
        System.out.print("Bagian: ");
        k.bagian = sc.next();
        
        k.cetak();
    }
}