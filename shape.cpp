#include <iostream>
using namespace std;


struct POINT {
  int x;
  int y;
};

class shape
{
protected:
  POINT *pts;
  int count;
  char shapeType;

public:
  shape(int n, char type) : count(n), shapeType(type) {

  pts = new pts[n];
  }

  ~shape() {

    delete[] pts;
  }
  

  void move(int x, int y) {


    for(int i=0;i<n;++i) {

      pts[i].x = pts[i].x + x;
      pts[i].y = pts[i].y + y;
    }

    cout<<"points moved\n";

    for(int i=0;i<n;++i) {
      cout<<pts[i].x << "\n" << pts[i].y;
    }

  }

  void draw();

  void erase();

  char GetType();

  int arr[100];

};

class line : public shape {

  line(int n, char type) : shapes(n, type) { }

  void draw() {
    cout<<"Line drawn";
  }

  void erase() {
    cout<<"Line erased";
  }
  setPoints() {

  for(int i=0;i<n;++i) {
    cin>>pts[i].x >> pts[i].y;
  }

};

class rectangle : public shape {

  rectangle(int n, char type) : shapes(n, type) { }

  void draw() {
    cout<<"Rectangle drawn";
  }

  void erase() {
    cout<<"Rectangle erased";
  }
  setPoints() {

    for(int i=0;i<n;++i) {
      cin>>pts[i].x >> pts[i].y;
    }
  }

};

class polygon : public shape {

  polygon(int n, char type) : shapes(n, type) { }

  void draw() {
    cout<<"Polygon drawn";
  }

  void erase() {
    cout<<"Polygon erased";
  }

  setPoints() {

    for(int i=0;i<n;++i) {
      cin>>pts[i].x >> pts[i].y;
    }
  }
}

int main() {

  int choice, op;
  cout<<"enter choice of shape\n";
  cin>>choice;

  Line l;
  Rectangle r;
  Polygon p;

  switch(choice)
  {
    case 1:

    cout<<"enter choice of operation 1 to 4:\n";

    switch(op) {

      case 1:
      l.setPoints(); break;

      case 2:
      l.draw(); break;

      case 3:
      l.erase(); break;
    }

    case 2:
    cout<<"enter choice of operation 1 to 4:\n";
    switch(op) {

      case 1:
      r.setPoints(); break;

      case 2:
      r.draw(); break;

      case 3:
      r.erase(); break;
    }

    case 3:
    cout<<"enter choice of operation 1 to 4:\n";
    switch(op) {

      case 1:
      r.setPoints(); break;

      case 2:
      r.draw(); break;

      case 3:
      r.erase(); break;
    }

    case 4:
    cout<<"enter choice of operation 1 to 4:\n";

    switch(op) {

      case 1:
      r.setPoints(); break;

      case 2:
      r.draw(); break;

      case 3:
      r.erase(); break;
    }





    }

  }
}
