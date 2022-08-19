// 생성자 함수(new, new Function)
function A() {}
const A = new A();
console.log(a, typeof a);
console,log(A()); 

    // 생성하면서 데이터 넣기
    function B(name, age) {
        console.log(name, age);
    }

    const b = new B();//undefined undefined
    const c = new B('Mark', 37); PerformanceMark, 37
    console.log (B()); //B함수가 호출(리턴값이 나와야 하는 데 리턴값이 없어 undefined)

// 객체에 속성 추가하기
    // 값을 속성으로 넣기
    function A(){
        this.name = 'Mark';
    }

    const a = new A(); //{name: 'Mark}
    console.log(a);

    // 함수를 속성으로 넣기
    function B() {
        this.hello = function () {
            console.log('hello');
        }
    }

    (new B()).hello();

// new Object
const a = new Object();
console.log(a, typeof a);

const b =new Object(true);
console.log(b, typeof b); // Boolean 생성자를 이용해서 true라는 값을 가진 object 형의 객체

const c = new Object({name: 'Mark'}); // 직접 literal: 문자 그대로 작성한 객체
console.log(c, typeof c);

// prototype
function Person(name, age) {
    this.name = name;
    this.age = age;
    this.hello =function(){
        console.log('hello', this.name, this.age);
    };
}

Person.prototype.hello = function(){
    console.log('hello', this.name, this.age);
}

const p = new Person('Mark', 37)
p.hello(); //hello Mark 37
console.log(p.toString());

console.log(Person.prototype);
console.log(Person.prototype.toString);//prototype의 체인에 의해서 상위에 있는 hello가 가지고 있는 함수 의미
console.log(Person.prototype.constructor); //constructor은 위에 함수 선언한 거 의미
console.log(Person.hello); //undefined 왜냐하면 hello가 객체로 선언되지 않았기 때문
console.log(Person.prototype.hello);//undefined

console.log(Object.prototype);//{} 빈객체
console.log(Object.prototype.toString);
console.log(Object.prototype.constructor);//object 라고 하는 기초 객체(object)의 생성자 함수


// Person은 Object로부터 나온 프로토타입 체인을 받아온 후에 내가 설정한 hello 함수와 그런 property를 가지는 함수이다.
console.log(p instanceof Person);//p가 Person에서 나온 instance인가 true
console.log(p instanceof Object);//p가 Object에서 나온 instance인가 true

// prototype 상속
function Person() {}

Person.prototype.hellpo = function(){
    console.log('hello');
}

function Korean(region) {
    this.region = region;
    this.where = function(){
        console.log('where', this.region);
    };
}
    // Korean 프로토타입을 Person 프로토타입으로 변경
    Korean.prototype = Person.prototype;

    const k = new Korean('Seoul'); 

    k.hello();
    k.where();

    // Object-Person-Korean
    console.log(k instanceof Korean);//true
    console.log(k instanceof Person);//true
    console,log(k instanceof Object);//true

// 객체 리터럴
const a = {};
console.log(a, typeof a);//{} object형

const b = {
    name: 'Mark',
};

console.log(b, typeof b);//{name:Mark} object형

    // propety에는 값 뿐만아니라 함수도 할당 가능
    const c = {
        name:'Mark',
        hello() {
            console.log('hello1', this.name);
        },

        // hello2는 이런 표현식을 갖는다는 의미
        hello2: function() {
            console.log('hello2', this.name);
        },

        hello3: () => {
            // this 적용 안됨
            console.log('hello3', this.name);
        }
    };

    c.hello1();
    c.hello2();
    c.hello3();

// 표준 내장 객체
    // Array
    const a = new Array('red','black','white'); // Array란 객체를 생성자 힘수로 사용해서 표현 가능
    console.log(a, typeof a); //['red','black','white'] object형(객체)
    console.log(a instanceof Array);//true
    console.log(a instanceof Object);//true

    const b = ['red','green','yellow']; //리터럴 표현법으로 생성 가능

    console.log(b, typeof b);
    console.log(b instanceof Array);//true
    console.log(b instanceof Object);//true 

    // instanceof가 다 true이므로 Array가 가지고 있는 프로토타입 함수 사용 가능
    console.log(b.slice(0.1)); //0번째부터 1개만 잘라오겠다. 그래서['red']
    
    console.log(Array.prototype.slice, Object.prototype.slice); //프로토타입 체인상 Object에 slice가 있는게 아니라 Object를 받아온 Array에 따로 또 구현을 추가한 함수이다.


