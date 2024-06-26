import java.util.*;
  
// Main class 
class main { 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        doTreeSet();
    } 
    public static void doTreeSet() {
        final int MAX = 10;
        System.out.println();
        Set ss = new TreeSet(); 
        for (int i = 1; i <=MAX; i++) {
            System.out.println(" - tree konulan Integer :" + i);
            ss.add(new Integer(i));
        }
        
        System.out.println();
        Iterator i = ss.iterator(); 
        while (i.hasNext()) {
            System.out.print("\t" + i.next());
        }
        } 
    
    }


