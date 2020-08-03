package model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import service.Operation;

public class Account {
	//the amount of money present in the account
	private BigDecimal money;
	//the list of operations done on the account
	private List<Operation> operations = new ArrayList<Operation>();
	/**
	 * @return the money
	 */
	public BigDecimal getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	/**
	 * @return the operations
	 */
	public List<Operation> getOperations() {
		return operations;
	}
	/**
	 * @param operations the operations to set
	 */
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	/**
	 * @param add an operation
	 */
	public void addOperation(Operation operation) {
		this.operations.add(operation);
	}
}
