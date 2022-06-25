package Arquivos.Thread.MultiThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class mainMultiThreads {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService  threadRun = Executors.newCachedThreadPool();
		buffer sharedLocation = new unsysnchronizedBuffer();
		
		System.out.printf("Thread running\t\tValue\t "
				+ "Sum write\tSum read\n");
		System.out.println("-------------------------------------------------------------------");
		threadRun.execute(new writeBuffer(sharedLocation));
		threadRun.execute(new readBuffer(sharedLocation));
		threadRun.shutdown();
		// o 1 representa o tempo, a TimeUnit a unidade
		threadRun.awaitTermination(1, TimeUnit.MINUTES);
	}
}

/*

Thread running		Value	 Sum write	Sum read
-------------------------------------------------------------------
Escrevendo valor: 	 1
Leitura valor: 			 1
Leitura valor: 			 2
Escrevendo valor: 	 3
Escrevendo valor: 	 6
Escrevendo valor: 	10
Escrevendo valor: 	15
Leitura valor: 			 7
Escrevendo valor: 	21
Leitura valor: 			13
Escrevendo valor: 	28
Escrevendo valor: 	36
Leitura valor: 			21
Escrevendo valor: 	45
Leitura valor: 			30
Escrevendo valor: 	55
Escrita do buffer realizada!

Leitura valor: 			40
Leitura valor: 			50
Leitura valor: 			60
Leitura valor: 			70

Leitura do total de valores:  70
Leitura finalizada!

----------- Anotações ----------
Soma = Soma + count

Escrevendo valor: 1 - Passa o count (1) para o buffer, faz a soma 1 = 0 + 1

Leitura valor: 1 - Recebe o count do buffer (1), faz a soma 1 = 0 + 1

Leitura valor: 2 - Recebe o count do buffer (1), faz a soma 2  = 1 + 1

Escrevendo valor: 3 - Passa  o count (2) para o buffer, faz a soma 3 = 1 + 2

Escrevendo valor: 6-  Passa  o count (3) para o buffer, faz a soma 6 = 3 + 3

Escrevendo valor: 10 -  Passa  o count (4) para o buffer, faz a soma 10 = 6 + 4

Escrevendo valor: 15 - Passa  o count (5) para o buffer, faz a soma  15 = 10 + 5

Leitura valor: 7 - Recebe o count do buffer (5), faz a soma 7  = 2 + 5

Escrevendo valor: 21 - Passa  o count (6) para o buffer, faz a soma  21 = 15 + 6

Leitura valor: 13 - Recebe o count do buffer (6), faz a soma 13  = 7 + 6

Escrevendo valor: 28 - Passa  o count (7) para o buffer, faz a soma  28 = 21 + 7

Escrevendo valor: 36 - Passa  o count (8) para o buffer, faz a soma  36 = 28 + 8

Leitura valor: 21 - Recebe o count do buffer (8), faz a soma 21  = 13 + 8

Escrevendo valor: 45 - Passa  o count (9) para o buffer, faz a soma  45 = 36 + 9

Leitura valor: 30 - Recebe o count do buffer (9), faz a soma 30  = 21 + 9

Escrevendo valor: 55 - Passa  o count (10) para o buffer, faz a soma  55 = 45 + 10

A thread writeBuffer acabou, da um shutdown, o método awaitTermination, espera








 */
