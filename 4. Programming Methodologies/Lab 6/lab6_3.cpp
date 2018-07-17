#include <iostream>
#include <fstream>

using namespace std;

int main(int argc, char *argv[])
{
    ofstream os;
    os.open(&argv[1][0]);

    int n;
    cout << "Dose plhthos proionton: ";
    cin >> n;

    os << "\nTo arxeio exei dimiourgithei apo ton Kappa kai exei " << n << " triades arithmon. " << endl;

    for(int i = 0; i < n; i++)
    {
        os << rand() % 9999 << " " << rand() % 9 << " " << ((float(rand()) / float(RAND_MAX)) * (20.0 - 2.0)) + 2.0 << " " << endl;
    }

    os.close();

    return 0;
}