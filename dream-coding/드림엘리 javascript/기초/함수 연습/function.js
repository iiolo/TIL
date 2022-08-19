function add(num1, num2) {
    return num1 + num2;
}

// function print() {
//     console.log('print');
// }

// print(8, 33);

// const doSomething = add;
// const result = doSomething(2, 3);
// console.log(result);
// const result2 = add(2, 3);
// console.log(result);

function divide(num1, num2) {
    return num1 / num2;
}

// 전달된 함수를 통해서 어떤 값이든 출력
function surprise(operator) {
    const result = operator(2, 3); // add(2,3), divide(2,3)
    console.log(result);
}
// surprise(add);
surprise(divide);
