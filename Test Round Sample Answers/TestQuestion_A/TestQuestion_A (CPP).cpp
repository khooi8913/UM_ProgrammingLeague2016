#include <cstdio>

using namespace std;

int main(){

    int numCases;
    scanf("%d",&numCases);

    for(int i=0;i<numCases;i++){
        int num1, num2;
        scanf("%d %d", &num1, &num2);
        if(num1<num2)
            printf("<\n");
        else if(num1>num2)
            printf(">\n");
        else
            printf("=\n");
    }

    return 0;
}
