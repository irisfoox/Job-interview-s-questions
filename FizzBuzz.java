package FizzBuzz;

public class FizzBuzz {
	public static void fizzbuzz(int start,int length) {
    int[] arr=new int[length];
    for(int i=0;i<arr.length;i++) {
    	arr[i]=start+i;            //initializing array with int
    }
    String[] strarr=new String[length];
    for(int i=0;i<arr.length;i++) {
    	if((arr[i]%3==0) && (arr[i]%5==0)) {strarr[i]="fizzbuzz";}
    	else if(arr[i]%3==0) {strarr[i]="fizz";}
    	else if(arr[i]%5==0) {strarr[i]="buzz";}
    	else strarr[i]=String.valueOf(arr[i]);
    }
    for(String i:strarr)
    	System.out.print(i+" ");
	}
    public FizzBuzz() {
    	
    }
}
