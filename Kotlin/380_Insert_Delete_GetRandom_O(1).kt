class RandomizedSet() {
    val index = mutableMapOf<Int, Int>()
    val list = mutableListOf<Int>() 
    
    fun insert(`val`: Int): Boolean {
        if(index.containsKey(`val`)) return false

        list.add(`val`)
        index[`val`] = list.lastIndex
        
        return true
    }

    fun remove(`val`: Int): Boolean {
        if(!index.containsKey(`val`)) return false

        list[index[`val`]!!] = list.last()

        index[list.last()] = index[`val`]!!
        list.removeAt(list.lastIndex)
        index.remove(`val`)

        return true
    }

    fun getRandom(): Int {
        return list.random()
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */