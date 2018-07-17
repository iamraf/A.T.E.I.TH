#include <iostream>

using namespace std;

void diav(int *a[], int n)
{
    cout << "Dose " << n << " akereous" << endl;

    for(int i = 0; i < n; i++)
    {
        cin >> *a[i];
    }
}

float moa(int *a[], int n1, int n2)
{
    float mo = 0;

    for(int i = n1; i < n2; i++)
    {
        mo += *a[i];
    }

    return mo / (n2 - n1);
}

int main()
{
    int n = 10;
    int *a[n];

    diav(a, n);

    int n1, n2;

    cout << "Dose 2 akereous gia meso oro: ";
    cin >> n1;
    cin >> n2;

    if(n2 > n || n1 > n2)
    {
        cout << "Lathos euros arithmon" << endl;
    }
    else
    {
        cout << "Mesos oros arithmon: " << moa(a, n1, n2) << endl;
    }
    
    return 0;
}