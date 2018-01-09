#include <stdio.h>
#include <math.h>

#define f(x) ((x) * (x) - num)
#define fp(x) (2 * (x))

float mysqrt(float num)
{
    float x = num;
    float oldx = pow(10, -15);

    while(fabs(x - oldx) > pow(10, -15))
    {
        oldx = x;
        x = x - (f(x) / fp(x));
    }

    return x;
}

int main(int argc, char *argv[])
{
    float num;

    printf("Dose arithmo: ");
    scanf("%f", &num);

    printf("\nnum = %f, \nx = %f, \nsqrt(num) = %f\n", num, mysqrt(num), sqrt(num));
    return 0;
}
