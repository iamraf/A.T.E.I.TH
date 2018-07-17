#include <iostream>
#include <string>

using namespace std;

int main()
{
    char input;

    int ints = 0;
    int intCounter = 0;

    int charCounter = 0;

    while(1)
    {
        cout << "Dose enan xaraktira" << endl;
        cin >> input;

        if(input == 'X' || input == 'x')
        {
            break;
        }
        else if(input == 'R')
        {
            continue;
        }
        else if(input == 'F' || input == 'P' || input == 'A')
        {
            input = tolower(input);
        }

        if(isalpha(input))
        {
            charCounter++;

            cout << "O xaraktiras einai alfavitikos" << endl;
        }
        else if(isdigit(input))
        {
            input = input - '0';
            intCounter++;
            ints += input;

            cout << "O xaraktiras einai arithmitikos" << endl;
        }
        else if(input < ' ')
        {
            cout << "O xaraktiras einai elegxou" << endl;
        }
        else
        {
            cout << "O xaraktiras einai eidikos" << endl;
        }
    }

    cout << "Plhthos pezon " << charCounter << endl;
    cout << "Plhthos arithmitikon " << intCounter << " Athrisma " << ints << endl;
    
    return 0;
}