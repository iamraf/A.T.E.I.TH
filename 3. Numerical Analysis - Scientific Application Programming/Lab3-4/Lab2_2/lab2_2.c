#include <stdio.h>
#include <math.h>

int main(int argc, char *argv[])
{
    int x = 2, n = 2;

    int oros = 1;
    double myexp = 1;

    for(int i = 1; i <= n; i++)
    {
        oros *= x / i;
        myexp += oros;
    }

    printf("x = %d, myexp(%d) = %f, exp(%d) = %f", x, x, myexp, x, exp(x));
    return 0;
}
