public class Cola {
    private NodoCola primero;
    private NodoCola ultimo;
    private int tama;
    
    public Cola(){
		primero=null;
		ultimo=null;
		tama=0;
	}
	public boolean isEmpty(){
		return primero==null;
	}
	public int size(){
		return tama;
	}
	public void insertar(NodoCola nodo){
		if (isEmpty()) {
			primero=nodo;
			primero.setSgte(null);
			ultimo=nodo;
		}else{
			ultimo.setSgte(nodo);
			nodo.setSgte(null);
			ultimo=nodo;
		}
		ultimo=nodo;
		tama++;
	}
	public void desplejarCola(){
		NodoCola actual= new NodoCola();
		actual=primero;
		if(primero!=null){
			while(actual!=null){
				System.out.println(" " + actual.getNombre());
				System.out.println(" " + actual.getRut());
				System.out.println(" " + actual.getEdad());
				actual=actual.getSgte();
			}
		}else{
			System.out.println("No hay datos");
		}
	}
        boolean comparar(String x){
     		NodoCola temp=primero;
		boolean comp=false;
                if(primero!=null){
                       do{
			if(x.equalsIgnoreCase(temp.getRut())){
				comp=true;
			}else{
				temp=temp.getSgte();
			}
                    }while(temp != null && comp != true);
                }
		return comp;
                
	}
}