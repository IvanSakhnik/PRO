#include"array.h"
#include<time.h>

int Random_array(int **array)
{
	int i,j;
	srand(time(0));
	for (i=0; i<M; i++)
		for(j=0; j<N; j++)
			array[i][j] = rand()%10;


	return 0;		
		
}

int Sort_array(int **array)
{
	int i,j;
	for (i=0; i<M; i++)
		for(j=0; j<N; j++)
			array[i][j] = j + i*N;
		
	return 0;			
}

int Enter_array(int **array)
{
	int i,j;
	printf("Input array:\n");
	for (i=0; i<M; i++)
		for(j=0; j<N; j++)
			scanf ("%d ", &(array[i][j]));

	return 0;
}
