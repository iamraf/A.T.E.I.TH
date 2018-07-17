#include <iostream>

using namespace std;

class SH
{
    int x;
    int y;

public:
    float z;

    SH()
    {
        x = y = 0;
    }

    SH(int xy)
    {
        x = y = xy;
    }

    SH(int _x, int _y) : x(_x), y(_y)
    {

    }

    void setxy(int a, int b)
    {
        x = a;
        y = b;
    }

    void getxy(int &a, int &b)
    {
        a = x;
        b = y;
    }

    int calculate_area()
    {
        return x * y;
    }
};

int main()
{
    return 0;
}