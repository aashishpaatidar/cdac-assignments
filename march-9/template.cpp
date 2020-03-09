#include<iostream>
using namespace std;

class Complex
{
	int real;
	int img;
	public:
	Complex()
	{
	}
	void show()
	{
	}

	friend ostream& operator<<(ostream &cout, Complex c)
	{
		cout<<c.real<<"+"<<c.img<<"i"<<endl;
	}
	
	friend istream& operator>>(istream &cout, Complex &c)
	{
		cin>>c.real>>c.img;
	}
	
};



template <class x>
class Array
{
	x *p;
	int n;
	public:
	Array(int size)
	{
		n=size;
		p=new x[n];	
	}
	//int & operator[](int i)
	//{
	//return p[i];	
	//}



void read()
{
cout<<"enter the element of array:";
for(int i=0;i<n;i++)
{
	cin>>p[i];	
}
}

void print()
{
cout<<"print the element of array:";
for(int i=0;i<n;i++)	
{
	cout<<p[i]<<"  ";
}
cout<<endl;
	
}
	
};


int main()
{
Array<int> b(5);
                                      //[3];//={1,2,3};

b.read();

b.print();

Array<Complex> b2(5);

b2.read();
b2.print();

Array<float>b1(4);                                       //cout<<b[2];
b1.read();
b1.print();

}
