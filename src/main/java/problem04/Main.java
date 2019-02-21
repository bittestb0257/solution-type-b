package problem04;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static ArrayList<String> makeGame() {//돌다리 생성
		ArrayList<String> game = new ArrayList<String>();
		Random generator = new Random();
		int river = generator.nextInt(65536)-32768+10;
		int rock = generator.nextInt(65536)-32768+10;
		
		int flag, i=0;
		
		while(i < river+rock) {
			flag = generator.nextInt(1);
			if(flag == 1)
				game.add("#");
			else
				game.add("o");
		}
		return game;
	}
	public static void start(ArrayList<String>game) {
		Random generator = new Random();
		int go = generator.nextInt(4)+1;
		
	}
	public static void main(String[] args) {
		start(makeGame());
	}

}
