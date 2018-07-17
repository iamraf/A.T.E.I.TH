#include <iostream>

using namespace std;

int syn(char s[], char ch)
{
    int counter = 0;

    for(int i = 0; i < sizeof(s); i++)
    {
        if(s[i] == ch)
        {
            counter++;
        }
    }

    return counter;
}

int syn2(char *s, char ch)
{
    int counter = 0;

    for(int i = 0; i < sizeof(s); i++)
    {
        if(s[i] == ch)
        {
            counter++;
        }
    }

    return counter;
}

int main()
{
    char s[] = "Kappa";

    cout << "Found: " << syn(s, 'a') << endl;

    char *s2 = s;

    cout << "Found: " << syn2(s2, 'K') << endl;
    
    return 0;
}