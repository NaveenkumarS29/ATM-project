import java.io.*;
import java.util.HashMap;

public class Person extends Account {
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void checkForClient() throws IOException {

		data.put(12345, 5135);
		data.put(13245, 1234);

		System.out.println("Enter Customer Number : ");
		setAccountnumber(Integer.parseInt(br.readLine()));
		System.out.println("Enter Customer Pin Number : ");
		setPinnumber(Integer.parseInt(br.readLine()));
		System.out.println("Size of Customer : " + data.size());

		int accnum = getAccountnumber();
		int pinnum = getPinnumber();

		if (data.containsKey(accnum) && data.get(accnum) == pinnum)
			showData();
		else
			System.out.println("Data Not Found please check the Customer number or Pin number : " + accnum);

	}

	private void showData() throws IOException {
		
		System.out.println("Enter Your Choice.....!");

		System.out.println("1 ----> Check Balance");
		System.out.println("2 ----> Deposit");
		System.out.println("3 ----> Withdraw Amount");
		System.out.println("4 ----> Exit");

		checkForChoice(Integer.valueOf(br.readLine()));
	}

	private void checkForChoice(int choice) throws NumberFormatException, IOException {

		switch (choice) {
		case 1:
			CheckBalance();
			break;
		case 2:
			CashDeposit();
			break;
		case 3:
			CashWithDraw();
			break;
		case 4:
			System.out.println("Thank you Visit Again");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Values");
			break;
		}
	}

	private void CheckBalance() throws IOException {
		System.out.println("You have choosen Check Balance");
		System.out.printf("Amount you hold in your Account : %1.2f \n", getMoney() );

		showData();		
	}

	private void CashWithDraw() throws NumberFormatException, IOException {
		System.out.println("Enter amount to Withdraw Amount \nEnter the amount in the order of 100");
		long cash = Long.parseLong(br.readLine());
		
		if(cash%100 == 0 && cash%5 == 0)
			if (getMoney() > 0 && cash <= getMoney() && getMoney() >= 100)
			{ 
				cashWithdraw((double)cash);
				System.out.println("Amount you Withdraw : "+ cash);
			}
			else
				System.out.println("Insufficient Balance.....!");
		else 
			System.out.println("Please Enter the amount you want to withdraw in the order of 100");
		showData();
				
	}

	private void CashDeposit() throws NumberFormatException, IOException {

		System.out.println("Enter amount to Deposit");
		double depositcash = Double.parseDouble(br.readLine());
		if (depositcash >= 0) {
			cashDeposit(depositcash);
			System.out.printf("Amount you deposited : %1.2f\n", depositcash);
		}
		showData();
		
	}

}
