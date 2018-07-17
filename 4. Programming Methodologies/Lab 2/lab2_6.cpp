#include <iostream>

using namespace std;

void emfa(int n)
{
    cout << endl;

    for(int i = 0; i < n; i++)
    {
        cout << "*";
    }
}

int main()
{
    emfa(15);
    emfa(120);
    
    return 0;
}