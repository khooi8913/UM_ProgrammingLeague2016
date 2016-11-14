#include <cstdio>
#include <cmath>

using namespace std;

int main(){

    int numCases;
    scanf("%d",&numCases);

    for(int i=0;i<numCases;i++){
        int n;
        scanf("%d", &n);
        n = n*567;
        n = n/9;
        n = n+7492;
        n = n*235;
        n = n/47;
        n = n-498;
        n = abs((n/10)%10);
        printf("%d\n",n);
    }

    return 0;
}

