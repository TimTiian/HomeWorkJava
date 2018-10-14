package GitHomeWork;

import java.io.*;
import java.util.*;

/**
 * @Topic: Dictionary
 * @author Chenliang Tian
 * @date Oct 13 2018
 */

public class Dictionary {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap map = new HashMap();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");

        String type = input.nextLine(); //Construct the Scanner object for reading

        Scanner s = new Scanner(new BufferedReader( new FileReader("src/testing/dict.txt")));//open dict.txt;
        String d = s.next(); // save every word change string
        int x = 0;

        if(s.hasNext()){       // traverse map
            x++;
            map.put(d, x);
            if(s.hasNext() == false){
                return;
            }
        }
        if(map.containsKey(type)){         // judge the type content wether belong to map set
            System.out.println("good");
        } else{
            System.out.println("mis-spelled");
        }
    }
}
