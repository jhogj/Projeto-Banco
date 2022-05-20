
class CONTAB {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente2 titular;
	private static int total;

	public CONTAB(int agencia, int numero) {
		CONTAB.total++;
		System.out.println("o total de contas e " + CONTAB.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + numero);
		System.out.println("o numero da agencia e " + this.agencia);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;

		}
	}

	public boolean transfere(double valor, CONTAB destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode ser menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("não pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}

	public Cliente2 getTitular() {
		return titular;
	}

	public void setTitular(Cliente2 titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return CONTAB.total;
	}

}
