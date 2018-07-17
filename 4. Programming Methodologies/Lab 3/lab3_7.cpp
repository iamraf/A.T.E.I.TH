#include <iostream>

using namespace std;

float diav(int a[], int n)
{
    float akures = 0;
    int correct = 0;

    int counter = 0;

    while(correct != n)
    {
        int random = rand() % 100 + (-60);

        if(random <= -20 || random >= 30)
        {
            akures++;
        }
        else
        {
            a[counter++] = random;
            cout << random << endl;

            correct++;
        }
    }

    return akures;
}

float methe(int a[], int n)
{
    float average = 0;

    for(int i = 0; i < n; i++)
    {
        average += a[i];
    }

    return average / n;
}

void zekr(int a[], int n, int &pze, float *mkr)
{
    int counter = 0;
    float average = 0;

    for(int i = 0; i < n; i++)
    {
        if(a[i] > 17 && a[i] <= 28)
        {
            pze++;
        }

        if(a[i] > 1 && a[i] <= 17)
        {
            average += a[i];
            counter++;
        }
    }

    if(counter != 0)
    {
        *mkr = average / counter;
    }

}

int perf(int a[], int n)
{
    int counter = 0;

    for(int i = 0; i < n; i++)
    {
        if(a[i] == 22)
        {
            counter++;
        }
    }

    return counter;
}

int *ptomx(int a[], int n)
{
    int max = a[0];
    int *pos = &a[0];

    for(int i = 0; i < n; i++)
    {
        if(a[i] > max)
        {
            max = a[i];
            pos = &a[i];
        }
    }

    return pos;
}

short pmctem(int a[], int n)
{
    short pos = 0;
    int min = a[0];

    for(short i = 0; i < n; i++)
    {
        if(a[i] < min)
        {
            cout << i << endl;
            pos = i;
        }
    }

    return pos + 1;
}

int main()
{
    int n = 0;
    cout << "Dose plhhos egguron thermokrasion " << endl;
    cin >> n;

    int temperatures[n];
    float akures = diav(temperatures, n);
    int pze = 0;
    float mkr = 0;
    zekr(temperatures, n, pze, &mkr);

    cout << "Akures thermokrasies: " << akures << endl;
    cout << "Mesh thermokrasia: " << methe(temperatures, n) << endl;
    cout << "Plhthos zeston hmeron: " << pze << endl;
    cout << "Mesi thermokrasia kruon hmeron: " << mkr << endl;
    cout << "Plhthos idanikon hmeron: " << perf(temperatures, n) << endl;
    cout << "Thesi mnimis pio zesths meras: " << *ptomx(temperatures, n) << endl;
    cout << "Thesi pinaka pio kruas meras: " << pmctem(temperatures, n) << endl;
}