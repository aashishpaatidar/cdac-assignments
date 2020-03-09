#include <iostream>
using namespace std;

int n;
class selectionSort {
public:

  void ssort(int *p, int n) {

    int min, temp;

    for(int i = 0 ; i < (n - 1) ; ++i) {
        min = i;
        for(int j = (i + 1) ; j < n ; ++j) {

            if(p[j] < p[min])
               min = j;
        }

        temp = p[min];
        p[min] = p[i];
        p[i] = temp;

    }

    for(int i = 0 ; i < n ; ++i) {
    cout << p[i] <<" ";
    }
  }
};

int main() {


  cout << "enter the size of array\n";
  cin >> n;
  int arr[n];
  cout << "Enter the array\n";

  for(int i = 0 ; i < n ; ++i) {
  cin >> arr[i];
  }
  selectionSort obj;
  obj.ssort(arr, n);

return 0;
}
