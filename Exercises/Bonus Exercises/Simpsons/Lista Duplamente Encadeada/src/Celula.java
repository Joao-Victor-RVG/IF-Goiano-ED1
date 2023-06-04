public class Celula {

    protected Object celulaProxima;
    protected Object celulaAnterior;
    protected Object objectElemento;


    Celula(Celula prox, Object ele) {
        this.celulaProxima = prox;
        this.celulaAnterior = null;
        this.objectElemento = ele;
    }

    Celula(Object ele) {
        this.celulaProxima = null;
        this.celulaAnterior = null;
        this.objectElemento = ele;
    }

    void setProxima(Celula prox) {
        this.celulaProxima = prox;
    }

    void setAnterior(Celula ant) {
        this.celulaAnterior = ant;
    }


    Object getProxima(){
        return(this.celulaProxima);
    }

    Object getAnterior() {
        return (this.celulaAnterior);
    }

    Object getElemento(){
        return(this.objectElemento);
    }








}