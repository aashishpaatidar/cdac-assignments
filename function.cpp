#include <iostream>
using namespace std;

void ProcessArray(int *p, int n, void (*pfn)(int *)) {

    for(int i=0;i<n;++i) {
    (*pfn)(p+i);
  }

}

void RemoveOdd(int *e) {

  if( *e%2 != 0)
    *e = 0;
}

void RemoveEven(int *e) {

  if(*e%2 == 0)
     *e = 0;

}

void RemoveNegative(int *e) {

  if(*e < 0)
    *e = 0;

}

void RemovePositive(int *e) {

  if(*e > 0)
  *e = 0;

}

int main()
{
  int n;
  cout<<"enter the size of N\n";
  cin>>n;

  int arr[n];
  cout<<"enter elements of array\n";

  for(int i=0;i<n;++i) {
    cin>>arr[i];
  }

  void (*pfn[4])(int *) = {RemoveOdd, RemoveEven, RemoveNegative, RemovePositive};
  int choice;

  cout<<"enter choice\n";
  cin>>choice;
  --choice;

  ProcessArray(arr, n, *pfn[choice]);

  for(int i=0;i<n;++i)
  {
    cout << arr[i] <<"\t";
  }
}
