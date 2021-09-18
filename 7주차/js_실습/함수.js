// 함수 만들기
    // 이름이 hello1인 함수 선언
    function hello1(){
        console.log('hello1');
    }
    console.log(hello1, typeof hello1);

    // 함수 이름 없이 만들기
    const hello1 = function(){
        console.log('hello1');
    }
    console.log(hello1, typeof hello1);
    
    // 매개변수 활용
    function hello2(name) {
        console.log('hello2', name);
    }
        // 함수 이름 없을 때
        const hello2 = function(name) {
            console.log('hello2', name);
        }

    // 함수의 리턴
    function hello3(name) {
        return `hello3 ${name}`; 
    }

    console.log(hello3('Mark'));
        
        // 함수 이름 없을 때
        const hello3 = function(name){
            return `hello3 ${name}`;
        }

// 익명함수 호출
var hello2;
console.log(hello2);
hello3();

// 선언적 함수 호출
hello1();


// 선언적 함수
function hello1(){
    console.log('hello1');
}


// 익명함수
    // var 사용
    hello2 = function(){
        console.log('hello2');
    }
    // const 사용
    const hello3 = function() {
        console.log('hello3');
    }

// new Function
const sum = new Function('a', 'b', 'c', 'return a + b + c');
console.log(sum(1,2,3));

// function 과 new Function();의 차이점
{
    const a = 1;

    const test = new Function('return a');

    console.log(test());//a is not defined
}

{
    const a =2;
    const test =function() {
        return a;
    };

    console.log(test());
}

// arrow function
const hello1 = () => {
    console.log('hello1');
};

    //  매개변수
    // const hello2 = (name) => {
    //     console.log('hello1', name);
    // };

    const hello2 = name => {
        console.log('hello1', name);
    };

    const hello3 = (name, age) => {
        console.log('hello3', name, age)
    }

    // 리턴
    const hello4 = name => {
        return `hello4 ${name}`;
    }

    const hello5 = name =>  `hello5 ${name}`;

// new (); 생성자 함수
function Person(name, age) {
    
    // 인자로 넣은 name과 age가 property를 가질 수 있게 해줌
    this.name = name;
    this.age = age;

}

const p = new Person('Mark', 37);
console.log(p, p.name, p.age);

    // Person이라는 틀을 이용해서 여러명의 사람 객체 생성 가능
    const a = new Person('Anna', 26);
    console.log(a, a.name, a.age);

    // arrow 함수에서는 사용 불가능
    const Cat = (name, age) => {
        console.log(this);
        this.name = name;
        this.age = age;
    }

    const c = new Cat('냥이', 1); // cat is not a constructor


// 함수 안에서 함수를 만들어 리턴
function plus(base) {
    return function(num){
        return base + num;
    }
}

    // base
    const plus5 = plus(5); // return 5 + num

    // num
    console.log(plus5(10)); //15

    const plus7 = plus(7);
    console.log(plus7(8)); //15


// 함수를 호출할 때 인자로 함수를 사용
function hello(c) {
    console.log('hello');
    c();
}
    // hello 함수가 실행되면 console.log('hello');이 실행이 되고 c(); 자리로  hello 함수 인수인 익명함수의 내용 console.log('콜백');이 들어가게 된다
    hello(function() {
        console.log('콜백');
    });



   