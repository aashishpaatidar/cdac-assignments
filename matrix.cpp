#include <iostream>
using namespace std;

int x, m, n;
int result[50][50];

class matrix
{
public:

  void ReadMatrix(int **p, int m, int n)
  {
    for(int i=0;i<m;++i)
    {
      for(int j=0;j<n;++j)
      {
        cin>>p[i][j];
      }
    }
  }

  void WriteMatrix(int **p, int m, int n)
  {
    for(int i=0;i<m;++i)
    {
      for(int j=0;j<n;++j)
      {
        cout<<p[i][j];
      }
      cout<<"\n";
    }
  }

  void AddMatrices(int result[50][50], int **a, int **b, int m, int n)
  {
    for(int j=0;j<m;++j)
    {
      for(int k=0;k<n;++k)
      {
        result[j][k] = a[k][j] + b[k][j];
      }
    }
  }

};

int main()
{
  matrix obj;

  cout<<"enter the no. of matrices\n";
  cin>>x;
  cout<<"enter the size of mxn matrix\n";
  cin>>m>>n;

  int ***arr = NULL;


  arr = new int**[x];

  for(int j=0;j<x;++j) {
    arr[j] = new int*[m];
  }

  for(int j=0;j<x;++j) {
    for(int k=0;k<m;++k) {
    arr[j][k] = new int[n];
   }
  }

  for(int i=0;i<x;++i) {

   obj.ReadMatrix(arr[i], m, n);

   cout<<"\n";

   obj.WriteMatrix(arr[i], m, n);


 }

 for(int i=0;i<x;++i) {
   obj.AddMatrices(result, arr[i], arr[++i], m, n);
 }

 for(int i=0;i<m;++i) {
   for(int j=0;j<n;++j) {

     cout<<result[i][j]<<" ";
   }
   cout<<"\n";
 }
}
