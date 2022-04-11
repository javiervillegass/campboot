public class App {
    public static void main(String[] args) throws Exception {
        Cliente Pedrito = new Cliente();
        Pedrito.edad = 22;
        Pedrito.telefono = 1234543;
        Pedrito.nombre = "Pedro";
        Pedrito.credito = 5;
        System.out.println(Pedrito.edad);
        System.out.println(Pedrito.telefono);
        System.out.println(Pedrito.nombre);
        System.out.println(Pedrito.credito);


    }
}
class Persona{
    public int edad;
    public String nombre;
    public long telefono;
}
class Cliente extends Persona{
    public int credito;
}
class Traajador extends Persona{
    public int salario;
}
