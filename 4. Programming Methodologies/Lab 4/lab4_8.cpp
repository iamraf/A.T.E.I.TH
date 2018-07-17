#include <iostream>

#define TOUPPER_1(x) (x > 96 && x < 123 ? (char)(x - 32) : char (x))

using namespace std;

inline char TOUPPER_2(char x)
{
    if(x > 96 && x < 123)
    {
        x -= 32;
    }

    return x;
}

int main()
{
    cout << TOUPPER_1('a') << endl;
    cout << TOUPPER_2('b') << endl;
    
    return 0;
}
