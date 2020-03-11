#include <iostream>
#include <string>
using namespace std;

int n;
class countSort {
public:
  void count_sort(string p, int n) {

    int i, j, count;
  

    int freq[25];

    for(i=0;i<=25;++i) {
      freq[i] = 0;
    }

    for(i=0;i<n;++i) {
      ++freq[p[i] - 'a'];
    }

    for(i=0;i<=25;++i) {
      count = freq[i];
      for(j=0;j<count;++j) {
        cout<<(char)(i+'a');
      }
    }
  }
};

int main() {

  string str;
  cout<<"enter a string\n";
  cin>>str;

  n = str.length();

  countSort obj;
  obj.count_sort(str, n);
}
