class StockSpanner {
public:
    StockSpanner() {
        
    }
    
    int next(int price) {
        int result = 1;
        for(int i=stock.size()-1; i>=0; --i){
            if(stock[i].first <= price) {
                result += stock[i].second;
                stock.pop_back();
            } else break;
        }
        stock.push_back(make_pair(price, result));
        
        return result;
    }
private:
    vector<pair<int, int>> stock;
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */