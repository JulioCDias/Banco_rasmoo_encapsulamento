public class TesteEncapsulamento {
    public static void main(String[] args) {
        //Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Julio");
        cliente.setCpf("0123123123");
        cliente.setProfissao("Desenvolvedor");
        cliente.setSalario(5500);

        //Conta
        Conta conta = new Conta();
        conta.depositar(1000);
        conta.sacar(1000);
        conta.setAgencia(10);
        conta.setTitular(cliente);
        System.out.println(conta.getSaldo());

        //Pegando informações
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
        System.out.println(conta.getTitular().getProfissao());
        System.out.println(conta.getSaldo());

        //Outra maneira
        conta.setTitular(new Cliente());
        conta.getTitular().setNome("Antonio");
        conta.getTitular().setCpf("12233344");
        conta.getTitular().setProfissao("P.O");
        conta.getTitular().setSalario(25000);


    }
}
