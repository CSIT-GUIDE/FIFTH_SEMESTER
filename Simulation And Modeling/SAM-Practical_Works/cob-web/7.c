#include<stdio.h>
int main()
{
	int a=12,i;
	float p=30,b=30,c=1,d=0.9,s,dem;
	printf("i\tp\td\ts");
	printf("\n-------------------------");
	for(i=0;i<20;i++){
		s=c+d*p;
		dem=s;
		p=((float)a-dem)/b;
		printf("\n%d\t%.4f\t%.4f\t%.4f",i,p,dem,s);
	}
	return 0;
}
