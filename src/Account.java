
public class Account {

	private double money;
	private int accountnumber;
	private int pinnumber;
	
	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getPinnumber() {
		return pinnumber;
	}

	public void setPinnumber(int pinnumber) {
		this.pinnumber = pinnumber;
	}

	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}


	public double DepositAmount(double money) {
		return this.money + money;
	}
	
	public double WithDrawAmount(double money) {
		return this.money - money;
	}
	
	public String getBalance() {
		this.money = getMoney();
		return String.valueOf(money);
	}
	
	public double cashWithdraw(double amount) {
		this.money = this.money - amount;
		return money;
	}
	
	public double cashDeposit(double amount) {
		this.money = this.money + amount;
		return money;
	}
	
}
