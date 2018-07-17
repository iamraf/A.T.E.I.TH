#include <iostream>

using namespace std;

int main()
{
    int p[10];

    cout << "Dose 10 arithmous: " << endl;

    for(int i = 0; i < sizeof(p) / sizeof(int); i++)
    {
        cin >> p[i];
    }

    cout << endl;

    for(int i = sizeof(p) / sizeof(int) - 1; i >= 0; i--)
    {
        cout << p[i] << endl;
    }
    
    return 0;
}