#include <iostream>

using namespace std;
 
void DFS(int u, int A[][8], int n){
    static int visited[8] {0};
 
    if (visited[u] == 0){
        cout << u<< ", ";
        visited[u] = 1;
        for (int v=1; v<n; v++){
            if (A[u][v] == 1){
                DFS(v, A, n);
            }
        }
    }
}
 
int main (){
 
    int A[8][8] = {{0, 0, 0, 0, 0, 0, 0, 0},
                   {0, 0, 1, 1, 1, 0, 0, 0},
                   {0, 1, 0, 1, 0, 0, 0, 0},
                   {0, 1, 1, 0,1, 1, 0, 0},
                   {0,1, 0, 1,0,1, 0, 0},
                   {0, 0, 0, 1, 1, 0, 1, 1},
                   {0, 0, 0,0,0, 1, 0, 0},
                   {0, 0, 0,0, 0, 1, 0, 0}};
 
    cout << "Vertex: 2 -> ";
    DFS(2, A, 8);
    
 
    return 0;
}