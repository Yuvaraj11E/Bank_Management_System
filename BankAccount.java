package KIT.bank;

public class BankAccount 
{
	private int accno;
	private String accholder;
	private float balance;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccholder() {
		return accholder;
	}
	public void setAccholder(String accholder) {
		this.accholder = accholder;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public BankAccount(int accno, String accholder, float balance) {
		super();
		this.accno = accno;
		this.accholder = accholder;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", accholder=" + accholder + ", balance=" + balance + "]";
	}
	

}
