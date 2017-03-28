import java.util.concurrent.BrokenBarrierException;

public class Producer implements Runnable{
	private int threadNumber;
        Thread thr;

	public Producer(int num){
		threadNumber = num;
		System.out.println("Thread" + threadNumber + " started");
		thr = new Thread(this, "Thread" + threadNumber + "_Producer");
		thr.start();
	}


	public void run(){
		while (true){
			Global.CR1.push(threadNumber);
			if(threadNumber == 1){
				try{
					Global.Sem2.release();
					System.out.println("P1 acquire Sem2");
					System.out.println("P1 start waiting for Sem1");
					Global.Sem1.acquire();
					System.out.println("P1 finish waiting for Sem1");
		
				} catch (InterruptedException e){
					e.printStackTrace();
				}
			}
			if(threadNumber == 4){
				try{
					Global.Sem1.release();
					System.out.println("P4 release Sem1");
					System.out.println("P4 start waiting for Sem2");
					Global.Sem2.acquire();
					System.out.println("P4 finish waiting for Sem2");
					thr.sleep(100);
		
				} catch (InterruptedException e){
					e.printStackTrace();
				}
			}
			if(threadNumber == 5){
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
