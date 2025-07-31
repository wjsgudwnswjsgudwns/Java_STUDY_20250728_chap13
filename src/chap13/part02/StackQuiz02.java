package chap13.part02;

import java.util.Stack;

public class StackQuiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 유효한 괄호인지 아닌지 판별 ex ()()(()))
		
		String str = ")(())()(";
		
		Stack<Character> strStack = new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' ) {
				strStack.push(ch);
			} else {
				if(strStack.isEmpty()) {
					System.out.println("유효하지 않은 괄호 구성.");
					return;
				}
				strStack.pop();
			}
			
		}

		if (strStack.isEmpty()) {
			System.out.println("유효한 괄호 구성");
		} else {
			System.out.println("유효하지 않은 괄호 구성");
		}
	}

}
