package cit360.spring2017.threads_example;

public class ThreadRunnable implements Runnable {

	private String name;
	private int time;

	public ThreadRunnable(String name, int time) {
		this.name = name;
		this.time = time;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {

		try {
			for (int i=0; i<6; i++) {
				System.out.println(name + " counter " + i);

				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " It finished excution");
	}
}