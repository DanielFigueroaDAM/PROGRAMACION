public class raiz {
    public static void main(String[] args) {
        int n=99,i,mult;
        for(i=0;i<=n;i++){
            mult=i*i;
            if(mult==n){
                System.out.println("la raiz cuadrada es "+i);
                break;
            }
            if(mult>n){
                int resto=n-mult;
                System.out.println("nos hemos pasado y el resto es "+resto);
                break;
            }
        }
    }
}
