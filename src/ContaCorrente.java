
public class ContaCorrente extends Conta{
	@Override
	public void imprimirConta() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosUsuario();
	}
}
