package pbo;

public class Mahasiswa extends Orang {
    String nim;
    
    void panggilNama(){
         System.out.println("Identitas, "+ this.nim +" bernama "+ super.nama );
    }
}
