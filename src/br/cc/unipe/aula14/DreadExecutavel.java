package br.cc.unipe.aula14;

public class DreadExecutavel implements Runnable {

	public void run() {
		int i = 0;
		while(i < 10){
			System.out.println("Palmeiras não tem mundial");
			System.out.println(Thread.currentThread().getName() + " hashcode>>" + this.hashCode());
			i++;
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e){
				System.out.println("Ainda assim não tem mundial");
			}
		}
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++){
			DreadExecutavel dread = new DreadExecutavel();
			Thread oi = new Thread(dread);
			oi.start();
		}
	}
}
