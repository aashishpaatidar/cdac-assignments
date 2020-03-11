#include <iostream>
using namespace std;

class mergeSort {
public:

  void merge(int a[], int l, int m, int r) {

    int i, j, k;
    int n1 = m - l + 1;
    int n2 = r - m;

    int left[n1], right[n2];

    for(i = 0; i < n1; i++)
      left[i] = a[l + i];

    for(j = 0; j < n2; j++)
      right[j] = a[m + 1 + j];

    i = 0;
    j = 0;
    k = l;

    while(i < n1 && j < n2) {

        if(left[i] <= right[j]) {

            a[k] = left[i];
            ++i;
        }
        else {

            a[k] = right[j];
            ++j;
        }
        ++k;
    }
    while(i < n1) {

            a[k] = left[i];
            ++i;
            ++k;
    }
    while(j < n2) {

            a[k] = right[j];
            ++j;
            ++k;
    }
  }

  void merge_sort(int a[], int l, int r) {

    if(l < r) {

      int m = l+(r-l)/2;
      merge_sort(a, l, m);
      merge_sort(a, m+1, r);

      merge(a, l, m, r);
  }
}
  void print(int a[], int n) {

    for(int i=0; i<n; ++i) {
      cout<<a[i]<<" ";
    }
  }
};

int main() {

  int n;
  cout<<"enter the no. of elements\n";
  cin>>n;

  int a[n];
  cout<<"enter elements\n";

  for(int i=0;i<n;++i) {
    cin>>a[i];
  }
  cout<<endl;

  mergeSort obj;

  obj.merge_sort(a, 0, n-1);
  obj.print(a, n);
}
