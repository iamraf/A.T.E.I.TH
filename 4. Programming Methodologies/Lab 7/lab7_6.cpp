#include <iostream>
#include <cstring>

using namespace std;

class SH
{
    int x;
    int y;

public:
    float z;

    SH()
    {
        x = y = 0;
    }

    SH(int xy)
    {
        x = y = xy;
    }

    SH(int _x, int _y) : x(_x), y(_y)
    {

    }

    void setxy(int a, int b)
    {
        x = a;
        y = b;
    }

    void getxy(int &a, int &b)
    {
        a = x;
        b = y;
    }

    int calculate_area()
    {
        return x * y;
    }

    void pros(int k)
    {
        x += k;
        y += k;
    }

    friend int pol(SH &ob, int k)
    {
        ob.x *= k;
        return ob.x;
    }

    SH operator^(int k)
    {
        int _x = x, _y = y;

        while(k > 1)
        {
            _x *= x;
            _y *= y;
            k--;
        }

        return SH(_x, _y);
    }

    friend ostream &operator<<(ostream &os, const SH &ob)
    {
        os << ob.x << " --- " << ob.y << endl;
        return os;
    }
};

SH addobs(SH &ob1, SH &ob2)
{
    int x_1, y_1, x_2, y_2;

    ob1.getxy(x_1, y_1);
    ob2.getxy(x_2, y_2);

    return SH(x_1 + x_2, y_1 + y_2);
}

class DerW : public SH
{
    float w;
public:
    DerW() : SH()
    {
        w = 0;
    }

    DerW(int a, int b, float c) : SH(a, b), w(c)
    {
    }

    void setw(float _w)
    {
        w = _w;
    }

    void getw(float &_w)
    {
        _w = w;
    }
};

class DS : public SH
{
    char *s;
    int len;
public:
    DS() : SH()
    {
        s = (char *) 0;
        len = 0;
    }

    DS(int x, int y, char *str) : SH(x, y)
    {
        set(str);
    }

    void set(char *a)
    {
        len = 0;

        if(a)
        {
            len = strlen(a);
            s = new char[len];
            strcpy(s, a);
        }
        else
        {
            s = (char *) 0;
        }
    }

    char *get()
    {
        return s;
    }

    void emf()
    {
        cout << "s = \"" << s << "\" " << *this;
    }

    ~DS()
    {
        delete[] s;
    }
};

int main()
{
    DS o1;
    o1.set("Forrest Knight");
    o1.emf();
    
    DS o2(4, 5, " The sting");
    o2.emf();

    return 0;
}