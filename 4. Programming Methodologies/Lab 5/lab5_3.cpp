#include <iostream>
#include <stdlib.h>

using namespace std;

int main(int argc, char *argv[])
{
    int result = 0;

    for(int i = 0; i < argc; i++)
    {
        result += atoi(argv[i]);
    }

    cout << "Apotelesma: " << result << endl;
    
    return 0;
}