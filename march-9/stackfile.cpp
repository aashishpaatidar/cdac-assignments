#include <iostream>
#include <stack>
using namespace std;

class stackfile {
public:

  int parenthesis() {

    std::stack<char> s;
    std::string str;

    std::cout<<"enter parenthesis string\n";
    std::cin>>str;

    for(int i=0;i<str.length();++i) {

      if(str[i]=='(' || str[i]=='{' || str[i]=='[') {
        s.push(str[i]);
      }


        if(s.empty())
        std::cout<<"Mismatch\n";



      switch(str[i]) {

        case ')':
                 if(s.top()=='(')
                 s.pop();

                 break;

        case '}':
                if(s.top()=='{')
                s.pop();

                break;

        case ']':
                if(s.top()=='[')
                s.pop();

                break;
    }

   }

   if(!s.empty())
   std::cout<<"Mismatch\n";

   std::cout<<"Match\n";

   return 0;

  }
};

int main() {

  stackfile obj;
  obj.parenthesis();
}
