package pbo;

public class PBO {

    public static void main(String[] args) {
        Kendaraan k = new Kendaraan("Hyundai", "Atoz", "Hitam", 1200, 4);
        
        System.out.println("Merek: "+ k.getMerek());
        System.out.println("Seri: "+ k.getSeri());
        System.out.println("Warna: "+ k.getWarna());
        System.out.println("CC: "+ k.getCc());
        System.out.println("Roda: "+ k.getRoda());
    }
}
