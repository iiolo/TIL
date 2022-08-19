//함수 헷갈리는 부분 정리

// 함수 선언
// function doSomething() {
//     console.log('hello');
// }

function doSomething(add) {
    console.log(add);
    const result = add(2, 3);
    console.log(result);
}

function add(a, b) {
    const sum = a + b;
    return sum;
}

// 함수 호출
// doSomething(add); // 함수를 인자로 받은 경우
// doSomething(add()); //함수를 인자로 받은 경우x

// result 라는 변수를 정의함과 동시에 어떠한 값을 할당할 것인데
// 함수가 있으므로 1과 2라는 값을 전달해서 add라는 함수를 호출
// 함수가 호출되면 add 함수가 선언된 코드 블럭이 실행이 되고
// 순서대로 하나씩 실행이되어 1+2 가 할당된 sum이라는 변수가 return된다.
// 즉 add에서 3이라는 값이 전달이 되어지니까 함수 호출이 끝나자마자
// 전달된 3이 result로 할당되게 된다. 그래서 result를 출력하게 되면 3이 나온다.
// const result = add(1, 2);
// console.log(result);

const addFun = add;
console.log(addFun); // add 함수 자체가 나옴
addFun(1, 2);
add;
