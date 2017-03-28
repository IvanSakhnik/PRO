import Inp.RandomArray;
import Out.OutputArray;
import Sh.Search;
public class Laba2{
	public static void main(String[] args){
		int m=5;
		int n=5;
		int array[][] = new int [m][n];
		
		RandomArray.Input_array(array,m,n);
		OutputArray.Output_array(array,m,n);
		Search.Search_value(array,m,n,5);
		
	}	
}	
