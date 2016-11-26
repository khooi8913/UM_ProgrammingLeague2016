#include <iostream>

using namespace std;

void quickSort(long long int a[], int lf, int rg) {
	int pos = (lf + rg) / 2;
	int pivot = a[pos];

	int x = lf, y = rg, tmp;
	while (x <= y) {
		while (a[x] < pivot)
			x++;
		while (a[y] > pivot)
			y--;
		if (x <= y) {
			tmp = a[x];
			a[x] = a[y];
			a[y] = tmp;
			x++;
			y--;
        }
	}
	if (lf < y) {
		quickSort(a, lf, y);
	}
	if (x < rg) {
		quickSort(a, x, rg);
	}
};

int main()
{
    long long int n = 1;
    while (true)
    {
        cin >> n;
        long long int a[n];
        for(int i=0;i<n;i++)
            cin >> a[i];
        quickSort(a, 0, n-1);
        for (int i=0; i<n; i++)
            if (i!=n-1)
                cout << a[i] << " ";
            else
                cout << a[i];
        if (n==0)
            break;
        cout << endl;
    }
    return 0;
}
