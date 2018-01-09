#include <stdio.h>
#include <math.h>

#define f(x) ((x) * (x) * (x) - 4 * (x))
#define fp(x) (3* (x) * (x) - 4)

int main(int argc, char *argv[])
{
    double a, b, h;

    printf("Dose oria tous diastimatos ton rizon a, b, kai to vima h: ");
    scanf("%lf %lf %lf", &a, &b, &h);

    double x, oldx;

    for(double i = a; i <= b; i += h)
    {
        if((f(i) * f( i + h)) < 0)
        {
            x = i;
            oldx = i + h;

            printf("x = %15.30lf,  f(x) = %15.30lf\n", x, f(x));

            while(fabs(x - oldx) > pow(10, -15))
            {
                oldx = x;
                x = x - (f(x) / fp(x));
                printf("x = %15.30lf,  f(x) = %15.30lf\n", x, f(x));
            }
            printf("\n");
        }
    }
    return 0;
}
