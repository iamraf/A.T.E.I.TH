#include <stdio.h>
#include <math.h>

int main(int argc, char *argv[])
{
    int x = 2;

    double i = 1;
    double oros = 1;
    double myexp = 1;

    while(oros > pow(10, -15.0))
    {
        oros *= x / i++;
        myexp += oros;
    }

    printf("x = %d, myexp(%d) = %f, exp(%d) = %f", x, x, myexp, x, exp(x));
    return 0;
}
