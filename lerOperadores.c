#include <conio.h>
#include <stdio.h>

main()
{
	float num1,num2,multiplicacao,divisao,soma, subtracao;
	//num1=10;
	//num2=5;
	
	printf("Digite o numero 1:");
	scanf("%f", &num1);
	printf("Digite o numero 2:");
	scanf("%f", &num2);
		
	soma = num1 + num2;
	subtracao = num1-num2;
	multiplicacao = num1*num2;
	divisao = num1/num2;
	
	
    	printf ("\nA soma e: = %f",soma );
		printf ("\nA subtraçao e: +  %f",subtracao);
		printf ("\nA Multiplicacao e: = %f",multiplicacao);
		printf ("\nA divisão e =  %f",divisao);
	
	getch();
}
