#include"array.h"

int Output_array(int **array)
{
	int i,j;
	for (i=0; i<M; i++)
	{
		for(j=0; j<N; j++)
			printf("%4d ",array[i][j]);
		printf("\n");
	}	

	return 0;
}
