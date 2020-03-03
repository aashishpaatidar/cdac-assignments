#include<iostream>
   using namespace std;
   const int size=20;
   
   
   void acceptStr(char (&str)[size])
   {
      cout<<"\nEnter a String : ";
      cin>>str;
  }
  
  void strCpy(char (&str1)[size], char (&str2)[size])
  {
      int i=0;
      while(str1[i]!='\0')
      {
          str2[i]=str1[i];
          i++;
      }
      str2[i]='\0';
  }
  
  void strComp(char (&str1[size],char (&str2)[size])
  {
      while((str1[i]!='\0' || str[i]!='\0'))
      {
  
      }
  }
  
  
  
  int main()
  {
      char str1[size],str2[size];
      int i;
  
      acceptStr(str1);
      strCpy(str1,str2);
      cout<<"String 1 : "<<str1<<"\nString 2: "<<str2<<"\n";
  
      return 0;
  
 
  }

