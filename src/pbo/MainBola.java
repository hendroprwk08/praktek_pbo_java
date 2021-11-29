package pbo;

public class MainBola {
    public static void main(String[] args){
        BolaBasket bb = new BolaBasket();
        //akses class parent
        bb.setBerat(23.5);
        System.out.println("Berat bola "+ bb.getBerat());
    }
}
