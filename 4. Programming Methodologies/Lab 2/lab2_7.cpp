#include <iostream>

using namespace std;

float fmath(int x)
{
    float i = (x * x * x) + (5 * (x * x)) + (8.1 * x) + 9.6;

    return i;
}

int main()
{
    float g = fmath(4);

    cout << "Fmath: " << g << endl;

    return 0;
}