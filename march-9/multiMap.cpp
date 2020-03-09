#include <iostream>
#include <map>
using namespace std;

int n;
class multiMap {
public:

  int usingmultimap(int n) {

    multimap<string, int> m;
    multimap<string, int>::iterator itr;
    string str;
    int marks;


    for(int i=0;i<n;i++) {

      cin>>str;
      cin>>marks;

      m.insert(pair<string, int>(str,marks));
    }

    cout<<"\n";

    cout<<"students who passed";

    for(itr=m.begin();itr!=m.end();++itr) {
      if((*itr).second>=40) {
        cout<<(*itr).first<<"\t";
        cout<<(*itr).second<<"\n";

      }
    }
     cout<<"students who failed\n";

      for(itr=m.begin();itr!=m.end();++itr) {
        if((*itr).second<40) {
          cout<<(*itr).first<<"\t";
          cout<<(*itr).second<<"\n";

        }
      }


  return 0;
  }
};


int main() {

  multiMap obj;

  cout<<"enter the no. of students\n";
  cin>>n;
  obj.usingmultimap(n);
}
