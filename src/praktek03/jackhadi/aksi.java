package praktek03.jackhadi;

public class aksi {
    public static void main(String[] args) {
        Handphone e = new Handphone();
         
        e.setJenis("Iphone");
        e.setMerk("Iphone 7");
        e.setHarga(9000);
        
        e.cetakInfo();
        
         System.out.println("Jenisnya \t: ");
         System.out.println(e.getJenis());
         System.out.println("Merknya \t: ");
         System.out.println(e.getMerk());
         System.out.println("Harganya \t: ");
         System.out.println(e.getHarga());
    }
    
}
