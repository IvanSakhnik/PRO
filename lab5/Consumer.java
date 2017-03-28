import java.util.concurrent.BrokenBarrierException;

public class Consumer implements Runnable{
	private int threadNumber;

	public Consumer(int num){
		threadNumber = num;
		System.out.println("Thread" + threadNumber + " started");
		new Thread(this, "Thread" + threadNumber + "_Consumer").start();
	}

	public void run(){
		while (true){
			Global.CR1.pop(threadNumber);
			if(threadNumber == 2){
				try{
					CommonVariables.mutex.lock();
					CommonVariables.updateVariables(threadNumber);
					CommonVariables.mutex.unlock();
					Global.CB1.await();
				} catch (InterruptedException e){
					e.printStackTrace();
				} catch (BrokenBarrierException e){
					e.printStackTrace();
				}

			}
			else if(threadNumber == 3){
				try{
					CommonVariables.mutex.lock();
					CommonVariables.updateVariables(threadNumber);
					CommonVariables.mutex.unlock();
					Global.CB1.await();
				} catch (InterruptedException e){
					e.printStackTrace();
				} catch (BrokenBarrierException e){
					e.printStackTrace();
				}
			}
		}
	}
}
