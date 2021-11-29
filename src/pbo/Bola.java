package pbo;

public class Bola {
    private double berat;

    public Bola() {
        System.out.println("Ini Cons Class Bola");
    }
    
    void setBerat(double d){
        this.berat = d;
    }
    
    double getBerat(){
        return this.berat;
    }
}
