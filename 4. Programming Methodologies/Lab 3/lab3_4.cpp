#include <iostream>

using namespace std;

float embadon(float m)
{
    return m * m;
}

float embadon(float m, float p)
{
    return m * p;
}

int main()
{
    cout << "Emvadon tetragonou me plevra 2: " << embadon(2) << endl;

    cout << "Emvadon paralilogramou me vasi 4 kai upsos 3: " << embadon(4, 3) << endl;

    return 0;
}