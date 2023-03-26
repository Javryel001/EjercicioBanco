
import java.time.LocalDate;


public class Estudiante extends Cliente{
    
    private Float balance;
    private Cuenta cuenta;
    // No posee prestamo
    // Poseen cuenta unica
    // Tiene atributo extra llamado balance
    

    
    public Estudiante(Long idCliente, String nombre, String apellido, String telefono, String email, LocalDate fechaAltaCuenta,
    Cuenta cuenta) {
        super(idCliente, nombre, apellido, telefono, email, fechaAltaCuenta);
        this.cuenta = cuenta;
    }


    public Float getBalance() {
        return balance;
    }

    public Float calculoBalance() {
        return this.balance;
    }
    public void setBalance(Float balance) {
        this.balance = balance;
    }


    public Cuenta getCuenta() {
        return this.cuenta;
    }


    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

   
}
