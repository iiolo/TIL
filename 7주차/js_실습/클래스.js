// 생성방식
    // 선언적 방식
    class A{}
    
    console.log(new A());//A{}

    // class 표현식을 변수에 할당
    const B = class {};

    console.log(new B());//B{}

    // 선언적 방식이지만 호이스팅을 일어나지 않는다(함수와 다르게 호이스팅 존재x)
    new C();
    class C {}

// Constructor
    class A {}
    console.log(new A());//A{}

    class B {
        constructor(){
            console.log('constructor');
        }
    }//constructor

    console.log(new B());

        //생성자를 넣어서 객체 안에서 활용할 수 있도록 설정
        class C {
            constructor(name, age) {
                console.log('constructor', name, age);
            }
        }

        console.log(new C('Mark', 37));
        console.log(new C());//undefined undefined

// 멤버 변수

    class A {
        constructor(name,age) {
            // name과 age가 객체의 프로퍼티로 들어감
            this.name=name;
            this.age=age;
        }
    }

    console.log(new A('Mark', 37)); //A{name:'Mark', age:37}

        // class에 직접 field를 부여하는 방식(런타임 환경 chrome72, node 12버전 이상 등에서 사용 가능)
        class B {
            name;//this.name
            age;//this.age
        }

        console.log(new B());//런타임 에러, 문법적인 오류(문법을 이해하지 못하는 런타임이여서)

        class C {
            // 초기값 설정
            name = 'no name';
            age=0;

            constructor(name,age) {
                // 초기값이 있긴하지만 constructor로 새로 할당됨
                this.name = name;
                this.age = age;
            }
        }

        console.log(new C('Mark', 37)); //class C를 이용해서 객체 만듦

// 멤버 함수
    class A {
        // 함수의 이름과 괄호 그리고 중괄호를 이용해서 설정하는 방법
        hello1() {
            console.log('hello1', this);
        }

        // 멤버변수처럼 변수이름에 함수 할당하는 방법
        hello2 = () => {
            console.log('hello2', this);
        };
    }

    new A(), hello1();
    new A(), hello2();

    class B {
        name = 'Mark';

        hello() {
            console.log('hello', this.name); //this.name이 Mark를 받아서 출력
        }
    }

    new B().hello();//hello Mark

// get, set
    class A {
        _name = 'no name';
        // 게터
        get name() {
            return this._name+'@@@';
        }

        // 세터
        set name(value) {
            this._name = value + '!!!';
        }

        
    }

        // 세터 동작
        const a = new A();
        console.log(a);
        a.name = 'Mark';//set 함수 불림(오른쪽에 위치한 결과가 set의 value로 들어감), a에 Mark라는 문자열이 set되게 됨(이것을 할 때 set 함수라 불림)
        console.log(a);//Mark!!!
        console.log(a._name);//Mark!!!, _name을 얻은 결과

        // 게터 동작
        console.log(a.name);//Mark!!!@@@

        // read only  형태로 동작
        class B {
            _name='no name';

            get name(){
                return this._name + '@@@';
            }
        }

        const b = new B();
        console.log(b);
        b.name = 'Mark';
        console.log(b);

// Static 변수와 함수
    class A {
        // static 변수
        static age = 37;

        static 함수
        static hello() {

            // new A를 통해 만든 객체가 아닌 class의 변수, class의 함수라 생각
            console.log(A.age);
        }
    }

    console.log(A, A.age);
    A.hello();

    class B {
        // 멤버변수
        age = 37;

        // static 함수(class 함수)
        static hello(){
            console.log(this.age);//말이 안되는 문법
        }
    }

    console.log(B, B.age);//static age 없음
    B.hello();//this.age는 undefinded
    new B().hello();//hello 함수를 모른다면서 에러가 남. hello 함수는 static 함수이기 때문(객체에 속해있는 함수가 아님)

    class C {
        static name ='이 클래스의 이름을 C가 아니다';
    }

    console.log(C)//static name 변수에 할당한 값 출력

// 클래스 상속 extends
    class Parent {
        name = 'Lee';

        hello() {
            console.log('hello', this.name);
        }
    }

    class Child extends Parent {}//Parent에 있는 멤버변수와 멤버 함수가 Child가 instance로 만들어질 때 같이 만들어지게 됨

    const p = new Parent();
    const c = new Child();
    console.log(p,c);//Parent {name:'Lee'}, Child{name:'Lee'}

    // 부모의 멤버 변수와 멤버 함수를 자식이 그대로 실행 가능
    c.hello();
    c.name = 'Anna';
    c.hello();

// override
    class Parent {
        name = 'Lee';

        hello() {
            console.log('hello', this.name);
        }
    }

    class Child extends Parent {
        // 부모요소가 안갖고 있는 변수
        age = 37;

        // 부모요소가 가진 함수 덮어씌우기
        hello() {
            console.log('hello', this.name, this.age);
        }
    } 

    const p = new Parent();//부모를 통해 만든 객체
    const c = new Child();
    console.log(p,c);//Parent {name:'Lee'}, Child{name:'Lee', age:37}

    // 자식이 구현한 것을 호출하게 됨
    c.hello();
    c.name = 'Anna';
    c.hello();

// super
    class Parent {
        name;

        constructor(name) {
            this.name = name;
        }

        hello() {
            console.log('hello', this.name);
        }
    }

    class Child extends Parent {
        age;
        
        // 부모에서 하는 constructor를 실행하고 자식에서의 constructor를 실행할 수 있도록 super 호출
        constructor(name, age) {
            super(name);
            this.age = age;
        }

        // overriding
        hello() {
            console.log('hello', this.name, this.age);
        }
    } 

    // 인수 입력
    const p = new Parent('Mark');

    // 자식의 constructor에서 name과 age를 받아서 처음 name은 부모의 constructor를 먼저 호출하게 한다음 this.name 할당하도록 처리 후 남아 있는 this.age로 할당하게 해줌
    const c = new Child('Mark', 37);

    console.log(p,c);//Parent {name:'Mark'}, Child{name:'Mark', age:37}
    c.hello(); //hello Mark 37


// 클래스 안의 static 변수 상속
    class Parent {
        static age = 37;
    }

    class Child extends Parent{}
    console.log(Parent.age);
    console.log(Child.age);