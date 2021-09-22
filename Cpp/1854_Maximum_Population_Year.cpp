class Solution {
public:
    int maximumPopulation(vector<vector<int>>& logs) {
        int result = 0;
        
        vector<int> population(2051, 0);
        
        for(auto& log : logs) {
            population[log[0]] += 1;
            population[log[1]] -= 1;
        }
        
        int max_population = 0;
        int current = 0;
        for(int i = 1950; i <= 2050; ++i) {
            current += population[i];
            
            if(current > max_population){
                max_population = current;
                result = i;
            }
        }
        
        return result;
    }
};