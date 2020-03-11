#include <iostream>
using namespace std;

class c2stack {

  int *arr;
  int size;
  int top1, top2;

public:
  c2stack(int n) {

    arr =  new int[n];
    size = n;
    top1 = -1;
    top2 = size;
  }

  void push1(int x) {

       if (top1 < top2 - 1)
       {
           ++top1;
           arr[top1] = x;
       }
       else
       {
           cout << "Stack Overflow";
       }
  }

  void push2(int x) {

       if (top1 < top2 - 1)
       {
           --top2;
           arr[top1] = x;
       }
       else
       {
           cout << "Stack Overflow";
       }
  }

   void pop1() {

       if (top1 >= 0)
       {
          arr[top1] = 0;
          top1--;
       }
       else
       {
           cout << "Stack UnderFlow";
       }
   }

   void pop2() {

       if (top2 < size)
       {
          arr[top2] = 0;
          ++top2;
       }
       else
       {
           cout << "Stack UnderFlow";
       }
   }

};

int main() {

  int n, i;
  cout<<"enter the size of stack\n";
  cin>>n;

  cout<<"enter 1 to push in stack1\n";
  cout<<"enter 2 to push in stack2\n";
  cout<<"enter 3 to pop from stack1\n";
  cout<<"enter 4 to pop from stack2\n";

  cin>>i;

  c2stack obj(n);

  while(n != 0) {
  switch(i) {

     case 1: cout<<"enter element to push in stack1\n";
             cin>>n;
             obj.push1(n); break;

     case 2: cout<<"enter element to push in stack2\n";
             cin>>n;
             obj.push2(n); break;

     case 3: cout<<"top element deleted from stack1\n";
                    obj.pop1(); break;

     case 4: cout<<"top element deleted from stack2\n";
                    obj.pop2(); break;

  }
  --n;
  cout<<"enter 1 or 2 to push and 3 or 4 to pop\n";
  cin>>i;
}
  return 0;
}
