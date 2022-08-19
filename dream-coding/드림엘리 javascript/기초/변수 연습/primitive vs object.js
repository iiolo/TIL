// number, string, boolean, null, undefined
let number = 2;
let number2 = number;

console.log(number);
console.log(number2);

number2 = 3;

console.log(number);
console.log(number2);

// object
let obj = {
    name: 'laura',
    age: 5,
};

const obj = {
    name: 'laura',
    age: 5,
};

console.log(obj.name);

let obj2 = obj;
console.log(obj2.name);

obj.name = 'james';
console.log('------------');
// obj1과 obj2는 가리키는 object가 동일해서 같은 결과 값을 출력함
console.log(obj.name);
console.log(obj2.name);
