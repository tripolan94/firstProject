package com.yedam.lambda;


public class BaseballExample {
	private int count;
	private int ball;
	private int strike;
	
	
	public BaseballExample(){
	}
	
	public BaseballExample(int count, int ball, int strike) {
		super();
		this.count = count;
		this.ball = ball;
		this.strike = strike;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	public int getStrike() {
		return strike;
	}
	public void setStrike(int strike) {
		this.strike = strike;
	}

	
	
	
}
