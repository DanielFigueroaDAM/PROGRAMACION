package org.example;

public class compararArrays {
    public static void main(String[] args) {
        int[] numeros1 = {10, 20, 40, 40, 50};
        int[] numeros2 = {10, 20, 40, 40, 50};
        boolean comprobando=comparaArrays(numeros1,numeros2);
        System.out.println(comprobando);
    }
    public static boolean comparaArrays(int [] a, int [] b){
        boolean igual=true;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return igual;
    }
}
