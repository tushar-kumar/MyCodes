// Write a c program that computes the sum of following series 
// i.e. 1+2/!2 + 3/sqrt of 3 +4/!4 + 5/sqrt 5 .....

#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int fact(int x)
{
	int sum=1;
	while(x>0)
	{
		sum=sum*x;
		x--;
	}
	return sum;
}

int main()  
{
    system("cls");
    int n;
    double ans,sum=0;
    printf("Enter the value of n: ");
    scanf("%d",&n);

    for(int i=1;i<=n;i++)  
   {
   	ans=0;
   	
   	if( i%2==0)
   	{
   	ans = (double)i/(fact(i));
	sum+=ans;
   	// printf("%lf \n",ans);
   	}
   	else
   	{
   	ans = i/(sqrt(i));
	sum+=ans;
   	// printf("%lf \n",ans);
   	}
   }
	printf("\n\t\t The sum of the series id %lf.\n",sum);
}
