/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platt_cis365_assignment1;

import java.util.Scanner;

/**
 *
 * @author justinplatt
 */
public class Reverse {
    public static void main(String[] args) {
        String str;
        int count = 3;
        Scanner kb = new Scanner(System.in);
     
        System.out.println("Please enter a string and this program will return the reverse string:");
        str = kb.nextLine();
              
            while (str == null || "".equals(str))
        {
            -- count;
            
            if (count > 0)
            { 
            System.out.println("Null or empty values are not allowed. Please try again (" + count + " attempts remaining)" );
            str = kb.nextLine();
            }
            else
            {
                System.out.println("Sorry, you have reached the maximum number of attempts");
                System.exit(0);
            }
        }
            
                   
            
            
        System.out.println(reverseString(str));
        
    }
    
    /*
   For null or empty strings could also do
        if (str == null || "".equals(str)
            throw new InvalidParameterException("Value is empty or null");
    */
        
        public static String reverseString(String str){
            StringBuilder str2 = new StringBuilder();
            str2.append(str);
            str2.reverse();
            str = str2.toString();
            return str;
        
        }
    }
    

