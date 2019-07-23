import java.util.Scanner;
class AppPilaCola{
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
	String nom;
	String rut;
	int eda;
    //Colas de no inicializadas pero si creadas
    Cola ColaNueva1= new Cola();
    Cola ColaNueva2= new Cola();
    Cola ColaNueva3= new Cola();
    Cola ColaNueva4= new Cola();
    Cola ColaNueva5= new Cola();
    Cola ColaNueva6= new Cola();
    Cola ColaNueva7= new Cola();
    Cola ColaNueva8= new Cola();
    Cola ColaNueva9= new Cola();
    Cola ColaNueva10= new Cola();
    Cola ColaNueva11= new Cola();
    Cola ColaNueva12= new Cola();
    Cola ColaNueva13= new Cola();
    Cola ColaNueva14= new Cola();
    Cola ColaNueva15= new Cola();
    Cola ColaNueva16= new Cola();
    // fin de colas si inicializar
	Cola Cola1= new Cola();
    Cola Cola2= new Cola();
    Cola Cola3= new Cola();
    Cola Cola4= new Cola();
    Cola Cola5= new Cola();
    Cola Cola6= new Cola();
    Cola Cola7= new Cola();
    Cola Cola8= new Cola();
    Cola Cola9= new Cola();
    Cola Cola10= new Cola();
	NodoCola persona= new NodoCola("Eduardo","19.954.048-3",21);
	NodoCola persona1= new NodoCola("Elein","1.463-K",12);
    NodoCola persona2= new NodoCola("Jose","1.054.002-1",30);
    NodoCola persona3= new NodoCola("Migel","2.900.003-8",50);
    NodoCola persona4= new NodoCola("Alice","9.000.006-3",62);
    NodoCola persona5= new NodoCola("Camila","3.910.003-2",90);
    NodoCola persona6= new NodoCola("Maria","4.524.635-0",85);
    NodoCola persona7= new NodoCola("Rosita","5.846.530-4",42);
    NodoCola persona8= new NodoCola("Angel","8.156.326-8",52);
    NodoCola persona9= new NodoCola("Sebastian","6.853.624-8",32);
    Cola1.insertar(persona);
    Cola2.insertar(persona1);
    Cola3.insertar(persona2);
    Cola4.insertar(persona3);
    Cola5.insertar(persona4);
    Cola6.insertar(persona5);
    Cola7.insertar(persona6);
    Cola8.insertar(persona7);
    Cola9.insertar(persona8);
    Cola10.insertar(persona9);
    Pila lista= new Pila();
    lista.insertar(Cola1);
    lista.insertar(Cola2);
    lista.insertar(Cola3);
    lista.insertar(Cola4);
    lista.insertar(Cola5);
    lista.insertar(Cola6);
    lista.insertar(Cola7);
    lista.insertar(Cola8);
    lista.insertar(Cola9);
    lista.insertar(Cola10);
    //listas con colas sin inicializar
    lista.insertar(ColaNueva1);
    lista.insertar(ColaNueva2);
    lista.insertar(ColaNueva3);
    lista.insertar(ColaNueva4);
    lista.insertar(ColaNueva5);
    lista.insertar(ColaNueva6);
    lista.insertar(ColaNueva7);
    lista.insertar(ColaNueva8);
    lista.insertar(ColaNueva9);
    lista.insertar(ColaNueva10);
    lista.insertar(ColaNueva11);
    lista.insertar(ColaNueva12);
    lista.insertar(ColaNueva13);
    lista.insertar(ColaNueva14);
    lista.insertar(ColaNueva15);
    lista.insertar(ColaNueva16);
    //fin de listas con colos sin inicializar
	boolean salir= false;
	int opciones;
	while(!salir){
		System.out.println("1.Ingrese nodo");				
		System.out.println("2.Mostrar lista");
		System.out.println("3.Salir");
		opciones= teclado.nextInt();
		switch(opciones){
    		case 1:
			System.out.println("Ingrese nombre");
			nom=teclado.next();
			System.out.println("Ingrese rut de la forma xx.xxx.xxx-x");
			rut=teclado.next();
                        while(Validacion(rut)!=true ){
                            System.out.println("Rut invalido ingrese nuevamente");
                            rut=teclado.next();
                        }
			System.out.println("Ingrese edad");
			eda=teclado.nextInt();
                        NodoCola datos= new NodoCola(nom,rut,eda);
			if(rutANumero(rut)>=0 && rutANumero(rut)<=999999){ 
                             while(Cola2.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola2.insertar(datos);
                        }else if(rutANumero(rut)>999999 && rutANumero(rut)<=1999999){
                              while(Cola3.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola3.insertar(datos);                        
                        }else if(rutANumero(rut)>1999999 && rutANumero(rut)<=2999999){
                              while(Cola4.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola4.insertar(datos);
                        }else if(rutANumero(rut)>2999999 && rutANumero(rut)<=3999999){
                              while(Cola6.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola6.insertar(datos);
                        }else if(rutANumero(rut)>3999999 && rutANumero(rut)<=4999999){
                              while(Cola7.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola7.insertar(datos);
                        }else if(rutANumero(rut)>4999999 && rutANumero(rut)<=5999999){
                              while(Cola8.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola8.insertar(datos);
                        }else if(rutANumero(rut)>5999999 && rutANumero(rut)<=6999999){
                             while(Cola10.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola10.insertar(datos);
                        }else if(rutANumero(rut)>6999999 && rutANumero(rut)<=7999999){ 
                            while(ColaNueva16.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva16.insertar(datos);
                        }else if(rutANumero(rut)>7999999 && rutANumero(rut)<=8999999){
                              while(Cola9.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola9.insertar(datos);
                        }else if(rutANumero(rut)>8999999 && rutANumero(rut)<=9999999){
                              while(Cola5.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola5.insertar(datos);
                        }else if(rutANumero(rut)>9999999 && rutANumero(rut)<=10999999){
                              while(ColaNueva1.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva1.insertar(datos);
                        }else if(rutANumero(rut)>10999999 && rutANumero(rut)<=11999999){
                              while(ColaNueva2.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva2.insertar(datos);
                        }else if(rutANumero(rut)>11999999 && rutANumero(rut)<=12999999){
                             while(ColaNueva3.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva3.insertar(datos);
                        }else if(rutANumero(rut)>12999999 && rutANumero(rut)<=13999999){
                              while(ColaNueva4.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva4.insertar(datos);
                        }else if(rutANumero(rut)>13999999 && rutANumero(rut)<=14999999){
                              while(ColaNueva5.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva5.insertar(datos);
                        }else if(rutANumero(rut)>14999999 && rutANumero(rut)<=15999999){
                              while(ColaNueva6.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva6.insertar(datos);
                        }else if(rutANumero(rut)>15999999 && rutANumero(rut)<=16999999){
                              while(ColaNueva7.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva7.insertar(datos);
                        }else if(rutANumero(rut)>16999999 && rutANumero(rut)<=17999999){
                              while(ColaNueva8.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva8.insertar(datos);
                        }else if(rutANumero(rut)>17999999 && rutANumero(rut)<=18999999){
                              while(ColaNueva9.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva9.insertar(datos);
                        }else if(rutANumero(rut)>18999999 && rutANumero(rut)<=19999999){
                            while(Cola1.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            Cola1.insertar(datos);
                        }else if(rutANumero(rut)>19999999 && rutANumero(rut)<=20999999){
                              while(ColaNueva10.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva10.insertar(datos);
                        }else if(rutANumero(rut)>20999999 && rutANumero(rut)<=21999999){
                              while(ColaNueva11.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva11.insertar(datos);
                        }else if(rutANumero(rut)>21999999 && rutANumero(rut)<=22999999){
                             while(ColaNueva12.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva12.insertar(datos);
                        }else if(rutANumero(rut)>22999999 && rutANumero(rut)<=23999999){
                              while(ColaNueva13.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva13.insertar(datos);
                        }else if(rutANumero(rut)>23999999 && rutANumero(rut)<=24999999){
                              while(ColaNueva14.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva14.insertar(datos);
                        }else{
                              while(ColaNueva15.comparar(rut)){                                
                                System.out.println("Rut repetido ingrese nuevo rut");
                                rut=teclado.next();                                
                            }
                            datos.setRut(rut);
                            ColaNueva15.insertar(datos);
                        }
			break;
		case 2:
			lista.desplejarPila();
			break;
		case 3:
			salir=true;
			break;
		}
	}
    }
    public static boolean Validacion(String rut){
        rut=rut.toUpperCase();
        rut=rut.replace(".","");
        String[] rut_dv = rut.split("-");
        boolean devolver=false;
        if(rut_dv.length ==2){
            try
                    {
                        int ruts = Integer.parseInt( rut_dv[0] );
                        char dv = rut_dv[1].charAt(0);
 
                        // Validamos que sea un rut valido según la norma
                        if (ValidarRut(ruts, dv)  )
                        {
                            System.out.println("Rut correcto");
                            devolver=true;
                        }
                        else
                        {
                            System.out.println("Rut incorrecto");
                            devolver=false;
                        }
                    }
                    catch( Exception ex )
                    {
                        System.out.println(" Error " + ex.getMessage());
                    }
        }
        return devolver;
    }
    
    public static boolean ValidarRut(int rut, char dv)
    {
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10)
        {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        return dv == (char) (s != 0 ? s + 47 : 75);
    }
    public static int rutANumero(String rut){
		rut =  rut.toUpperCase();
		rut = rut.replace(".", "");
		rut = rut.replace("-", "");
		int rutAux = Integer.parseInt(rut.substring(0, rut.length()-1));
		return rutAux;
	}
}