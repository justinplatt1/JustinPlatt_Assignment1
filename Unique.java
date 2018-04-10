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
public class Unique {

    public static void main(String[] args) {
        
        String[] strArray = {"abc1", "abc2", "abc3", "abc4"};
        System.out.println(isUnique(strArray));
     

    }

    public static boolean isUnique(String[] strArray) {
       // for (int i = 1; i < strArray.length; i++) {
            
                for (int i = 0; i <strArray.length - 1; i++)
                { 
                    for (int j = i + 1; j < strArray.length; j++)
                    {
                        if (strArray[i].equals(strArray[j]))
                            return false;
                    }
                
            }

        
        return true;

    }
}
/* if you want x array type to work, the parameter for the isUnique method would have
to change to (x[] xArray)*/
