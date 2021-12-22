// async & await
// clear syle of using promise

// 1. async
// promise 이용
// function fetchUser() {
//     return new Promise((resolve, reject) => {
//         // do network request in 10 secs...
//         resolve('laura');
//     });
// }

// 앞 코드 async화
async function fetchUser() {
    return 'laura';
}
const user = fetchUser();
user.then(console.log);
console.log(user);

// 2. await
// delay 함수는 정해진 ms가 지나면 resolve를 호출하는 promise return
function delay(ms) {
    return new Promise((resolve) => setTimeout(resolve, ms));
}

async function getApple() {
    await delay(2000);
    return '🍎';
}

async function getBanana() {
    await delay(1000);
    return '🍌';
}
// 앞 코드 promise화
// function getBanana() {
//     return delay(3000).then(() => '🍌');
// }

// promise 버전
// function pickFruits() {
//     return getApple().then((apple) => {
//         return getBanana().then((banana) => `${apple} + ${banana}`);
//     });
// }
// pickFruits().then(console.log);

// async /await 버전
async function pickFruits() {
    // promise 만들기
    const applePromise = getApple();
    const bananaPromise = getBanana();

    // await 키워드 붙이기
    const apple = await applePromise;
    const banana = await bananaPromise;
    return `${apple} + ${banana}`;
}
pickFruits().then(console.log);

console.clear();
// 3. useful Promise APIs
// all
function pickAllFruits() {
    return Promise.all([getApple(), getBanana()]) //
        .then((fruits) => fruits.join(' + '));
}
pickAllFruits().then(console.log);

function pickOnlyOne() {
    return Promise.race([getApple(), getBanana()]);
}
pickOnlyOne().then(console.log);
