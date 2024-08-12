public class TesteStatic {
    public static void main(String[] args) {
        Cliente julio = new Cliente("Julio","123456765");

        Conta contaCorrente = new Conta(1078,23456,julio);
        Conta contaPoupanca = new Conta(1078,23453,julio);

        System.out.println(Conta.getTotalDeContas());
    }
}
