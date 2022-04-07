package ExercíciosGeneration.SeisdeAbril;

public class Funcionario {

	private String nomeFuncionario;
	private String salario;
	
	public Funcionario (String nomeFuncionario, String salario)
	{
		this.nomeFuncionario = nomeFuncionario;
		this.salario = salario;
	}

	public String getNomefuncionario() 
	{
		return nomeFuncionario;
	}

	public void setNomefuncionario(String nomefuncionario) 
	{
		this.nomeFuncionario = nomefuncionario;
	}

	public String getSalario() 
	{
		return salario;
	}

	public void setSalario(String salario) 
	{
		this.salario = salario;
	}
	
	public void informe()
	{
		System.out.println("\nNome do Funcionário: "+nomeFuncionario+"\tSeu salário: " +salario);
	}	
}