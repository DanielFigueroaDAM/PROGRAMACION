package clasesabs;


 public abstract class PuntoBase {
     private int x;
     private int y;
     public PuntoBase(double x, double y){
         super();
     }

     public PuntoBase() {

     }

     public int getX() {
         return x;
     }

     public void setX(int x) {
         this.x = x;
     }

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }
     abstract String aCadea();
 }
