#include<stdio.h>
int main()
{
int peri,area,length=6,width=9;
  peri=2*(length+width);
  area=length*width;
  printf("The perimeter of the rectangle is: %d cm",peri) ;
  printf("\nThe area of the rectangle is: %d sq cm",area);
    return 0;
}