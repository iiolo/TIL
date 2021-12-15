'use strict';

// Array

// 1. Array declaration
const arr1 = new Array();
const arr2 = [1,2]; // 총 길이 2인 배열, 0번째 index에는 숫자 1, 1번째 index에는 숫자 2

// 2. Index position
const fruits = ['🍎', '🍌'];
console.log(fruits);
console.log(fruits.length);
console.log(fruits[0]); // '🍎'
console.log(fruits[1]); //'🍌'
console.log(fruits[2]);// undefined

// 3. Looping over an array
// fruits 배열 안 전체적인 데이터 돌아가면서 하나씩 출력
console.clear();

    // a. for
    for (let i = 0; i < fruits.length; i++) {
        console.log(fruits[i]);
        
    }

    // b. for of
    for (let fruit of fruits) {
        console.log(fruit);
    }

    // c. forEach
    fruits.forEach((fruit, index, array) => {
        // console.log('he'); // data가 사과, 바나나로 총 두개가 들어있어 he가 두번 출력됨
        console.log(fruit);
    });

// 4. Addition, deletion, copy
// push : add an item to the end
fruits.push('🍓','🍑');
console.log(fruits);

// pop : remove an item from the end
fruits.pop();
fruits.pop();
console.log(fruits);

// unshift : add an item to the beginning 
fruits.unshift('🍓', '🍋');
console.log(fruits);

// shift : remove an item from the beginning
fruits.shift();
fruits.shift();
console.log(fruits);

// note!! shift are slower than pop, push

// splice : remove an item by index position
fruits.push('🍓','🍑', '🍋')
console.log(fruits);
fruits.splice(1, 1);
console.log(fruits);
fruits.splice(1, 1, '🍏', '🍉');
console.log(fruits);

//combine two arrays
const fruits2 = ['🍐', '🥥']
const newFruits = fruits.concat(fruits2);
console.log(newFruits);

// 5. Searching
// indexOf : find the index
console.clear();
console.log(fruits);
console.log(fruits.indexOf('🍎'));
console.log(fruits.indexOf('🍉'));
console.log(fruits.indexOf('🥥'));

// includes
console.log(fruits.includes('🍉'));
console.log(fruits.includes('🥥'));


// lastIndexOf
console.clear();
fruits.push('🍎');
console.log(fruits);
console.log(fruits.indexOf('🍎'));
console.log(fruits.lastIndexOf('🍎'));

// 연습
console.clear();
const newArray = [5,7,8,9]
console.log(newArray);
const news = newArray.toString();
console.log(news);
newArray.push(10);
newArray.pop();
const news2 = newArray.toLocaleString();
console.log(news2);

const arrLen = newArray.length;
console.log(arrLen);

newArray.join(9);
console.log(newArray);

