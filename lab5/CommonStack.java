import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class CommonStack{
	private static final int N = 100;
	private int stack[] = new int[N];
	private int top = -1;

	public synchronized void push(int P_num){
		while (is_full()){
			try{
				wait();
			} catch (InterruptedException e){
				System.out.println("Interrupted Exception");
			}
		}
		top++;
		stack[top] = top;
		System.out.println("P"+P_num+" add_elem: top = "+top+"; elem = "+stack[top]);
		notify();
	}

	public synchronized int pop(int P_num){
		while (is_empty()){
			try{
				wait();
			} catch(InterruptedException e){
				System.out.println("Interrupted Exception");
			}
		}
		int tmp = stack[top];
		top--;
		System.out.println("P"+P_num+" get_elem: top = "+top);
		notify();
		return tmp;
	}

	public synchronized boolean is_empty(){
		return top == -1;
	}

	public synchronized boolean is_full(){
		return top >= N-1;
	}
}
