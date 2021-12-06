# Javascript 역사를 통한 개념 정리

## 역사

- 1993년 : 컴퓨터가 집집마다 없었던 시절에 생긴 컴퓨터를 모르는 사람도 쓸 수 있는 UI요소가 더해진 Mosaic Web Browser가 시장에 나옴
- 1994년

  - Mosaic Web Browser를 만든 개발자 Mac Andreessen이 Netscape을 창립하면서 조금 더 UI요소가 더해진 Netscape Navigator을 시장에 내놓음, 시장에서 80%의 점유율을 자랑하면서 급격히 성장한다, Mac Andreessen은 좀 더 다이나믹한 사이트를 만들기 위한 scripting언어를 추가하고 싶어 했다. scheme을 만든 개발자 Brendan Eich를 데려와 자바의 요소와 scheme을 융합한 언어를 10일만에 새로 만들고자 했다. 프로토타입을 베이스로 한 유연한 언어를 만들어냄
  - 9월 : 내부적으로는 mocha라고 불렸던 언어가 탄생, 추후 LiveScript으로 이름이 바뀌게 됨. Netscape Navigator 안에 LiveScript를 이해하고 실행할 수 있는 엔진 LiveScript interpreter이 포함되어 브라우저가 출시되게 됨. 즉, 웹 개발자들이 LiveScript 언어를 통해 웹을 만들게 됐을 때 Netscape Navigator 브라우저가 그언어를 이해하면서 그언어가 실행하고자 하는 것에 알맞게 그 DOM요소를 조작하는 것이 가능하게 됨

- 1995년
  - 그당시 인기가 많던 언어인 java의 이름을 따면서 추후 javascript로 이름을 변경하게 됨, 공식적으로 Netscape Navigator 브라우저 위에 javascript와 그 javascript를 이해할 수 있는 엔진(interpreter)이 포함되어서 출시하게 됨,
  - microsoft 사가 netscape 사의 javascript를 reverse engineering(만들어진 프로그램의 binary code를 분석해서 source code를 복원해내는 과정)해서 결국 netscape 사의 javascript와 그 엔진의 소스 코드를 고대로 복원해서 조그만 기능을 추가하면서 자신들만의 언어인척 Jscript라는 언어를 하나 만들게 된다.
  - microsoft 사가 internet explorer을 시장에 내놓음. 개발자 고통의 시발점이 되었다.
- 1966년
  - 11월 : netscape 사는 javascript를 ECMA International 단체와 함께 표준안을 만들기 시작
- 1997년
  - 7월 : ECMAScript 1 language specification 시장 발행, ECMAScript는 브라우저에서 동작하는 언어를 만들 때 그리고 그 언어를 이해할 수 있는 엔진을 이해하기 위해 변수는 이렇게 만들고, 함수는 이런식으로 정의해야 되고 등의 그런 문법적인 사항들을 잘 정리한 문서이다. 그 뒤에 1998(2), 1999(3), 2000(4) 쭉쭉 새로운 버전이 추가되었다. 특히 3버전에서는 새로운 error handling 방식에 관련된 문법과 three echo operator(관계연산자) 등이 새로 추가 했다. 4버전부터는 굉장히 많은 사람들이 다양한 아이디어를 제의해 들어오게 된다(operational annotation, class, Enterprise scale)
- 2000년
  - microsoft 사의 internet explorer 시장 점유율이 급격히 상승하게 된다.(95% 사용자) internet explorer는 자신이 표준이라면 더이상 ECMAScript 표준안에 참가하지 않겠다고 선언한다. 그래서 4버전부터 표준안 발행이 더뎌졌다.
- 2004년
  - mozilla 사에서 firefox 브라우저 출시, ECMA에 ActionScript3 언어와 그 언어를 이해할 수 있는 엔진인 Tamarin 을 가지고 다시 표준안을 검토해보자고 제의하지만 기존 Javascript와 Jscript와 너무 달라 이걸로 다시 표준안을 진행하기에는 무리가 있었다. 그래서 이 표준안을 두고 netscape, microsoft, firefox 삼사의 치열한 신경전을 벌이고 있었다. 그래서 개발자들은 시장에 존재하는 브라우저에서 잘 동작할 수 있도록 웹페이지를 만들어야 했기에 밤에 잠도 못자고 고생하면서 만들어야만 했다.
  - 그 후 웹 시장에서 굉장히 획기적인 일이 발생하게 된다. Jesse James Garrett이라는 사람이 비동기적으로 서버에서 데이터를 받아오고 처리할 수 있는 정말 획기적인 AJAX(Asynchronous Javascript And XML)을 만들어냄. 하지만 이 AJAX의 도입에도 ECMAScript4 표준안 발행을 앞두고 netscape, microsoft, firefox 삼사의 치열한 신경전이 벌어지고 있었다.
  - opera 등의 다양한 브라우저 탄생, 개발자들은 이러한 다양한 브라우저에서 작동하는 웹페이지를 구현해내야만 했다.
  - 웹시장이 증가하고 수요가 많아지면서 많은 개발자들이 웹시장으로 들어오게 됨, 많은 개발자들 사이에서 강력한 커뮤니티가 생겨난다. 그 커뮤니티에서 jQuery, dojo, mootools와 같은 라이브러리들이 많이 나오게 된다. 이 라이브러리들이 공통적으로 해결하고자 했던 문제점은 개발자들이 더이상 다른 브라우저의 구현사항을 신경쓰지 않아도 되게 만드는 것이었다. 다른 것은 신경쓰지 않아도 라이브러리가 제공하는 API만 사용해서 제공하는 함수들을 호출하면 알아서 다른 브라우저 상에서 동작할 수 있게 만들었다. jQuery가 굉장히 많은 사랑을 받음
