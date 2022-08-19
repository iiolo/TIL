# JS 프로처럼 쓰는 팁

## tenary-operator 삼항 연산자

- 조건 ? true일시 return 값 : false일시 return값;

### 사용하는 경우

- 조건이 두가지인 경우 불필요한 else if 문 사용 자제
- 바로 리턴하는 경우

---

## nullish coalescing operator

- 함수안에서 변수 선언 = 함수 선언시 설정한 인자 값이 호출할 때 있는 경우 return 값 ?? 함수 선언시 설정한 인자 값이 호출할 때 없는 경우 return 값;
- left Expression ?? right Expression
  - value만 넣을 수 있는 것이 아닌 코드를 넣어 실행한 값을 할당하게 할 수도 있다.
- ?? 기준으로 왼쪽코드가 null이거나 undefined인 경우에만 ?? 오른쪽에 이어지는 문장이 실행됨(default parameter와 다른 점)
- Logical OR operator과 차이점을 명확히 이해하고 사용하기(nullish coalescing의 경우 null이나 undefined만 해당)

```js
function printMessage(text) {
  const message = text ?? 'Nothing to display';
  console.log(message);
}
```

---

## default parameter

```js
function printMessage(text = 'Nothing to display' /*default parameter*/) {
  console.log(text);
}
```

- undefined 경우에만 default 값이 자동으로 할당되고 null로 명확하게 지정되거나 값이 있는 경우 default parameter은 해당하지 않는다.
  - 그래서 default parameter는 undefined일 경우에만 해당

---

## Logical OR operator

- || 기준으로 왼쪽 코드가 falsy(거짓)한 경우에만 오른쪽 코드가 실행됨
- falsy : undefinged, null, false, 0, -0, NaN(Not a Number), 빈 문자열(" ", ' ', \` `)

---

## object destructuring

- object이름.object안의 key이름으로 반복해서 불러오는 것을 방지할 수 있음
- const {object 안의 key들} = object 이름

---

## Spread Syntax(...)

### object

- object를 직접적으로 수정하는 것은 옳지 않다.
- object와 object를 결합한 새로운 object 생성 방법
  - 변수 선언 = Object.assign(object1, object2); //예전 문법
  - 변수 선언 = { ...object1, ...object2} // 최신 문법
    - spread syntax(...)를 이용해서 object1에 있는 모든 key와 value를 하나 하나씩 가져오고 object2에 있는 key와 value들도 하나하나씩 가져와서 모두 다 가져 올 수 있다.
    - spread syntax(...) 사용해서 결합할 경우 만약 object2의 특정 key 값을 덮어 씌우고 싶다면 그 뒤에 ,로 구분하여 특정 key : 값 으로 그 특정 key 값만 업데이트 할 수 있다

### array

- 배열의 제일 뒤에 값을 추가하는 경우
  - 새로운 배열을 만들고 싶을 경우 : [...배열이름, 배열에 추가할 값];
  - 기존 배열의 값을 수정하는 경우 : 배열이름.push(추가할 값);
- 배열의 제일 앞에 값을 추가하는 경우
  - 새로운 배열을 만들고 싶을 경우 : [배열에 추가할 값, ...기존배열이름];
  - 기존 배열의 값을 수정하는 경우 : 배열이름.unshift(추가할 값);
- 배열들을 결합하고 싶은 경우
  - 새로운 배열을 만들고 싶을 경우 : [...배열1이름, ...배열2이름];
    - 중간에 다른 아이템 추가하고 싶을 경우 : [...배열1이름, 추가할 값, ...배열2이름];
  - 기존 배열의 값을 수정하는 경우 : 배열1이름.concat(배열2이름)

## Optional Chaining

- 값이 있을 수도 없을 수도 있는 경우 그 데이터 안에 있는 값을 표현 할 때 &&(and연산자)를 사용하는 것보다 optional chaining을 이용하는 것이 좋다
- object1.object2 ? .key는 object1 안에 object2가 있다면 그 object2 안에 ? 뒤에 작성된 해당 key가 있는지 없는지 확인한다.
  - false인 경우
    - object1 안에 object2가 없는 경우
    - object2이 있지만 object2 안에 해당 key가 없는 경우
- nullish coalescing operator 함께 사용 가능

## Template Literals

- \`문자열 ${object이름.key이름}`
  - object destructuring 사용시 \`문자열 ${object의 key이름}`
- object에 있는 data 들을 활용해 문자열과 함께 문장으로 만들경우 + 연산자를 활용해 계속적으로 연결하기 보다는 template literals를 활용하는 것이 좋다.
- 한문장 안에서 필요한 data에 접근 가능해짐

## Array

- 중복을 허용하는 자료 구조
- 중복되는 값들을 제거해 다시 배열로 만들고 싶다면 중복을 허용하지 않는 Set(똑같은 값이 있으면 덮어씌워서 제거하는 형태)과 spread 연산자 활용(각각 하나하나 낱개로 품)
  - [...new Set(배열이름)]

### 배열 함수

- 배열 안에서 조건에 해당하는 것들만 추출 : 배열이름.filter(변수 => 변수 조건);
- 기존의 값을 변수조건에 맞게 하나하나 변경해 mapping : 배열이름.map(변수 => 변수 조건);
- 배열 안 값들 더해서 총합 구함 : 배열이름.reduce((변수1, 변수2)=>변수1+변수2, 초기값);

```js
const result = items
  .filter((num) => num % 2 === 0)
  .map((num) => num * 4)
  .reduce((a, b) => a + b, 0);
consol.log(result);

// 위와 동일 코드(복잡한 버전)
const evens = items.filter((num) => num % 2 === 0);
const multiple = evens.map((num) => num * 4);
const sum = mulitple.reduce((a, b) => a + b, 0);
console.log(sum);
```

## async

- Promise -> Async/await
- Promise를 계속해서 중첩해서 사용하는 경우 then을 중첩적으로 사용하게 되어 코드가 복잡해질 수 있다.
- 두가지 이상의 promise를 연결해서 사용해야 한다면 async와 await을 이용하면 좀 더 깔끔하고 순차적으로 확인할 수 있어 가독성을 높이고 이해력도 높일 수 있다.

```js
async function displayUser() {
  const user = await fetchUser(); //user를 어디서부터 fetch를 해옴
  const profile = await fetchProfile(user); // fetch해온 user를 이용해서 profile을 가져옴
  updateUI(user, profile); // 앞서 가져온 정보를 통해 UI 업데이트
}

// 위와 동일 코드(복잡한 버전)
function displayUser() {
  fetchUser().then((user) => {
    fetchProfile(user).then((profile) => {
      undateUI(user, profile);
    });
  });
}
```
