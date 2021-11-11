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

## 헷갈리는 컨셉

## CSS 꽃 : Flex box

## 팁

- 새로운 기능을 쓸 때는 mdn, can i use 등의 사이트에서 브라우저 호환성 확인
