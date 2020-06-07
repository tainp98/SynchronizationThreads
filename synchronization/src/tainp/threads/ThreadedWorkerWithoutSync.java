package tainp.threads;

public class ThreadedWorkerWithoutSync extends Thread {
	private ResourcesExploiter rExp;
	private String thread_name; 
	public ThreadedWorkerWithoutSync(ResourcesExploiter resource, String name) {
		rExp = resource;
		thread_name = name;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			rExp.exploit();
			System.out.println(thread_name + " " + rExp.getRsc() + " ");
		}
	}
		
}
