function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
    
}


// promise 실행시키는 함수 앞에는 async 붙이기
// async function process() {

     // 함수 자체에서 흐름이 다른함수로 넘어가고 그러지 않기 때문에 분기점을 만드는 것도 쉽고 어떤 변수를 공유하는 것도 쉬워서 로직을 작성하기 편해짐
//     console.log('안녕하세요!');

     // promise 실행시키는 부분에 await 붙이기
//     await sleep(1000);

//     console.log('반갑습니다!');

//     return true;
// }


// process(); //안녕하세요! 출력 후 1초 뒤 반갑습니다! 출력

// process().then(value => {
//     console.log(value);
// }) // 안녕하세요! 출력 후 1초 뒤 반갑습니다! 출력과 동시에 true 출력



// Promise에서 error를 발생하고 싶을 때 throw를 사용하고 error를 잡아내고 싶을 땐 try-catch 문 사용
async function makeError() {
    await sleep(1000);
    const error = new Error();

    // 에러 발생 시키기
    throw error;
}

async function process() {
    try {
        await makeError();
    } catch (e) {
        console.error(e);
    }
}

process();