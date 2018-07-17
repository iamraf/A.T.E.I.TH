#include <iostream>
#include <iomanip>

using namespace std;

int kappa(unsigned int n)
{
    int x = n;

    // a

    cout << hex << n << endl;

    // b

    for(int i = 0; i < sizeof(n) * 8; i++)
    {
        if((n & 0x80000000) == 0)
        {
            cout << 0;
        }
        else
        {
            cout << 1;
        }

        n = n << 1;
    }

    cout << endl;

    return ~x + 1;
}

int main()
{
    cout << "Simpliroma tou 2: " << dec << kappa(2) << endl;
    
    return 0;
}