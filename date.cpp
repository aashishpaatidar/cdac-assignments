#include<iostream>

using namespace std;

class date
{
	int day;
	int month;
	int year;
public:
	date()
	{
	}
	int flag=1;

	void readday()
	{
		cout<<"Enter the day:\n";
		cin>>day;
		if(day<1 || day>31)
		{
			//cout<<"Date is invalid:";
			 flag =0;
		}
	}

	void readmonth()
	{
		cout<<"Enter the month:\n";
		cin>>month;

		if(month>12 || month<1)
		{
			//cout<<"Date is inavlid:\n"
			flag=0;
		}
	}

	void readyear()
	{
		cout<<"Enter the year:\n";
		cin>>year;
		if(year<0)
		{
			
			//cout<<"Date is inavlid:\n"
			flag=0;
		}
	}
	void showdate()
	{
		if(flag==1)
		{
		cout<<day<<"/"<<month<<"/"<<year;
		}
		else{
			cout<<"invalid date:\n";
		}
	}

};
int main()
{
	date d;
	d.readday();
	d.readmonth();
	d.readyear();
	d.showdate();
	return 0;
}
