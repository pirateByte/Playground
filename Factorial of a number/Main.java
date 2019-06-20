#include <stdio.h>
int main() {
	//Type your code
  int x,res=1;
  scanf("%d",&x);
  for(int i=1;i<=x;i++)
    res*=i;
  printf("%d",res);
	return 0;
}