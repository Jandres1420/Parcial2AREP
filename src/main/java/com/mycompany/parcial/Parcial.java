/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parcial;

import org.eclipse.jetty.util.ajax.JSON;
import static spark.Spark.*;

/**
 *
 * @author juan.pico-m
 */
public class Parcial {

    public static void main(String[] args) {
        port(getPort());
        staticFileLocation("/public");
        get("/espalindromo" ,(request, response) ->{
            response.type("application/json");
            return readPalindromo(request, response);
        });
        System.out.println("Hello World!");
    }
    
    public static int getPort(){
        if(System.getenv("PORT")!=null){
            Integer.parseInt(System.getenv("PORT"));
        }return 8080;
    }
    
    public static String readPalindromo(spark.Request request, spark.Response response){
        String value = request.queryParams("value");
        System.out.println("Es palindromo " + Palindromo.isPalindromo(value));
        JSON json = new JSON();
        String outPut= "{\"operation\":\"palíndromo\",\"input\":\""+value+"\",\"output\":\""+Palindromo.isPalindromo(value)+"\" }";
        StringBuffer stringBuffer = new StringBuffer("operation");
        json.appendString(stringBuffer, value);
        System.out.println("JSON " + json.toString());
        return outPut;
    }
}
