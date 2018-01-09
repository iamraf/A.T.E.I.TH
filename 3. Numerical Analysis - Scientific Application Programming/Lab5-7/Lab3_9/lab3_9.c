#include <stdio.h>
#include <math.h>

double Horner(int n, double p[], double q[], double j)
{
    q[0] = p[0];

    for(int i = 1; i <= n; i++)
    {
        q[i] = p[i] + (q[i - 1] * j);
    }

    return q[n];
}

int main(int argc, char *argv[])
{
    int n;

    printf("Dose vathmo polionimou n: ");
    scanf("%d", &n);

    double a, b, h;

    double x, oldx;

    double p[n + 1];
    double q[n + 1];

    for(int i = 0; i <= n; i++)
    {
        printf("Dose timi gia to p[%d]: ", i);
        scanf("%lf",&p[i]);
    }

    for(int i = 0; i <= n; i++)
    {
        printf("P[%d] = %f\n", i, p[i]);
    }

    printf("\nDose oria tous diastimatos ton rizon a, b, kai to vima h: ");
    scanf("%lf %lf %lf", &a, &b, &h);

    double pin[n - 1];

    for(double z = a; z <= b; z += h)
    {
        if(Horner(n, p, q, z) * Horner(n, p, q, z + h) <= 0)
        {
            x = z;

            printf("x = %15.30lf, f(x) = %15.30lf\n", x, Horner(n,p,q,z));

            while(fabs(x - oldx) > pow(10, -15))
            {
                oldx = x;
                x = x - (Horner(n, p, q, x) / Horner(n - 1, q, pin, x));
                printf("x = %15.20lf, f(x) = %15.20lf\n", x, Horner(n, p, q, x));
            }
            printf("\n");
        }
    }
    return 0;
}
