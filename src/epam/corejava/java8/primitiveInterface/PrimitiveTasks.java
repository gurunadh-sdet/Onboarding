package epam.corejava.java8.primitiveInterface;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class PrimitiveTasks {

	public static void main(String[] args) {
		
		
		
		//1. Write an IntPredicate to verify if the given number is a primenumber
		IntPredicate ifPrimeNumber = n-> {
			if(n<=1)
				return false;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
					return false;
			}
			return true;
			};

			System.out.println(ifPrimeNumber.test(9));
			System.out.println(ifPrimeNumber.test(7));
			
		// 2. Write an IntConsumer to print square of the given number
			IntConsumer square = n-> {
					System.out.println(n*n);
				};
				
				square.accept(7);
				square.accept(4);
				
		//3. Write a IntSupplier to give random int below 5000. 
				
				IntSupplier randomNumSupplier = ()-> {
						Random r = new Random();
						return r.nextInt(5000);	
					};
					
				System.out.println(randomNumSupplier.getAsInt());
				
			
	}

}