- 2008년
  - google사에서 chrome 브라우저 출시, chrome 브라우저는 JIT(Just-in-time compliation)이라는 javascript를 빠르게 실행하는 강력한 엔진이 포함되어 있다.
  - 7월 : netscape, microsoft, firefox 삼사는 chrome을 보고 자극을 받게 된다. 그래서 chrome을 포함한 모든 브라우저들이 모여 생산적인 대화를 하게 된다.
- 2009년
  - ECMAScript 5 출시
- 2015년
  - ECMAScript 6 출시
  - 지금 현재 많이 사용하는 class, arrow function, const, let, default parameter 등이 포함되어 있음
- 계속해서 연마다 새로운 버전을 출시하고 있지만 ECMAScript 5나 6에서 모든 것이 지정된거나 마찬가지이다. 그래서 javascript 언어는 성숙하고 잘 정착된 언어라고 말할 수 있다. 또한 모든 브라우저가 ECMAScript의 버전을 잘 따라가고 있기 때문에 이제는 더이상 jQuery, dojo, mootools와 같은 라이브러리의 도움없이 javascript와 web apis에서 제공하는 api들로만으로도 모든 브라우저에서 잘 동작할 수 있는 웹사이트나 웹어플리케이션을 만들 수 있다.

### 브라우저 별 ECMAScript를 따르는 javascript engines

- Chrome : V8(node.js와 electron js에서도 많이 이용되어짐, 2020년도 2월경 microsoft의 edge상에서도 사용되게 됨)
- Firefox : SpiderMonkey
- Safari : JSCore
- MS Edge : Charkra
- Opera : Carakan
- Adobe Flash : Tamarin

### Babel

- 시장에서 사용자들은 다양한 시장에서 다양한 브라우저를 사용하고 있고 모든 사용자들이 최신 브라우저를 사용하는 것은 아니다. 하지만 개발자들은 쿨한 기능이 탑재된 최신버전의 ECMAScript 로 개발하고 싶어한다. 그래서 개발 할 때는 최신버전의 ECMAScript로 쓰고 사용자에게 배포할 때만 javascript transcompiler를 이용해서 최신버전의 ECMAScript를 5나 6로 변환해서 변환된 코드를 생산해주는 transcompiler가 가능한 것들

### 우리가 배울 수 있는 좋은 프로그래밍의 철학

: 서비스 레이어나 프레젠테이션 레이어, 비즈니스 레이어 만들 때 API를 잘 작성해서 구현사항이 변경되어도 이 인터페이스를 사용하고 있는 사용자 코드는 수정하지 않도록 만드는 것이 정말 좋은 practice

### 최근 동향

- SPA(Single Page Application)이 굉장히 뜨고 있는 추세이다. 즉 웹사이트를 만드는 것은 더이상 충분하지 않다. 하나의 페이지 안에서 데이터를 받아와서 필요한 부분만 부분적으로 업데이트하는 것이 유행 중이다.
- javascript 만으로도 SPA가 충분히 구현 가능하지만 SPA를 조금 더 쉽게 만들기 위해 react, angular, vue, mackburn 등이 나오게 된다. 이런 라이브러리나 프레임워크를 이용해서 SPA를 조금 더 쉽게 구현 할 수 있다.

### javascript 이용 분야

- javascript는 브라우저를 위한 브라우저에서 동적인 요소를 추가하기 위해 만들어진 언어이다.
- 백엔드
  - node js : V8 javascript engine을 이용한 백엔드를 이용해 서비스를 구현할 수 있도록 만들어진 것
  - ECMAScript의 활발한 표준화를 통해서 더욱 V8라고 불리는 강력한 javascript engine을 통해서 node.js 등장
- mobile
  - react native 나 kotlin 등을 이용해서 mobile application도 충분히 만들 수 있음
- desktop application
  - electron을 이용해서 만들 수 있음

### 뜨고 있는 기술

- 브라우저에서 동작할 수 있는 유일한 언어는 javascript 였는데 요즘에는 web assembly가 등장해서 Rust, C, C++, C#, python, go 등의 다양한 언어들을 이용해서 웹 어플리케이션을 만드는 것이 가능해짐
  - C++로 만들어진 게임 같은 경우에도 브라우저에서도 쉽게 동작할 수 있도록 만드는 게 가능해짐
  - graphic tool 중 하나인 figma도 web assembly를 이용해서 만들어진 좋은 예이다.
