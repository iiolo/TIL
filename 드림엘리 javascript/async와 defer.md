# async와 defer

- html에서 javascript 표현시 어떻게 포함하는 것이 효율적인 것인가
- 사용자가 html 파일 다운로드시 브라우저가 한줄 한줄 분석한다(parising HTML) > 한줄한줄 분석하고 이해한 것을 CSS와 병합해서 DOM 요소로 변환
- async : boolean 타입의 속성값으로 선언하는 것만으로도 true로 설정되어 옵션 사용 가능

## head 안에 script 태그

- html parsing하다가 script 태그 발견시 src안 js파일을 다운받아야하네 하고 이해하게 된다. 그래서 html parsing하는 것을 잠시 멈추고 그 js을 다운받아서 실행한다음에 다시 html parsing을 시작한다.
- 단점 : 해당 js 파일 용량이 어마어마하게 크고 인터넷도 느리다면 사용자가 그 웹사이트를 보는 데 많은 시간이 걸린다. 그래서 head안에 script 태그를 포함하는 것은 좋은 방법이 아니다.

## body 끝부분에 script 태그

- parsing html > page is ready > fetching js > executing js
- 브라우저가 html을 다운받아서 쭉 parsing해서 페이지가 준비된 다음에 그다음에 script 태그를 만나 script를 fetching(서버에서 받아옴)하고 executing(실행)하게 됨
- page가 js를 다운로드 받기 전에도 이미 준비가 되어 사용자가 미리 페이지 컨텐츠를 볼 수 있다.
- 단점 : 사용자가 기본적인 html 컨텐츠를 빨리 본다는 장점은 있지만 웹사이트가 js에 굉장히 의존적일 경우 즉 사용자가 의미있는 컨텐츠를 보기 위해서 js를 이용해서 서버에 있는 데이터를 받아온다던지 아니면 dom 요소를 더 이쁘게 꾸며준다던지 그런식으로 동작하는 웹사이트라면 사용자가 정상적인 페이지를 보기 전까지는 fetching(서버에서 js를 받아오는)하는 시간도 기다려야 하고 executing(실행)하는 시간도 기다려야 한다.

## head 안에 async 속성값 활용한 script 태그

- parsing html > blocked > parsing html
  <br> [fetching js > executing js]
- async 사용시 브라우저가 html을 다운로드 받아서 parsing 하다가 script 태그에 async 속성 있을 시 병렬로 src 안 js 파일을 다운로드 받자고 명령만해놓고 다시 parsing하다가 해당 js 파일이 다운로드(fetching) 완료될 시 그때 parsing하는 것을 멈추고 다운로드된 js을 실행(executing)을 다하고 나서 나머지 html을 parsing하게 됨
- 장점 : body 끝에 사용하는 것보다는 fetching이 parsing하는 동안 병렬적으로 일어나서 다운로드 받는 시간을 절약할 수 있다.
- 단점
  - js가 html이 parsing되기도 전에 executing(실행)이 되기 때문에 만약 js에서 queryselector을 통해 dom 요소를 조작할 경우 조작하려는 시점에 html에 원하는 요소가 아직 정의되어 있지 않을 수 있어 위험하다.
  - html이 parsing하는 동안에 언제든지 js를 실행하기 위해서 멈출 수 있기 때문에 사용자가 페이지를 보는데 여전히 시간이 조금 더 걸릴 수 있다.

## **head 안에 defer 속성값 활용한 script 태그**

- parsing html > executing js
  <br> [fetching js]
- 제일 효율적이고 안전한 방법
- parsing하다가 script 태그에서 defer 속성이 보이면 병렬로 src 안 js 파일을 fetching(다운로드) 하자고 명령만해놓고 나머지 html을 끝까지 parsing 한다. 그리고 마지막에 parsing이 끝난 후 다운로드 되어진 js excuting(실행)하게 된다.
- 가장 좋은 옵션 : html을 parsing하는 동안 필요한 js를 다 다운로드 받아놓고 html parsing을 먼저해서 사용자에게 페이지를 보여준 다음에 바로 이어서 js를 실행하기 때문

## async와 defer 차이점

- async : 다수의 js 다운로드 받을 경우 먼저 다운로드 된 js를 실행하게 된다. 즉, 정의된 js 순서에는 상관없이 다운로드가 먼저 된 js를 실행하기 때문에 js가 순서에 의존적일 경우 이 속성 이용시 문제가 될 수 있다.
- defer : 다수의 js 다운로드 받을 경우 html parsing하는 동안 해당 js들을 다 다운로들 받아놓은 다음 그 다음에 순서대로 실행하기 때문에 정의한 순서가 지켜져 원하는대로 js를 실행할 수 있다.
