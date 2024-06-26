import java.util.LinkedList;
import java.util.Queue; 
  
// Main class 
class main { 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        Queue<String> firinKuyruk = new LinkedList<>();
        firinKuyruk.add("Serkan");
        firinKuyruk.add("Ayşe");
        firinKuyruk.add("Fatma");
        firinKuyruk.add("Hayriye");
        firinKuyruk.add("Ali");
    
    System.out.println("Fırın sıra Elementleri:"+firinKuyruk);

    System.out.println("Serkanı annesi çağırdı: "+firinKuyruk.remove());
    
    System.out.println("Kuyrukdaki yeni birinci sıra: "+firinKuyruk.element());
    
    System.out.println("Kuyruk baştaki aldı ve gitti: "+firinKuyruk.poll());

    System.out.println("Yeni kuyruk birincisi  "+firinKuyruk.peek());
    
    //Değişiklikler sonucu son durum
    System.out.println("Sonuç Queue:"+firinKuyruk);
    } 
}