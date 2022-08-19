class Counter {
    constructor(runEveryFiveTimes) {
        this.counter = 0;
        this.callback = runEveryFiveTimes;
    }
    increase() {
        this.counter++;
        console.log(this.counter);

        if (this.counter % 5 === 0) {
            // callback 함수가 등록되어 있다면 callback 함수 사용
            // if (this.callback) {
            //     this.callback(this.counter);
            // }
            this.callback && this.callback(this.counter);
        }
    }
}

// callback 함수를 전달함으로써 원하는 기능을 수행할 수 있다.
// class Counter 자체는 숫자가 5배가 될 때마다 어떤 동작을 하는지는 자체적으로 결정되어 있지는 않다
// 그래서 사용하는 사람이 원할 때 이런 기능을 전달하게 되어 수행하게 됨
function printSomething(num) {
    console.log(`${num} yo!`);
}

function alertNum(num) {
    alert(`alert! ${num}`);
}

const printCounter = new Counter(printSomething);
const alertCounter = new Counter(alertNum);

coolCounter.increase();
coolCounter.increase();
coolCounter.increase();
coolCounter.increase();
coolCounter.increase();

coolCounter.increase();
coolCounter.increase();
coolCounter.increase();
coolCounter.increase();
coolCounter.increase();
