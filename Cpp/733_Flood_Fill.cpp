class Solution {
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        recursive(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    
    void recursive(vector<vector<int>>& image, int row, int col, int new_color, int initial_color){
        if(row<0 || col<0 || row>image.size()-1 || row>image[0].size()-1 
           || image[row][col] == new_color || image[row][col] != initial_color) return;
        
        image[row][col] = new_color;
        recursive(image, row + 1, col, new_color, initial_color);
        recursive(image, row - 1, col, new_color, initial_color);
        recursive(image, row, col + 1, new_color, initial_color);
        recursive(image, row, col - 1, new_color, initial_color);
    }
};