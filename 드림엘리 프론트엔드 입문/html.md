# html

- 웹을 이루는 가장 기본적인 블록(파일)
- Html 없이는 웹사이트 못 만듦
- Hyper text markup Language
- Markup 언어 : 어느정도 태그를 이용해서 구조적으로 보여지는 것

## Docktype>html>head>body

## head

: ui 적인 요소가 없음, css 불러오는 역할도 함, meta data만 존재, 상세 설명

## body

: user에게 보여지는 파일들로 이루어져 있다.

heading

- h1~

## w3c

- 웹의 표준화를 추진하는 단체
- 여기서 정한 표준에 맞게 브라우저를 구현해야 한다.
- 브라우저는 유효한 태그를 쓰지 않아 어느정도의 에러가 발생하면 똑똑히 회복해서 유저가 html을 보는데 지장이 없도록 할 수 있다.
  ○ 유효한 태그인 지 확인 가능 웹사이트 : https://validator.w3.org/

## mdn

- 지원 가능한 태그들 확인은 mdn에서 확인 할 수 있다.
- 브라우저 호환가능성 확인 가능
- 더 이상 사용하지 않는 태그들도 확인 가능

## body 구성 방법

- https://developer.mozilla.org/en-US/docs/Learn/HTML/Introduction_to_HTML/Document_and_website_structure
- 웹사이트를 바라볼 때 박스로 구분하는 연습(가장 작은 단위로 나누기)

## 태그

- element(node): <태그 명 attribute>contents</태그명>

### Box

- item들을 sectioning 쉽게 도와주는 태그들
- 안에 contents가 없으면 사용자에게 보여지지 않음
- ex) header, footer, aside, main, section, article, nav, div, span, form
- div 태그가 아닌 section 태그(header,nav, asiede, main, footer 등)로 구역을 나누는 것이 좋다
- article 태그 : 여러가지 item들을 그룹화해서 재사용 가능한 아이들이 모아져 있는 것을 말함, 반복되는 아이들을 묶어준 것
- div 태그 : 묶어서 스타일링 할 경우, 혹은 그냥 묶고 싶을 때 아무때나 잘 쓰임
- h1태그는 contents를 꾸며서 바뀌어서 나오므로 엄밀히 말하면 box형 태그는 아니다.

### item

- 브라우저가 자동적으로 렌더링 해줘서 사용자가 볼 수 있는 태그
- ex) a, video, button, audio,input, map, label, canvas, img, table
- a 태그 : href, target

### block level 단위

- 한줄에 하나 차지
- div 태그

### inline level 단위

- 공간이 허용하면 다른 태그 옆에 배치 가능
- b 태그 : 텍스트르 볼드체 화
- span 태그, input 태그

### list

- ol 태그 ordered list
  - 숫자화 리스트
- ul 태그 unordered list
  - 숫자화 되어 있지 않은 리스트
- li 태그

### input 태그

- 데이터를 사용자에게 요구해서 사용자로부터 데이터를 받음
- label 태그와 함께 사용 : 입력받을 값의 이름
- label의 for과 input의 id에 동일한 이름을 줘서 고유 식별자를 갖게 함

## 팁

- mdn 사이트로 attribute 확인해가면서 쓰자

## 개발자 마인드

1. 뭐든지 나눠보자
1. 큰그림을 먼저 보자
