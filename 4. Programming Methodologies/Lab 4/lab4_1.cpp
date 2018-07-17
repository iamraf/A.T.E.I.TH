#include <iostream>

using namespace std;

int syn(char pc[], char ch, int n)
{
    int counter = 0;

    for(int i = 0; i < n; i++)
    {
        if(pc[i] == ch)
        {
            counter++;
        }
    }

    return counter;
}

int syn2(char *pc, char ch, int n)
{
    int counter = 0;

    for(int i = 0; i < n; i++)
    {
        if(pc[i] == ch)
        {
            counter++;
        }
    }

    return counter;
}

int main()
{
    char pc[] = {'K', 'a', 'p', 'p', 'a'};

    cout << "Found: " << syn(pc, 'a', 5) << endl;

    char *pp = pc;

    cout << "Found: " << syn2(pp, 'K', 5) << endl;
    
    return 0;
}