// //Gerente eh um FuncionarioAutenticavel, Gerente herda da classe FuncionarioAutenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autentificador;
	
	public Gerente() {
		this.autentificador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
        return this.autentificador.autentica(senha);
    }
}
