package CS201_Assignments.Lab_8_9;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence.");
        Scanner textInput = new Scanner(System.in);

        String s = textInput.nextLine();
        LinkedHashMap hMap = new LinkedHashMap();

        hMap.put('a', 0);
        hMap.put('e', 0);
        hMap.put('i', 0);
        hMap.put('o', 0);
        hMap.put('u', 0);


        if (s != " ") {
            for (int i = 0; i < s.length() - 1; i++) {

                if (hMap.containsKey(s.charAt(i))) {
                    int count = (int) hMap.get(s.charAt(i));
                    hMap.put(s.charAt(i), ++count);
                }
            }
            System.out.print(hMap);
        }
    }
}
