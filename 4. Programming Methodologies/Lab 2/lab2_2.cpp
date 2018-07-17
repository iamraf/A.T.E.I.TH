#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

int main()
{
    cout << "Dose to n: ";

    int n;

    cin >> n;

    int p[n];

    cout << endl;

    srand(time(NULL));

    int biggest = 0;

    for(int i = 0; i < n; i++)
    {
        p[i] = rand();

        if(biggest < p[i])
        {
            biggest = p[i];
        }
    }

    cout << "Biggest " << biggest << endl;
    
    return 0;
}