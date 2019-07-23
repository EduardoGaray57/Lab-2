public class NodoCola {
    private String Nombre;
    private String rut;
    private int edad;
    private NodoCola sgte;

    public NodoCola(String Nombre, String rut, int edad) {
        this.Nombre = Nombre;
        this.rut = rut;
        this.edad = edad;
        this.sgte = null;
    }
    public NodoCola() {
        this.Nombre = null;
        this.rut = null;
        this.edad = 0;
        this.sgte = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public NodoCola getSgte() {
        return sgte;
    }

    public void setSgte(NodoCola sgte) {
        this.sgte = sgte;
    }
    
}
