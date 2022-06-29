
public class Main {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.depositar(45000);
		contaPoupanca.depositar(10000);
		contaCorrente.transferir(5000, contaPoupanca);
		
		contaCorrente.imprimirConta();
		contaPoupanca.imprimirConta();
	}

}
