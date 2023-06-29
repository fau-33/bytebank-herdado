
public class TesteFuncionario {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		Funcionario flavio = new Gerente();
		flavio.setNome("Flávio Félix");
		flavio.setCpf("1234567");
		flavio.setSalario(2600.0);

		
		
		System.out.println(flavio.getNome());
		System.out.println(flavio.getCpf());
		System.out.println(flavio.getBonificacao());
		
		

	}

}
