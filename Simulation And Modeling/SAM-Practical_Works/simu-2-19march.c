/*Find the square root of 3*/
#include <stdio.h>
#include <stdlib.h>
#define f(x) x*x
int main()
{
	int N, n =0, i;
	double root_3,randx;
	printf("Enter the no. of points to be taken? \n");
	scanf("%d",&N);
	for(i=0;i<N;i++){
		randx = (double)(1)/RAND_MAX*rand()+1;
		if(f(randx)<=3){
			n += 1;
		}
	}
	root_3 =  1+((double)n/N);
	printf("%lf",root_3);
	return 0;
}
