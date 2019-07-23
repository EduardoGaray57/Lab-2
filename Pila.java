public class Pila {
    private NodoPila cima;
    private int tama;
    
    public Pila(){
		cima=null;
		tama=0;
	}
	public void insertar(Cola espera){
		NodoPila nuevo;
		nuevo=new NodoPila(espera);
		nuevo.setSgte(cima);
		cima=nuevo;
		tama++;			
	}
	public void desplejarPila(){
		NodoPila actual;
		actual=cima;
                while(actual!=null){
                    actual.getColita().desplejarCola();
                    System.out.println("-------------------------->Cola Siguiente");
                    actual=actual.getSgte();
                }
        }

    public NodoPila getCima() {
        return cima;
    }

    public void setCima(NodoPila cima) {
        this.cima = cima;
    }

    public int getTama() {
        return tama;
    }

    public void setTama(int tama) {
        this.tama = tama;
    }
        
    
}