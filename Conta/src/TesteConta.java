public class TesteConta {
    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = 1000;

        System.out.println("saldo da conta " + conta.numero  + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println("saque efetuado com sucesso !!!");
            conta.consultarSaldo();
        }else {
            System.out.println("nao foi possivel realizar saque, saldo insuficiente");

        }

        saqueEfetuado = conta.realizarSaque(500);

        if (saqueEfetuado){
            System.out.println("saque efetuado com sucesso !!!");
            conta.consultarSaldo();
        }else {
            System.out.println("nao foi possivel realizar saque, saldo insuficiente");

        }

        System.out.println("Realizando deposito  de 500 reais....");
        conta.depositar(500);
        conta.consultarSaldo();

    }

}
