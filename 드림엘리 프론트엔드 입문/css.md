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

## 변수 할당

```css
:root {
  변수: 값;
  --text-color: 색상코드;
  --background-color: 색상코드;
  --accent-color: 색상코드;
}
```

- 그리고서 css 값 적을 때 var(변수이름)로 적으면 root에 있는 변수 값만 바꾸면 그 변수로 할당된 모든 css 값이 바뀜

---

## CSS Units

- 절대적인 단위의 경우 px을 많이 사용하고 상대적인 단위에서는 %, viewport와 관련된 단위, em, rem 주로 사용

### Absolute length units 절대적인 단위

| Unit | Name               | Equivalent to       |
| ---- | ------------------ | ------------------- |
| cm   | Centimeters        | 1cm = 96px/2.54     |
| mm   | Millimeters        | 1mm = 1/10th of 1cm |
| Q    | Quarter-milimeters | 1Q = 1/40th of 1cm  |
| in   | Inches             | 1in = 2.54cm = 96px |
| pc   | Picas              | 1pc = 1/6th of 1in  |
| pt   | Points             | 1pt = 1/72th of 1in |
| px   | Pixels             | 1px = 1/96th of 1in |

- px을 제외한 것들은 물리적인 세상에서만 의미 있음, css 주된 용도는 모니터 위에서 웹사이트를 꾸며줄 때 쓰이므로 대부분의 경우 px을 이용해서 쓰고 나머지 단위는 잘 쓰지 않음
- px : 모니터 위에서 화면에 나타날 수 있는 가장 작은 단위, absolute unit 중 가장 많이 쓰임
  - 발생할 수 있는 문제점 : 컨테이너 사이즈가 변경되어도 컨텐츠가 그대로 고정된 값으로 유지됨, 폰트 사이즈를 px로 쓰게 될 경우 사용자가 브라우저에서 폰트 사이즈 설정을 바꿔도 전혀 반응하지 않음, 그래서 거의 px보다는 %를 활용(컨텐츠 유동적 변화)

### Relative length units 상대적인 단위

- Responsive Units 반응형 단위
  Unit|Relative to|example
  ---|---|---
  em|relative to parent element, 타이포그래피에서 현재 지정된 포인트 사이즈를 나타내는 단위, 지금 폰트 사이즈를 나타내는 단위, 같은 폰트 사이즈라도 폰트 패밀리에 따라서 사용자에게 보여지는 텍스트의 크기는 달라질 수 있다. em은 선택된 폰트패밀리와 상관 없이 항상 고정된 폰트 사이즈를 가지고 있다. 부모의 폰트 사이즈에 상대적으로 곱해서 계산되어짐 |기본 브라우저 폰트 사이즈 16px일때 8em을 가진 parent 요소가 있을 경우 parent요소의 크기는 16 \* 8 = 128px, 그 자식 요소 child는 0.5em을 가졌다면 128px \* 0.5 = 64px의 크기를 갖게된다.  
  rem|relative to root element , em과 비슷하지만 부모에 따라서 사이즈가 계산되는 것이 아닌 root에 지정된 폰트 사이즈에 따라서 크기가 결정됨(root요소에 상대적으로 크기 결정), 최고의 root인 사이즈에 따라 곱해져 결정됨|기본 브라우저 폰트 사이즈 16px일때 8em을 가진 parent 요소가 있을 경우 parent요소의 크기는 16 \* 8 = 128px, 그 자식 요소 child는 0.5em을 가졌다면 16px \* 0.5 = 8px의 크기를 갖게된다.
  ex|em과 달리 지정된 폰트 사이즈에 따라서 높이가 변경될 수 있다.
  ch|적용된 폰트패밀리에서 숫자 0의 너비를 나타내는 단위]
  lh|line height of the element, 브라우저 지원 안됨
  vw|viewport width|100vw의 경우 viewport width의 100% 사용, 50vw는 viewport width 반 사용
  vh|viewport height
  vmin|viewport width와 viewport height 중 작은 값| 50vmin의 경우 viewport width와 viewport height 중 더 작은 값의 50% 적용
  vmax|viewport width와 viewport height 중 큰 값|50vmax의 경우 viewport width와 viewport height 중 더 큰 값의 50% 적용
  % | 부모요소에 맞게 상대적으로 크기가 계산되어짐, em대신에 % 사용 가능|

