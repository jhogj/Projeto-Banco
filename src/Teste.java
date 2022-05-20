
public class Teste {
	public static void main(String[] args) {
		CONTAB conta2 = new CONTAB (5555, 66666);
		CONTAB conta3 = new CONTAB (5555, 55555);
		CONTAB conta = new CONTAB (1909, 19191);
		
	Cliente2 paulo = new Cliente2 ();
	paulo.setNome ("Paulo Silveira");
	conta2.setTitular (paulo);
	
	Cliente2 titularDaConta = conta2.getTitular();
	titularDaConta.SetProfissao("programador");
	
	Cliente2 andreia = new Cliente2 ();
	andreia.setNome ("Andreia Magalhaes");
	conta3.setTitular (andreia);
	
	Cliente2 jose = new Cliente2 ();
	jose.setNome ("Jose Hudson");
	conta.setTitular (jose);
	
	
	
	
}
}
