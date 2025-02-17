package para.puntos;

public class Circulo extends Punto{
    public int radio;

    public Circulo(int x,int y, int r){
        super(x,y);
        this.radio=r;
    }
    public double perimetroCirculo(){
        return (2 * this.radio * 3.14);
    }
    public double areaCirculo(){
        return (3.14*(this.radio*this.radio));
    }
}
