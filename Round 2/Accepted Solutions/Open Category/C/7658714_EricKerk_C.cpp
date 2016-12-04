#include<string.h>
#include<stdio.h>
#define MAXN 100002
char s[MAXN],temp[MAXN];

int main()
{
    int i,length;
    while(~scanf("%s",s))
    {
        length=strlen(s);
        for(i = 0; i < length; ++i)
        {
            if(s[i]=='['||s[i]==']')
                temp[i] = '\0';
            else
                temp[i] = s[i];
        }
        temp[length]='\0';
        for(i = length - 1; i > -1; --i)
        {
            if(s[i]=='[')
                printf("%s",temp+i+1);
        }
        if(!(s[0]=='['||s[0]==']'))
            printf("%s",temp);
        for(i = 1; i < length; ++i){
            if(s[i]==']')
                printf("%s",temp+i+1);
        }
        printf("\n");
    }
    return 0;
}
