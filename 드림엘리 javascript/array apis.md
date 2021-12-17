# Array APIs

## 1. join

- arrayName.join('seperator');
- join(separator?: string): string;
- 배열에 있는 모든 아이템들을 문자를 통해서 각각 구분자(seperator)를 넣어 더해서 seperator string으로 return
- ? 뜻은 전달해도 되고 안해도 된다는 뜻, 즉 seperator은 넣어도 되고 안넣어도 되는데 안넣게 되면 구분자는 ,로 들어가게 됨

## 2. split

- arrayName.split('seperator', limit);
- split(separator: string | RegExp, limit?: number): string[];
- seperator과 limit 총 두가지의 parameter을 받음
  - seperator
    - 필수 작성
    - string 또는 RepExp type으로 작성
  - limit
    - 선택적 작성(optional)이며 작성할 경우 number type으로 작성
    - return 받을 배열의 사이즈 설정
- 배열 안 string을 여러가지 문자열로 전달된 seperator을 통해 잘게 나눠줌

## 3. reverse

- arrayName.reverse();
- 배열 안 들어있는 아이템의 순서를 거꾸로 바꿔 줌
- 이 함수를 호출한 배열 자체도 순서가 변경됨 즉, 배열 자체를 변화시키고 return값도 변화된 배열 자체를 return한다.

## 4. splice

- arrayName.splice(시작하는 index 번호, 지울 개수, 추가하고픈 data1, data2...);
- remove an item by index position : item을 지정된 position에서 삭제
- 시작하는 index 번호 지정 후 지울 개수는 지정해도 되고 안해도 됨. 안할 경우 지정한 index부터 모든 data들을 지워버림
- 추가하고픈 data1, data2..는 지워진 그 자리에 추가됨
- 배열 자체에서 해당 숫자 인덱스에 해당하는 위치의 데이터의 범위가 삭제됨, 즉 해당 함수를 쓴 배열 자체 값도 변경됨

## 5. slice

- arrayName.splice(시작하는 index 번호, 끝나는 index 번호)
- slice(start?: number, end?: number): T[];
- parameter end는 exclusive하다 : 만약 0부터 2까지로 지정하게 되면 마지막 2는 배제가 되어서 index 0에서 1까지만 return
- splice 와 다른 점 : splice는 해당 함수를 사용한 배열 자체를 수정하는 함수이고, slice 같은 경우에는 해당 함수를 쓴 배열에는 영향을 주지 않고 그 배열에서 원하는 부분만 return해서 받아옴.
- 배열의 특정한 부분을 return하는 함수

## 6. find

- arrayName.find(predicate, thisArg?)
- find\<S extends T>(predicate: (this: void, value: T, index: number, obj: T[]) => value is S, thisArg?: any): S | undefined;
- predicate
  - callback 함수
  - 배열에 있는 모든 요소들 마다 호출되어짐
  - 호출되어지는 callback 함수가 true를 return 하면 바로 함수를 멈추고 true된 그 요소를 return한다.
  - this, value or item, index, object 네가지 인자가 전달됨
  - value is S : 값이 boolean type으로 return 되어야 함
- array 안에서 predicate 함수의 조건에 맞는 첫번째로 찾아진 요소를 return.
- 첫번째로 찾아진 요소는 predicate가 true인(전달된 callback함수가 true가 되면) 요소를 찾자마자 그 요소를 return, 만약 찾지못하면 undefined return

## 7. filter

- arrayName.filter(predicate, thisArg?)
- filter\<S extends T>(predicate: (value: T, index: number, array: T[]) => value is S, thisArg?: any): S[];
- predicate라는 callback함수를 전달해서 callback 함수가 true인 아이템들만 모아서 새로운 배열을 전달해주는 함수
- 원하는 것만 받아올 수 있다.

## 8. map

- arrayName.map(perdicate, thisArg?)
- map\<U>(callbackfn: (value: T, index: number, array: T[]) => U, thisArg?: any): U[];
- 배열 안에 들어있는 요소 한가지, 한가지를 다른 것으로 변환해 주는 것
  - 예를 들어서 [1,2,3] 배열에서 지정된 callback 함수를 호출하면서 각각의 1, 2, 3 이 세가지 요소들을 callback 함수를 거쳐서 다시 새로운 값을 변환하는 것을 뜻함. <br>즉, 전달한 callback 함수가 어떤 일을 하느냐에 따라서 1, 2, 3이 다른 값으로 mapping 되어서 만들어진다.
    <br> 주어진 callback 함수가 주어진 숫자\*2를 하는 함수라면 1, 2, 3의 값이 각각 2가 곱해져 mapping 되므로 2, 4, 6 으로 변환되어 return
