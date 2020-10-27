class DiningPhilosophers {
public:
    DiningPhilosophers() : m(5) {
        
    }

    void wantsToEat(int philosopher,
                    function<void()> pickLeftFork,
                    function<void()> pickRightFork,
                    function<void()> eat,
                    function<void()> putLeftFork,
                    function<void()> putRightFork) {
		m[philosopher].lock();
        m[(philosopher+1)%5].lock();
        
        pickLeftFork();
        pickRightFork();
        eat();
        putLeftFork();
        putRightFork();
        
        m[philosopher].unlock();
        m[(philosopher+1)%5].unlock();
    }
private:
    vector<mutex> m;
};