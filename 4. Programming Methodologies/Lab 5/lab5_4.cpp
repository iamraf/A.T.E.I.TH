#include <iostream>
#include <stdlib.h>

using namespace std;

bool check(int i)
{
    return (i & 0x01) == 0 ? true : false;
}

int main()
{
    cout << "Number 1: " << check(1) << endl;

    cout << "Number 12: " << check(12) << endl;

    return 0;
}