#include <iostream>

using namespace std;

void eis(double x[][3])
{
    cout << "Dose double times gia ton 4x3 pinaka " << endl;

    for(int i = 0; i < 4; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            cin >> x[i][j];
        }

        cout << endl;
    }
}

void ant(double x[][3], int y[][3])
{
    for(int i = 0; i < 4; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            if(x[i][j] > 0)
            {
                y[i][j] = 1;
            }
            else if(x[i][j] < 0)
            {
                y[i][j] = -1;
            }
            else
            {
                y[i][j] = 0;
            }
        }
    }
}

int emf(int y[][3])
{
    int count = 0;

    for(int i = 0; i < 4; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            cout << y[i][j] << endl;

            if(y[i][j] != 0)
            {
                count++;
            }
        }

        cout << endl;
    }

    return count;
}

int main()
{
    double x[4][3];
    int y[4][3];

    eis(x);
    ant(x, y);

    int plhthos = emf(y);

    cout << "Plhthos mh midenikon stoixeion: " << plhthos << endl;

    return 0;
}