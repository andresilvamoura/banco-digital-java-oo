
public class ContaPoupanca extends Conta{
	@Override
	public void imprimirConta() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosUsuario();
	}
}
