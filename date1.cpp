#include<iostream>
using namespace std;


class TimeD
{
	int hr,min,sec;
public:
	TimeD()
	{

	}
	TimeD(int hr,int min,int sec)
	{
		this->hr=hr;
		this->min=min;
		this->sec=sec;
	}

	TimeD operator+(TimeD &b)
	{
		TimeD res;
		res.hr = this->hr+b.hr;
		res.min=this->min+b.min;
		res.sec=this->sec+b.sec;

		if(res.sec>60)
		{
			res.min +=res.sec/60;
			res.sec=res.sec%60;
		}

		if(res.min>60)
		{
			res.hr +=res.min/60;
			res.min=res.min%60;
		}
		return res;
	}

	TimeD operator-(TimeD &b)
	{
		TimeD res;
		res.hr = this->hr-b.hr;
		res.min=this->min-b.min;
		res.sec=this->sec-b.sec;

		if(res.sec<0)
		{
			res.sec=60+res.sec;
			res.min=res.min-1;
		}

		if(res.min<0)
		{
			res.min=60+res.min;
			res.hr=res.hr-1;
		}
		return res;
	}


	void printtime()
	{
			cout<<this->hr<<":"<<this->min<<":"<<this->sec;
	}




};

int main()
{
	TimeD t1(5,35,47),t2(3,57,59),t3;
	t3 = t1-t2;
	t3.printtime();

	return 0;
}
