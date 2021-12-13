# 객체 지향 언어(Class vs Object)

- class를 이용해서 상속과 다양성이 일어날 수 있다. 이런 모든 것들이 일어날 수 있는 곳이 객체지향 언어이다.
- 객체 지향 언어로 프로그래밍을 잘하는 개발자 = 풀어야 하는 문제나 구현해야 되는 기능들을 객체로 잘 정의해서 만들 수 있는 개발자

## js에 class나 object가 없다면

- 정의한 변수들이 여기저기에 둥둥 떠다니면서 규모있는 프로젝트를 만들기 힘들었을 것이다.
- 실제로 살아가는 세상에는 수많은 물체와 사물들이 존재한다. 프로그래밍을 할 때 또한 사물과 물체들을 class나 object로 정의해서 프로그래밍 하는 것이 조금 더 자연스럽기 때문에 개발자들이 편하고 유연하게 프로그래밍을 할 수 있게 도와준다.

## 상속 Inheriance

```js
class 상속받을class extends 상속해줄class {}
```

- a way for one class to extend another class
- extends 키워드 사용
- extends 키워드를 기준으로 뒤 class의 모든 fields와 methods가 앞 class에 상속됨
- 상속을 이용하게 되면 공통되어지는 것들을 일일히 작성하지 않아도 extends를 이용해서 동일한 것들을 재사용할 수 있다.
  - 한 곳에서 수정해도 모두 다 동일하게 변경 가능
  - 다양성이 획기적인 일을 하게 됨(overriding : 필요한 함수만 재 정의해서 사용할 수 있다.)
- super.fieldORmethod; : 부모의 해당 field나 method가 호출함

## instanceOf

- object는 class를 통해 만들어진 새로운 instance
- instanceof : instanceof를 기준으로 왼쪽 object가 오른쪽 class의 instance인지 아닌지 즉, class를 이용해서 만들어진 것인지 아닌지 확인
- js에서 만든 모든 object들은 js에 있는 Object를 상속한 것이다. 즉, 어떤 object던지 공통적으로 존재하는 method를 쓸 수 있다. 또한 overriding도 가능 ex)toString()

---

## class 클래스

- class가 구현된 언어 구현사항 detail
  - introduced in ES6 : js에 도입된지 얼마 안됨, ES6에 도입, class가 도입되기 전에는 class를 정의하지 않고 바로 object를 만들 수 있었다. 그리고 object를 만들 때 function을 이용해 template을 만드는 방법이 있었다.
  - syntactical sugar(문법상으로 가짜로 편리함을 제공하는) over prototype-based inheritance : 기존에 존재하는 js 위에 추가된 개념이여서 완전히 새롭게 완벽하게 추가된 것이 아니라 기존에 존재하던 prototype을 base로 한 것에 기반해서 그 위에 간편하게 쓸 수 있도록 문법만 class가 추가된 것이다.
  - 언어가 어떻게 그렇게 만들어졌는 지 class가 어떻게 추가되어졌는지 조금 더 자세히 이해하려면 prototype을 살펴볼 필요가 있다.
- class는 관련있는 함수나 변수들을 한 곳에 묶어놓는 컨테이너 같은 것이다. fields(data, 속성)과 methods가 종합적으로 묶여있는 곳을 뜻함.

- data class : 간혹 class 안에 method는 들어있지 않고 fields만 들어있는 경우. 많이 사용됨
- encapsulation(캡슐화) : class 안에서도 내부적으로 보여지는 변수와 밖에서 보일 수 있는 변수를 나눈 것
- **template** : class는 붕어빵을 만들 수 있는 틀과 같다. 그래서 청사진 혹은 template이라 불리기도 한다.
- declare once : class에는 어떤 데이터가 들어갈 수 있는지만 정의만 해놓고 한번만 선언한다.
- no data in : class 자체에는 data가 들어있지 않고 틀 template만 정의해놓는 것이다. class는 정의만 해놓은 것이기에 실제로 메모리에 올라가진 않는다.
-

