public class Main {
    public static void main(String[] args) {

            Cliente igor = new Cliente();
            igor.setNome("igor");

            Conta cc = new ContaCorrente(igor);
            Conta poupanca = new ContaPoupanca(igor);

            cc.depositar(100);
            cc.transferir(100, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }
    }
