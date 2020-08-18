package com.yedam.exam;

public class Exercuse0620 {
	private String ano;
	private String owner;
	private int balance;
	
	public Exercuse0620(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {return ano; }
	public void setAno(String ano) {this.ano = ano; }

	public String getOwner() {return owner; }
	public void setOwner(String owner) {this.ano = owner; }

	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
}
