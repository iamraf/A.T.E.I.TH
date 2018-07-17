#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    ifstream is;
    char file[100];

    cout << "Dose onoma arxeiou: ";
    cin >> file;

    is.open(file);

    cout << "Xaraktira-Xaraktira" << endl;

    char ch;

    while(1)
    {
        ch = is.get();

        if(is.eof())
        {
            break;
        }

        cout << ch;
    }

    is.close();
    is.open(file);

    cout << "\n\nGrammi-Grammi" << endl;

    char s[100];

    while(1)
    {
        is.getline(s, sizeof(s), '\n');

        if(is.eof())
        {
            break;
        }

        cout << s << " " << endl;
    }

    is.close();

    return 0;
}