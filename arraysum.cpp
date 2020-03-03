#include <iostream>
using namespace std;

#define max 50

int x, m, n;


class arraysum
{

int arr[max][max][max];
  public:




   void readElements(int x, int m, int n)
   {


      for(int i=0;i<x;++i)
      {
          for(int j=0;j<m;++j)
          {
             for(int k=0;k<n;++k)
             {
                 cin>>arr[i][j][k];
             }
             cout<<"\n";
          }
      }
   }

   void addMatrices(int x, int m, int n)
   {


   for(int i=0;i<n;++i)
   {
       for(int j=0;j<m;++j)
       {
          for(int k=1;k<x;++k)
          {
              arr[0][j][i] = arr[0][j][i] + arr[k][j][i];
          }
          cout<<"\n";
       }
   }
   }

   void printMatrix(int m, int n)
   {



   for(int j=0;j<m;++j)
   {
      for(int k=0;k<n;++k)
      {
          cout<<arr[0][j][k]<<" ";
      }
      cout<<"\n";
   }
   }


};


int main()
{


   arraysum obj;

   cout<<"enter the no. of matrices\n";
   cin>>x;
   cout<<"enter size of mxn\n";
   cin>>m>>n;

   obj.readElements(x, m, n);

   obj.addMatrices(x, m, n);

   obj.printMatrix(m, n);

}
