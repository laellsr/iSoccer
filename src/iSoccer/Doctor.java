package iSoccer;

import java.util.Scanner;

public class Doctor extends Person
{
	protected Scanner input = new Scanner(System.in);
	protected String CRM;
	protected double salary;
	
	public String getCRM() {
		return CRM;
	}
	public void setCRM() {
		System.out.printf("Digite o CRM:\n=> ");
		CRM = input.nextLine();
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		System.out.printf("Digite o salario (ex.: 123,45):\n=> R$ ");
		this.salary = input.nextDouble(); input.nextLine();
	}
	
	public void setDoctor() {
		setPerson(); setCRM(); setSalary();		
	}
	
}
