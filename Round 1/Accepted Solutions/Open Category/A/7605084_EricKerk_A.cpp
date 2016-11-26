#include <iostream>

using namespace std;

int main()
{
    while(true)
    {
        int n1=0,n2=0,n3=0,n4=0;
        int degree=3*360;
        cin >> n1;
        cin >> n2;
        if (n1>n2)
            degree = degree + (n1 - n2)*9;
        else
            degree = degree + (40 - n2 + n1)*9;
        cin >> n3;
        if (n3>n2)
            degree = degree + (n3 - n2)*9;
        else
            degree = degree + (40 - n2 + n3)*9;
        cin >> n4;
        if (n3>n4)
            degree = degree + (n3 - n4)*9;
        else
            degree = degree + (40 - n4 + n3)*9;
        if (n1+n2+n3+n4==0)
            break;
        cout << degree << endl;
    }
}
