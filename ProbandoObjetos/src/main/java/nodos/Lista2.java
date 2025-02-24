package nodos;

public class Lista2 {
    private Nodo nodoInicial;
    private int tamanho;
    public Lista2(){
        this.nodoInicial=null;
        tamanho=0;
    }
    public Lista2(Nodo nodoInicial){
        this.nodoInicial=nodoInicial;
        tamanho=1;
    }
    public boolean estaValeira(){
        if(nodoInicial == null){
            return false;
        }
        return true;
    }
    public int getTamanho(){
        return tamanho;
    }
    public void engadirUltimo(int valor){
        Nodo nuevoNodo= new Nodo(valor,null);
        tamanho++;
        if()
    }
}
