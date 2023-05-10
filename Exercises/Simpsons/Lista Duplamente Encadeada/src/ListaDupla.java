public class ListaDupla {

    protected Object celulaPrimeira;
    protected Object celulaUltima;
    protected int totalElementos = 0;

    boolean PosicaoOcupada(int pos) {
        return ((pos >= 0) && (pos < this.totalElementos));
    }

    Celula PegaCelula(int pos) {
        if (!this.PosicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posicao nao existe");
        } else {
            Celula atual = (Celula) this.celulaPrimeira;
            for (int i = 0; i < pos; i++) {
                atual = (Celula) atual.getProxima();
            }
            return (atual);
        }
    }

    Object Pega(int pos) {
        return (this.PegaCelula(pos).getElemento());
    }


    void AdicionaNoComeco(Object elemento) {
        if (this.totalElementos == 0) {
            Celula nova = new Celula(elemento);
            this.celulaPrimeira = nova;
            this.celulaUltima = nova;
        } else {
            Celula nova = new Celula((Celula) this.celulaPrimeira, elemento);
            this.celulaPrimeira.setcelulaAnterior(nova);
            this.celulaPrimeira = nova;
        }
        this.totalElementos++;
    }

    void Adiciona(Object elemento) {
        if (this.totalElementos == 0) {
            this.AdicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.celulaUltima.setcelulaProxima(nova);
            nova.setAnterior((Celula) this.celulaUltima);
            this.celulaUltima = nova;
            this.totalElementos++;
        }
    }

    void RemovedoComeco() {
        if (!this.PosicaoOcupada(0)) {
            throw new IllegalArgumentException("Posicao nao Existe");
        } else {
            this.celulaPrimeira = this.celulaPrimeira.getcelulaProxima();
            this.totalElementos--;
        }
        if (this.totalElementos == 0) {
            this.celulaUltima = null;
        }
    }

    void RemovedoFim() {
        if (!this.PosicaoOcupada(totalElementos-1)) {
            throw new IllegalArgumentException("Posicao nao existe");
        } else {
            if (this.totalElementos == 1) {
                this.RemovedoComeco();
            } else {
                Celula penultima = this.celulaUltima.getcelulaAnterior();
                penultima.setProxima(null);
                this.celulaUltima = penultima;
                this.totalElementos--;
            }
        }
    }

    void Remove(int pos) {
        if (!this.PosicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posicao nao Existe");
        } else {
            if (pos == 0) {
                this.RemovedoComeco();
            } else if (pos == this.totalElementos - 1) {
                this.RemovedoFim();
            } else {
                Celula anterior = this.PegaCelula(pos - 1);
                Celula atual = (Celula) anterior.getProxima();
                Celula proxima = (Celula) atual.getProxima();
                anterior.setProxima(proxima);
                proxima.setAnterior(anterior);
                this.totalElementos--;
            }
        }
    }

    boolean Contem(Object elemento){
        Celula atual = (Celula) this.celulaPrimeira;
        while(atual != null){
            if(atual.getElemento().equals(elemento)){
                return(true);
            }
            atual = (Celula) atual.getProxima();
        }
        return(false);
    }

    int tamanho(){
        return(this.totalElementos);
    }

    void EsvaziaLista(){
        this.celulaPrimeira = null;
        this.celulaUltima = null;
        this.totalElementos = 0;
    }


    String Imprimir(){
        if(this.totalElementos == 0){
            return("[]");
        }else{
            StringBuilder builder = new StringBuilder("[");
            Celula atual = (Celula) this.celulaPrimeira;
            for(int i=0; i < this.totalElementos -1; i++){
                builder.append(atual.getElemento());
                builder.append(", ");
                atual = atual.getcelulaProxima();
            }
            builder.append(atual.getElemento());
            builder.append("]");
            return(builder.toString());
        }
    }
}