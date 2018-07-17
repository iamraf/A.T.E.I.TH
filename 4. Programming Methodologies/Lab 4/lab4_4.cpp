#include <iostream>
#include <string.h>

using namespace std;

void cps(char t[], char s[], int n)
{
    for(int i = 0; i < n; i++)
    {
        t[i] = s[i];
    }

    t[n] = '\0';
}

void cps2(char *t, char *s, int n)
{
    for(int i = 0; i < n; i++)
    {
        t[i] = s[i];
    }

    t[n] = '\0';
}

int main()
{
    char s[100], t[100];

    cout << "Dose s: ";

    cin >> s;

    cps(t, s, 3);

    cout << "\nString s: " << s << " String t: " << t << endl;

    char *s2 = s;
    char *t2;

    cps2(t2, s2, 5);

    cout << "\nString s: " << s2 << " String t: " << t2 << endl;
    
    return 0;
}