package chap13.part02;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Coin> coinbox = new Stack<Coin>();
		
		coinbox.push(new Coin(50)); // 50원짜리 1개 생성 -> 코인 박스에 삽입
		coinbox.push(new Coin(100)); // 100원짜리 1개 생성 -> 코인 박스에 삽입
		coinbox.push(new Coin(500)); // 500원짜리 1개 생성 -> 코인 박스에 삽입
		coinbox.push(new Coin(100)); // 100원짜리 1개 생성 -> 코인 박스에 삽입
		coinbox.push(new Coin(500)); // 500원짜리 1개 생성 -> 코인 박스에 삽입
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue()+"원");
		}
	}

}
