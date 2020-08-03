package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import model.Account;
import model.BankClient;
import model.InvalidAmountException;

class PrintTest {

	//see the printed result in the console
	@Test
	void testPrint() throws InvalidAmountException {
		Account account = new Account();
		account.setMoney(new BigDecimal(50));
		BankClient bankClient = new BankClient();
		bankClient.setAccount(account);
		bankClient.deposit(new BigDecimal(20));
		bankClient.withdraw(new BigDecimal(30));
		bankClient.print();
	}

}
