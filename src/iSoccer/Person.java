package iSoccer;

import java.util.Scanner;

public class Person
{
	protected Scanner input = new Scanner(System.in);
	protected String name, email, CPF, phone;

	public String getName() {
		return name;
	}

	public void setName() {
		System.out.printf("Digite o nome:\n=> ");
		this.name = input.nextLine();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		System.out.printf("Digite o email:\n=> ");
		this.email = input.nextLine();
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF() {
		System.out.printf("Digite o CPF:\n=> ");
		CPF = input.nextLine();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone() {
		System.out.printf("Digite o telefone:\n=> ");
		this.phone = input.nextLine();
	}
	
	public void setPerson()
	{
		setName(); setEmail(); setCPF(); setPhone();
	}
	
	
}
