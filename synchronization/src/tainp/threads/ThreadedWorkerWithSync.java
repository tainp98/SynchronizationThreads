package tainp.threads;

public class ThreadedWorkerWithSync extends Thread {
	private ResourcesExploiter rExp;
	private String thread_name; 
	public ThreadedWorkerWithSync(ResourcesExploiter resource, String name) {
		rExp = resource;
		thread_name = name;
	}
	public void run() {
		synchronized(rExp){
			for(int i=0;i<1000;i++){
			rExp.exploit();
			System.out.println(thread_name + " " + rExp.getRsc() + " ");
			}
			
		}
	}
}
