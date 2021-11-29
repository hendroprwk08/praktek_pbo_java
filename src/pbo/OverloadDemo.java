package pbo;

public class OverloadDemo {  
    String s;
    int j;
    
    OverloadDemo(){
        System.out.println("Aku Contoh Overloading Pada Constructor" );
    }

    OverloadDemo(String d){
        this.s = d;
    }

    OverloadDemo(String d, int j){
        this.s = d;
        this.j = j;
    }

    void tanaman(){
        System.out.println("Aku memiliki tanaman Bunga Kamboja" );
    }
    
    void tanaman(String n){
        System.out.println("Aku memiliki tanaman "+ n );
    }
    
    void tanaman(String n, String j){
        System.out.println(n + " termasuk dalam jenis "+ j );
    }
    
    String tanaman(String n, String a, String p){
        return n +" berasal dari "+ a +" Populasi"+ p;
    }
}
