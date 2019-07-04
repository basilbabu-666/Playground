#include <stdio.h>
int main()
{
int x=0,n;
  scanf("%d",&n);

  for(int i=1; i<=n; i++)
  {
    for(int j=1; j<=i; j++)
    {
      x=x+1;
      if (x%2==1)
      {
      printf("*");
          
      }
      else
      {
        printf("#");
        
      }
    }
      printf("\n");
    
    }
  return 0;
}