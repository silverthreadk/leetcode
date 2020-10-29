class ParkingSystem {
public:
    ParkingSystem(int big, int medium, int small) : slots(3, 0) {
        slots[0] = big;
        slots[1] = medium;
        slots[2] = small;
    }
    
    bool addCar(int carType) {
        if(slots[carType-1] == 0) return false;
        --slots[carType-1];
        return true;
    }
    
    vector<int> slots;
};

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */