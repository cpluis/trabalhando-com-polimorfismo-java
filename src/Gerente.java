
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
}
