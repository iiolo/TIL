// 기본 자료형

// Boolean

    // const isTrue = true;
    // const isFalse = false;

    // isTrue의 값과 typeof로 isTrue 타입 확인 
    // console.log(isTrue, typeof isTrue);

    // isFalse의 값과 typeof로 isFalse 타입 확인 
    // console.log(isFalse, typeof isFalse);

    // 표준 내장 객체로도 사용 가능
    // const a = new Boolean(false);
    // console.log(a, typeof a);

    // boolean을 객체로 지정해서 사용하지 않는 이유
    // 조건이 실행되는 경우
    // if(a) {
    //     console.log('false?')
    // }

    // 조건이 실행이 안되는 경우
    // const b = Boolean(false);
    // console.log(b,typeof b);

    // if (b) {
    //     console.log('false?')
    // }

// Null
// const a = null;

// undefined
// let b;
// console.log(b, typeof b);

// Null과 undefined 비교(같은 것 True 이라고 판단)
// if (a==b) {
//     console.log(a == b);
// }

// Null과 undefined 정확하게 비교(값뿐만 아니라 타입까지 완벽하게 비교)
// if (a===b) {
//     console.log(a === b);
// }

// Number
// const a = 37;
// console.log(a, typeof a);

    // 실수도 가능
    // const b = 96.7;
    // console.log(b, typeof b);

    // NaN
    // const c = NaN;
    // console.log(c, typeof c);

    // const d = Number('Mark');
    // console.log(d, typeof d);

    // const e = Number('37');
    // console.log(e, typeof e);

// String
// const a = 'Mark';
// console.log(a, typeof a);

// const b = "Mark" + "Lee";

// const c = a + 'Lee';

// console.log(c, typeof c);

    // templete string
    // const d = `${a} Lee`;
    // console.log(d, typeof d);

// Symbol
    // 함수를 호출해내는 형태로만 사용 가능
    const a = Symbol();
    console.log(a, typeof a);

    const b =Symbol(37);

    // 같은 인수를 넣어도 c와 d는 같지 않다.
    const c = Symbol('Mark');
    const d = Symbol('Mark');

    console.log(c===d); //false 출력

    // Symbol은 항상 new로 만들지 않음
    new Symbol(); //Error