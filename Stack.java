import java.util.Stack; 
  
// Main class 
class main { 
  
    // Driver code 
    public static void main(String args[]) 
    { 
         Stack<String> s = new Stack();
        
        s.push("Serkan");
        s.push("Yildirim");
        s.push("Kastamonu");
        s.push("TheJavaProgram");
        
        System.out.println("Stack koleksiyonu : " + s);
        
        int pos = s.search("Kastamonu");
        System.out.println("Kastamonu indexi : " + pos);
        
        String peekElement = s.peek();
        boolean evetBenim=false;

        if(peekElement=="Serkan") 
        {
            evetBenim=true; 
        }
        System.out.println("Stack basindaki ben miyim : " + evetBenim);

        //Vector sınıfından kalıtım alınan size komutu ile eleman sayısı alınabilir
        int ilkSize = s.size();
        System.out.println("Stack eleman sayisi : " + ilkSize);

        //Tersine çevirelim...
        while(s.empty() == false){
            System.out.println(s.pop());
        }
        
        int sonSize = s.size();
        System.out.println("Pop sonrasi eleman sayisi : " + sonSize);
    } 
}