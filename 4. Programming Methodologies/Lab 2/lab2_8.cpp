#include <iostream>

using namespace std;

int chk(char ch)
{
    switch(ch)
    {
        case 'A':
            return 4;
        case 'B':
            return 4;
        case 'C':
            return 2;
        case 'D':
            return 1;
        case 'E':
            return 1;
        case 'F':
            return 1;
        default:
            return -1;
    }
}

int main()
{
    cout << "Vathmologia tou A: " << chk('A') << endl;
    
    return 0;
}