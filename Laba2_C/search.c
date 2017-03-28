#include"array.h"

void Search(int **array, int value)
{
	int index_i = -1, index_j = -1;
	int i, j;
		
	for (j=0; j<N; j++)
	{
		for(i=0; i<M; i++)
			if (array[i][j] == value)
			{
				index_i = i;
				index_j = j;
				break;
			}
	if (index_i != -1 && index_j != -1)
	break;
	}

	if (index_i != -1 && index_j != -1)
	{
		index_i += 1;
		index_j += 1;
		printf("Element %d found at position %d-%d \n",value,index_i,index_j);
	}
	else 
		printf("Element %d not found \n",value);	
}	

void Search_debug(int **array, int value)
{
	int index_i = -1, index_j = -1;
	int i, j;
		
	for (j=0; j<N; j++)
	{
		for(i=0; i<M; i++)
		{
			if (array[i][j] == value)
			{
				index_i = i;
				index_j = j;
				printf("array[%d][%d]=%d index_i = %2d; index_j = %2d; \n",i+1,j+1,array[i][j],index_i+1,index_j+1);
				break;
			}
			printf("array[%d][%d]=%d index_i = %d; index_j = %d; \n",i+1,j+1,array[i][j],index_i,index_j);
		}
	if (index_i != -1 && index_j != -1)
	break;
	}

	if (index_i != -1 && index_j != -1)
	{
		index_i += 1;
		index_j += 1;
		printf("Element %d found at position %d-%d \n",value,index_i,index_j);
	}
	else 
		printf("Element %d not found \n",value);	
}
