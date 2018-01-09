#include <stdio.h>
#include <math.h>

double iparag(int i)
{
    float iparag = 1;

    for(int j = 1; j <= i; j++)
    {
        iparag *= j;
    }

    return iparag;
}

int main(int argc, char *argv[])
{
    int x = 2, n = 2;

    double myexp = 1;

    for(int i = 1; i <= n; i++)
    {
        myexp += pow(x, i) / iparag(i);
    }

    printf("x = %d, myexp(%d) = %f, exp(%d) = %f", x, x, myexp, x, exp(x));
    return 0;
}
