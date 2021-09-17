// 조건문
// 표현식이 true여서 항상 참이여서 항상 블록 실행
// if (true) {
//     console.log('항상 실행');
// }
if (true) console.log('항상 실행');

// 표현식이 false여서 블록은 항상 실행되지 않음
// if (false) {
//     console.log('항상 실행되지 않음');
// }
if(false) console.log('항상 실행되지 않음');

// 표현식이 거짓(false)으로 평가되는 경우(블록 실행되지 않음)
if(false) console.log(false);
if(0) console.log(false);
if('') console.log('');
if (null) console.log(null);
if (undefined) console.log(undefined);
if (NaN) console.log(NaN);

// 표현식이 참(True)으로 평가되는 경우(Falsy한 값 제외한 나머지 모두)
if (true) console.log(true);
if (37) console.log(37);
if(-37) console.log(-37); //음수도 가능
if ('Mark') console.log('Mark');
if ({}) console.log({});
if ([]) console.log([]); // 빈배열도 가능

// if () else {}
const n = 37;
// if (n>0) {
//     console.log('n이 0보다 큰 경우');
// } else {
//     console.log('n이 0보다 크지 않은(n<=0) 경우');
// }
    // 블록 한 줄 일 경우 중괄호 없이 사용 가능
    if (n>0) console.log('n이 0보다 큰 경우');
    else console.log('n이 0보다 크지 않은(n<=0) 경우');
