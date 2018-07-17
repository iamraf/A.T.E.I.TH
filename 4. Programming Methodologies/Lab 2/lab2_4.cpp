#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

int main()
{
    int n;
    int correct = 0;
    int tries = 0;
    int temps = 0;

    int wormDays = 0, wormCounter = 0;
    int coldDays = 0, coldCounter = 0;
    int idealCounter = 0;

    int mostWormDay;
    int mostColdDay;

    cout << "Dose n: ";
    cin >> n;
    cout << endl;

    int correctTemps[n];

    srand(time(NULL));

    while(correct != n)
    {
        int r = rand() % 120 - 40;

        if(r > -20 && r < 30)
        {
            correctTemps[correct] = r;
            correct++;

            temps += r;

            if(r == 22)
            {
                idealCounter++;
            }
            else if(r >= 17 && r <= 28)
            {
                wormCounter++;

                wormDays += r;

                if(mostWormDay < r)
                {
                    mostWormDay = r;
                }
            }
            else if(r >= 1 && r <= 17)
            {
                coldCounter++;

                coldDays += r;

                if(mostColdDay > r)
                {
                    mostColdDay = r;
                }
            }
        }

        tries++;
    }

    if(tries > 0)
    {
        int correctTemp = 0;

        for(int i = 0; i < n; i++)
        {
            correctTemp += correctTemps[i];
        }

        cout << "Mesi thermokrasia: " << correctTemp / n << endl;
        cout << "Zestes meres: " << wormCounter << " Mesi themokrasia: " << wormDays / wormCounter << endl;
        cout << "Krues meres: " << coldCounter << " Mesi themokrasia: " << coldDays / coldCounter << endl;
        cout << "Idanikes meres: " << idealCounter << endl;
        cout << "Pio zesti mera: " << mostWormDay << endl;
        cout << "Pio krua mera: " << mostColdDay << endl;
        cout << "Mh egkeires prospatheies: " << tries - correct << endl;
    }
    else
    {
        cout << "Den dothikan thermokrasies " << endl;
    }
    
    return 0;
}