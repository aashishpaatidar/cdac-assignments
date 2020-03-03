#include <iostream>
using namespace std;

int Strlen(char* a)
{

	int l=0,i = 0;
	while( a[i] != '\0')
	{
		l++;
		i++;
	}
	return l;
}

char* Strcpy(char* dest, const char* src, int l)
{
for(int i=0;i<=l+1;i++)
{

dest[i]=src[i];
}
cout<<"array is copied\n";
}

int Strcmp(char* s1,char* s2)
{

		while(*s1)
		{
			if(*s1!=*s2)
				break;

			s1++;
			s2++;
		}
		return (*(char *)s1-*(char *)s2);

}

int Strcat(char* arr1,char* arr2,int l1)
{
	int i=0;
	//char res[100];
	while(arr2[i]!='\0')
	{
		arr1[i+l1]=arr2[i];
		i++;
	}
	cout<<"arr1=\n"<<arr1<<"\n";
}

int main()
{
	char arr1[100], arr2[100];
	char d[100];

	arr1[0] = '\0';
	arr2[0]='\0';
	d[0]='\0';

	cout<<"enter the string1:\n";
	cin>>arr1;

	cout<<"Enter the string2:\n";
	cin>>arr2;

	cout<<"String : \n" << arr2;

	int l1=Strlen(arr1);
	int l2=Strlen(arr2);

	cout<<"Length is : \n" <<l1;

	cout<<"Length is : \n" <<l2;
	Strcpy(d,arr1,l1);

	cout<<" copied string :\n"<<d<<"\n";

	int rem =Strcmp(arr1, arr2);

	if(rem==0)
	{
		cout<<"Same\n";
	}
	else
	{
		cout<<"different\n";
	}

	Strcat(arr1,arr2,l1);
	return 0;
}
