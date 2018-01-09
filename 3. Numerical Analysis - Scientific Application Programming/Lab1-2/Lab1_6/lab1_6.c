#include <stdio.h>
#include <math.h>

int main(int argc, char *argv[])
{
    double a = -1.5, b = 1.5;
    double h = 0.1;

    double x = a, y;

    for(; x <= b; x += h)
    {
        if(fabs(x) > 1.0)
        {
            y = 1 / sqrt(pow(x, 2) - 1);
        }
        else if(fabs(x) < 1.0)
        {
            y = 1 / sqrt(1 - pow(x, 2));
        }
        else
        {
            y = 0;
        }

        printf("x = %f, y = %f\n", fabs(x), y);
    }

    return 0;
}
