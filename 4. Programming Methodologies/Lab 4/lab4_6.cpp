#include <iostream>
#include <string.h>

using namespace std;

void check_space(char *t, char *s)
{
    int n = 0;

    for(int i = strlen(s) - 1; i > 0; i--)
    {
        if(s[i] == ' ')
        {
            continue;
        }
        else
        {
            n = i;
            break;
        }
    }

    for(int i = 0; i < n; i++)
    {
        t[i] = s[i];
    }

    t[n] = '\0';
}

int main()
{
    char s[100], t[100];

    gets(s);

    check_space(t, s);

    cout << "New string:" << t << "|" << endl;
    
    return 0;
}