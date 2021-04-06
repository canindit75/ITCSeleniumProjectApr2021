package JavaOOPSPack;

public class CitiBank implements Bank  {
	public void Debit() {
		System.out.println("Citibank - Debit");
	}

	public void Credit() {
		System.out.println("CitiBank - Credit");
	}

	public void TransferMoney() {
		System.out.println("CitiBank - TransferMoney");
	}
 
	public void MinBalance(){
		System.out.println("CitiBank - Min Balance");
	}

}
