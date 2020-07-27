package clase14.ejercicio28;

public class Cuenta {
	
	private String titular;
	private double cantidad;

	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}
	
	public Cuenta(int i, double d) {
		// TODO Auto-generated constructor stub
	}

	public void ingresar(double saldo) {
        cantidad = cantidad + saldo;
    }

    public void retirar(double saldo) {
        cantidad = cantidad - saldo;
    }
    
    public double cantidad() {
        return cantidad;
    }
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String tirular) {
		this.titular = tirular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [tirular=" + titular + ", cantidad=" + cantidad + "]";
	}

}
