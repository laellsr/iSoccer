package iSoccer;

import java.util.Scanner;

public class Player extends Person
{
	protected Scanner input = new Scanner(System.in);
	protected double salary;
	protected String type, status = "sem informacao";
	
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		System.out.printf("Digite o salario (ex.: 123,45):\n=> R$ ");
		this.salary = input.nextDouble(); input.nextLine();
	}
	public String getType() {
		return type;
	}
	public void setType() {
		System.out.printf("Digite o tipo de jogador (area de jogo):\n=> ");
		this.type = input.nextLine();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus() {
		System.out.printf("Digite o status do jogador (disponibilidade para jogar):\n=> ");
		this.status = input.nextLine();
	}
	public void setPlayer() {
		setPerson(); setSalary(); setType(); setStatus();		
	}
}
