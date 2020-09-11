class Foo {
public:
    Foo() : m(3) {
        for(int i=1; i<3; ++i){
            m[i].lock();
        }
    }

    void first(function<void()> printFirst) {
        m[0].lock();
        // printFirst() outputs "first". Do not change or remove this line.
        printFirst();
        m[1].unlock();
    }

    void second(function<void()> printSecond) {
        m[1].lock();
        // printSecond() outputs "second". Do not change or remove this line.
        printSecond();
        m[2].unlock();
    }

    void third(function<void()> printThird) {
        m[2].lock();
        // printThird() outputs "third". Do not change or remove this line.
        printThird();
        m[0].unlock();
    }
private:
    vector<mutex> m;
};