package problem02;

public class Sub implements Arithmetic{
	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b)
			return a-b;
		else
			return b-a;
	}
}
