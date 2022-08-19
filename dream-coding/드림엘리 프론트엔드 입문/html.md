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

- 의미가 있는 symantic 태그 사용하기
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

## 필수로 알아야하는 semantic tags

- semantic tags(semantic markup) : semantic의 뜻은 의미의, 의미가 있는 이다. 우리가 사용하는 물건에도 언제 어디에 써야하는 지 등의 저마다의 의미를 가지고 있는 것처럼 html 태그 또한 의미를 가지고 있다.

### sematic tags를 잘 활용해야 하는 중요한 이유

1. SEO(Search Engine Optimazation) : 검색을 최적화 하기 위해
1. Accessibility : 웹 접근성 때문이다. screen reader를 이용하거나 키보드만 이용해서 등의 웹사이트를 이용하는 경우 문제없이 잘 동작될 수 있게 하기 위해
1. Maintainability : 개발자들을 위해서, 개발자가 html 코드를 바라봤을 때 한눈에 웹사이트 구조를 알아볼 수 있고 유지보수성을 높여서 개발할 수 있다.

### sematic tags example

- \<header> : 웹사이트의 브랜드를 나타내 줄 수 있는 로고나 사용자들을 위한 중요한 메뉴 아이템들을 담는 태그
  - \<nav> : \<header> 안에 여러가지 메뉴들이 모여있을 경우 사용
- \<footer> : 필수적이지는 않지만 웹사이트의 맨 아래의 마지막으로 부가적인 정보나 링크들을 담는 태그
- \<main> : 현재 웹사이트에서 중요한 부분을 가지고 있는 태그
  - \<aside> : main안에서도 페이지의 컨텐츠와 직접적으로 상관 없는 부가적인 내용(광고나 페이지와 연관된 다른 링크들 등)이 담긴 태그
  - main안 내용들은 필요에 따라서 article과 section으로 분리하면 좀 더 구조적으로 웹사이트 구성 가능

### 헷갈릴 수 있는 내용

- 문서 안에서 자체적으로 의미 있는 태그가 필요한 것인지 CSS로 스타일링을 위해서 사용하는 지 점검해보는 것이 좋다

#### section 태그와 article 태그의 차이점

- article
  - 신문기사의 경우 신문기사에서의 기사 하나를 그 자체를 묶어줄 때 사용
  - 자체만으로 독립적으로 다른 페이지에 보여줬을 때 전혀 문제가 없을 경우 사용
  - main 태그 안 다른 내용들과 전혀 상관없이 독립적으로 고유한 정보를 나타날 때 사용
- section
  - article 안에 내용들을 서로 연관 있는 것끼리 묶어주고 싶을 경우 사용
  - article 안이나 main 안에서 아무 곳에서나 연관있는 내용들을 하나로 묶어줄 때 사용
- 한페이지 안에서 여러가지 내용을 보여준다면 section 별로 나누고 하나의 section 안에서 또다른 블로그 포스팅을 보여줄 때 article을 사용할 수 있다.

#### img 태그와 css의 속성 background-image 적재적소 활용법

- img 태그 사용하는 경우 : image가 웹페이지 안에서 하나의 중요한 요소로 자리잡고 있을 때 사용해서 html 문서 안에서 자체적으로 포함되게 만드는 것이 좋음
- css의 속성 background-image 사용하는 경우 : 문서의 내용과 별개로 스타일링 목적을 위해서 배경이미지로 사용되는 경우(문서의 일부분이 아닌 경우) 사용, image가 없어도 문서를 읽는데 전혀 지장이 없는 경우

#### button 태그와 a 태그 적재적소 활용법

- button 태그: review, vote, login, sign up, take quiz 등 사용자의 특정한 액션을 위해 버튼을 클릭시 특정한 행동이 발생하는 경우 사용하는 것이 적절
- a 태그 : 사용자가 클릭 했을 때 어딘가로 이동하는 경우(링크가 걸려져 있는 경우) 사용하는 것이 적절

#### 목록들의 차이점(ol, ul, dl)

- ul(unordered list) : 순서가 없는 목록 즉, 단순히 목록으로만 나타낼 때 사용(중첩 사용 가능)
- ol(ordered list) : 목록 중에서 순서가 중요한 경우 사용, 순서 표기됨(중첩 사용 가능)
- dl(description list) : 어떤 한 단어에 대해서 설명이 묶여있는 목록 만드는 경우(정의, 설명 목록)
  - dt(description term) : 원하는 단어
  - dd(description detail) : 단어에 해당하는 설명

#### 스타일링을 위해서 table 태그를 사용하면 안되는 이유

- 많은 데이터의 양을 행과 열을 이용해서 정말 table이 필요해서 그런 데이터를 나타내는 경우 table 태그를 사용하면 된다.
- 단순히 아이템을 테이블(grid) 형식으로 표현하기 위해서 table 태그를 사용하는 것은 좋지 않다. CSS의 flex, grid 를 활용해 조금 더 유연하고 아름답게 스타일링을 가능하게 해야 한다.

#### 시각적 or 강조

##### i 태그와 em 태그의 차이점

- i : 시각적으로만 italic 체으로 변환되고 별다른 의미가 없다
- em : 강조하는 italic 체

##### b 태그와 strong 태그의 차이점

- b : 시각적으로만 bold 체으로 변환되고 별다른 의미가 없다
- strong : 강조하는 bold 체

## 팁

- 사용 가능한 html 태그들 : https://developer.mozilla.org/ko/docs/Web/HTML/Element

- mdn 사이트로 attribute 확인해가면서 쓰자

## 개발자 마인드

1. 뭐든지 나눠보자
1. 큰그림을 먼저 보자
