
// para classe não pode ser instanciada
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario; //para deixar publico apenas para os filhos e para outras classe fica ainda privado

	
	public Funcionario() {
		
	}
	
	// metodo que obriga implementação das classes que instanciam Funcionario
	//o primeiro filho da classe precisa instancia obrigatoriamante
	//meto sem corpo, não ha implementação aqui apenas onde é instanciado caso deseje
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "A Classe Funcionario Possui Nome: " + nome + ", CPF: " 
	                        + cpf + ", Salario: R$" + salario+" Reais";
	}

}
