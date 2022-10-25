#include<iostream>
using namespace std;
void dupmis(int arr[],int n)
{
    int i=0;
    while(i<n)
    {
        if(arr[i]!=arr[arr[i]-1])
        swap(arr[i],arr[arr[i]-1]);
        else {
        i++;
      }
      
    }
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=i+1){
            cout<<"Missing Number"<<i+1<<endl;
            cout<<"Duplicate Number"<<arr[i];
        }
    }
      
}
int main()
{
    int arr[]={1,2,3,5,2,6};
    int n=sizeof(arr)/sizeof(arr[0]);
    dupmis(arr,n);
}
