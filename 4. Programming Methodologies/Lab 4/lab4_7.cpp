#include <iostream>
#include <string.h>

using namespace std;

char *ptoc(char *str, char ch)
{
    for(int i = 0; i < strlen(str); i++)
    {
        if(str[i] == ch)
        {
            return &str[i];
        }
    }

    return NULL;
}

int main()
{
    char str[] = "Kappa Keepo";

    char *p = ptoc(str, 'a');

    cout << "Output: " << (int *) p << endl;
    
    return 0;
}