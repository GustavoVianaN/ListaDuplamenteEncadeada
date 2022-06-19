public class Lista {

    private Celula elementoInicial    = null;
    private Celula ultimoelemento = null;
    private int lenghtElementos = 0;

    private void posicaoTrue (int posicao) {
        if (posicao < 0 || posicao >= lenghtElementos){
            throw new IllegalArgumentException("Não existe");
        }
    }

    private void emptyLista () {
        if (lenghtElementos == 0){
        }
    }

    public void adicionarNoInicio (Object elemento) {
        if (lenghtElementos == 0) {
            Celula newLista = new Celula (elemento);
            elementoInicial = newLista;
            ultimoelemento  = newLista;
        } else {
            Celula newLista = new Celula (elemento, elementoInicial);
            elementoInicial.setAntes (newLista);
            elementoInicial = newLista; 
        }

        lenghtElementos++;
    }

    public void inserirElemento (Object elemento) {
        if ( lenghtElementos == 0 ) {
            adicionarNoInicio (elemento);
            return;
        } 
            Celula newLista = new Celula (elemento);
            ultimoelemento.setProximo (newLista);
            newLista.setAntes (ultimoelemento);
            ultimoelemento = newLista; 
            lenghtElementos++;
}


    public void inserirElemento (int posicao, Object elemento) {

        emptyLista();
        posicaoTrue ( posicao );

        if (posicao == 0) {
            adicionarNoInicio (elemento); 
            return;
        }

        Celula anterior = (Celula) guardarPosicao (posicao - 1);
        Celula proximo = anterior.getProximo();
        Celula newLista = new Celula (elemento, proximo);
        newLista.setAntes( anterior );
        anterior.setProximo ( newLista );
        proximo.setAntes( newLista );
        lenghtElementos++;
    }


    public Object guardarPosicao ( int posicao ) {
        emptyLista();
        posicaoTrue ( posicao );
        Celula elementoAtual = elementoInicial; 
        for (int contador = 0 ; contador < posicao ; contador++) {
            elementoAtual = elementoAtual.getProximo();
        }
        return elementoAtual;
    }

    public void removerDoInicio () {

        emptyLista();

        elementoInicial = elementoInicial.getProximo();
        lenghtElementos--;

        if ( lenghtElementos == 0 ){
            ultimoelemento = null;
        }
    }



    public void remove (int posicao) {
        emptyLista();
        posicaoTrue(posicao);
        if (posicao == 0){
            removerDoInicio ();
            return;
        }
        if (posicao == lenghtElementos - 1){
            removerFinal ();
            return;
        }
        Celula anterior = (Celula) guardarPosicao (posicao - 1);
        Celula elementoAtual = anterior.getProximo ();
        Celula proximo = elementoAtual.getProximo();
        anterior.setProximo (proximo);
        proximo.setAntes (anterior);
        lenghtElementos--;

        if (lenghtElementos == 0) {
            ultimoelemento = null;
        }
    }
    public void removerFinal() {
        emptyLista();
        Celula penultimoelemento = ultimoelemento.getAntes ();
        penultimoelemento.setProximo ( null );
        ultimoelemento = penultimoelemento;
        lenghtElementos--;
    }
    public void exitLista() { 
        elementoInicial = null;
        ultimoelemento = null;
        lenghtElementos = 0;
    }


    public int tamanho () { 
        return lenghtElementos;
    }


    public boolean list (Object elemento) {
        Celula elementoAtual = elementoInicial;
        for (int i = 0 ; i < lenghtElementos ; i++) {
            if ( elementoAtual.equals ( elemento ) ) {
                  return true;
            }
            elementoAtual = elementoAtual.getProximo();
        }
        return false;
    }

    public String toString () { 
        if (lenghtElementos == 0) {
            return "[ ]";
        }
        Celula elementoAtual = elementoInicial; 
        String retornarElementos = "[";
        for ( int i = 0 ; i < lenghtElementos - 1; i++ ){
            retornarElementos += elementoAtual.getNumero() + ", ";
            elementoAtual = elementoAtual.getProximo();
        }
        retornarElementos += elementoAtual.getNumero() + " ]";
        return retornarElementos;
    }

}



