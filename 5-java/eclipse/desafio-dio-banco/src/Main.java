
public class Main {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas");
		
		IConta cc = new ContaCorrente(lucas);	
		IConta poupanca = new ContaPoupanca(lucas);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();	
	}
}
