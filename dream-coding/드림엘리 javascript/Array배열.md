# Array 배열

## 자료 구조란?

- 일상생활에서 비슷한 것들만 모아서 각 바구니에 모아놓는 것처럼 프로그래밍 언어에서도 비슷한 종류의 데이터들을 묶어서 한 곳에다가 보관해놓는 것들을 **자료구조**라고 한다.
- 자료구조에는 어떤 방식으로, 어떤 형식으로 데이터를 담느냐에 따라서 굉장히 다양한 타입들이 있다.
- object와 자료구조의 차이점
  - object는 서로 연관된 특징과 또는 행동들을 묶어놓는 것을 말한다.
  - 자료구조는 비슷한 type의 objec들을 묶어놓는 것을 말한다.
- js가 아닌 다른 언어에서는 보통 자료구조에는 동일한 type의 object를 담을 수만 있다. 즉 type이 있는 언어에서는 동일한 type의 데이터만 담을 수 있다.
- js는 dynamically typed language이기에 type이 동적으로 정의가 된다. 그래서 type이 없어 한 바구니 안에 다양한 종류의 데이터를 담을 수 있다(가능하지만 추천x)
- 자료구조와 알고리즘 : 물건을 한 데 담아놓은 자료구조 중에서도 즉, array, map, set, list 중에서도 single linked list냐, double linked list냐 이런 것들 중에서도 새로운 자료구조에 **삽입**할 때 얼마나 효율적으로 삽입할 수 있는지, **삭제**할 때도, **검색**할 때도, **정렬**할 때도 어떤 알고리즘을 써서 할 수 있는지 이런 효율성을 같이 공부하면 좋을 것이다. 나중에 프로그래머스나 인터뷰 문제에서도 종종 등장한다.

## 개념

- 배열은 칸칸히 촘촘히 모여있는 자료구조를 말한다.
- 중요! : Index
  - 칸마다 0부터 시작하는 index가 지정되어 있다.(프로그래밍 언어에서 index는 0부터 시작)
  - 삽입과 삭제를 index를 이용해 할 수 있다.
  - 배열을 공부할 때는 배열이 index을 기준으로 data가 저장되기 때문에 index를 활용해서 어떻게 data를 검색하고 삽입, 삭제하는지 정확하게 아는 것이 중요하다
- 칸의 수 = 배열의 사이즈
- 한 배열 안에는 동일한 data를 넣는 것이 중요

## 1. Array declaration 배열 선언

- new 키워드 사용
  - 변수 선언 = new Array();
- [] 활용(많이 쓰이는 방식)
  - 변수 선언 = [data1, data2]

## 2. Index position

- index를 통한 배열 접근 방법
- 배열이름[indexNumber]
  - 배열에서 []을 이용해서 index 별로 data를 출력할 수 있다
  - objectName['key']와 비슷하다. object에서 string으로 key이름을 작성하면 그에 해당하는 value들을 가져올 수 있었다. 그것처럼 배열의 경우 숫자 즉 index를 전달하게 되면 index에 해당하는 value들을 받아올 수 있다.
  - 배열의 첫번째 아이템을 찾을 때는 0
  - 배열이름[배열이름.length - 1] : 배열의 젤 마지막 아이템을 찾을 경우 배열의 length-1을 해서 접근한다. 배열은 index가 0부터 시작하기 때문에 총 길이에 -1을 하면 젤 마지막 index를 받아올 수 있기 때문이다.

## 3. Looping

- 배열 안에 들어있는 전체적인 data를 한번씩 돌아가면서 출력
- 방법
  - for
    ```js
    for (let i = 0; i < arrayName.length; i++) {
      console.log(arrayName[i]);
    }
    ```
  - for of
    ```js
    for (let item of arrayName) {
      console.log(item);
    }
    ```
  - forEach
    ```js
    arrayName.forEach();
    ```
    - 배열 안에 들어 있는 value들마다 자신이 전달한 함수(callbackfn)를 출력
    - 배열에 있는 forEach라는 api를 이용
    - 바로 callback함수를 받아옴
    - forEach(callbackfn: (value: T, index: number, array: T[]) => void, thisArg?: any): void;
      - forEach는 어떤 걸 수행하는 함수인데 배열에 들어있는 각각의 element에 정해진 action을 수행하는 함수이다. 즉 배열 안에 들어있는 값마다 전달한 action인 callback 함수를 수행한다
      - 전달한 callback 함수를 value 하나하나마다 호출해줌
      - 뒤에 ? 붙어있는 것은 parameter을 전달해도 되고 안해도 되는 것
      - callback 함수에는 총 세가지의 parameter 들어옴 : 첫번째로는 callback 함수를 호출하는 value(배열에 있는 값), 두번째로는 그 value가 들어있는 index, 마지막으로는 전체적인 array 즉, 배열을 전달 받을 수 있음(array는 보통 받아오지 않음)

