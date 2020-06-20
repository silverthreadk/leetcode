class BrowserHistory {
public:
    BrowserHistory(string homepage) : pos(0) {
        homepages.push_back(homepage);
    }
    
    void visit(string url) {
        homepages.erase(homepages.begin() + pos + 1, homepages.end());
        homepages.push_back(url);
        pos = homepages.size()-1;
    }
    
    string back(int steps) {
        pos = max(pos-steps, 0);
        return homepages[pos];
    }
    
    string forward(int steps) {
        pos = min(pos+steps, static_cast<int>(homepages.size())-1);
        return homepages[pos];
    }
private:
    vector<string> homepages;
    int pos;
};

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory* obj = new BrowserHistory(homepage);
 * obj->visit(url);
 * string param_2 = obj->back(steps);
 * string param_3 = obj->forward(steps);
 */