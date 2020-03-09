#include <iostream>
#include <vector>
using namespace std;

class sequentialSearch {
public:

  void sequence() {

    vector<int> v;
    int num, e;

    cout<<"enter elements and -1 to stop\n";
    cin>>num;

    while(num != -1) {
      v.push_back(num);
      cin>>num;
    }

    vector<int>::iterator itr;
    cout<<"enter the element to find\n";
    cin>>e;

    for(itr = v.begin(); itr != v.end(); ++itr) {

      if(*itr == e)
         cout<<"element found";
    }
  }
};

int main() {

  sequentialSearch obj;
  obj.sequence();
}
