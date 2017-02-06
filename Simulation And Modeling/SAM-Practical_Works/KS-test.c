#include <stdio.h>
#include <math.h>
#define MAX_NO 500
int main()
{	
	//linear congruental method to generate random numbers:
	int a,m,c=0,i,x,j,flag=0,N=0, choice;
	float rand[MAX_NO], temp;
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
		N++; i++;
		if(flag ==1){
			break;
		}
	}
	printf("\nno of randoms generated= %d",N);
	
	
	//Rank the random numbers in increasing order
	for(i=0;i<N;i++){
		for(j=0;j<N-i-1;j++){
			if(rand[j]>rand[j+1]){
				temp=rand[j];
				rand[j]=rand[j+1];
				rand[j+1]=temp;
			}
		}
	}
	
	//Display the random numbers
	printf("\n");
	for(i=0;i<N;i++){
		printf("%f ",rand[i]);
	}
	
	//BEGIN OF K-S test
	//setup the hypothesis
	printf("\n\nHypothesis\n");
	printf("H0 : Numbers are uniformally distributed\n");
	printf("H1 : Numbers are not uniformally distributed\n");
	
	float tempX[MAX_NO], tempY[MAX_NO];
	float Dpo, Dne, D, Dalpha;
	
	for(i = 0;i<N;i++){
		tempX[i] = (float)(i/N) - rand[i];
		tempY[i] = rand[i] - (float)((i-1)/N);
	}
	Dpo = tempX[0];
	for (i = 0; i<10; i++){
		if (tempX[i]>Dpo){
			Dpo = tempX[i];
		}
	}
	Dne = tempY[0];
	for (i = 0; i<10; i++){
		if (tempY[i]>Dne){
			Dne = tempX[i];
		}
	}
	
	//Find the actual value of D
	D = (Dpo > Dne ? Dpo: Dne);
	
	printf("\nEnter critical value at 0.05 level of significance from table: ");
	scanf("%f",&Dalpha);
	
	printf("\n\n\t\tConclusion\t\t\n");
	printf("\n\n");

	printf("D-calculated=%.4f and D-tabulated=%.4f",D,Dalpha);
	printf("\n\n");
	
	if(D<=Dalpha){
		printf("D-calculated <= D-tabulated. \nNull Hypothesis H0 is accepted and numbers are uniformally distributed.\n");
	}
	else{
		printf("D-calculated > D-tabulated.\nNull Hypothesis H0 is rejected and numbers are not uniformally distributed.\n");
	}
	return 0;
}
