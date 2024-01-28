public class CuentaBancaria {
    private int numCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(int numCuenta, String titular, double saldoInicial) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (saldo - cantidad >= 0) {
            saldo -= cantidad;
        }
    }

    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
