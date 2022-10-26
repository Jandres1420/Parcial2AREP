/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

/**
 *
 * @author juan.pico-m
 */
public class Palindromo {
    
    public static String getOperation(){
        return "Palindromo";
    }
    
    public static Boolean isPalindromo(String value){
        String alReves = "";
        for(int i = value.length()-1 ; i>=0;i--){
            alReves+=value.charAt(i);
        }
        if(alReves.equals(value)){
            return true;
        }return false;
    }
    
}
