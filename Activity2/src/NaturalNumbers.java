import java.util.Random;
import java.util.stream.IntStream;

public class NaturalNumbers {
	//int[] set1 =new int[100];
	
	/*public void initliaze(int array[],int min, int max){
		Random rand=new Random();;
	    int randomNum = rand.nextInt((max - min) + 1) + min;
		for(int i=0; i<array.length;i++){
			array[i]=randomNum;
		}	
	}*/
	
	public void naturalnumbers(int array[]){
		
		for(int i=0; i<array.length;i++){
			if(array[i]==0){
				System.out.println("Can not contain 0!");
				System.exit(0);
				//return 0;
			}
			else if(array[i]>0){
				System.out.println("Natural Numbers!");
				
			}
			
		}
	}
	
	public int addition(int array[]){
		int sum = 0;
		 sum = IntStream.of(array).sum();
		return sum;
	}
	
	public int subtraction(int array[]){
		int sum = 0;
		for(int i=0; i<array.length;i++){
			sum -= array[i];
		}
		return sum;
	}
	
	public int multiply(int array[]){
		int prod = 1;
		for(int i=0; i<array.length;i++){
			prod *= array[i];
		}
		return prod;
	}
	
	public int divide(int array[]){
		int divide = 1;
		for(int i=0; i<array.length;i++){
			if(array[i]==0){
				System.out.println("ERROR!");
				return 0;
			}
			divide /= array[i];
		}
		return divide;
	}
	

/*	public static void main(String[] args) {
	int[] set2 =new int[5];
	for(int i=0; i<set2.length;i++){
		set2[i]=i;
	}
	
	
		NaturalNumbers object=new NaturalNumbers();
		//object.initliaze(set2,2,10);
		int sum=object.addition(set2);
		System.out.println(sum);
		sum=object.multiply(set2);
		System.out.println(sum);
		sum=object.divide(set2);
		System.out.println(sum);
		sum=object.subtraction(set2);
		System.out.println(sum);
		

	}*/

}
