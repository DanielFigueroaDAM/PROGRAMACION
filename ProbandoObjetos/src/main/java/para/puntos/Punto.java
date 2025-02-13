package para.puntos;

public class Punto {
    public int y;
    public int x;

    public Punto(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y>0){
            this.y=y;
        }
        else {
            System.out.println("No es valido");
        }
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        if(x>0){
            this.x=x;
        }
        else {
            System.out.println("No es valido");
        }
    }
    public boolean equals(){
        if((x==outro))
    }
}
