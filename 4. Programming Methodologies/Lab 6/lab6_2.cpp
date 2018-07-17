#include <iostream>
#include <fstream>

using namespace std;

int main(int argc, char *argv[])
{
    //1

    ifstream is;
    ofstream os;

    is.open(&argv[1][0]);
    os.open(&argv[2][0]);

    cout << "Xaraktira-Xaraktira" << endl;

    char ch;

    while(1)
    {
        ch = is.get();

        if(is.eof())
        {
            break;
        }
        os << ch;
        cout << ch;
    }

    is.close();
    os.close();

    //2

    is.open(&argv[1][0]);
    os.open(&argv[2][0]);

    cout << "\n\nGrammi-Grammi" << endl;

    char s[100];

    while(1)
    {
        is.getline(s, sizeof(s), '\n');

        if(is.eof())
        {
            break;
        }

        os << ch;
        cout << s << " " << endl;
    }

    is.close();
    os.close();

    return 0;
}