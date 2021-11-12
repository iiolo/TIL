# CSS(Cascading Style Sheet)

## 의미, 정의

- cascading : 정의된 세부적인 정의가 있다면 그것을 쓰고 정의된 게 없다면 다음 기본적으로 정의된 것으로 넘어가는 것을 의미
  - 웹사이트 스타일링 : author style(css) > user style(사용자가 지정한 스타일) > Browser 상에서 기본적으로 정의된 스타일 순으로 적용
  - !important 쓸 경우 위에서 말한 적용 순서를 무시하고 제일 먼저 적용됨, 나쁜 architecture가 될 수 있으므로 쓰지 않는 것이 좋다

## 선택자 selectors

- html의 어떤 태그들을 고를 것인지 규정하는 문법
- 구체적으로 태그 가까이 설정할 수록 우선순위가 높아짐
- 종류
  - \* = universal
  - tag이름 = 해당하는 태그만 골라냄
  - #id이름 = 해당하는 아이디만 골라냄
  - .class이름 = 해당하는 클래스 골라냄
  - : = state ex)hover 등의 기능 줄 수도 있음 button:hover
  - [] = attribute ex) a[href="naver"] = href속성으로 naver 값
    을 가진 a태그만 선택
- 작성법

```css
selector {
  property: value;
}
```

## 스타일링

- css reference에서 확인 가능
- padding : 컨텐츠 안에 들어가는 spacing(top,right,bottom,left 따로 지정 가능)
- margin : 컨텐츠 밖에 들어가는 spacing(top,right,left,bottom 따로 지정 가능)
- border : 테두리두께 스타일 색상
- 웹사이트를 만들 때는 잘 정의한 박스들을 원하는 위치에 원하는 사이즈로 배치하는 것이 가장 중요하다
  - display
    - block : 한줄에 하나만 들어가는 상자
    - inline-block : contents 상관없이 지정한 박스의 높이와 가로에 맞춰서 한줄로 표기, 상자인데 가로로 여러개로 진열할 수 있는 특별한 상
    - inline : contents 자체 크기에 맞춤, 아이템
  - position
    - static : 기본값으로 html에서 정의된 순서대로 브라우저 상에 자연스럽게 보여짐
    - relative : 원래 item이 있어야 되는 자리에서 옮길 수 있음
    - absolute : 그item이 담겨 있는 가장 가까운 박스 기준으로 위치 변경됨
    - fixed: 상자 안에서 완전히 벗어나 윈도우페이지를 기준으로 움직임
    - sticky : 원래 있어야 되는 자리에 있으면서 scroll되어도 변하지 않고 원래 있던 자리에 고대로 붙어있음

## CSS 쓰는 연습할 수 있는 게임 사이트

- https://flukeout.github.io/

---

## CSS 꽃 : Flex box

- 참고 사이트 : https://css-tricks.com/snippets/css/a-guide-to-flexbox/
- box와 item들을 행 또는 열로 자유자재로 배치시켜줄 수 있는 유연한 것이다.
- 박스가 커졌을 때 각각의 item들이 어떤식으로 커지면서 박스의 공간을 메꾸어야 할지, 박스가 작아졌을 때 item들이 어떻게 작아져서 유연하게 박스 안에서 배치되어야 되는지를 자유롭게 정의할 수 있고 쉽게 가능하게 해준다.
- 웹사이트 레이아웃을 쉽게 제어할 수 있게 된다.

### container level

: 박스에 적용되는 속성들, container를 꾸며주는 속성들

- display
  - flex
- flex-direction
- flex-wrap
- flex-flow : flex-direction flex-wrap값들을 인자로 받는 단축 속성
- justify-content : 중심축에서 아이템들 어떻게 배치하는 지 정함
  - flex-start/center/end : 아이템 순서를 유지하되 배치를 왼쪽 가운데 오른쪽(flex-) 지정해서 배치 가능
  - space-around : 박스 별 spacing 넣어줌
  - space-evenly : 박스 사이에 똑같은 간격 넣어줌
  - space-between : 시작 박스(왼쪽/위쪽)과 끝박스(오른쪽/아래쪽)은 화면에 맞게 배치하고 중간 박스들에 똑같은 간격 넣어줌
- align-items : 중심축과 반대되는 축에서 어떻게 배치하는 지 정함
  - baseline: 텍스트 위치가 균등하게 보여질 수 있도록 baseline에 맞춰서배치
- align-content :jutify-content와 비슷하지만 중심축이 아닌 반대축 기준으로 배치
  - space-between : 시작 박스(왼쪽/위쪽)과 끝박스(오른쪽/아래쪽)은 화면에 맞게 배치하고 중간 박스들에 똑같은 간격 넣어줌
  - justify-content에서 쓰이는 속성 값 사용 가능

### item level

- container 박스 안에 각각의 item들에 적용되는 속성들, item들 각각 꾸며주는 속성
- order : item들의 order 바꿀 때 사용, 하지만 잘 사용되지는 않음
- flex-grow : 중요함, container를 꽉 채우려고 지정된 item들의 너비가 늘어남
  - 숫자 : 다른 아이템에 비해 배로 커짐
- flex-shrink : container가 작아졌을 때 어떻게 행동하느냐를 지정
  - 숫자 : 다른 아이템에 비해 배로 작아짐
- flex-basis : item들이 공간을 얼마나 차지해야 하는지 세부적으로 명시할 수 있게 도와주는 속성
  - auto : flex-grow나 flex-shrink에 맞춰서 아이템들이 변형됨
  - 숫자% : container의 너비에 따라서 다른 아이템들에 비해 숫자% 만큼 container를 차지함
  -
- align-self : item 별로 item들 정렬 가능
  - center : 적용된 item 하나만 중심 정렬 가능

### main axis

: 중심축(아이템이 정렬되는 방향)

- justify-content : 중심축에서 아이템들 어떻게 배치하는 지 정함

### cross axis

: 중심축과 반대되는 축(중심이 x축이면 이축은 y축), 반대축

- 중심축 방향(수평/수직)이 달라지면 이 축도 방향이 달라짐
- align-items : 중심축과 반대되는 축에서 어떻게 배치하는 지 정함

### flex-box 연습 게임 사이트

- 개구리를 연꽃잎에 옮기는 게임
- https://flexboxfroggy.com/#ko

---

## 팁

- 새로운 기능을 쓸 때는 mdn, can i use 등의 사이트에서 브라우저 호환성 확인
- % 단위 : 부모 기준 단위 / vh 단위 : 부모와 상관없이 뷰포트 기준 단위
