// Obejects
// - one of the Javascript's data types 
// - a collection of related data and/or functionality
// - Nearly all objects in Javascript are instances of Object
// - object = { key: value}

//primitive type
// const name = 'laura';
// const age = 4;
// print(name, age);
// function print(name, age) {
//     console.log(name);
//     console.log(age);
// }

// object
// 1.Literals and properties
const obj1 = {}; //'object literal' syntax
const obj2 = new Object(); //'object constructor' syntax

const laura = {name : 'laura', age : 4}
function print(person) {
    console.log(person.name);
    console.log(person.age);
}
print(laura);

    // With Javascript magic(dynamically typed language)
    // can add properties later 
    laura.hasJob = true;
    console.log(laura.hasJob);

    // can delete properties later
    delete laura.hasJob;
    console.log(laura.hasJob);

// 2. Computed properties
// - key should be always string
console.log(laura.name);
console.log(laura['name']);

laura['hasJob'] = true;
console.log(laura.hasJob);

function printValue(obj,key) {
    console.log(obj[key]);
}

printValue(laura,'name');

// 3. Property value shorthand
const person1 = {name: 'bob', age : 2}
const person2 = {name: 'steve', age : 3}
const person3 = {name: 'dave', age : 4}
const person4 = new Person('laura', 20);
console.log(person4);

// 4. Constructor function
// object를 필요할 때 일일히 만들게 될 경우 불가피하게 
// 동일한 key와 value들을 반복해서 작성해야 하는 문제점 해결하기 위한 함수(class template 같은 것)
function Person(name, age) {
    // return {
    //     // name : name,
    //     // age : age,

    //     // key와 value의 이름이 동일하다면 생략 가능
    //     name,
    //     age,
    // };

    // this = {};
    this.name = name;
    this.age = age;
        // return this;
}

// 5. in operator : property existence check(key in object)
console.log('name' in laura);
console.log('age' in laura);
console.log('random' in laura);
console.log(laura.random);

// 6. for..in vs for..of
// for(key in object)
console.clear();
for (key in laura) {
    console.log(key); //laura 안 모든 key들이 출력됨
}

// for(value of iterable)
const array = [1,2,3,4];

// for (let i = 0; i < array.length; i++) {
//     console.log(array[i]);
// }

// 위와 같은 것을 조금 더 간단하게 하는 방법
for (value of array) {
    console.log(value);
}

// 7. Fun cloning
// - Object.assign(dest, [obj1, obj2, obj3...])
const user = {name : 'laura', age : '24'};
const user2 = user; // reference는 다르지만 가리키는 object는 같음
// user2.name = 'coder';
console.log(user);//{name: 'coder', age: '24'}

// object를 복사할 수 있는 방법
    //old way
    // 1. 텅텅 비어져 있는 obj을 먼저 만듦
    const user3 = {};

    // 2. for..in 을 사용해 해당 obj을 돌면서 manual(수동)적으로 할당
    for(key in user) { // user 안 key들을 빙글빙글 돌면서 첫번째 key는 name이 되고 두번째 key는 age가 된다.
        // 첫번째 key인 name일 때는 user3의 새로운 property인 name을 추가할 건데 값은 기존의 user의 key에 있는 value가 할당됨
        // 두번째로 돌때는 user3에 age라는 property가 추가되고 값은 user에 있는 age의 value인 20이 할당됨
        user3[key] = user[key]; 
    }

    console.clear();
    console.log(user3);

    // recent
    // example 1
    // const user4 = {};
    // Object.assign(user4, user); //(텅 빈 obj, 복사하고자 하는 obj)

    // example 2
    const user4 = Object.assign({}, user);
    console.log(user4);

    //another example
    const fruit1 = {color :'red'};
    const fruit2 = {color :'blue', size : 'big'};
    const mixed = Object.assign({}, fruit1, fruit2); // 동일한 property가 있을 시 뒤에 나온 object 값이 덮어씌우게 됨
    console.log(mixed.color);
    console.log(mixed.size);

