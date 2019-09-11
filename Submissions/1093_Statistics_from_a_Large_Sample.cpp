class Solution {
public:
    vector<double> sampleStats(vector<int>& count) {
        int minimum = 255;
        int maximum = 0;
        double sum = 0;
        int number_of_elements = 0;
        int mode = 0;
        int mode_value = 0;
        vector<pair<int, int> > cumulative;
        for(int i=0; i<count.size(); ++i){
            if(count[i] > 0) {
                minimum = min(minimum, i);
                maximum = max(maximum, i);
                sum+=count[i]*i;
                number_of_elements+=count[i];
                cumulative.push_back({i, number_of_elements});
                if(mode_value < count[i]) {
                    mode = i;
                    mode_value = count[i];
                }
            }
        }
        
        float median_index = number_of_elements / 2.f;
        double median = cumulative[0].first;
        for(int i=1; i<cumulative.size(); ++i){
            if(cumulative[i].second > median_index){
                if(number_of_elements % 2 == 1) median = cumulative[i].first;
                else if(cumulative[i-1].second == median_index) median = (cumulative[i].first + cumulative[i-1].first)/2.f;
                else median = cumulative[i].first;
                break;
            }
        }
        double mean = sum/number_of_elements;
        return {minimum, maximum, mean, median, mode};
    }
};