package para.puntos;

public class Cilindro extends Circulo{
    public int altura;
    public Cilindro(int x, int y,int r,int l){
        super(x,y,r);
        this.altura=l;
    }
    public double areaCilindro(){
        return super.areaCirculo() + super.areaCirculo() +(this.altura * super.perimetroCirculo());
    }
    public double volumenCilinro(){
        return this.altura * super.areaCirculo();
    }

}
