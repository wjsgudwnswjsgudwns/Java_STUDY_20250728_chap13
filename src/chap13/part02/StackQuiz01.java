package chap13.part02;

import java.util.Stack;

public class StackQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 뒤집기
		Stack<Character> character = new Stack<Character>();
		
		character.push('H');
		character.push('e');
		character.push('l');
		character.push('l');
		character.push('o');
		
		while(!character.isEmpty()) {
			Character charac =  character.pop();
			System.out.print(charac);
		}

	}

}
