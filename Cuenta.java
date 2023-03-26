

public class Cuenta {
    private Integer idCuenta;
    private boolean status;
    private Float balance;
   
   
    public Cuenta() {
    }


    public Cuenta(Integer id, boolean status, Float balance) {
        this.idCuenta = id;
        this.status = status;
        this.balance = balance;
    }


    public Integer getId() {
        return idCuenta;
    }


    public void setId(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }


    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }


    public Float getBalance() {
        return balance;
    }


    public void setBalance(Float balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Cuenta [idCuenta=" + getId() + ", status=" + isStatus() + ", balance=" + getBalance() + "]";
    }

    
    
}
