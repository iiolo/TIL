// 조건문
// 표현식이 true여서 항상 참이여서 항상 블록 실행
// if (true) {
//     console.log('항상 실행');
// }
// if (true) console.log('항상 실행');

// 표현식이 false여서 블록은 항상 실행되지 않음
// if (false) {
//     console.log('항상 실행되지 않음');
// }
// if(false) console.log('항상 실행되지 않음');

// 표현식이 거짓(false)으로 평가되는 경우(블록 실행되지 않음)
// if(false) console.log(false);
// if(0) console.log(false);
// if('') console.log('');
// if (null) console.log(null);
// if (undefined) console.log(undefined);
// if (NaN) console.log(NaN);

// 표현식이 참(True)으로 평가되는 경우(Falsy한 값 제외한 나머지 모두)
// if (true) console.log(true);
// if (37) console.log(37);
// if(-37) console.log(-37); //음수도 가능
// if ('Mark') console.log('Mark');
// if ({}) console.log({});
// if ([]) console.log([]); // 빈배열도 가능

// if () else {}
// const n = 37;
// if (n>0) {
//     console.log('n이 0보다 큰 경우');
// } else {
//     console.log('n이 0보다 크지 않은(n<=0) 경우');
// }
    // 블록 한 줄 일 경우 중괄호 없이 사용 가능
    // if (n>0) console.log('n이 0보다 큰 경우');
    // else console.log('n이 0보다 크지 않은(n<=0) 경우');

// if () {} else if () {} else{}
// const n =15;

// n이 3으로 나누어 떨어진다면
// if (n % 3 == 0) {
//     console.log('n은 3의 배수입니다.');
// }else if(n%5==0){
    // 3의 배수가 아닌 것 중에서 5의 배수가 있을 경우
//     console.log('n은 5의 배수입니다.');

// } else {
//     console.log('n은 3의 배수도 아니고 5의 배수도 아닙니다.');
// }

// 3의 배수와 5의 배수 모두에 해당하는 n을 위해(즉 15의 배수)
// if(n%3==0 && n%5==0){
//     console.log('n은 15의 배수입니다.');
// }else if(n%3 == 0){
//     console.log('n은 3의 배수 입니다.');
// } else if(n%5==0) {
//     console.log('n은 5의 배수입니다.');
// } else {
//     console.log('n은 3의 배수도 아니고 5의 배수도 아닙니다.');
// }

// 정리
// 하나의 boolean 값으로 평가하는 식
// const multipleOfThree = n % 3 == 0;
// const multipleOfFive = n % 5 == 0;

// if(multipleOfThree && multipleOfFive){
//     console.log('n은 15의 배수입니다.');
// }else if(multipleOfThree){
//     console.log('n은 3의 배수 입니다.');
// } else if(multipleOfFive) {
//     console.log('n은 5의 배수입니다.');
// } else {
//     console.log('n은 3의 배수도 아니고 5의 배수도 아닙니다.');
// }

// 중첩으로 작성시
// if(multipleOfThree && multipleOfFive){
//     console.log('n은 15의 배수입니다.');
// } else {
//     // 15의 배수가 아닌 경우 중에서
//     if(multipleOfThree){
//         // 3의 배수인 경우
//         console.log('n은 3의 배수 입니다.');
//     } else if(multipleOfFive) {
//         // 5의 배수인경우
//         console.log('n은 5의 배수입니다.');
//     } else {
//         // 3의 배수도 5의 배수도 아닌 경우
//         console.log('n은 3의 배수도 아니고 5의 배수도 아닙니다.');
//     }
// }

// 논리연산자를 이용한 조건식 평가
    // AND 연산자 (&&)
    // if (true && true) {
    //     console.log('두개 모두 참이면 참');
    // }

    // if (true && false) {
    //     console.log('한개만 참이면 거짓');
    // }

    // if (false && true) {
    //     console.log('한개만 참이면 거짓');
    // }

    // if (false && false) {
    //     console.log('두개 모두 거짓이면 거짓');
    // }

    // OR 연산자(||)
    // if (true || true) {
    //     console.log('두개 모두 참이면 참');
    // }

    // if (true || false) {
    //     console.log('한개만 참이면 참');
    // }

    // if (false || true) {
    //     console.log('한개만 참이면 참');
    // }

    // if (false || false) {
    //     console.log('두개 모두 거짓이면 거짓');
    // }

    // NOT 연산자(!)
    // if (!true) {
    //     console.log('참이면 거짓');
    // }

    // if (!false) {
    //     console.log('거짓이면 참');
    // }


// 논리 연산자를 이용한 조건부 실행
// let n =5;

    // AND 연산자
        // 앞 조건이 맞아 뒤 표현식 실행됨
        // (n % 5 == 0) && console.log('5로 나누어 떨어질 때만 실행');

        // 앞 표현식 거짓일 경우 뒤 표현식 실행x
        // n = 6;
        //n % 5 == 0 && console.log('5로 나누어 떨어질 때만 실행'); //뒤 표현식 실행안됨
    
    // || 연산자
    // n = 5;

    // 뒤 표현식 실행되지 않음
    // n % 5 == 0 || console.log('5로 나누어 떨어지지 않을 때만 실행');

    // 뒤 표현식 실행됨
    // n = 6;
    // n % 5 == 0 || console.log('5로 나누어 떨어지지 않을 때만 실행');


// 삼항 연산자를 이용한 조건부 실행
// let n = 5;
    // 조건 ? 조건이 참이면 실행되는 표현식 : 조건이 거짓이면 실행되는 표현식
    // console.log(n % 5 == 0 ? '5의 배수입니다.':'5의 배수가 아닙니다.');

    // 변수에 표현식 결과 할당 가능
    // const message = n % 5 == 0 ? '5의 배수입니다.':'5의 배수가 아닙니다.';
    // console.log(message);


// swith를 이용한 조건문
let n = 5;

// switch (n) {
//     default : 
//     console.log(n);
// }

    // n이 5로 나누었을 때 나머지가 0인 경우
    // switch(n % 5) {
    //     case 0: {
    //         console.log('5의 배수 입니다.')

            // case 맞을 경우 case 안에 구문만 실행하고 뒤의 구문인 default 실행x
    //         break;

    //     }

    //     default : 
    //         console.log(n);
    // }


    // break와 case 잘 조합
    n = 6;
    switch(n % 5) {
        case 0: {
            console.log('5의 배수 입니다.')
            break;

        }

        case 1 :
        case 2:
        case 3:
        case 4:
            console.log('5의 배수가 아닙니다.')

        default : 
            console.log(n);
    }



