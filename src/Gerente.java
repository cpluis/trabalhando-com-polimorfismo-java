
public class Gerente extends Funcionario{

	private int senha;
	
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}				
	}	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public Gerente() {
		
	}
	
//	public double getBonificacao() { // por ter deixado como protected eu consigo acessar o atributo salario
//		return  + super.getSalario(); //utilizando getbonificação da classe funcionario
//		//eu sou obrigado a colocar a palavra super para indicar que estou usando o metodo da super classe
//	}
//	


	@Override
	public String toString() {
		return "Classe Gerente Possui Senha: " + senha 
				+ ", Bonificação: " 
				+ getBonificacao() 
				+ ", Nome: " + getNome()
				+ ", CPF: " + getCpf() 
				+ ", Salário" 
				+ getSalario();
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
