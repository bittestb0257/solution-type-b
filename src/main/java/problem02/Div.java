package problem02;

public class Div implements Arithmetic {
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b)
			return a/b;
		else
			return b/a;
	}
}
