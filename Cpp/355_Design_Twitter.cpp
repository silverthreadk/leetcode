class Twitter {
public:
    /** Initialize your data structure here. */
    Twitter() : time(0) {
        
    }
    
    /** Compose a new tweet. */
    void postTweet(int userId, int tweetId) {
        tweet_lists[userId].push_back(Tweet(tweetId, time++));
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    vector<int> getNewsFeed(int userId) {
        vector<int> result;
        auto comp = [](const Tweet &t1, const Tweet &t2) {
            return t1.time < t2.time;
        };
        priority_queue<Tweet, vector<Tweet>, decltype(comp)> pq(comp);
        
        vector<Tweet>& t = tweet_lists[userId];
        int t_size = t.size();
        for(int i=t.size()-1; i>=0 && i>=t_size-10; --i){
            pq.push(t[i]);
        }
        
        for(const auto& follower_id : followers[userId]){
            vector<Tweet>& t = tweet_lists[follower_id];
            int t_size = t.size();
            for(int i=t.size()-1; i>=0 && i>=t_size-10; --i){
                pq.push(t[i]);
            }
        }
        
        while(!pq.empty() && result.size() < 10){
            result.push_back(pq.top().id);
            pq.pop();
        }
        
        return result;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    void follow(int followerId, int followeeId) {
        if(followerId == followeeId) return;
        followers[followerId].insert(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    void unfollow(int followerId, int followeeId) {
        followers[followerId].erase(followeeId);
    }

private:
struct Tweet{
    int id;
    int time;
    
    Tweet(int id, int time) : id(id), time(time) {
    }
};
    
    unordered_map<int, unordered_set<int>> followers;
    unordered_map<int, vector<Tweet>> tweet_lists;
    int time;
};

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter* obj = new Twitter();
 * obj->postTweet(userId,tweetId);
 * vector<int> param_2 = obj->getNewsFeed(userId);
 * obj->follow(followerId,followeeId);
 * obj->unfollow(followerId,followeeId);
 */