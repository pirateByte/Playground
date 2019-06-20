#include <stdio.h>
int main() {
	//Type your code
  int x,res=0,y;
  scanf("%d",&x);
  y=x;
  while(x>0){
    res+=factorial(x%10);
    x/=10;
  }
  if(res==y)
    printf("Yes");
   else
     printf("No");
	return 0;
}
int factorial(int x){
  int res=1;
  while(x>1){
    res*=x;
    x--;
  }
  return res;
}