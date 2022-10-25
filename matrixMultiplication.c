#include <stdio.h>
#define COL 10

int multiplyPossible(int n, int p){
    //The column of first matrix should be equal to row of second.
    return n == p;
}
void readInput(int (*matrix)[COL], int m, int n){
    for (int  i = 0 ; i < m ; i++ )
        for (int j = 0 ; j < n ; j++ )
            scanf("%d", (*(matrix + i) + j));
}

void multiplyMatrix(int (*matrix1)[COL], int m, int (*matrix2)[COL], int p, int q, int (*final)[COL]){
    int sum = 0;
    for (int i = 0 ; i < m ; i++ )
    {
        for (int j = 0 ; j < q ; j++ )
        {
            for (int k = 0 ; k < p ; k++ )
            {
                sum = sum + matrix1[i][k]*matrix2[k][j];
            }

            final[i][j] = sum;
            sum = 0;
        }
    }
}
void display(int (*matrix)[COL], int m, int n){
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            printf("%d ", *(*(matrix + i) + j));
        }
        printf("\n");
    }
}



int main()
{   int m, n, p, q;
    int first[10][10], second[10][10], finalMatrix[10][10];

    printf("Enter the number of rows and columns of first matrix:\n");
    scanf("%d %d", &m, &n);

    printf("Enter the number of rows and columns of second matrix:\n");
    scanf("%d %d", &p, &q);


    if(multiplyPossible(n, p))
    {
        //Reading elements of first matrix
        printf("Enter the elements of first matrix:\n");
        readInput(first, m, n);

        //Reading elements of second matrix
        printf("Enter the elements of second matrix:\n");
        readInput(second, p, q);

        //Carrying out matrix multiplication
        multiplyMatrix(first,m, second, p, q, finalMatrix);

        //Printing the final product matrix
        printf("The product of entered matrices is:\n");
        display(finalMatrix, m, q);
    }
    else{
        printf("Matrices with entered orders can't be multiplied with each other.\n");
        printf("The column of first matrix should be equal to row of second.\n");

    }

    return 0;
}
