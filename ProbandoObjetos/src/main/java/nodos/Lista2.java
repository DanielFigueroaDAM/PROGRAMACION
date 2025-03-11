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
            return true;
        }
        return false;
    }

    /**
     * Devolve o tamaño da lista
     * @return
     */
    public int getTamanho(){

        return tamanho;
    }

}