- 배열 안에 들어있는 모든 요소들을 전달해준 callback함수로 호출하면서 callback 함수에서 가공되어진 return된 값들로 대체하여 새로운 배열을 만드는 함수
- 배열 안에 있는 요소들을 원하는 함수를 이용해서 다른 방식의 data를 만들고 싶을 때 유용

## 9. some

- arrayName.some(perdicate, thisArg?)
- some(predicate: (value: T, index: number, array: T[]) => unknown, thisArg?: any): boolean;
- callback 함수가 return이 true가 되는 item이 있는지 없는지 확인해줌
- callback 함수는 배열 안 모든 요소들 하나하나 다 수행이 되는데 callback 함수 값이 true가 되는 요소가 한개라도 있으면 some함수는 true을 return 한다.
- 배열 안에 callback 함수 조건에 하나라도 만족하는 요소 있을 시 true가 return
- 배열 중에 어떤 요소들이라도 하나 만족되는 것이 있는지 없는지 검사할 때는 some 이용

## 10. every

- arrayName.every(perdicate, thisArg?)
- every(predicate: (value: T, index: number, array: T[]) => unknown, thisArg?: any): boolean;
- 배열에 들어있는 모든 요소들이 callback 함수 조건을 충족해야지만 true을 return
- 모든 배열의 조건이 만족되어야 할 때는 every 사용

## 11. reduce

- reduce((prev, curr) = {}, initialVaule);
- reduce(callbackfn: (previousValue: T, currentValue: T, currentIndex: number, array: T[]) => T): T;
- reduce(callbackfn: (previousValue: T, currentValue: T, currentIndex: number, array: T[]) => T, initialValue: T): T;
- callback 함수만 전달하거나 initial value도 같이 전달할 수 있다.
- callbackfn
  - callback 함수는 배열 안에 들어있는 모든 요소들마다 호출이 된다.
  - previousValue
    - 이전 값
    - return한 값이 그다음에 호출될 때 previousValue로 전달됨, 즉 return 하는 값들이 previousValue로 순차적으로 전달됨
    - 이전에 callback 함수에서 return 되어진 값들이 전달됨
  - currentValue
    - 현재 값
    - 배열 하나하나의 요소가 순차적으로 currentValue에 전달됨
    - 배열의 item을 순차적으로 전달받음
  - 함수의 바디에서 return 값 입력해야 함
- initialValue : 시작 값, currentValue가 이 값부터 시작한 후 배열 안 모든 값들을 순차적으로 호출
- The return value of the callback function is the accumulated result
  - callback 함수에서 return되는 값은 함께 누적된 결과값을 return 한다.
  - 전달하는 callback 함수 안에서 return할 때는 어떤 값이 누적된 값을 전달해야 함
- 배열에 있는 모든 요소들의 값을 누적하는 즉, 무언가 함께 모아놓을 때 사용
- 원하는 시작점(initialValue)부터 배열 안 모든 값들을 돌면서 어떤 값을 누적할 때 사용하는 함수
- reduceRight : reduce를 배열의 제일 뒤에서부터 시작하는 함수

## 12. sort

- arrayName.sort((a, b) => a - b) // 오름차순 정렬
- arrayName.sort((a, b) = > b - a) // 내림차순 정렬
- sort(compareFn?: (a: T, b: T) => number): this;
- compareFn
  - callback 함수
  - a와 b 즉 이전 값과 현재 값이 전달 됨
- example) [11,2,22,1].sort((a, b) => a - b)
  - a-b의 결과가 negative value(-값, 음수)을 return 하게 되면 첫번째가 뒤에 것보다 작다고 간주되어져서 b의 앞에 정렬이 된다.

## 13. Add

- push
  - arrayName.push(data1, data2...);
  - add an item to the end : 어떤 value(item)들을 배열의 제일 뒤에서부터 추가
- unshift
  - arrayName.unshift();
  - add an item to the beginning : 어떤 value(item)들을 배열의 제일 앞에서부터 추가

### 14. Delete

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

### 15. concat

- array1.concat(array2) : array1 배열 뒤에 array2 배열 추가해서 붙임
- combine two arrays : 두가지 배열 묶어서 만들 수 있다.
- concat(...items: ConcatArray<T>[]): T[];
  - concat을 호출하는 배열 + 새로 전달될 items라는 배열을 합해서 새로운 배열을 return

### 16. Searching

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

## tip

- callback 함수의 parameter인 value의 이름 지정시 아무 의미 없는 이름을 짓게 되면 코드가 길어지게 되면 쉽게 이해하기 힘드므로 최대한 이해하기 쉽게 이름을 지정하는 것이 중요하다.
- 함수 작성시 한줄일경우 return 키워드 생략 가능
- api를 섞어서 사용 가능
