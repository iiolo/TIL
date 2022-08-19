# Object

- https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Object
- 어떤 데이터가 들어갈 수 있는지 정의를 하고 선언된 틀인 class를 이용해서 실제로 데이터를 넣어서 만드는 것이 object이다.
- **instance of a class** : class를 이용해서 새로운 instance 생성시 object가 됨
- created many times : object는 class를 이용해서 굉장히 많이 만들 수 있다.
- data in : class에 실제로 데이터를 넣으면 object가 되어 메모리에 올라가게 됨
- 붕어빵 틀인 class에 팥이라는 data를 넣으면 팥붕어빵이 되고, cream data를 넣으면 크림붕어빵이 됨. 그렇게 만들어진 붕어빵 자체는 object이고 붕어빵을 만들기 위한 틀은 class가 된다.
- 새로운 object를 만들 때는 new 키워드 사용 : new objectName(constructor에 전달할 data)
- objectName.fieldName, objectName.methodName() 으로 field와 method 호출 가능
- this = 생성된 object

## object란?

- one of the Javascript's data types
  - primitive type은 변수 하나당 값을 하나만 담을 수 있다. 이들을 parameter로 전달하게되었을 때 만약에 parameter가 많아 지게 되면 추가해야 되는 것들이 굉장히 많아져 관리하기도 힘들고 logical하게 그룹으로 묶어서 생각할 수 없어 힘들다. 그래서 이것을 개선하기 위하여 object를 사용한다.
- a collection of related data and/or functionality
- Nearly all objects in Javascript are instances of Object
- object = { key: value}
  - object는 key와 value의 집합체이다.
  - object는 key(우리가 접근할 수 있는 변수인 property)와 value(그 property가 가지고 있는 값) 이렇게 두가지로 나뉘어진다.

## 1. Literals and properties

- 만드는 방법
- {} 이용('object literal' syntax)
  - js에서는 class가 없어도 {} 이용해서 바로 object를 생성할 수 있음
  - 변수 선언 = {};
- class template인 new 키워드 이용('object constructor' syntax)

  - 변수 선언 = new Object();

- With Javascript magic(dynamically typed language)
  - js는 dynamically typed language으로 동적으로 type이 runtime(프로그램이 동작하고 있을 때)될 때 결정되는 언어이다. 이러한 특성들로 생겨난 기능들이다.
  - can add properties later
    - objectName.추가하고픈 property의 key = value;
    - 정의된 후에 object에 property를 추가 가능, 이미 object에 property가 정의된 상태여도 그 뒤에 property 추가가 가능하다.
    - 이것은 다른 언어에서 흔한 일은 아니다. 이렇게 동적으로 코딩하게 되면 금방 하기에는 좋지만 나중에 유지보수가 어려워지며 생각치도 못한 에러가 발생할 수도 있기 때문에 추천하는 방법은 아니다.
  - can delete properties later
    - delete objectName.삭제하고픈 property의 key;
    - 후에 property 삭제 가능

## 2. Computed properties

- object['key']
- 계산된 properties로 배열에서 data를 받아오는 것과 비슷한 방식
- key should be always string : property를 받아올 때 string type으로 지정해서 받아와야 한다.
- object 안의 data에 접근할 때 방법
  - .을 이용
    - 코딩하는 그 순간 그 key에 해당하는 것을 받아오고 싶을 때 .을 사용
    - 출력하는 경우
  - Computed properties 사용
    - 정확하게 어떤 key가 필요한지 모를 때 즉, runtime에서 결정될 때 Computed properties 사용
    - 동적으로 key의 value를 받아와야 하는 경우 유용하다. : 실시간으로 원하는 key의 값을 알고 싶을 경우 ex) 언제 어떤 key를 받을지 모르는 경우로 사용자에게 input을 받아서 출력해야 하는 함수라면 코딩하는 시점에는 어떤 것을 받을 지 모르므로 computed properties 사용
- computed properties를 이용해서 Javascript magic 가능
  - can add properties later : objectName['추가하고픈 property의 key'] = value;
  - can delete properties later : delete objectName['삭제하고픈 property의 key'];

## 3. Property value shorthand

- key와 value의 이름이 동일하다면 생략 가능

## 4. Constructor function

- object를 필요할 때 일일히 만들게 될 경우 불가피하게 동일한 key와 value들을 반복해서 작성해야 하는 문제점 해결 가능
- 다른 계산을 하지 않고 순수하게 object만 생성하는 함수일 경우 보통 대문자로 시작하는 이름으로 생성
- 함수 작성
  ```js
  function 함수이름(value1, value2) {
    //  this에다가 property를 넣고(this = {};) 결국 this를 return하는 함수(return this;)
    this.key1 = value1;
    this.key2 = value2;
  }
  ```
  - 작성된 함수를 통한 object 생성
    ```js
    const 변수이름 = new 함수이름(value1, value2);
    ```

## 5. in operator

- property existence check(key in object) : 해당하는 object 안에 key가 있는지 없는지 확인해주는 기능
- 'key' in object

## 6. for..in vs for..of

- 프로젝트 할 때 유용하게 쓸 수 있는 기능
- for..in
  - for(key in objectName)
  - 모든 key 들을 받아와 사용하고 싶을 때 이용
  - 해당 object가 갖고있는 key 들이 {} 을 돌 때마다 key들이 지역변수에 할당되어짐
    ```js
    for (key in laura) {
      console.log(key); //laura 안 모든 key들이 출력됨
    }
    ```
- for..of
  - for(value of iterable)
  - for..of는 object를 쓰는 것이 아니라 array, list와 같이 순차적으로 iterable한 것들을 쓴다.
  - iterable한 것들의 모든 값들이 value에 할당되면서 순차적으로 값을 출력하거나 계산할 수 있다.
    ```js
    const array = [1, 2, 3, 4];
    for (value of array) {
      console.log(value); // array의 모든 값들이 value에 할당되면서 값을 출력
    }
    ```

## 7. Cloning

- object를 복사할 수 있는 방법
- 텅텅 비어져 있는 obj을 먼저 만든 후 Object.assign(dest, [obj1, obj2, obj3...]) 활용
- Object.assign(dest, [obj1, obj2, obj3...])
  - Object
    - Object에 있는 assign 사용
    - Object는 js에 기본적으로 내장되어 있는 object 중 하나이며 js에 있는 object는 Object를 상속한다.
  - assign
    - assign<T, U>(target: T, source: U): T & U; => 복사하고자하는 target과 복사하려하는 source를 같이 전달해줘야 하며 return 값은 target과 복사하고자 하는 것이 통합된 것이 return 된다. 또한 source는 여러개 전달이 가능하다.(source 끼리 동일한 property가 있을 시 뒤에 나온 source의 object 값이 덮어씌우게 됨 이 점 유의)
    - assign(target: object, ...sources: any[]): any; => 배열도 전달 가능

```js
// example 1
const user4 = {};
Object.assign(user4, user); //(텅 빈 obj, 복사하고자 하는 obj)

// example 2
const user4 = Object.assign({}, user);
```

## 추천 사이트

- Javascript MDN Reference : https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference
  - js 내부에 포함되어 있는 object는 어떤 것들이 있는지 카테고리로 묶어져 있는 object들을 통해 살펴볼 수 있다.
