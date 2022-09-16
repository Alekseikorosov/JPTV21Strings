/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings21;


import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author pupil
 */
public class Strings21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("-------Работа со строками ---------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        char[] charArrayBegin = str.toCharArray();
        char[] charArrayEnd = new char[charArrayBegin.length];
        for(int i = 0; i < charArrayBegin.length; i++){
            charArrayEnd[i] = charArrayBegin[charArrayBegin.length - 1 - i];
            
        }
        System.out.println("CharArrayEnd = "+ Arrays.toString(charArrayEnd));
        String reversString = new String(charArrayEnd);
        System.out.println("Revers string: "+ reversString);
        
    }
    
}
