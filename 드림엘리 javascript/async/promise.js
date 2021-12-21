'use strict';

// Promise is a Javascript object for asynchronous operation
// State : pending -> fulfilled or rejected
// Producer vs Consumer

// 1. Producer
const promise = new Promise((resolve, reject) => {
  // doing some heavy work(network, files)
  console.log('doing something...');
  setTimeout(() => {
    resolve('laura'); // 성공적으로 네트워크에서 받아온 또는 파일에서 읽어온 데이터를 가공한 데이터를 resolve 함수를 통해 전달
    // reject(new Error('no network'))
  }, 2000);
});

// 2. Consumers : then, catch, finally
promise
  .then((value /*laura*/) => {
    console.log(value);
  })
  .catch((error) => {
    console.log(error);
  })
  .finally(() => {
    console.log('finlly');
  });

// 3. Promise chaining
const fetchNumber = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve(1);
  }, 1000);
});

fetchNumber
  .then((num) => num * 2)
  .then((num) => num * 3)
  .then((num) => {
    // 다른 서버와 통신
    return new Promise((resolve, reject) => {
      setTimeout(() => resolve(num - 1), 1000);
    });
  })
  .then((num) => console.log(num));

// 4. Error handling
// hen을 받아오는 promise return
const getHen = () =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve('🐓'), 1000);
  });

// hen을 받아서 hen으로부터 egg을 얻어오는 promise return
const getEgg = (hen) =>
  new Promise((resolve, reject) => {
    setTimeout(() => {
      // resolve(`${hen} => 🥚`);
      reject(new Error(`error! ${hen} => 🥚`));
    }, 1000);
  });

// egg를 받아와서 egg를 가지고 🍳로 만드는 함수
const cook = (egg) =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve(`${egg} => 🍳`), 1000);
  });

getHen()
  .then(getEgg) //hen => getEgg(hen)
  .catch((error) => {
    //getegg에서 error 발생시 대체제 리턴
    return '🥖';
  })
  .then(cook) // egg => cook(egg)
  .then(console.log) // meal => console.log(meal)
  .catch(console.log); // error => console.log(error)
