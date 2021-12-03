'use strict';

let name ='laura';
console.log(name);
name = 'hello';
console.log(name);

const count = 17; // integer
const size = 17.1 // decimal number
console.log(`value : ${count}, type : ${typeof count}`);
console.log(`value : ${size}, type : ${typeof size}`);

//number
const infinity = 1/0;
const negativeInfinity = -1/0;
const nAn = 'not a number' / 2;
console.log(infinity);
console.log(negativeInfinity);
console.log(nAn);

//bigInt
const bigInt = 123456789012345678901234567890n;
console.log(`value : ${bigInt}, type : ${typeof bigInt}`);
