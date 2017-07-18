package cit360.spring2017.threads_example;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ThreadRunnable thread1 = new ThreadRunnable("#19", 500);
		
		@SuppressWarnings("unused")
		ThreadRunnable thread2 = new ThreadRunnable("#17", 600);
		
		@SuppressWarnings("unused")
		ThreadRunnable thread3 = new ThreadRunnable("#42", 800);
	}
}