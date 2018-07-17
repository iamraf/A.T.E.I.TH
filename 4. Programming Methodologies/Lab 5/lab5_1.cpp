#include <iostream>
#include <string.h>

using namespace std;

int len(char *s)
{
    return strlen(s);
}

int at(char *s)
{
    for(int i = 0; i < strlen(s); i++)
    {
        if(s[i] == 'G')
        {
            return i;
        }
    }

    return -1;
}

void F(char *mes, char *s, int (*fp)(char *))
{
    cout << mes << fp(s) << endl;
}

int main()
{
    // 1

    char s[100] = "asdasdadGasdsds";
    int (*pf)(char *);

    pf = len;
    cout << "mikos toy string: " << pf(s) << endl;;

    pf = at;
    cout << "thesh toy G sto string: " << pf(s) << endl;

    // 2

    cout << endl;

    char s2[100] = "asdasdadGasdsds";
    int (*pf2)(char *);

    pf2 = len;
    F("mikos toy string s: ", s, len);

    pf2 = at;
    F("thesh toy G sto string s: ", s, pf2);

    return 0;
}