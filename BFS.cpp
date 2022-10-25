#include <iostream>
#include <queue>

using namespace std;
 
void BFS(int vtx,int A[][8],int n){
    queue<int> Q;
    int visited[8] {0};
    cout << vtx << ", " ;
     visited[vtx] = 1;
    Q.emplace(vtx);
    while (!Q.empty()){
        int u = Q.front(); 
        Q.pop();
        for (int v=1; v<=n; v++){  
            if (A[u][v] == 1 && visited[v] == 0){  
                cout << v << ", " ;  
                visited[v] = 1;
                Q.emplace(v);
            }
        }
    }
    cout << endl;
}
 
int main (){
 int a;
    int A[8][8] = {{0, 0, 0, 0, 0,0, 0, 0},
                   {0, 0, 1, 1, 1, 1, 1, 1},
                   {0, 1, 0, 1, 0, 0, 0, 0},
                   {0, 1, 1, 0, 1, 0, 0, 0},
                   {0,1, 0, 1, 0, 1, 0, 0},
                   {0, 1,0, 1, 1, 0,1, 1},
                   {0, 0, 0,0,0, 1, 0, 0},
                   {0, 0, 0, 0, 0, 1, 0, 0}};
    cout<<"Vertex:1->";
    BFS(1,A,8);
     cout<<"Vertex:2->";
    BFS(2,A,8);
     cout<<"Vertex:3->";
    BFS(3,A,8);
     cout<<"Vertex:4->";
    BFS(4,A,8);
     cout<<"Vertex:5->";
    BFS(5,A,8);
    cout<<"Vertex:6->";
    BFS(6, A, 8);
  cout<<"Vertex:7->";
    BFS(7,A,8);
 cout<<"hello";
    return 0;
}