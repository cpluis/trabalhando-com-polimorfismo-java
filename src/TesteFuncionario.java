
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		Funcionario luis = new Funcionario();
		luis.setNome("Luis Pires");
		luis.setCpf("08965561122");
		luis.setSalario(2888.00);
		System.out.println(luis);
		gerente.setNome("Marcelo");
		gerente.setCpf("8986565544");
		gerente.autentica(2);
		gerente.setSalario(5000.0);
		boolean autenticacao = gerente.autentica(2222);
		System.out.println(gerente);
		System.out.println(autenticacao);
		
		System.out.println();
		
	}
}
