
public class Prestamo {
    
    private Integer idPrestamo;
    private Float total;
    private Float saldo;
// Fijarnos su ingreso mensual
// multiplicarlo por 5 o por 10, segun corresponda
// Fijarnos si tiene prestamos asociados y restar el total de prestamos, del calculo obtenido antes
// Pedro Ignacio Ottaviano10:11
// Prestamo total al que puede aplicar es de 10* 2000
// 20000
// saldoPrevio = 2000
// 18000
    
    public Prestamo() {
    }

    public Prestamo(Integer idPrestamo, Float saldo) {
        this.idPrestamo = idPrestamo;
        this.saldo = saldo;
    }
    public Prestamo(Integer idPrestamo, Float total, Float saldo) {
        this.idPrestamo = idPrestamo;
        this.total = total;
        this.saldo = saldo;
    }


    public Integer getIdPrestamo() {
        return idPrestamo;
    }


    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }


    public Float getTotal() {
        return total;
    }


    public void setTotal(Float total) {
        this.total = total;
    }


    public Float getSaldo() {
        return saldo;
    }


    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    
}
