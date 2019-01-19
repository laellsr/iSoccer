package iSoccer;

import java.util.Scanner;

public class PartnerSupporter extends Person
{
	protected Scanner input = new Scanner(System.in);
	protected String andress;
	public int status;
	protected int type;
	public double supportvalue;
	
	public String getAndress() {
		return andress;
	}
	public void setAndress() {
		System.out.printf("Digite o endereco:\n=> ");
		this.andress = input.nextLine();
	}
	@Override
	public int getStatus() {
		return status;
	}
	@Override
	public void setStatus() {
		System.out.printf("Status:\n[1] Adimplente\n[2] Inadimplente\n=> ");
		this.status = input.nextInt(); input.nextLine();
	}
	@Override
	public int getType() {
		return type;
	}
	public void setType() {
		System.out.printf("Tipo:\n[1] Junior\n[2] Senior\n[3] Elite\n=> ");
		this.type = input.nextInt(); input.nextLine();
	}
	@Override
	public double getSupportvalue() {
		return supportvalue;
	}
	@Override
	public void setSupportvalue(Double supportvalue) {
		this.supportvalue = supportvalue;
	}
	public void setPartner()
	{
		setPerson(); setAndress(); setStatus(); setType();
	}
		
}
