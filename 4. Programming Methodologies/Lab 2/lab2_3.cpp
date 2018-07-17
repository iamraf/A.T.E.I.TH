#include <iostream>

using namespace std;

int main()
{
    int p[3][4];

    int positives = 0;

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            cout << "Dose arithmo gia thesi " << i << ", " << j << ": ";
            cin >> p[i][j];
            cout << endl;

            if(p[i][j] % 2 == 0)
            {
                positives++;
            }
        }
    }

    cout << "Positives: " << positives << endl;
    
    return 0;
}