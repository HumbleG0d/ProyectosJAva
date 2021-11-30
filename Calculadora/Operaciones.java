/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author sergio
 */
public class Operaciones {
   
    
    public static double Suma(double n1 [] , double n2 []){
         double r = 0; 
        for(int i = 0 ; i < 100 ; i++){
            r = r + (n1 [i]  + n2[i]);
        }
        return r;
    }
    public static double Resta(double n3 [] , double n2 [] ){
        double p = 0;
        for(int i = 0 ; i < 100 ; i++){
            p =  (n3[i] - n2[i]) - p ;
        }
        return -1*p;
    }
    public static double Mult(double n4 [] , double n2 [], int c3){
        double q = 1;
        if(c3 == 1){
            for(int i = 0 ; i<c3 ; i++){
                q=q*(n4[i]*n2[i]);
            }
        }
        else{
            for(int j = 0 ; j < c3-1 ; j++){
            for(int i = 0; i < c3 ; i++){
                q=q*n4[i];
        }
            q = q*n2[j];
        }
        }
        return q;
    }
    public static double Div(double n5 [] , double n2 [] , int c4){
        double s = 1;
        if(c4 == 1){
            for(int i = 0 ; i < c4 ; i++){
                  s = (n5[i]/n2[i])/s;
                 }
        }
        else{
            for(int j = 0 ; j < c4 -1 ; j++){
                for(int i = 0 ; i <c4 ; i++){
                    s = n5[i]/s;
                }
                s =Math.pow(s, -1);
                s = s/n2[j];
            }
        }
        return s;
    }
    
}
