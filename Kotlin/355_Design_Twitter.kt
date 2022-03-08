class Twitter() {
    val followers = mutableMapOf<Int, MutableSet<Int>>()
    val tweetList = mutableMapOf<Int, MutableList<Tweet>>()
    var time = 0

    fun postTweet(userId: Int, tweetId: Int) {
        tweetList[userId] = tweetList[userId] ?: mutableListOf()
        tweetList[userId]?.add(Tweet(tweetId, time++))
    }

    fun getNewsFeed(userId: Int): List<Int> {
        val result = mutableListOf<Int>()
        val pq = PriorityQueue<Tweet>(Comparator<Tweet>{t1, t2 -> t2.time - t1.time})
        
        var tweet = tweetList[userId] ?: mutableListOf()
        var tweetSize = tweet?.size ?: 0
        for(i in tweetSize - 1 downTo maxOf(0, tweetSize - 10)) {
            pq.add(tweet[i]!!)
        }
        
        followers[userId]?.forEach{ followerId ->
            tweet = tweetList[followerId] ?: mutableListOf()
            tweetSize = tweet?.size ?: 0
            for(i in tweetSize - 1 downTo maxOf(0, tweetSize - 10)) {
                pq.add(tweet[i]!!)
            }
        }
        
        while(!pq.isEmpty() && result.size < 10){
            result.add(pq.peek().id)
            pq.poll()
        }

        return result
    }

    fun follow(followerId: Int, followeeId: Int) {
        if (followeeId == followerId) return
        followers[followerId] = followers[followerId] ?: mutableSetOf()
        followers[followerId]?.add(followeeId)
    }

    fun unfollow(followerId: Int, followeeId: Int) {
        followers[followerId]?.remove(followeeId)
    }

}

data class Tweet(val id: Int, val time: Int)

/**
 * Your Twitter object will be instantiated and called as such:
 * var obj = Twitter()
 * obj.postTweet(userId,tweetId)
 * var param_2 = obj.getNewsFeed(userId)
 * obj.follow(followerId,followeeId)
 * obj.unfollow(followerId,followeeId)
 */