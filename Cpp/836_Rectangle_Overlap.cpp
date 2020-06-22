class Solution {
public:
    int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C-A)*(D-B);
        int area2 = (G-E)*(H-F);
        int x_overlap = max(A, E) < min(C, G);
        int y_overlap = max(B, F) < min(D, H);
        if(x_overlap && y_overlap){
            int area3 = (max(A, E)-min(C, G))*(max(B, F)-min(D, H));
            return -area3 + area1 + area2;
        }
        return area1 + area2;
    }
};