'use strict';

// Javascript is synchronous
// Executing the code block in order after hoisting
console.log('1'); //요청 순서 3 //출력순서 1(동기)
setTimeout(() => console.log('2'), 1000); //요청 순서 4 //출력순서 4 (비동기)
console.log('3'); //요청 순서 5 // 출력순서 2(동기)

// Synchronous callback
function printImmediately(print) {
  print();
} // 요청 순서 1 //출력순서 3 (동기)

printImmediately(() => console.log('hello')); //요청 순서 6 //출력순서 3 (동기)

// Asynchronous callback
function printWithDelay(print, timeout) {
  setTimeout(print, timeout);
} // 요청 순서2 //출력순서 5 (비동기)

printWithDelay(() => console.log('async callback'), 2000); // 요청 순서7 //출력순서 5 (비동기)

// callback hell example
class UserStorage {
  loginUser(id, password, onSuccess, onError) {
    setTimeout(() => {
      if (
        (id === 'laura' && password === 'dream') ||
        (id === 'color' && password === 'academy')
      ) {
        onSuccess(id);
      } else {
        onError(new Error('not found'));
      }
    }, 2000);
  }

  getRoles(user, onSuccess, onError) {
    setTimeout(() => {
      if (user == 'laura') {
        onSuccess({ name: 'laura', role: 'admin' });
      } else {
        onError(new Error('no access'));
      }
    }, 1000);
  }
}

// id, password 받아오기 > login 함수 호출 > login 함수에서 받아온 user 데이터 토대로 roles 함수 호출
const userStorage = new UserStorage();
const id = prompt('enter your id');
const password = prompt('enter your password');
userStorage.loginUser(
  id,
  password,
  (user) => {
    userStorage.getRoles(
      user,
      (userWithRole) => {
        alert(
          `Hello ${userWithRole.name}, you have a ${userWithRole.role} role`
        );
      },
      (error) => {
        console.log(error);
      }
    );
  },
  (error) => {
    console.log(error);
  }
);
