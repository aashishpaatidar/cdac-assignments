#include <iostream>
using namespace std;

void memory_allocate(int n, int m, int** arr)
{
     arr = new int*[n];

     for(int i=0;i<m;++i)
     {
        arr[i] = new int[m];
     }
}

int main()
{
     int n, m;
     int** arr;

     cin>>n>>m;

     memory_allocate(n, m, arr);
}
