import java.util.LinkedList; 
  
// Main class 
class main { 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        LinkedList<String> meyveListesi = new LinkedList<String>(); 
  
        meyveListesi.add("Armut"); 
        meyveListesi.add("Elma"); 
        meyveListesi.addLast("Erik"); 
        meyveListesi.addFirst("Karpuz"); 
        /*Elma yerine kiraz*/ 
        meyveListesi.add(2, "Kiraz"); 
  
        System.out.println("Degisiklikler olmadan once");
        System.out.println(meyveListesi); 
  
        meyveListesi.remove("Erik"); 
        meyveListesi.remove(0); 
        meyveListesi.removeFirst(); 
        meyveListesi.removeLast(); 
        System.out.println("Degisiklikler olduktan sonra");
        System.out.println(meyveListesi); 
    } 
}