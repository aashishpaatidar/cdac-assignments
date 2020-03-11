#include <iostream>
using namespace std;

class queue {
public:

  int front, rear, size;
  int cap;
  int *arr;

  queue(int n) {

    this->cap = cap;
    front = this->size = 0;
    rear = cap - 1;
    arr = new int[this->cap];
  }


bool isFull(queue q) {

  return (q.size == q.cap);
}

bool isEmpty(queue q) {

  return (q.size == 0);
}

void enqueue(queue q, int item) {

  if(isFull(this))
            return;
        this->rear = (this->rear + 1) % this->cap;
        this->arr[this->rear] = item;
        this->size = this->size + 1;
}

int dequeue(queue q) {

}

int front(queue q) {

}

int rear(queue q) {

}
};

int main() {


}
