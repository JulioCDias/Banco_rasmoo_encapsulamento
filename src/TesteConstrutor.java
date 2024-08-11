public class TesteConstrutor {
    public static void main(String[] args) {
        Conta conta = new Conta(1240, 1466, new Cliente("Julio","0122286"));

        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
    }
}
