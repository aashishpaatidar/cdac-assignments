#include <iostream>
#include <set>
using namespace std;

class usingSet {
public:
  int setTheory() {

    set<int> s;
    int n, num;

    cout<<"enter the value of N\n";
    cin>>n;

    for(int i=0; i<=n; ++i) {
      s.insert(i+2);
    }

    set<int>::iterator itr = s.begin();

    for(int i=2; i < n; ++i) {

      for(itr=s.begin();itr!=s.end();++itr) {

        if(*itr == i)
           continue;
        if((*itr % i) == 0)
             s.erase(itr);
      }
    }


    for(itr=s.begin();itr!=s.end();++itr) {

      cout<<(*itr)<<" ";
    }

    return 0;
  }
};

int main() {

  usingSet obj;
  obj.setTheory();
return 0;
}
