#include <stdio.h>
#include <stdlib.h>
#define f(x,y) x*x+y*y-1
#define MAX_RAND 100
int main()
{
	int N, n =0, i;
	double pi_calc,randx, randy;
	printf("Enter the no. of points to be taken? \n");
	scanf("%d",&N);
	for(i=0;i<N;i++){
		randx = (double)(rand()%(100))/(double) MAX_RAND;
		randy = (double)(rand()%(100))/(double) MAX_RAND;
		if(f(randx,randy)<=0){
			n++;
		}
	}
	pi_calc = ((double) n/N)*4;
	printf("Calculated Value = %lf",pi_calc);
	return 0;
}
