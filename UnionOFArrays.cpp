#include<iostream>
using namespace std;
void unionof(int a[],int b[],int m,int n)
{
    int i=0; 
    int j=0;
    while(i<m && j<n)
    {
        if(a[i]<b[j])
        {
            cout<<a[i++]<<" ";

        }
        else if(b[j]<a[i])
        {
            cout<<b[j++]<<" ";

        }
        else{
            cout<<a[i++]<<" ";
            j++;
        }
    }
    while(i<m)
    {
        cout<<a[i++]<<" ";
    }
    while(j<n)
    {
        cout<<b[j++]<<" ";
    }
}
int main()
{
    int a[]={1,1,2,3,3,3,4,6,6,7};
    int b[]={1,2,4,5,6,6,6,7,8};
    int m=sizeof(a)/sizeof(a[0]);
    int n=sizeof(b)/sizeof(b[0]);
    unionof(a,b,m,n);

}
