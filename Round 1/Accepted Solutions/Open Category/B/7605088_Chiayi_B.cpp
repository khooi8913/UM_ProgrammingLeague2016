#include <stdio.h>
#include <string.h>

const int N = 105;
int n, vis[N];

int Scan()
{
	int res = 0, ch, flag = 0;

	if((ch = getchar()) == '-')				
		flag = 1;

	else if(ch >= '0' && ch <= '9')			
		res = ch - '0';
	while((ch = getchar()) >= '0' && ch <= '9' )
		res = res * 10 + ch - '0';

	return flag ? -res : res;
}

void init() {
	int num = 0;
	for (int i = 0; i < n; i++) {
		num = Scan();
		vis[num]++;
	}
}

void solve() {
	int bo = 0;
	for (int i = 1; i <= 100; i++) {
		while (vis[i]) {
			if (bo++) printf(" ");
			printf("%d", i);
			vis[i]--;
		}
	}
	printf("\n");
}

int main() {
	while (~scanf("%d", &n) && n) {
		init();
		solve();
	}
	return 0;
}