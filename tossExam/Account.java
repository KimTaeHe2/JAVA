package tossExam;


public class Account {
	// 필드
	private String ano; 	// 계좌번호
	private String owner; 	// 예금주
	private int balance; 	// 잔액

	
	public Account() {};
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// 생성자
	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 메서드
	
} // class 종료
