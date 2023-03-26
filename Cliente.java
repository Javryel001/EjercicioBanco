import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public abstract class Cliente {

    private Long idCliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    protected LocalDate fechaAlta;
    private Float ingresoMensual;
    protected Cuenta[] cuentas;
    private Prestamo[] prestamos;

    public Cliente() {
    }

    public Cliente(Long idCliente, String nombre, String apellido, String telefono, String email, LocalDate fechaAlta,
            Cuenta[] cuentas,
            Float ingresoMensual, Prestamo[] prestamos) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.ingresoMensual = ingresoMensual;
        this.cuentas = cuentas;
        this.prestamos = prestamos;
    }

    public Cliente(Long idCliente, String nombre, String apellido, String telefono, String email, LocalDate fechaAlta) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaAlta = fechaAlta;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Float getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(Float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public Cuenta[] getCuentas() {
        return this.cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public Prestamo[] getPrestamo() {
        return this.prestamos;
    }

    public void setPrestamo(Prestamo[] prestamos) {
        this.prestamos = prestamos;
        
    }

    public long calcularAntiguedad() {
        LocalDate momentoActual = LocalDate.now();
        long antiguedad = ChronoUnit.MONTHS.between(getFechaAlta(), momentoActual);

        return antiguedad;
    }

    public abstract Float calculoBalance();

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
                + telefono + ", email=" + email + ", fechaAlta=" + fechaAlta + ", ingresoMensual=" + ingresoMensual
                + ", cuentas=" + Arrays.toString(cuentas) + ", prestamos=" + Arrays.toString(prestamos) + "]";
    }

}