### em과 rem의 차이점

- 박스 컨테이너 자체 사이즈를 지정할 때는 em과 rem은 반응형 단위이긴 하지만 폰트 사이즈에 비례해서 변화하는 단위이기 때문에 결국 이 아이들도 고정적인 값을 갖게된다. 그래서 컨텐츠를 조금 더 물과 같은 유동적이게 만들기 위해서는 %를 이용하는 것이 좋다.
- em과 rem은 어떤 것이 더 낫다고 할 수 없다.
- 어떤 디자인이냐에 따라서 혹은 원하는 기능에 따라서 em / rem 적절하게 사용됨
- em
  - component가 어디에 사용되느냐에 따라서, 즉 부모요소에 따라서 사이즈가 유동적으로 변동되길 원한다면 em 이용
  - em을 많이 사용하게 되면(복잡한 구조 안에 있을 시) 폰트 사이즈를 즉각적으로 계산하기 어려움. 직관적을 폰트사이즈가 계산이 되지 않기 때문에 em을 많이 사용하게 되면 계산하는 데 어려움이 있을 수 있다.
  - font size 변경에 따라서 발생할 수 있는 padding 등은 em 사용, font-size에 따라서 padding 등도 변화했으면 해서 em 사용
- rem

  - component가 사이트 어디에 사용되든 사이즈가 고정되길 원한다면 rem 이용
  - 폰트사이즈 결정시 em보다는 rem을 더 선호하는 편
  - 어떤 component에 사용되느냐에 상관없이 동일한 사이즈를 유지하고 싶을 때 사용

- padding도 font size에 따라 변경되어야 하는 경우 padding 값으로 px보다는 em 단위 활용한다면 font size가 변경될 때마다 padding이 그에 맞게 변화할 수 있다.
  - padding에 em 적용시 기존의 컨텐츠에 적용된 폰트사이즈의 숫자 배(곱하기)가 된다.
  - 미디어쿼리로 스크린 사이즈에따라 폰트사이즈 변경되어도 이 폰트사이즈에 맞게 padding 사이즈 변화되서 조금 더 반응형으로 컴포넌트 component 제작 가능
  - 요소마다 사이즈에 상관없이 고정적인 padding을 유지해야 한다면 rem 사용
  - em과 rem 섞어서 사용할 수 있음 ex) 위아래는 폰트사이즈에 맞게 padding 조정되게 만들고, 양쪽(왼쪽과 오른쪽)은 현재 폰트 사이즈와 상관없이 고정되게 만들기(수직 정렬됨) -> padding: 숫자em, 숫자rem
- 미디어 쿼리 스크린 사이즈 지정시 rem을 사용해서 하면 더 좋음

### 사용하는 목적에 따른 단위

#### 부모요소 / 브라우저 사이즈에 따른 변경

1. 부모요소의 사이즈에 따라 사이즈가 변경되어야 하는 경우 : %, em
1. 부모와는 상관없이 브라우저 사이즈에 대해 반응해야 하는 경우 : viewport 관련 단위(vw, vh, vmin, vmax), rem

#### 요소 /font 사이즈에 따른 변경

1. 요소(ex) box) 자체의 너비와 높이에 따라 사이즈 변경 : %, viewport 관련 단위(vw, vh, vmin, vmax), flex box 등 이용해서 유동적으로 설정
2. font 사이즈에 따라서 사이즈 변경 : em, rem

### 사이즈 계산 사이트

- PXtoEM : http://pxtoem.com/

---

## 팁

- 새로운 기능을 쓸 때는 mdn, can i use 등의 사이트에서 브라우저 호환성 확인
- % 단위 : 부모 기준 단위 / vh 단위 : 부모와 상관없이 뷰포트 기준 단위
