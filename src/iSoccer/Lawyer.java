package iSoccer;

import java.util.Scanner;

public class Lawyer extends Person
{
	protected Scanner input = new Scanner(System.in);
	protected double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary() {
		System.out.printf("Digite o salario (ex.: 123,45):\n=> R$ ");
		this.salary = input.nextDouble(); input.nextLine();
	}
	
	public void setLawyer() {
		setPerson(); setSalary();		
	}
	
}
