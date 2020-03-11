#include <iostream>
using namespace std;

class quickSort {
public:

  void quick(int *a, int low, int high) {

    int i, j, p;

    if(low < high) {

      p = partition(a, low, high);

      quick(a, low, p-1);
      quick(a, p+1, high);
    }
  }

  int partition(int *a, int low, int high) {

    int pivot = a[high];
    int i = (low - 1);

    for(int j=low; j<=high; ++j) {

      if(a[j] < pivot) {
        ++i;
        swap(&a[i], &a[j]);
      }
    }
    swap(&a[i+1], &a[high]);
    return i+1;
  }

  void swap(int *x, int *y) {

    int temp = *x;
    *x = *y;
    *y = temp;
  }

  void print(int *a, int n) {

    for(int i=0; i<n; ++i) {
      cout<<a[i]<<" ";
    }
  }
};

int main() {

  int n;
  cout<<"enter the elements and -1 to stop\n";
  cin>>n;

  int arr[n];

  for(int i=0;i<n;++i) {
    cin>>arr[i];
  }
  int size = n;

  quickSort obj;

  obj.quick(arr, 0, size-1);
  obj.print(arr, size);
}
