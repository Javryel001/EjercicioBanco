
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class ClienteB extends Cliente implements IClienteService {

    public ClienteB(Long idCliente, String nombre, String apellido, String telefono,
            String email, LocalDate fechaAlta, Cuenta[] cuentas, Float ingresoMensual, Prestamo[] prestamos) {
        super(idCliente, nombre, apellido, telefono, email, fechaAlta, cuentas, ingresoMensual, prestamos);
    }

    @Override
    public Float calculoPrestamo() {
        Float maximoDisponibleB = getIngresoMensual() * 5;

            Prestamo[] prestamos = getPrestamo();
            float deudaTotal = 0f;
    
            // for(Cuenta cuenta : cuentas) {
            // saldoTotal += cuenta.getBalance();
            // }
            // return saldoTotal;
            // }
            for (int i = 0; i < prestamos.length; i++) {
    
                deudaTotal += prestamos[i].getSaldo();
            }Float totalPrestamo = 0f;
            for(Prestamo prestamo : prestamos){
        
                totalPrestamo += prestamo.getSaldo();
            }
        
        return maximoDisponibleB - deudaTotal;
    }

    @Override
    public Float calculoBalance() {
        Cuenta[] cuentas = getCuentas();
        float saldoTotal = 0f;

        // for(Cuenta cuenta : cuentas) {
        // saldoTotal += cuenta.getBalance();
        // }
        // return saldoTotal;
        // }
        for (int i = 0; i < cuentas.length; i++) {

            saldoTotal += cuentas[i].getBalance();
        }
        return saldoTotal;
    }
}
