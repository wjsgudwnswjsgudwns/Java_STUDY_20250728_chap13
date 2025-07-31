package chap13.part02;

import java.util.Stack;

public class StackTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack1 = new Stack<String>();
		
		stack1.push("1) kor");
		stack1.push("2) jap");
		stack1.push("3) usa");
		
		while(!stack1.isEmpty()) { // isEmpty() -> stack이 비어있으면 true -> ! 비어 있지 않으면 true
			String str = stack1.pop();
			System.out.println(str);
		}

	}

}