## 4. Array API

### shift/unshift 와 pop/push

- 중요! : shift와 unshift는 pop과 push보다 많이 느리다.
- 배열에 item들이 들어있을 때 뒤에서부터 넣고 빼는 것은 빈 공간에 data를 넣었다가 지웠다가 하기 때문에 기존에 들어있던 data들은 움직이지 않아도 되어 한 공간에 index를 이용해서 넣고 빼고가 되기 때문에 빠른 operation(기능)을 진행할 수 있지만 - 반대로 앞에서 data를 넣게 되려면 기존에 있던 data들을 뒤로 옮겨놓고 넣을 data 공간을 만든 후 새로운 data를 집어 넣어야 한다. 앞에서 data를 삭제할 경우에는 data를 지운 후 남은 data들을 차례대로 앞으로 땡겨와 기존 data가 위치했던 공간을 채워야한다. 배열의 길이가 길수록 shift(당겨오다, 움직이다) 동작을 반복하게 되어 shift와 unshift를 사용하기 보다는 pop과 push를 사용하는 것이 좋다.
- 제일 뒤에서 item을 접근하는 것은 정말 빠르고 중간에 item을 넣다 빼는 것도 index를 활용하기에 빠르다. 하지만 배열의 전체 data가 움직여야(shift, unshift) 하는 operation 같은 경우 느릴 수 밖에 없다. 또한 배열의 길이가 길수록 전체적으로 움직여야 하는 것이 많아져 더 느려진다.
- Big O나 알고리즘 관련된 정렬 같은 것들도 참고하면 좋다.

### Add

- push
  - arrayName.push(data1, data2...);
  - add an item to the end : 어떤 value(item)들을 배열의 제일 뒤에서부터 추가
- unshift
  - arrayName.unshift();
  - add an item to the beginning : 어떤 value(item)들을 배열의 제일 앞에서부터 추가

### Delete

- pop
  - arrayName.pop();
  - remove an item from the end : 배열에서 제일 뒤에서부터 하나씩 item 지워줌
  - 변수에 할당시 지워지는 item들이0 return된다.
- shift
  - arrayName.shift();
  - remove an item from the beginning : 배열에서 제일 앞에서부터 하나씩 item 지워줌
- splice
  - 꼬아서 이어주다
  - arrayName.splice(시작하는 index 번호, 지울 개수, 추가하고픈 data1, data2...);
  - remove an item by index position : item을 지정된 position에서 삭제
  - 시작하는 index 번호 지정 후 지울 개수는 지정해도 되고 안해도 됨. 안할 경우 지정한 index부터 모든 data들을 지워버림
  - 추가하고픈 data1, data2..는 지워진 그 자리에 추가됨

### Copy

- concat
  - array1.concat(array2) : array1 배열 뒤에 array2 배열 추가해서 붙임
  - combine two arrays : 두가지 배열 묶어서 만들 수 있다.
  - concat(...items: ConcatArray<T>[]): T[];
    - concat을 호출하는 배열 + 새로 전달될 items라는 배열을 합해서 새로운 배열을 return

### Searching

- 검사, 검색할 수 있는 APIs

- indexOf
  - arrayName.indexOf(data)
  - find the index : 배열 안의 해당 값이 몇번째 index에 있는지 알고 싶을 때 유용
  - 배열 안에 해당 값이 없을 경우 -1 출력
  - 배열 내 똑같은 data가 2개 이상 존재하는 경우 제일 첫번째로 만나는 해당 값의 index를 출력
- includes
  - arrayName.includes(data)
  - 배열에 해당 값이 있는지 없는지 true or false를 return
- lastIndexOf
  - 배열 내 똑같은 data가 2개 이상 존재하는 경우 제일 마지막으로 만나는 해당 값의 index를 출력
