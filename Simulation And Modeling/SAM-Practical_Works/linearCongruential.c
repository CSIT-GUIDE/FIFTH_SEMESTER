#include <stdio.h>
#define MAX 50
int main()
{
	int a,m,c,i,x,j,flag=0,N=0, choice;
	float rand[MAX];
	printf("Mixed (1) or Multiplicative (2)?\n");
	scanf("%d",&choice);
	if(choice == 1)
	{
		printf("Enter the value of c: ");
		scanf("%d",&c);
	}
	printf("Enter the value of x0, a & m\n");
	scanf("%d%d%d",&x,&a,&m);
	while(1) {
		rand[i] = (float)x/m;
			
		for(j=0;j<=i;j++) {
			if(i==j) {
				continue;
			} 
			else if(rand[i] == rand[j]) {
				flag = 1;
				break;
			}
			else{
				flag = 0;
			}	
		}
		x = (a*x+c)%m;
		printf("%f\n",rand[i]);
		N++; i++;
		if(flag ==1){
			break;
		}
	}
	printf("\nno of randoms= %d",N);
	return 0;
}
