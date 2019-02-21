package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	Money tmp;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Money) {
			Money tmpp = (Money)obj;
			return amount == tmpp.amount;
		}
		else
			return false;
	}
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		tmp = new Money(this.amount + money.amount);
		return tmp;
	}

	public Money minus(Money money) {
		if(money.amount > this.amount)
			tmp = new Money(money.amount - this.amount);
		else
			tmp = new Money(this.amount-money.amount);
		return tmp;
	}

	public Money multiply(Money money) {
		tmp = new Money(money.amount * this.amount);
		return tmp;
	}

	public Money devide(Money money) {
		if(money.amount > this.amount)
			tmp = new Money(money.amount / this.amount);
		else
			tmp = new Money(this.amount/money.amount);
		return tmp;
	}
}