### class 선언

```js
class name {
  constructor(data1, data2) {
    // fields 속성
    this.field1 = data1;
    this.field2 = data2;
  }

  // methods 행동
  function() {}
}
```

- fields : constructor을 이용해서 object 만들 때 필요한 data를 전달함 -> 전달받은 data를 해당 class에 존재하는 fields에 this.field = data 이용해서 전달된 data를 바로 해줌
- methods

### getter and setters

- class를 사용자가 혹은 작성하는 사람이 바보같이 잘못 사용도 방어적인 자세를 만들 수 있도록 해주는 것들

#### getter

: get 키워드 사용하여 값을 리턴(getter 호출)

```js
get fieldName(){
    return this.aboutField;
}
```

#### setter

: set 키워드 사용하여 값 설정(setter 호출), set은 값을 설정하기 때문에 값(value)을 받아와야 함

```js
set fieldName(value){
    this.aboutField = value;
}
```

- call stack 초과 에러 방지
  - call stack 초과 에러
    - 1. getter 정의하는 순간, 앞서 작성한 this.fieldName = data1;에서 this.fieldName은 메모리를 읽어오는 것이 아니라 바로 getter을 호출하게 된다.
    - 2. setter을 정의하는 순간 this.fieldName = data1; 에서 = data1; 호출시(값을 할당할 때) 바로 메모리에 값을 할당하는 것이 아니라 해당 setter을 호출하게 된다. 즉 setter 안에서 전달된 value를 this.fieldName에 할당할 때 메모리 값을 업데이트 하는 것이 아니라 이 setter을 다시 호출하게 된다. 그래서 setter을 무한 반복 호출이 되면서 call stack 초과 에러가 뜨게 된다.
  - 방지하기 위해서는 getter와 setter에서 쓰여지는 변수이름을 조금 다른 이름으로 변경해줘야 한다. 그래서 해당 class는 앞서 정의된 field들과 getter와 setter로 다시 정의된 field로 구성된다.
- getter와 setter도 다시 정의된 field와 다른 원래 field이름으로 호출할 수 있고 그 field에 값을 할당할 수 있는 것은 내부적으로 gettter와 setter을 이용하기 때문이다.

### Fields(public, private)

- 너무 최근에 추가
  - js개발자들이 많이 사용하지 않음
  - 사파리나 최신 브라우저에서도 지원하지 않음, 그래서 쓰려면 babel 이용해야 함
- constructor 생성자를 사용하지 않고 field를 정의할 수 있다.
- Public : 그냥 field1 = data1;로 정의, 외부에서 접근할 수 있다.
- Private : #field1 = data1; 정의, class 내부에서는 값이 보여지고 접근이 되며 값이 변경이 가능하지만 class 외부에서는 이 값을 읽을 수도 변경할 수도 없다.(외부에서 호출시 undefined라 출력됨)

### Static

- 아직 쓰기엔 무리가 있다. 이런 것이 있다고만 알기
- static 키워드 사용 : class 안에 있는 fields와 object들은 새로운 object를 만들 때마다 고대로 복제되어서 값만 지정한 값으로 변경되어 만들어진다. 간혹 object와 상관없이 그리고 data에 상관없이 class가 가지고 있는 고유한 값과 이런 data의 상관없이 동일하게 반복되어 사용되어지는 method가 있을 수 있다. 그런 것들을 static 키워드를 사용해서 붙이면 object에 상관없이 class 자체에 연결되어 있다.
- object에 할당되는 것이 아닌 class 자체에 붙어있는 개념
- static 키워드로 생성한 field나 method는 className.staticField or className.staticMethod 형식으로만 외부에서 호출할 수 있다.
- typescript에서의 사용 : object에 상관없이(들어오는 데이터에 상관없이) 공통적으로 class에서 쓸 수 있는 경우 static field와 static method를 이용해서 사용하는 것이 메모리의 사용을 줄여줄 수 있음
