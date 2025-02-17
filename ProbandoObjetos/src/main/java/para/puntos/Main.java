package para.puntos;

public class Main {
    public static void main(String[] args) {
        Punto p1= new Punto(-2,4);
        Circulo c1=new Circulo(p1.x,p1.y,10);
        Cilindro cl1=new Cilindro(c1.x, c1.y,c1.radio,20);
        System.out.println(cl1.areaCilindro());
        System.out.println(cl1.volumenCilinro());
    }

}
