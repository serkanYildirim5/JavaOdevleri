import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

        List<String> nobetciList = new ArrayList<>();
 
        System.out.println("Nöbet listesi bos mu? : " + nobetciList.isEmpty());
 
        nobetciList.add("Ali");
        nobetciList.add("Veli");
        nobetciList.add("Mehmet");
 
        System.out.println("Listede toplam " + nobetciList.size() + "  tane nöbetci var.");
        System.out.println(nobetciList);
 
        // Nöbetci okuma
        String nobet1 = nobetciList.get(0);
        String nobet2 = nobetciList.get(1);
        String sonNobet = nobetciList.get(nobetciList.size() - 1);
 
        System.out.println("İlk gün nöbetci: " + nobet1);
        System.out.println("İkinci gün nöbetci: " + nobet2);
        System.out.println("Sonuncu gün nöbetci: " + sonNobet);
 
        // Belirtilen indexdeki nöbetci değiştir
        nobetciList.set(2, "Fatma");
        System.out.println("Değiştiriledikten sonra nobetler: " + nobetciList);
  }
}