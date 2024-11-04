package org.example;

import java.util.Scanner;

public class FactorialRecursivamente {

}
static int factorialRecursivo(int numero){
    long res;
    if(numero==0){
        res =1;
    }
    else res= numero*factorialRecursivo(numero-1);
    return res;

}
static int mElevadoN(int numero,int exponente){
    long res;
    if(numero==1){
        res =1;
    }
    else res= numero*mElevadoN(m,numero-1);
    return res;

}
