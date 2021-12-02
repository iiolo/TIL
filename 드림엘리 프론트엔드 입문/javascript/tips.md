## console

- node js에서도 실행 가능하고 web api인 console api에서도 실행 가능
- 많이 쓰이는 문법이라 거의 web api 뿐만아니라 프레임워크 등에서도 다 실행가능

## Devtool

- console
  - js 작성해서 실행 가능
  - 간단한 js기능 구현 가능
- source
  - 디버깅시 유용
  - 작성한 코드 확인 가능
  - break point 를 걸어서 디버깅할 때도 유용하게 쓰임
- network
  - network가 어떻게 발생하는지, 얼마나 많은 사이즈들의 데이터가 오고가는지 검사 가능
- performance 분석, memory 분석 등 굉장히 다양한 것들을 볼 수 있다.

## 'use strict';

- js를 strict 모드로 개발하기 위한 것
- 순수 vanilla js 작성시 js 최상단에 'use strict'; 정의해주면 좋다
  - 이유
    - brenden이 js 언어 만들 때 굉장히 빨리 만들어야 했어서 js는 굉장히 유연한 언어로 만들어 졌다.
    - 유연한 것은 때로는 위험하다는 것과 같다(flexible === dangerous). 유연하다는 것은 개발자가 많은 실수를 할 수 있다는 말이다.
    - JS에서는 선언되지 않은 변수에 값을 할당한다던지, 기존에 존재하는 prototype을 변경한다는 지 등의 비상식적인 것들은 다른 언어를 공부한 개발자들이 봤을 땐 약간 미친듯한 그런 행동들인데 다행히 'use strict';은 ECMAScript에 포함되어 있다. 그래서 'use strict'; 선언시 더이상 그러한 비상식적인 행동을 하지 않게 방지할 수 있다.
- typescript 사용시 선언하지 않아도 됨
- 'use strict'; 선언하지 않고 선언되지 않는 변수에 값 할당시 브라우저 상 문제가 없다. 하지만 'use strict'; 선언시 에러 발생하게 되어 상식적인 범위 안에서 js 이용할 수 있게 됨
- 'use strict'; 선언시 js engine이 좀 더 효율적으로 빠르게 js을 분석할 수 있어 실행하는 데 있어 조금 더 나은 성능 개선 까지 기대할 수 있다.

## Javascript 공식 사이트

- ecma-international.org : 문법에 관해 잘 정의되어 있으나 개발자가 보기 불편
- https://developer.mozilla.org/ko/ : 개발자들이 많이 사용하는 공식사이트, 여기서 공부하는 것을 추천
- https://www.w3schools.com/ : 공식사이트는 아니여서 mdn과 둘이 비교시 mdn이 훨씬 더 설명이 많고 최신 정보도 빨리 올라옴
