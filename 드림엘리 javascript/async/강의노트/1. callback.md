# Async 비동기 프로그래밍

## 관련 단어

- hoisting : var 변수 선언과 function declaration 함수 선언들이 자동적으로 제일 위로 올라가는 것
- callback 함수 : 전달한 함수를 나중에 불러줘 라는 개념, 보통 arrow function 형식으로 작성
- 1000 ms : 1초

## 1. 동기와 비동기

- synchronous : 정해진 순서(작성한 순서)에 맞게 코드가 실행되는 것
  - Javascript is synchronous 자바스크립트는 동기적이다.
    - Executing the code block in order after hoisting : hoisting이 된 이후부터 코드가 작성한 순서대로 하나 하나씩 동기적으로 실행된다(나타나는 순서대로 자동적으로 실행됨)
    - javascript 엔진은 코드를 제일 위에서부터 밑으로 실행하게 된다.
- asynchronous : 비동기적으로 언제 코드가 실행될지 예측할 수 없는 것
  - 브라우저 api는 무조건 브라우저한테 먼저 요청을 보내게 된다. 응답을 기다리지 않고 바로 콘솔 log으로 넘어가게 된다.
  - ex) setTimeout web api : 브라우저에서 제공되어지는 api로 지정한 시간이 지나면 전달한 timeHandler이라는 callback 함수 호출, parameter은 timeHandler callback function, timeout(어느정도 시간(ms)에 timeout할 건지 시간을 지정해주는 인자)
- javascript는 함수를 callback 형태를 인자로 다른 함수에 전달할 수도 있고 변수에 할당할 수도 있는 언어이다. 언어들마다 callback을 지원하는 방식은 차이점이 존재한다. sub routine, lamda expression, function point 등의 callback을 이용하는 방식이 다르다.

## 2. Callback의 종류

### Synchronous callback

- callback은 비동기일 때만 쓰진 않는다.
- callback 함수를 즉각적으로 동기적으로 실행함

### Asynchronous callback

- callback 함수가 나중에 언제 실행될지 예측할 수 없다.

## 3. Callback Hell 콜백 지옥

- callback 함수가 유용하게 쓰일 때도 있지만 callback 지옥이 발생할 수도 있다.
- callback 함수들을 nesting(계속해서 묶어)해나가서 callback함수 안에서 다른 callback 함수를 부르고 부르고 부르고 하면서 callback 지옥이라는 말이 생겼다.
- promise와 async/await를 배우면 callback 지옥 코드를 깔끔하게 변환할 수 있다.
- 콜백 체인의 문제점 : callback을 이용해서 callback 함수 안에서 다른 것을 호출하고 그안에서 또다른 callback을 전달하고 그 안에서 또 다른 것을 전달하고 계속 전달전달하면 이것이 바로 콜백 지옥이다.
- 콜백 지옥의 문제점
  - 읽기가 너무 거북함, 가독성이 너무 많이 떨어짐, 어디에서 어떤 식으로 연결되어 있는지 한눈에 가늠하기 어렵고 비즈니스 로직을 한 눈에 이해하는 것도 어렵다.
  - 나중에 에러가 발생하거나 디버깅해야 하는 경우 굉장히 어렵다. 만약 무슨 문제가 생기면 에러가 처리되는 구간이 어디인지 가늠이 안될 수 있다. 점점 체인이 길어질수록 디버깅하고 문제를 분석하는 것이 어려워지고 유지 보수 또한 어렵다.
