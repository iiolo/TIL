# ES6(2015)

## Shorthand property names

-   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Object_initializer
-   js에서 object는 항상 key와 value로 이루어져 있는데 key와 value의 이름이 동일한 경우 하나로 축약해서 작성 가능
    ex) name : name -> name

---

## Destructuring assignment

-   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment

### object

-   {} 이용
-   const { key1, key2 } = object
-   js에서 object의 key와 value의 접근하기 위해서는 object이름.key 이런 식으로 복잡하게 작성했어야 했는데 destructuring assignment 이용하는 경우 object의 key의 이름을 {} 안에 정의해주고 =과 함께 object의 이름 명시하면 해당 object의 key와 value들이 각각 {} 안 key이름에 맞게 할당이 된다.
-   object 내 정의된 key의 이름을 동일하게 {} 안에 작성해서 선언해줘야 함
-   다른 이름으로 새롭게 선언하고 싶을 경우
    const {orginalKeyName : 원하는 이름} = object 작성 후 콘솔에 출력할 때도 원하는 이름으로 출력할 수 있다.
-   object 뿐만 아니라 array에서 쓸 수 있다.

### array

-   [] 이용
-   const [ data1Name, data2Name ] = array
-   배열의 data에 각각 접근하기 위해서는 array이름[index]으로 작성하였어야 했다
-   data가 배열에 들어있는 순서에 맞게 [] 안에 이름 지정하면 순서에 맞게 각각 data가 해당 이름에 할당됨

---

## Spread Syntax(...)

-   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Spread_syntax

### array

-   [] 이용
-   [...arrayName]
-   배열 안 아이템들을 하나하나 복사해오려면 map이나 forEach 같은 배열 함수를 사용할 수도 있지만 spread syntax를 이용하면 더 간단하게 배열을 복사해 올 수 있다.
-   ...은 array에 들어있는 아이템들 하나하나씩을 각각 낱개로 가져와서 복사해오는 것을 말한다.
-   [...arrayName, item1] : 배열을 복사해오면서 아이템을 추가하고 싶을 경우 spread syntax작성 후 ,로 구분하여 추가하고 싶은 item을 작성해주면 된다.
-   array concatenation
    -   [...array1, ...array2]
    -   두가지 이상의 배열들 합치기

### object

-   {} 이용
-   {...objName}
-   ...을 이용하여 object 내의 key와 value의 값을 복사해올 수 있다.
-   object merge
    -   {...obj1, ...obj2}
    -   두가지 이상의 object들 합치기
    -   key가 동일한 object 병합시 제일 뒤에 오는 object가 앞에 오는 object 값을 덮어씌우게 됨

### 주의해야 하는 object 특성

-   object를 가리키고 있는 변수는 실제로 해당 object를 담고있는 것이 아니라 object가 들어있는 메모리의 주소의 값(reference)을 가지고 있다.
-   배열 안에 object를 가리키는 변수가 들어있는 경우 spread로 해당 배열을 복사해올 때 object의 reference만 복사해오기 때문에 동일한 object를 가리키게 된다.
-   object의 key나 value 값을 변경하게 된다면 해당 object를 가진 array는 다 값이 변경이 된다.
-   중요! : spread 연산자는 object가 가리키고 있는 주소의 참조값(reference)만 복사해와서 원래의 object를 변경하게 되면 전부 다 영향이 갈 수 있기 때문에 이점을 꼭 유의해야 함

---

## Default Parameters

-   https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/Default_parameters
-   function name(parameter = default parameter){

}

-   인자 다음에 = 로 기본적으로 원하는 초기값(Default Parameter)을 지정해 둠으로써 인자가 전달될 때는 인자의 값을, 인자가 전달되지 않는다면 기본적으로 설정된 해당 초기값(Default Parameter)을 이용하게 된다.

---

## Ternary Operator

-   https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator
-   조건 ? 조건 true일때 실행문 : false일때 실행문;

---

## Template Literals

-   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Template_literals
-   \` ` 안에서 ${값}을 활용하여 값과 문자열을 합친 하나의 문자열을 생성할 수 있다.
-   \+ 을 이용하는 것보다 더욱 간편하게 작성할 수 있고 가독성이 더 좋아 template literals를 사용하는 것을 추천한다.

---

# ES11(2020)

## Optional chaining(?.)

-   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Optional_chaining
-   코드가 반복적으로 중복되는 것을 막을 수 있다.
-   kotlin과 swift 같은 최신 언어에도 포함되어 있는 기능
-   ?.을 이용하여 .뒤에 오는 해당 key를 찾을 수 없다면 undefined를 반환한다.
-   예제

    ```js
    const person1 = {
        name: 'Laura',
        job: {
            title: 'S/W Engineer',
            manager: {
                name: 'Bob',
            },
        },
    };

    const person2 = {
        name: 'Bob',
    };

    function printManager(person) {
        /** 동일한 코드
             *    person.job 
                    ? person.job.manager 
                        ? person.job.manager.name 
                        : undefined 
                    : undefined
            */
        // person에 job이 있으면 manager가 있으면 name을 출력
        console.log(person.job?.manager?.name);
    }

    printManager(person1); //Bob
    printManager(person2); //undefined
    ```

## Nullish Coalescing Operator(??)

-   https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Nullish_coalescing_operator
-   OR 연산자나 AND 연산자 활용시 false의 특징을 알아놓을 필요가 있다.
    -   false : false, '', 0, -0, undefined, null
    -   OR
    -   || 기준 앞에 있는 값이 false일 때만 뒤의 것이 실행
    -   많은 개발자들이 특정한 값이 null 이라면 혹은 정해져있지 않다면(undefined) 기본 값을 할당하도록 OR 연산자를 많이 이용했다.
    -   문제점 : undefined 일 경우에만 기본 값을 할당하고 싶은 데 false 일 때마다 다 기본값이 할당되는 참사를 가져와 버그들로 고생할 수 있다.
-   OR 연산자보다 좀 더 명확한 코딩을 위해서 사용
-   ?? 기준 앞의 변수에 값이 있다면 해당 변수의 값을 쓰고 없다면 ?? 기준 뒤의 값을 사용
