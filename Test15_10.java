/**
 * Name : 呂芝瑩
 * ID : U10316015
 * EX : 15.10
 */
import java.util.ArrayList;

public class Test15_10 {
  public static void main(String[] args) {
    MyStack stack = new MyStack();	//invoke MyStack
    stack.push("S1");
    stack.push("S2");
    stack.push("S");

    MyStack stack2 = (MyStack) (stack.clone());	//invoke MyStack
    stack2.push("S1");
    stack2.push("S2");
    stack2.push("S");

    System.out.println(stack.getSize());
    System.out.println(stack2.getSize());
  }
}
