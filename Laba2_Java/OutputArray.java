package Out;
public class OutputArray{
	public static void Output_array(int array[][], int m, int n){
		for (int i=0; i<m; i++){
			for(int j=0; j<n; j++)
				System.out.print(array[i][j]+" ");
		System.out.println();
		}
	}	
}	
