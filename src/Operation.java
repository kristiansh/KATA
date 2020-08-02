import java.util.Date;

public abstract class Operation {
	//the name of the operation
	String operationName;
	//the date of the execution of the operation
	Date operationDate;
	//the amount involved
	float amount;
	//the balance at the end
	float balance;
	
	//to be implemented by the various related operations
	public abstract void execute(Account account, float amount)  throws Exception;
	
	//printing operations
	@Override
	public String toString() {
		return operationName + " at " + operationDate + " amount: " 
	+ amount + " balance: " + balance;
	}
}
