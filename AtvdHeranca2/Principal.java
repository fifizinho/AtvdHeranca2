package AtvdHeranca2;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario ("Cainan","Emprego",10.000,"152693278","vila labruneti","20/02/2003");
		System.out.println("Funcionario:");
		System.out.println("Marca:"+funcionario.getNome());
		System.out.println("Modelo:"+funcionario.getMatricula());
		System.out.println("Ano:"+funcionario.getSalario());
		System.out.println("Cor:"+funcionario.getTelefone());
		System.out.println("NumeroPortas:"+funcionario.getEndereco());
		System.out.println("Motor:"+funcionario.getDataNascimento());
		
		Admnistrador admnistrador = new Admnistrador ("Cainan","Emprego",10.000,"152693278","vila labruneti","20/02/2003",4983475);
		System.out.println("Administrador:");
		System.out.println("Marca:"+admnistrador.getNome());
		System.out.println("Modelo:"+admnistrador.getMatricula());
		System.out.println("Ano:"+admnistrador.getSalario());
		System.out.println("Cor:"+admnistrador.getTelefone());
		System.out.println("NumeroPortas:"+admnistrador.getEndereco());
		System.out.println("Motor:"+admnistrador.getDataNascimento());
		System.out.println("Cra"+admnistrador.getCra());
		
		Engenheiro engenheiro = new Engenheiro ("Cainan","Emprego",10.000,"152693278","vila labruneti","20/02/2003",50499458);
		System.out.println("Engenheiro:");
		System.out.println("Marca:"+engenheiro.getNome());
		System.out.println("Modelo:"+engenheiro.getMatricula());
		System.out.println("Ano:"+engenheiro.getSalario());
		System.out.println("Cor:"+engenheiro.getTelefone());
		System.out.println("NumeroPortas:"+engenheiro.getEndereco());
		System.out.println("Motor:"+engenheiro.getDataNascimento());
		System.out.println("NumCrea"+engenheiro.getNumCrea());
		
		Medico medico = new Medico ("Cainan","Emprego",10.000,"152693278","vila labruneti","20/02/2003",80989890);
		System.out.println("Medico:");
		System.out.println("Marca:"+medico.getNome());
		System.out.println("Modelo:"+medico.getMatricula());
		System.out.println("Ano:"+medico.getSalario());
		System.out.println("Cor:"+medico.getTelefone());
		System.out.println("NumeroPortas:"+medico.getEndereco());
		System.out.println("Motor:"+medico.getDataNascimento());
		System.out.println("Crm"+medico.getCrm());
	}

}
