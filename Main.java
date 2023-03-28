
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        Cuenta cuenta1 = new Cuenta(1, true, 500f);
        Cuenta cuenta2 = new Cuenta(2, true, 350f);
        Cuenta cuenta3 = new Cuenta(3, true, 350f);
        Cuenta cuenta4 = new Cuenta(4, true, 550f);

        LocalDate fecha1 = LocalDate.of(2023, 01, 15);
        LocalDate fecha2 = LocalDate.of(2021, 05, 30);

        Prestamo prestamo1 = new Prestamo(1, 2000f);
        Prestamo prestamo2 = new Prestamo(1, 5000f);

        Prestamo[] prestamos2 = { prestamo2 };
        Prestamo[] prestamos1 = { prestamo1 };
        Cuenta[] cuentas1 = { cuenta1, cuenta2 };
        Cuenta[] cuentas2 = { cuenta3, cuenta4 };


        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte id");
        Long idBuscado = sc.nextLong();
        System.out.println(idBuscado);
        System.out.println("----------------------");

        Cliente cliente1 = new ClienteA(7L, "Mario", "Fernandez", "22345678", "Mariof@gmail.com", fecha1, cuentas2,
                5000f, prestamos2);

        cliente1.tipoCliente();

        System.out.println("----------------------");
       
       
    

        ClienteA clienteA1 = new ClienteA(1l, "Ricardo", "Gomez", "242342",
                "Richard@Fort.com", fecha1, cuentas1, 5000.0f, prestamos1);

        ClienteB clienteB1 = new ClienteB(2l, "Ricardo", "Gomez", "242342",
                "Richard@Fort.com", fecha2, cuentas2, 3000.0f, prestamos2);

        System.out.println("El balance total de las cuentas del cliente es : " + clienteA1.calculoBalance());
        System.out.println("El prestamo que puede aplicar es de : " + clienteA1.calculoPrestamo());
        System.out.println("El prestamo que puede aplicar es de : " + clienteB1.calculoPrestamo());

        clientes.add(clienteA1);

        System.out.println(clientes);
    }
    
    public long calcularAntiguedad() {
        LocalDate momentoActual = LocalDate.now();
        long antiguedad = ChronoUnit.MONTHS.between(getFechaAlta(), momentoActual);

        return antiguedad;
    }
    public String tipoCliente() {
        if (calcularAntiguedad() > 12 && getIngresoMensual() > 2000) {
            return "Cliente A";

        } else if (getIngresoMensual <= 2000 && getIngresoMensual > 0) {
            return "Cliente B";
        }
         else 
        {
            return "estudiante";
        }
    }

    public void removeId(long idBuscado){
        
        for(int i=0; i< clientes.size();i++){
             if(clientes.getIdCliente[i]==idBuscado){
                 clientes.remove[i];
            }

            sc.close();
        }
    }
}
