// Function
// - fundamental building block in the program
// - subprogram can be used multiple times
// - performs a task or calculates a value

// 1. Function declaration
// function name(param1, param2) { body... return;}
// one function === one thing
// naming : doSomething, commalnd, verb
// e.g. createCardAndPoint -> createCard, createPoint
// function is object in JS

function printHello() {
    console.log('Hello');
}

printHello();

function log(message) {
    console.log(message);
}
log('Hello');

// 2. Parameters
// - premitivie parameters : passed by value
// - object parameters : passed by reference
function changeName(obj) {
    obj.name = 'coder'; // 전달된 object의 name 값을 coder로 변환하는 함수
}
const laura = { name : 'laura'};
changeName(laura);
console.log(laura);

// 3. Default parameters(added in ES6)
// 예전 방식
// function showMessage(message, from) {
//     if (from === undefined) {
//         from = 'unknown';
//     }
//     console.log(`${message} by ${from}`);
// }

// showMessage('Hi!');

function showMessage(message, from = 'unknown') {
    
    console.log(`${message} by ${from}`);
}

showMessage('Hi!');

// 4. Rest Parameters (added in ES6)
function printAll(...args) {
    // dream, coding, laura 순으로 출력
    for (let i = 0; i < args.length; i++) {
        console.log(args[i]);
        
    }

    // for of 사용해서 배열 출력
    for (const arg of args) {
        console.log(arg);
    }

    // 배열 함수 forEach 사용해서 배열 출력
    args.forEach((arg)=>console.log(arg));
}
printAll('dream', 'coding', 'laura');

// 5. Local scope
let globalMessage = 'global'; // global variable
function printMessage() {
    let message = 'hello';
    console.log(message); // local variable
    console.log(globalMessage);

    function printAnother() {
        console.log(message);
        let childMessage = 'hello';
    }

    // console.log(childMessage);// 출력 안됨

}

printMessage();

// 6. Return a value
function sum(a, b) {
    return a + b;
}

const result = sum(1, 2); // 3
console.log(`sum: ${sum(1,2)}`);

// 7. Early return, early exit
// bad
function upgradeUser(user) {
    if (user.point > 10) {
        //long upgrade logic...
    }
    
}

// good
function upgradeUser(user) {
    if (user.point <= 10) {
        return;
    }
    
    //long upgrade logic..
}

// 8. Function Expression
// - a function declaration can be called earlier than it is defined.(hoisted)
//- a function expression is createed when the execution reaches it.

// 함수를 선언함과 동시에 변수 print에 할당
const print = function () { 
    console.log('print');
};

print();

const printAgain = print;
printAgain();

const sumAgain = sum;
console.log(sumAgain(1, 3));

// 9. Callback function using function expression
function randomQuiz(answer, printYes, printNo) {
    if (answer === 'love you') {
        printYes();
    } else {
        printNo();
    }
}

const printYes = function () {
    console.log('yes');
}

// named function
// - better debugging in debugger's stack traces
//- recursions
const printNo = function print() {
    console.log('No');
    // print();
}

randomQuiz('wrong', printYes, printNo);

randomQuiz('love you', printYes, printNo);

// 10. Arrow function
// - always anonymous
// const simplePrint = function () {
//     console.log('simplePrint!');
// }

const simplePrint = () => console.log('simplePrint!');
const add = (a, b) => console.log(`sum : ${a+b}`);
const simpleMultiply = (a, b) => {
    // do something more
    return a*b;
};

// 11. IIFE : Immediately Invoked Function Expression
(function hello() {
    console.log('IIFE');
})();

// Quiz
// command에 따른 계산하는 함수 구하기
// function calculate(command, a, b)
// command : add, substract, divide, multiply, remainder

//answer
function calculate(command, a, b) {
    switch (command) {
        case 'add':
            console.log(a+b);
            break;
        case 'substract' :
            console.log(a-b);
            break;
        case 'divide' :
            console.log(a/b);
            break;
        case 'multiply' :
            console.log(a*b);
            break;
        case 'remainder' :
            console.log(a%b);
            break;
        default:
            break;
    }
}

calculate('remainder', 3,2);