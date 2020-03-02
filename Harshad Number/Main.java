#include<iostream>
using namespace std;
int main()
{
  int a,sum=0,b;
  cin>>a;
  b=a;
  while(a!=0){
    sum+=(a%10);
    a/=10;
  }

  if(b%sum!=0)
    cout<<"Not Harshad Number";
  else
    cout<<"Harshad Number";
	
  
}