package Arquivos.Thread.MultiThreads;

import java.security.SecureRandom;
import java.util.List;

public class writeBuffer implements Runnable{
	private static final SecureRandom generator = new SecureRandom();
	private final buffer sharedLocation;	
	public writeBuffer(buffer sharedLocation) {
		this.sharedLocation = sharedLocation;
	}
	public void run() {
		int sum = 0;
		for (int count =1;count <=10;count ++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sharedLocation.putBuffer(count);
				sum+=count;
				System.out.printf("\t%2d\n",sum);
				}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();				
			}			
		}
		System.out.println("Escrita do buffer realizada!\n");
	}
}

/*
sum = sum + count
1 = 0 + 1
3 = 1 + 2
6 = 3 + 3
10 = 6 + 4
15 = 10 + 5
21 = 15 + 6
28 = 21 +  7
36 = 28 + 8
45 = 36 + 9
55 = 45 + 10
 */