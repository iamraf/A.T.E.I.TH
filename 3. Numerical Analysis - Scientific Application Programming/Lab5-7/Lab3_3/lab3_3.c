#include <stdio.h>

float Horner1(int n, float p[], int x)
{
    float q[n];

    q[0] = p[0];

    for(int i = 1; i < n; i++)
    {
        q[i] = p[i] + (q[i - 1] * x);
    }

    printf("\nTimes sunteleston q\n");

    for(int i = 0; i < n; i++)
    {
        printf("Q[%d] = %f\n", i, q[i]);
    }

    return q[n];
}

int main(int argc, char *argv[])
{
    int n;

    printf("Dose vathmo poluonimou: ");
    scanf("%d", &n);

    float p[n];

    for(int i = 0; i < n; i++)
    {
        printf("Dose timi gia to p[%d]: ", i);
        scanf("%f", &p[i]);
    }

    printf("\nSuntelestes polionimou\n");
    for(int i = 0; i < n; i++)
    {
        printf("P[%d] = %f\n", i, p[i]);
    }

    int x;

    printf("\nDose timi gia to x: ");
    scanf("%d", &x);

    printf("Timh upoloipou diaireshs = %f\n", Horner1(n, p, x));
    return 0;
}
