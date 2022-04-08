import java.security.spec.EdDSAParameterSpec;

public class App {
    public static void main(String[] args) throws Exception {
        Persona personita= new Persona();
        personita.setEdad(20);
        personita.setNombre("pepe");
        personita.setTelefono(12456431);
        System.out.println(personita.getEdad());
        System.out.println(personita.getNombre());
        System.out.println(personita.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private long telefono;
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(long telefono){
        this.telefono=telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public long getTelefono(){
        return this.telefono;
    }



}