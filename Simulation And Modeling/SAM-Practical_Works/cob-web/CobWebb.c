#include <stdio.h>

int main(){

//	int a = 12, b = 30, n, s, i;
//	float c = 1.0, d = 0.9;
//	float p0 = 30;

	float a = 10.0, b = 0.9, c = -2.4, d = 1.2, s, p0 = 5, D;
	int n, i;

	printf("Enter the no. of iterations: ");
	scanf("%d", &n);
	
	for(i = 1; i <= n; i++){

		s = c + d * p0;
		
		D = s;

		p0 = (a - D) / b;
		printf("i = %d, P = %f\n", i, p0);
	}
}
