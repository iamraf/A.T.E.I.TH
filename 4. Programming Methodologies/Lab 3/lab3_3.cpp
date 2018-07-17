#include <iostream>

using namespace std;

void abx(int x, int &a, char &flag)
{
    if(x > 0)
    {
        a = x;
    }
    else
    {
        a = -x;
    }

    if((x % 3) == 0)
    {
        flag = 'T';
    }
    else
    {
        flag = 'F';
    }
}

int main()
{
    int a;
    char flag;

    abx(6, a, flag);

    cout << "Apoliti timi: " << a << " Diereite me to 3? " << (flag == 'T' ? "true" : "false") << endl;
    
    return 0;
}