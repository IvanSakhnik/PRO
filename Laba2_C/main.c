#include"array.h"

int main()
{
	        int ** array, i;
	array = (int **)malloc(sizeof(int *)*M);
	for (i  = 0; i < M; i++)
		array[i] = (int *)malloc(sizeof(int)*N);
		
	Random_array(array);
	//Sort_array(array);
	//Enter_array(array);
	Output_array(array);
	Search(array,5);

	return 0;
}

	
