public class Conta {
    //Parametros de Ua classe
    private int agencia;
    private int numero;
    private Cliente titular; //Usando Referencia ao declarar que titular é um cliente
    private double saldo;

    void depositar(double valor) { // Método de Classe, Void especifica que nao ha retorno
        this.saldo += valor;
    }

    boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Voçe relizou o saque de r$"+valor);
            return true;
        } else {
            System.out.println("Voçe nao tem saldo suficiente para o Saque");
            return false;
        }
    }

    void transferir(double valor, Conta destino){
        boolean conseguiuSacar = this.sacar(valor); //This Faz referencia a propia Classe
        if (conseguiuSacar){
            destino.depositar(valor);
        }

    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0){
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

