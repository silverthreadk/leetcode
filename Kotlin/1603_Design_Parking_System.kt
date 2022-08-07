class ParkingSystem(big: Int, medium: Int, small: Int) {
    var spaces = IntArray(3)
    
    init {
        spaces[0] = big
        spaces[1] = medium
        spaces[2] = small
    }

    fun addCar(carType: Int): Boolean {
        if(spaces[carType - 1] == 0) {
            return false
        } else {
            --spaces[carType - 1]
        }
        
        return true
    }

}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */