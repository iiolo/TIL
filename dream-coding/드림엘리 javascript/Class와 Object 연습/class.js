'use strict';

// 1. Class declarations
class Person {
    //constructor
    constructor(name, age) {
        //fields
        this.name = name;
        this.age = age;
    }

    //methods
    speak() {
        console.log(`${this.name} : hello!`);
    }
}

const laura = new Person('laura', 24); // 새로운 object 생성
console.log(laura.name);
console.log(laura.age);
laura.speak();

// 2. Getter and Setter
class User {
    constructor(firstName, lastName, age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
    }

    get age(){
        return this._age;
    }

    set age(value){
        // 1. age가 음수 되면 에러 발생 
        // if (value < 0) {
        //     throw Error('age can not be negative')
        // }

        // 2. age가 음수 되면 에러 발생 - 공격적인 방법
        this._age = value < 0 ? 0 : value;
    }

    //class User의 fields : firstName, lastName, _age
}

const user1 = new User('Laura', 'Kim', -1);
console.log(user1.age);

// 3. Fields(public, private)
// Too soon!

class Experiment {
    publicField = 2;
    #privateField = 0;
}

const experiment = new Experiment();
console.log(experiment.publicField);//2
console.log(experiment.privateField);//undefined

// 4. Static properties and methods
// too soon!
class Article {
    static publisher = 'Dream coding';
    constructor(articleNumber){
        this.articleNumber = articleNumber;
    }

    static printPublisher(){
        console.log(Article.publisher);
    }
}

const article1 = new Article(1);
const article2 = new Article(2);
//console.log(article1.publisher);//undefined
console.log(Article.publisher);// Dream coding
Article.printPublisher();

// 5. Inheriance
// - a way for one class to extend another class
class Shape {
    constructor(width, height, color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    draw(){
        console.log(`drawing ${this.color} color!`);
    }

    getArea() {
        return this.width * this.height;
    }
}

class Rectangle extends Shape{}// Rectangle이 Shape의 fields와 method를 상속받음
class Triangle extends Shape{
    //overriding
    draw(){
        super.draw();
        console.log('🔺');
    }
    getArea() {
        return this.width * this.height / 2;
    }
    
    toString(){
        return `Triangle : ${this.color}`;
    }
}
const rectangle = new Rectangle(20,20,'blue');
rectangle.draw();
console.log(rectangle.getArea());

const triangle = new Triangle(20,20,'red');
triangle.draw();
console.log(triangle.getArea());

// 6. class checking : instanceOf
console.log(rectangle instanceof Rectangle);
console.log(triangle instanceof Rectangle);
console.log(triangle instanceof Triangle);
console.log(triangle instanceof Shape);
console.log(triangle instanceof Object);
console.log(triangle.toString());

