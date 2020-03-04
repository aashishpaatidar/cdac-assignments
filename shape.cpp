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
  shape(int n, char type) : count(n), shapeType(type) { }

  void move(int x, int y) { }

  void draw();

  void erase();

  char GetType() {
    return shapeType;
  }

  ~shape() { }

};

class line : public shape {

  line() : shape(2,'l') { }

  line(int n, char type) : shapes(n, type) { }

  void draw() {

    cout<<"co-ordinates of line drawn";
    for(int i=0;i<count;++i) {

      POINT p = new POINT;
      cout<<p.x <<" "<<p.y<<"\n";
    }
  }

  void erase() {

    cout<<"line erased";
    delete[] pts;
  }
  setPoints() {

  pts = new POINT[count];
  cout<<"enter the co-ordinates for line\n";

  for(int i=0;i<count;++i) {

    POINT p;
    cin>>p.x >> p.y;
    pts[i] = p;
  }
}

void move(int x, int y) {

  for(int i=0;i<count;++i) {
    POINT p = pts[i];
    pts[i].x = pts[i].x + x;
    pts[i].y = pts[i].y + y;
  }
}

};

class rectangle : public shape {

  rectangle(): shape(4,'r') { }

  void draw() {
    cout<<"co-ordinates of rectangle drawn\n";
    for(int i=0;i<count;++i) {

      POINT p = new POINT;
      cout<<p.x <<" "<<p.y<<"\n";
  }

  void erase() {
    cout<<"Rectangle erased";
    delete[] pts;
  }

  void move(int x, int y) {

    for(int i=0;i<count;++i) {
      POINT p = pts[i];
      pts[i].x = pts[i].x + x;
      pts[i].y = pts[i].y + y;
    }
  }
  setPoints() {

    pts = new POINT[count];
    cout<<"enter the co-ordinates for rectangle\n";

    for(int i=0;i<count;++i) {

      POINT p;
      cin>>p.x >> p.y;
      pts[i] = p;
    }
  }

};

class polygon : public shape {

  polygon() : shape('p') { }

  int sides;
  cout<<"enter sides of polygon";
  cin>>sides;
  count  = sides;

  void draw() {

    cout<<"co-ordinates of polygon drawn\n";
    for(int i=0;i<count;++i) {

      POINT p = new POINT;
      cout<<p.x <<" "<<p.y<<"\n";
  }
  }

  void erase() {
    cout<<"Polygon erased";
    delete[] pts;
  }

  void move(int x, int y) {

    for(int i=0;i<count;++i) {
      POINT p = pts[i];
      pts[i].x = pts[i].x + x;
      pts[i].y = pts[i].y + y;
    }
  }

  setPoints() {

    pts = new POINT[count];
    cout<<"enter the co-ordinates for rectangle\n";

    for(int i=0;i<count;++i) {

      POINT p;
      cin>>p.x >> p.y;
      pts[i] = p;
    }
  }
};

int main() {

  int choice, num;
  cout<<"enter the no. of shapes\n";
  cin>>num;

  for(i=0;i<num;i++){
         int choice = 0;
         
            cout << endl << endl << endl << "Menu: ";
            cout << endl << "Choose the shape type to enter : ";
             cout << endl << "1. Line";
             cout << endl << "2. Rectangle";
           cout << endl << "3. Polygon" << endl;
           cin >> choice;
        }while(choice<1 || choice>3);
        if(choice==1){
            Line* l = new Line();
            array[i] = l;
        }
        if(choice==2){
            Rectangle* r = new Rectangle();
            array[i] = r;
        }
         if(choice==3){
            Polygon* p = new Polygon();
            array[i] = p;
}  }


  Line l;
  Rectangle r;
  Polygon p;

  shape **arr = new *shape[num];

  for(int i=0;i<num)









    }

  }
}
