public class NodoPila {
        private Cola colita;
        private NodoPila sgte;

    public NodoPila(Cola colita) {
        this.colita = colita;
        this.sgte=null;
    }

    public Cola getColita() {
        return colita;
    }

    public void setColita(Cola colita) {
        this.colita = colita;
    }

    public NodoPila getSgte() {
        return sgte;
    }

    public void setSgte(NodoPila sgte) {
        this.sgte = sgte;
    }
    
        
}
