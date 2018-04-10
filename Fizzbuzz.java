/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platt_cis365_assignment1;

/**
 *
 * @author justinplatt
 */
public class Fizzbuzz {
    
    
    
    public static void main(String[] args) {
        
    int value = 1;
    fizzBuzzSort(value);
    
    value = 1000;
    nthPrime(value);
    
    
    }
    
    private static void fizzBuzzSort(int num){
        while (num <= 100)
        {
            if (num%3 ==0 & num%5 ==0)
                System.out.println("FizzBuzz");
            else
            if (num%3 == 0)
            System.out.println("Fizz");
            else if (num%5 ==0)
                System.out.println("Buzz");
            else
        System.out.println(num);
            
        num++;
        }
    }
    
     public static void nthPrime(int n) {
     
    int num;
    int count;
   
    for(num = 2, count = 0; count < n; ++num) {
        if (isPrime(num)) {
            ++count;
        }
    }
        System.out.println("The " + n + "th prime number is : " + (num - 1));
                
}
    
    
    
private static boolean isPrime(int num) {
    for(int i = 2; i < num; ++i) {
        if (num % i == 0) {
          
            return false;
        }
    }
    return true;
}
    }


