#include <iostream>

using namespace std;

int main()
{
    /* a

        *
       **
      ***
     ****
    *****

    */

    int stars = 1, platos = 5;

    for(int i = 0; i < 5; i++)
    {
        for(int j = 0; j < platos; j++)
        {
            cout << ((j < platos - stars ? " " : "*"));
        }

        cout << endl;

        stars++;
    }

    cout << endl;

    /* b

     *****
      ****
       ***
        **
         *

    */

    stars = 5, platos = 5;

    for(int i = 0; i < 5; i++)
    {
        for(int j = platos; j > 0; j--)
        {
            cout << (j > stars ? " " : "*");
        }

        cout << endl;

        stars--;
    }

    cout << endl;

    /* c

        *
       ***
      *****
     *******
    *********

    */

    stars = 1, platos = 5 + (5 + 1);

    for(int i = 0; i < 5; i++)
    {
        for(int j = 1; j <= platos; j++)
        {
            cout << ((j > (platos / 2) - stars && j < (platos / 2) + stars) ? "*" : " ");
        }

        cout << endl;

        stars++;
    }

    return 0;
}