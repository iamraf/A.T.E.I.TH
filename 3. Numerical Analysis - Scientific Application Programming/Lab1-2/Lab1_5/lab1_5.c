#include <stdio.h>
#include <math.h>

#define macro(y, x) ((y) = 1 / (pow(x, 2) + 1))

int main(int argc, char *argv[])
{
    double a = 0, b = 1;
    double h = 0.1;

    double x = a, y;

    for(; x <= b; x += h)
    {
        macro(y, x);
        printf("x = %f, y = %f\n", x, y);
    }

    return 0;
}
