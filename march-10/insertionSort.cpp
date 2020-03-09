#include <iostream>
using namespace std;

int n;
class insertionSort {
public:

  void insertion(int *p, int n) {

    int i, j, key;

    for(i=1; i<n; ++i) {

      key = p[i];
      j = i-1;

      while(j >= 0 && p[j] > key) {

        p[j+1] = p[j];
        j = j-1;
      }
      p[j+1] = key;
    }
  }

  void print(int *p, int n) {

    for(int i=0; i<n; ++i) {
      cout<<p[i]<<" ";
    }
  }
};

int main() {

  cout<<"enter no. of elements\n";
  cin>>n;
  cout<<"enter elements\n";

  int arr[n];
  for(int i=0; i<n; ++i) {
    cin>>arr[i];
  }

  insertionSort obj;
  obj.insertion(arr,n);
  obj.print(arr, n);
}
