package pbo;

public class Kendaraan {
    String merek, seri, warna;
    int cc, roda;
    
    public Kendaraan(String m, String s, String w, int c, int r){
        this.merek = m;
        this.seri = s;
        this.warna = w;
        this.cc = c;
        this.roda = r;
    }

    public Kendaraan() {}

   
    String getMerek(){
        return this.merek;
    }
    
    String getSeri(){
        return this.seri;
    }
    
    String getWarna(){
        return this.warna;
    }
    
    int getCc(){
        return this.cc;
    }
    
    int getRoda(){
        return this.roda;
    }

}