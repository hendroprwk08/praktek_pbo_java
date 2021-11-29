package pbo;

public class Pegawai extends Orang {
    String nip;
    
    void panggilNama(){
        System.out.println("Identitas, "+ this.nip +" bernama "+ super.nama );
    }
}
