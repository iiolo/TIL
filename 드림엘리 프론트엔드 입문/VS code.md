## short cut key

- command palette 명령 팔레트 이용(ctrl + shift + p)
  - 축약어로 입력해도 찾을 수 있음
- 자주 사용하는 것은 외우는 것이 좋음

## extensions

- material theme
- material icon theme
- prettier : code를 fomatting 해줌(ctrl + , 으로 setting 창 이동)
  - 저장할 때 자동으로 formatting 하게 해주기 위해서는 format a file on save 체크박스 체크
  - prettier quote > single quote
- bracket pair colorizer : 괄호에 색감을 줘서 코드에 가독성을 줌
- indent rainbow : 들여쓰기 된 부분이 무지개 색으로 하이라이트 되어 있어 보기 편함
- auto rename tag : html 편집시 굉장히 도움을 주는 확장, 앞 태그 바꾸면 뒤의 태그가 자동으로 바뀜
- CSS Peek : html에서 정의된 스타일 확인하기 위한 것, 정의된 css 스타일을 바로 찾을 수 있게 해줌
  - html에서 ctrl을 누르고 확인하고 싶은 것을 클릭하면 정의된 css 파일로 넘어감
- HTML CSS Support : 정의된 css 스타일을 바꾸자 할때 유용, 정의된 css의 앞글자만 쳐도 관련 css 스타일들이 뜸, html에서 css의 자동완성을 이용할 수 있음
- Live server : 새로고침 안해도 저장만 해도 실시간으로 수정되는 것을 브라우저로 확인 가능
  - 명령 팔레트에서 open with live server : 새로운 브라우저 창 생성
- markdown preview : 설치 안해도 되는 확장임. 이미 내장되어 있는 것
  - 명령 팔레트에서 markdown open preview 클릭시 작성한 마크다운 파일이 어떻게 보이는 지 볼 수 있음
- HTML to CSS autocompletion : html에서 작성한 css 선택자를 일일히 찾아야 하는 수고로움을 덜어줌, css에서 html에서 작성한 선택자 첫글자만 쳐도 자동완성 됨

## Emmet

- https://emmet.io/ -> document에서 더 많은 정보 확인 가능
- zen coding
- 플러그인 형태였으나 요즘 에디터에는 기본적으로 들어가 있기도 하다.
- markup 언어는 작성해야 하는 코드의 양이 많고 일일히 작성해야 하고 반복된다.
- 개발 시간 단축
- 자주 쓰는 것들은 작은 양의 타이핑으로 생산할 수 있도록 하기
- html을 빠르게 작성하는 팁
  - ! : html 양식 작성 후 tab
  - div 태그 : div 작성 후 tab
  - .클래스이름 : 클래스 가진 div 태그 생성
  - #아이디명 : 아이디 가진 div 태그 생성
  - 부모, 자식 형제 노드
    - \> : 자식
    - \+ : 형제
    - \^ : 해당 태그의 부모의 형제 노드 생성
  - \*숫자 : 숫자만큼 반복 생성
  - ( ) : 그룹화, 괄호 안에서 작성한 emmet 문법이 그룹화
  - {text} : content에 텍스트 입력 가능
  - $ : 순서에 맞게 숫자 할당
  - lorem숫자 : 숫자에 맞는 단어 수 대로 더미용 텍스트 생성
