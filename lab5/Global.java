import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Global{
	public static CommonStack CR1 = new CommonStack();
	public static CyclicBarrier CB1 = new CyclicBarrier(3);
	public static Semaphore Sem1 = new Semaphore(0, true);
	public static Semaphore Sem2 = new Semaphore(0, true);
}
