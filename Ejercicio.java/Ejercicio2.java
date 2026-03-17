class CuentaBancaria {
    int numeroCuenta;
    double saldo;
    String titular;

    public CuentaBancaria(int numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double cantidad){
        saldo = saldo + cantidad;
         System.out.println("Depositaste: " + cantidad);
    }

    void retirar(double cantidad){
        if (cantidad <= saldo){
            saldo = saldo - cantidad;
            System.out.println("Retiraste: " + cantidad);
        } else{
            System.out.println("No hay suficiente dinero");
        }
    }

    void consultarsaldo(){
        System.out.println("saldo actual:" + saldo);
    }
}
