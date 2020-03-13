#include <iostream>
using namespace std;

class maxHeap {

  int size;
  int maxsize;
  int *heap;

public:

  maxHeap(int n) {

    size = 0;
    maxsize = n;
    heap = new int[n+1];
    heap[0] = 0;
  }

  int parent(int i) {

    return i/2;
  }

  int left(int i) {

    return (2*i);
  }

  int right(int i) {

    return (2*i)+1;
  }

  bool isLeaf(int i) {

    if(left(i) > size && right(i) > size) {
      return true;
    }
      return false;
    }

  void heapify(int i) {

    if(isLeaf(i))
       return;

    if(heap[i] < heap[left(i)] || heap[i] < heap[right(i)]) {

      if(heap[left(i) > heap[right(i)]) {
        swap(&i, &left(i));
        heapify(left(i));
      }
      else {
        swap(&i, &right(i));
        heapify(right(i));
      }
    }
  }

  void insert(int value) {

    heap[++size] = value;

    for(int i=size; i!=1; i=parent(i)) {

       if(heap[i] > heap[parent(i)])
          swap(&i, &parent(i));
    }
  }

  void swap(int *x, int *y) {

    int temp = *x;
    *x = *y;
    *y = temp;
  }

  int extract() {

    int pop = heap[1];
    heap[1] = heap[size--];

    heapify(1);

    return pop;
  }

  void print(int *a) {

    for(int i=1; i<=size/2; ++i) {

      cout<<
    }
  }

};

int main() {

  int n;
}
