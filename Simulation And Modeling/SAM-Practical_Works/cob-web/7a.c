#include<stdio.h>
int main()
{
	int a=10,i;
	float p=5,b=0.9,c=-2.4,d=1.2,s,dem;
	printf("i\tp          \td\t          s");
	printf("\n----------------------------------------");
	for(i=0;i<20;i++){
		s=c+d*p;
		dem=s;
		p=((float)a-dem)/b;
		printf("\n%d\t%.2f\t      %.2f\t      %.2f",i,p,dem,s);
	}
	return 0;
}
