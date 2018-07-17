#include <iostream>

using namespace std;

int main()
{

    // a

    for(int i = 1; i <= 20; i++)
    {
        cout << i << " ";
    }

    cout << endl;

    // b

    for(int i = 1; i <= 20; i++)
    {
        if(i % 2 == 0)
        {
            cout << i - (i * 2) << " ";
        }
        else
        {
            cout << i << " ";
        }
    }

    cout << endl;

    // c

    for(int i = 1; i <= 20; i++)
    {
        cout << i << " ";
        cout << i - (i * 2) << " ";
    }

    cout << endl;

    // d

    int previous1 = 1, previous2 = 1, next = 0;

    for(int i = 1; i <= 20; ++i)
    {
        if(i == 1)
        {
            cout << previous1 << " ";
            continue;
        }
        else if(i == 2)
        {
            cout << previous2 << " ";
            continue;
        }

        next = previous1 + previous2;
        previous1 = previous2;
        previous2 = next;

        cout << next << " ";
    }

    cout << endl;

    return 0;
}
