#include <stdio.h>

float Horner2(int n, float p[], float q[], int x)
{
    q[0] = p[0];

    for(int i = 1; i < n; i++)
    {
        q[i] = p[i] + (q[i - 1] * x);
    }

    return q[n];
}

int main(int argc, char *argv[])
{
    int n;

    printf("Dose vathmo poluonimou: ");
    scanf("%d", &n);

    float p[n];
    float q[n];
    float r[n];

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

    printf("Timh upoloipou diaireshs q = %f\n", Horner2(n, p, q, x));

    printf("\nTimes sunteleston q\n");

    for(int i = 0; i < n; i++)
    {
        printf("Q[%d] = %f\n", i, q[i]);
    }

    printf("Timh upoloipou diaireshs r = %f\n", Horner2((n - 1), p, r, x));

    printf("\nTimes sunteleston r\n");

    for(int i = 0; i < n; i++)
    {
        printf("R[%d] = %f\n", i, r[i]);
    }
    return 0;
}
