package comm.example;
import java.time.LocalDate;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Account {
	private String accountNumber; 
	private AccountType accountType;
	private double amount;
	private LocalDate dateOfOpening;
	private static Account account;
	static
	{
		account=new Account();
	}
	public static Account createAccount(AccountType accountType,double amount) {
	
		account.setAccountNumber(UUID.randomUUID().toString());
		account.setAccountType(accountType);
		account.setAmount(amount);
		account.setDateOfOpening(LocalDate.now());
		return account;
		
		
	}
	public String displayAccount()
	{
		return "Account number:" +getAccountNumber()+"Account Type:"+getAccountType()+"amount:"+getAmount()+"Opening Date:"+getDateOfOpening();
	}
	
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}

	}


