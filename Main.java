
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
       

        Cuenta cuenta1 = new Cuenta(1,true,500f);
        Cuenta cuenta2 = new Cuenta(2,true,350f);
        Cuenta cuenta3 = new Cuenta(3,true,350f);
        Cuenta cuenta4 = new Cuenta(4,true,550f);

        LocalDate fecha1 = LocalDate.of(2023,01,15);
        LocalDate fecha2 = LocalDate.of(2021,05,30);

        Prestamo prestamo1 = new Prestamo(1, 2000f);
        Prestamo prestamo2 = new Prestamo(1, 5000f);
        

        Prestamo[] prestamos2 = {prestamo2};
        Prestamo[] prestamos1 = {prestamo1};
        Cuenta[] cuentas1 = {cuenta1, cuenta2};
        Cuenta[] cuentas2 = {cuenta3, cuenta4};

        
        ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha1, cuentas1, 5000.0f, prestamos1);
        ClienteB clienteB1 = new ClienteB(2l, "Ricardo", "Gomez", "242342",
         "Richard@Fort.com", fecha2, cuentas2, 5000.0f, prestamos2);

        System.out.println("El balance total de las cuentas del cliente es : " + clienteA1.calculoBalance());
        System.out.println("El prestamo que puede aplicar es de : "+ clienteA1.calculoPrestamo());
        System.out.println("El prestamo que puede aplicar es de : "+ clienteB1.calculoPrestamo());
        System.out.println("La entiguedad es: "+clienteA1.calcularAntiguedad()+"meses");


        clientes.add(clienteA1);
        clientes.add(clienteB1);

        System.out.println(clientes);
    }   
}
