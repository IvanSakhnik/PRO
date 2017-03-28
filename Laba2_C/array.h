#ifndef ARRAY_H
#define ARRAY_H

#include<stdio.h>
#include<stdlib.h>
#define N 10
#define M 10

int Random_array(int **array);
int Sort_array(int **array);
int Enter_array(int **array);

int Output_array(int **array);

void Search(int **array, int value);
void Search_debug(int **array, int value);

#endif //ARRAY_H
