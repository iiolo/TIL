// const dog = {
//     name: '멍멍이',
//     sound: '멍멍!',

//     // 객체 안에 함수 생성
//     say : function say(){
//         console.log(this.sound); //this는 함수가 위치한 객체인 자기 자신(dog)을 의미함
//     }
// };
// dog.say();

// const cat = {
//     name:'야옹이',
//     sound: '야옹~'
// };

// cat.say= dog.say;
// dog.say();
// cat.say();

// const catSay = cat.say;
// catSay

// console.log(dog.name);
// console.log(dog.age);

// const ironMan = {
//     name: '토니 스타크',
//     actor: '로버트 다우니 주니어',
//     alias: '아이언맨'

// }

// const captainAmerica = {
//     name: '스티븐 로저스',
//     actor: '크리스 에반스',
//     alias: '캡틴 아메리카'
// }

// console.log(ironMan);
// console.log(captainAmerica);

// // 함수의 파라미터에서도 객체를 받아와 사용할 수 있다.
// function print({alias, name, actor}) {
//     // const text = (`${hero.alias}(${hero.name}) 역할을 맡은 배우는 ${hero.actor} 입니다.`);

//     // 비구조화 할당
//     const {alias, name, actor} = hero;
//     const text = (`${alias}(${name}) 역할을 맡은 배우는 ${actor} 입니다.`);



//     console.log(text);
// }

// print(ironMan);


