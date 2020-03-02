#include<iostream>
using namespace std;
#include<math.h>
int main()
{
    float d,o,pr,lo;
        cin>>d>>o;
    d=d/12;
    if(d<o)
    {
        pr=(o-d)*12;
        cout<<"Profit : Rs."<<pr;
    }
    else if(o<d)
    {
        lo=(d-o)*12;
        cout<<"Loss : Rs."<<lo;
    }
    else
        cout<<"No profit nor loss";
    return 0;

}