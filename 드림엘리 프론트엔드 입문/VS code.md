## short cut key

- command palette 명령 팔레트 이용(ctrl + shift + p)
  - 축약어로 입력해도 찾을 수 있음
- 자주 사용하는 것은 외우는 것이 좋음

---

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
- Kite AutoComplete AI Code : 코드 자동완성 기능 제공

---

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
    - > : 자식
    - - : 형제
    - ^ : 해당 태그의 부모의 형제 노드 생성
  - \*숫자 : 숫자만큼 반복 생성
  - ( ) : 그룹화, 괄호 안에서 작성한 emmet 문법이 그룹화
  - {text} : content에 텍스트 입력 가능
  - $ : 순서에 맞게 숫자 할당
  - lorem숫자 : 숫자에 맞는 단어 수 대로 더미용 텍스트 생성

---

## 코멘트 색상 변경 방법

- setting(설정) 창 > .json > edit in settings json(settings json에서 편집) 클릭 > setting을 세부적으로 텍스트로 할 수 있는 창이 나옴
  ```json
  "editor.tokenColorCustomizations": {
          "comments" : "#ffc2c2"
      }
  ```
  위 코드 입력

---

## 단축키

### 어플리케이션 자체에서 유용한 기능과 단축키

- ctrl + shift + p : command palette, 실행 가능한 모든 명령어를 마우스 없이 키보드 하나로 바로 실행 가능, 명령어 검색 후 선택하고 enter 치면 명령 수행됨
- ctrl + p : quick open, 해당하는 파일을 빠르게 검색하고 enter 치면 해당 파일로 이동, 검색어를 다 입력하지 않아도 cls라고 fuzzy search가 가능하기 때문에 해당하는 파일로 빠르게 이동 가능
- ctrl + , : User Settings
- ctrl + b : Toggle sidebar, 익스플로어 창 열고 닫는 것 가능
- ctrl + ` : Toggle Terminal, 비주얼스튜디오에 내장된 터미널 이용 가능
- ctrl + k + s : Keyboard Shortcuts, 단축키들 확인
- 윈도우용 단축키 정리 사이트 : https://code.visualstudio.com/shortcuts/keyboard-shortcuts-windows.pdf

### 코드 작성시 꼭 알아야 하는 단축키

- ctrl + Home / ctrl + End : 현재 파일 젤 윗부분으로 이동 / 현재 파일 젤 아랫부분으로 이동
- 문장에서 Home / End : 문장의 젤 앞부분으로 이동 / 문장 젤 끝부분으로 이동
- 문장에서 ctrl + shift + Home / end: 현재 문장 선택
- ctrl + <- /-> : move word, 단어별 이동
- 해당하는 곳에 가서 ctrl + shift + <- /-> : select word, 한 단어가 선택됨
- 문장에 가서 ctrl + c : 해당 문장 전체 복사
- 문장에 가서 ctrl + x : 해당 문장 전체 잘라내기
- 해당 문장(해당 블록 선택해서 해도 됨)에서 alt + 위방향키/밑방향키 : 해당 문장(해당 블록) 이동(up/down)
- 해당 문장(해당 블록 선택해서 해도 됨)에서 shift + alt + 위방향키/밑방향키 : 해당 문장(해당 블록) 복사 후 이동 붙여넣기(up/down)
- ctrl + enter : insert line below, 코드 문장 중간에서 작성하다가 그 다음줄에서 새로운 코드 문장 작성해야 하는 경우 사용
- ctrl + d : multi selection, 한 파일 안에서 여러 번 반복되어져서 사용되는 단어 있다면 그리고 그것을 빠르게 수정하고 싶을 때 해당하는 단어 위에서 여러 번 반복적으로 눌러주면 자동으로 동일 단어들이 모두 선택되어져 있기 때문에 간단하게 삭제하고 해당하는 내용으로 업데이트 할 수 있다.
- ctrl + u : undo last cursor, 이전에 있던 커서로 이동
- 다중선택
  - alt + click : insert cursor, 다중 선택 단축키, alt키를 누른 상태로 해당하는 부분 클릭, 공통적으로 해당하는 내용을 빠르게 업데이트 가능
  - shit + alt + drag mouse : shift 와 alt 누른 상태에서 드래그 하면 해당하는 부분에 다중으로 멀티 선택
  - 전체적을 블럭 선택한 다음에 shif + alt + i : 해당하는 부분 제일 긑에 커서가 자동으로 생성
  - 다중 선택된 상태에서도 단어별 이동 가능(ctrl + <- /->) , shit키 함께 눌러 선택도 할 수 있음 그래서 빠르게 원하는 것으로 업데이트 가능
