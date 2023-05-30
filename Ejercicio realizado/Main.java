public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Franco";
        cliente.edad = 29;
        cliente.tel = 11584659;
        cliente.credito = 100.00;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años, mi teléfono es " + cliente.tel
                + " y mi crédito disponible es " + cliente.credito);

        trabajador.nombre = "Rodolfo";
        trabajador.edad = 59;
        trabajador.tel = 11648599;
        trabajador.salario = 10000;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi teléfono es " + trabajador.tel
                + " y mi salario es de " + trabajador.salario);

    }
}
class Persona{
    int edad;
    int tel;
    String nombre;
}
class Cliente extends Persona{
    double credito;
}
class Trabajador extends Persona {
    double salario;
}