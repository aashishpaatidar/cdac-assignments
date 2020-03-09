#include <iostream>
using namespace std;


int n;
class bubbleSort {
public:

  void bsort(int *p, int n) {

    int temp;

    for(int i=0; i<n; ++i) {
      for(int j=i+1; j<n; ++j) {

        if(p[i]>p[j]) {
          temp = p[i];
          p[i] = p[j];
          p[j] = temp;
        }
      }
    }

    for(int i=0; i<n; ++i) {
      cout<<p[i]<<" ";
    }
  }
};


int main() {

  bubbleSort obj;

  cout<<"enter the no. of elements\n";
  cin>>n;
  int arr[n];

  cout<<"enter the elements\n";

  for(int i=0; i<n; ++i) {
    cin>>arr[i];
  }

  obj.bsort(arr, n);

  return 0;
}
