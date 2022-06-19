public class Celula {

    private Celula antes;
    private Object Numero;
    private Celula proximo;

    public Celula (Object Numero) {
        this (Numero, null );
    }

    public Celula (Object Numero, Celula proximo) {
        this.Numero = Numero;
        this.proximo = proximo;
    }

    public Celula getProximo () {
        return proximo;
    }

    public void setProximo (Celula proximo) {
        this.proximo = proximo;
    }

    public Object getNumero() {
        return Numero;
    }

    public Celula getAntes () {
        return antes;
    }

    public void setAntes (Celula antes) {
        this.antes = antes;
    }


    public boolean equals ( Object objeto ) {

        Celula CelulaChamar = (Celula) objeto;
        return Numero.equals ( CelulaChamar.getNumero() );
    }
}