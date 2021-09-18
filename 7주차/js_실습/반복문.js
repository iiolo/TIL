
// for문
    for(let i = 0; i < 5; i++) {
        console.log('반갑습니다.');
    }

    // 초기화 시 선언된 변수 중괄호 안 반복블록에서 사용가능
    for(let i = 0, j=5; i < 5; i++) {
        console.log('반갑습니다.');
    }

    for(let i = 0, j=5; i < 5; i++, j = j*j) {
        console.log('반갑습니다.');
    }

    // 반복문 즉시 종료 break;
    for(let i = 0; i < 5; i++) {
        console.log(n);
        if(i>2) {
            break;
        }
        console.log('반갑습니다.');
    }

    // continue; 시 바로 해당 반복 블록 멈춤
    for(let i = 0; i < 5; i++) {
        console.log(n);
        if(i<2) {
            continue;
        }
        console.log('반갑습니다.');
    }

    // 무한루프
    for(;;){
        console.log('반갑습니다.');

        // if문의 랜덤한 값을 통해서 90넘으면  break
        if(Math.random()*100 > 90) {
            break;
        }
    }


// while 문
    // 무한루프
    while(true) {
        console.log('반갑습니다.');

        // if문의 랜덤한 값을 통해서 90넘으면  break
        if(Math.random()*100 > 90) {
            break;
        }
    }

// do while 문
    // 무한루프
    do {
        console.log('반갑습니다.');
    }while (Math.random()*100 <= 90);

// for of 문
for (const i of [1, 2, 3]) {
    console.log(i);//1,2,3 요소가 하나 하나 나오게 됨
}

// for in 문

Object.prototype.test = function() {};
for (const i in {a:1, b:2, c:3}) {
    console.log(i);//1,2,3,a,b,c,test 출력
}
