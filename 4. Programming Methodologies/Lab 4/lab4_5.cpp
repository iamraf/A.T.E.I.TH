#include <iostream>
#include <string.h>

using namespace std;

void check_space(char *t, char *s)
{
    bool found = false;

    int counter = 0;

    for(int i = 0; i < strlen(s); i++)
    {
        if(s[i] == ' ')
        {
            if(!found)
            {
                continue;
            }
        }
        else
        {
            found = true;
        }

        t[counter++] = s[i];
    }

    t[counter] = '\0';
}

int main()
{
    char s[100], t[100];

    gets(s);

    check_space(t, s);

    cout << "New string:" << t << "|" << endl;
    
    return 0;
}