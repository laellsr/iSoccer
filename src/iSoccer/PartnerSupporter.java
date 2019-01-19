package iSoccer;

public class PartnerSupporter extends Person
{
	protected String andress, status = "sem informacao", type;
	protected double supportvalue;
	
	public String getAndress() {
		return andress;
	}
	public void setAndress(String andress) {
		this.andress = andress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSupportvalue() {
		return supportvalue;
	}
	public void setSupportvalue(double supportvalue) {
		this.supportvalue = supportvalue;
	}
		
}
