#include <iostream>

using namespace std;

void fmath(int x, float &y)
{
    y = (x * x * x) + (5 * (x * x)) + (8.1 * x) + 9.6;
}

void fmath2(int x, float *y)
{
    *y = (x * x * x) + (5 * (x * x)) + (8.1 * x) + 9.6;
}

int main()
{
    float g;
    fmath(4, g);

    cout << "Fmath " << g << endl;

    float g2;
    fmath2(4, &g);

    cout << "Fmath2 " << g2 << endl;
    
    return 0;
}