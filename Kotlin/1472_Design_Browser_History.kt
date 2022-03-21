class BrowserHistory(homepage: String) {
    private var index = 0
    private val homepages = mutableListOf<String>(homepage)
    
    fun visit(url: String) {
        var next = homepages.size - 1
        
        while(next > index) {
            homepages.removeAt(next)
            --next
        }
        
        homepages.add(url)
        index = homepages.size - 1
    }

    fun back(steps: Int): String {
        index = maxOf(index - steps, 0)
        return homepages[index]
    }

    fun forward(steps: Int): String {
        index = minOf(index + steps, homepages.size - 1)
        return homepages[index]
    }
    
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * var obj = BrowserHistory(homepage)
 * obj.visit(url)
 * var param_2 = obj.back(steps)
 * var param_3 = obj.forward(steps)
 */