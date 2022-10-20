class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] matrix = new char[n][m];   
        
        turnBox(box, matrix, m, n);
        
        turnGravity(matrix, n, m);
        
        return matrix;
    }
    
    public void turnGravity(char[][] matrix, int m, int n){
        for(int c = 0; c < n; c++){
            int last  = m-1;
            for(int r = m-1; r >= 0; r--){
                char val =  matrix[r][c];
                if(val == '.') continue;
                if(val == '*') last = r-1;
                if(val == '#') {
                    matrix[r][c] = '.';
                    matrix[last][c] = '#';
                    last--;
                }
            }
        }
    }
    
    public void turnBox(char[][] box, char[][] matrix, int m, int n){
        for(int i = 0, c = m-1; i < m; i++,c--) {
            for(int j = 0, r = 0; j < n; j++, r++) {
               matrix[r][c] = box[i][j];
            }
        }
    }
}
