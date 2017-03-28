public class Main{
	public static void main(String[] args){
		new Producer(1);
		new Consumer(2);
		new Consumer(3);
		new Producer(4);
		new Producer(5);
	}
}
