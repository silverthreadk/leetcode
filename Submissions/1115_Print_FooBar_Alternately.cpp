class FooBar {
private:
    int n;
    mutex bar_mutex;
    mutex foo_mutex;

public:
    FooBar(int n) {
        this->n = n;
        bar_mutex.lock();
    }

    void foo(function<void()> printFoo) {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo() outputs "foo". Do not change or remove this line.
            foo_mutex.lock();
        	printFoo();
            bar_mutex.unlock();
        }
    }

    void bar(function<void()> printBar) {
        
        for (int i = 0; i < n; i++) {
            
        	// printBar() outputs "bar". Do not change or remove this line.
            bar_mutex.lock();
        	printBar();
            foo_mutex.unlock();
        }
    }
};