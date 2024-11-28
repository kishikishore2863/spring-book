package stream.com;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyClass {


        public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            String str1 = sc.nextLine();
            System.out.println(removeDuplicates(str1));
        }

        public static String removeDuplicates(String input){
            String result = "";
            for(int i=0;i<input.length();i++){
                char currentChar = input.charAt(i);
                if(result.indexOf(currentChar) == -1 ){
                    result +=currentChar;
                }

            }
            return result;
        }



}





