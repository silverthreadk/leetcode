class ZeroEvenOdd {
private:
    int n;
    mutex zero_mutex;
    mutex even_mutex;
    mutex odd_mutex;
public:
    ZeroEvenOdd(int n) {
        this->n = n;
        zero_mutex.unlock();
        even_mutex.lock();
        odd_mutex.lock();
    }

    // printNumber(x) outputs "x", where x is an integer.
    void zero(function<void(int)> printNumber) {
        for(int i=1; i<=n; ++i){
            zero_mutex.lock();
        	printNumber(0);
            if(i&1){
                odd_mutex.unlock();
            } else {
                even_mutex.unlock();
            }
        }
    }

    void even(function<void(int)> printNumber) {
        for(int i=2; i<=n; i+=2){
            even_mutex.lock();
        	printNumber(i);
            zero_mutex.unlock();
        }
    }

    void odd(function<void(int)> printNumber) {
        for(int i=1; i<=n; i+=2){
            odd_mutex.lock();
        	printNumber(i);
            zero_mutex.unlock();
        }
    }
};