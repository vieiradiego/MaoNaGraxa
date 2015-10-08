package Sistema;

public class Formatar extends Persistencia 
{
	public static String CPF(String cpf) 
	{
		return(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
	}
}
