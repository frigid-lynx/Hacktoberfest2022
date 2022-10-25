#include<iostream>
#include<unordered_set>
#include<algorithm>
using namespace std;
int main()
{
    int arr[]={1,1,1,2,3,4,5,5,4,3,3,4,6};
    int n=sizeof(arr)/sizeof(arr[0]);
    unordered_set<int> set;
    for(int i=0;i<n;i++){
        set.insert(arr[i]);
        
        return set.size();
    }

}
