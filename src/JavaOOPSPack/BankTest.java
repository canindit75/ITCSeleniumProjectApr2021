package JavaOOPSPack;

public class BankTest {

	public static void main(String[] args) {
		HDFCBank hdfc = new HDFCBank();
		hdfc.Debit();
		hdfc.Credit();
		hdfc.TransferMoney();
		hdfc.GetROI();
		
		CitiBank citi = new CitiBank();
		citi.Debit();
		citi.Credit();
		citi.TransferMoney();
		citi.MinBalance();
		
		ICICIBank icici  = new ICICIBank();
		icici.Debit();
		icici.Credit();
		icici.TransferMoney();
		
		Bank b = new HDFCBank();
		//Through  interface instance, i can only access the common behavior specific the class instance
		b.Credit(); 
		b.Debit();
		b.TransferMoney();
		
		b = new CitiBank();
		b.Credit(); 
		b.Debit();
		b.TransferMoney();

		b = new ICICIBank();
		b.Credit(); 
		b.Debit();
		b.TransferMoney();

	}

}
