import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> newlist = new ArrayList<String>();
      
      
      for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 0){
                
                newlist.add(i, s + " " + s);
    
            }
            else{
                
               newlist.add(i, s + " " + s + " " + s);
        
               
            }
      }
        
        for (int i = 0; i < newlist.size(); i++) {
            System.out.println(newlist.get(i));
        }
    }
}
