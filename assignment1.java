import java.util.Arrays;

public class assignment1{

	public static void main(String[] args){
		int[] data={1,2,3,6,7};
		int[] dataR=reverseArray(data);
		 System.out.println("Original Array :"+ Arrays.toString(data));
		 System.out.println("reverse Array :"+ Arrays.toString(dataR));

	}
	public static int[] reverseArray(int[] data){
		int[] reversdata= new int[data.length];
		int i;
		for(i=0;i<data.length;i++){
			reversdata[i]=data[(data.length-i-1)];
		}
		return reversdata;
	}
}