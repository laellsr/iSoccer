package iSoccer;

import java.util.Scanner;

public class Driver extends Person
{
	protected Scanner input = new Scanner(System.in);
	protected double salary;
	protected String license;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		System.out.printf("Digite o salario (ex.: 123,45):\n=> R$ ");
		this.salary = input.nextDouble(); input.nextLine();
	}
	public String getLicense() {
		return license;
	}
	public void setLicense() {
		System.out.printf("Digite o número de habilitacao:\n=> ");
		this.license = input.nextLine();
	}
	public void setDriver() {
		setPerson(); setLicense(); setSalary();		
	}
	
}
