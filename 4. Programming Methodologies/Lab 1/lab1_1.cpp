#include <iostream>

using namespace std;

int main()
{
    bool running = true;

    int counter = 0;
    int average = 0;

    int worm = 0;
    int cold = 0;

    int wormCounter = 0;
    int coldCounter = 0;
    int idealCounter = 0;

    int mostWorm = 0;
    int mostCold = 0;

    while(running)
    {
        int temp;

        cout << "Dose thermokrasia" << endl;
        cin >> temp;

        if(temp == -999)
        {
            running = false;
        }
        else
        {
            if(temp < -50 || temp > 60)
            {
                cout << "Mh epitrepti thermokrasia" << endl;
            }
            else
            {
                average += temp;
                counter++;

                if(temp == 22)
                {
                    idealCounter++;
                }
                else if(temp >= 17 && temp <= 28)
                {
                    wormCounter++;

                    worm += temp;

                    if(mostWorm < temp)
                    {
                        mostWorm = temp;
                    }
                }
                else if(temp >= 1 && temp <= 17)
                {
                    coldCounter++;

                    cold += temp;

                    if(mostCold > temp)
                    {
                        mostCold = temp;
                    }
                }
            }
        }
    }

    if(counter > 0)
    {

        cout << "Plhthos thermokrasion " << counter << endl;
        cout << "Mesi thermokrasia " << (average / counter) << endl;
        cout << "Zestes meres " << wormCounter << " Mesi thermokrasia " << (worm / wormCounter) << endl;
        cout << "Krues meres " << coldCounter << " Mesi thermokrasia " << (cold / wormCounter) << endl;
        cout << "Idanikes meres " << idealCounter << endl;
        cout << "Thermokrasia pios zestis meras " << mostWorm << endl;
        cout << "Thermokrasia pios kruas meras " << mostCold << endl;
    }
    else
    {
        cout << "Den dothikan thermokrasies " << endl;
    }

    return 0;
}