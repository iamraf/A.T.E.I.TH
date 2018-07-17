#include <iostream>

using namespace std;

char ksp(char a)
{
    if(isupper(a))
    {
        return tolower(a);
    }
    else
    {
        return a;
    }
}

void ksp(char a, char &b)
{
    if(isupper(a))
    {
        b = tolower(a);
    }
    else
    {
        b = a;
    }
}

void ksp(char a, char *b)
{
    if(isupper(a))
    {
        *b = tolower(a);
    }
    else
    {
        *b = a;
    }
}

int main()
{
    cout << "Return lowercase letter A: " << ksp('A') << endl;

    char b;
    ksp('A', b);
    cout << "Return lowercase letter A: " << b << endl;

    char b2;
    ksp('A', b2);
    cout << "Return lowercase letter A: " << b2 << endl;

    return 0;
}