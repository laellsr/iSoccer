package iSoccer;

public class Menu
{
	static public void initial()
	{
		System.out.printf("Usuario: admin\nSenha: admin\n\n");
	}
	
	static public void startMenu()
	{
		System.out.printf("Usuario: admin\nSenha: admin\n\n");
		System.out.printf("[1] Login\n[0] Sair\n=> ");
	}
	
	static public void mainMenu()
	{
		System.out.printf("Bem-vindo a administracao do seu time\n"
				+ "[1] Adicionar funcionarios\n"
				+ "[2] Adicionar socio-torcedores\n"
				+ "[3] Gerenciar recursos\n"
				+ "[4] Relatorio sobre funcionarios\n"
				+ "[5] Relatorio sobre socios-torcedores\n"
				+ "[6] Relatorio sobre recursos\n"
				+ "[7] Relatorio completo\n"
				+ "[0] Sair\n"
				+ "=> ");
	}
	
	static public void employeeMenu()
	{
		System.out.printf("Selecione o tipo de funcionario\n"
				+ "[1] Presidente\n"
				+ "[2] Medico\n"
				+ "[3] Tecnico\n"
				+ "[4] Preparador fisico\n"
				+ "[5] Motorista\n"
				+ "[6] Cozinheiro\n"
				+ "[7] Advogado\n"
				+ "[8] Jogador\n"
				+ "=> ");
	}
}
