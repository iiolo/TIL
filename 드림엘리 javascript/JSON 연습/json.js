//JSON
//Javascript Object Notation

// 1. Object to JSON
//stringify(obj)
let json = JSON.stringify(true);
console.log(json); // string type의 true

json = JSON.stringify(['apple', 'banana'])
console.log(json);


const rabbit = {
    name : 'tori',
    color : 'white',
    size : null,
    birthDate : new Date(),
    // symbol :Symbol('id'),
    jump: () => {
        console.log(`${this.name} can jump!`);
    },
};

json = JSON.stringify(rabbit);
console.log(json);

json = JSON.stringify(rabbit, ["name", 'color', 'size']);//이름만 json 형태로 변환
console.log(json);


json = JSON.stringify(rabbit, (key,value) => {
    console.log(`key : ${key}, value : ${value}`);

    // key가 name인 것이 들어오면 해당 key의 value를 무조건 laura로 설정하고 아닌 경우 원래 오리지널 value 반환
    return key === 'name'?'laura': value;
})
console.log(json);

// 2. JSON to object
//parse(json)

console.clear();
json = JSON.stringify(rabbit);
const obj= JSON.parse(json, (key, value) => {
    console.log(`key : ${key}, value : ${value}`);

    // key가 만약 birthDate면 birthDate를 새로운 object Date를 만들것이고
    // 만약 key가 birthDate가 아니면 원래 value를 그대로를 쓸 것
    return key === 'birthDate' ? new Date(value) : value;
});
console.log(obj);
rabbit.jump();
// obj.jump();

console.log(rabbit.birthDate.getDate());
console.log(obj.birthDate.getDate());