#include <iostream>

using namespace std;

float ypol(int x, float k = 0.095)
{
    return (float) x * k;
}

int main()
{
    int x = 67;
    float g = 0.11;

    float f = ypol(x, g);

    cout << "F: " << f << endl;
    
    return 0;
}