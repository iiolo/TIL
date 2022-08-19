# API(Application Programming Interface)

## 개념

- service 내부의 구현사항을 잘 숨겨두고 외부에서 사용하는 사람이 필요한 것만 노출해둔 이것을 인터페이스, API라 부른다.

---

## 연도별 API의 역사

- API의 시초 : 1964년 거대한 컴퓨터를 쓸 때부터 등장한 단어로 하드웨어 독립성(Hardware Independence)을 위해 사용됨. 예를 들어 서로 다른 하드웨어 부품마다 개발자가 일일이 프로그래밍을 작성하기 보다는 HAL(Hardware Abstraction layer)라는 하드웨어 추상화 계층을 통해 한번만 display 함수를 이용하면 각기 다른 모니터에 출력을 하거나 각기 다른 하드웨어 부품에 작성을 하는 이런 일들을 쉽게 해주는 것이 생긴 것이다.
- 1980년대 중반부터 우리가 흔하게 사용하는 그래픽이 빵빵한 컴퓨터인 MacOS와 windows 가 등장한다. 이런 각각의 운영체제에서 동작하는 어플리케이션을 만들기 위해서는 운영체제에서 제공하는 API(Application Programming Interfaces)를 이용해서 만들 수 있다. mac의 경우 cocoa API, windows는 windows API를 이용해서 어플리케이션을 만들고 버튼을 추가하고 파일에 데이터를 저장하고 읽고 이런 일들을 할 수 있게 되었다.
- 1990년도 인터넷이 보편적으로 대중화되기 시작하면서 더이상 물질적으로 케이블이 연결된 세상에서 벗어나서 컴퓨터와 컴퓨터, 다양한 기기들이 인터넷을 통해서 의사소통해나가는 시대가 도입된다. 이때, 다양한 기기에서 서버에 있는 데이터를 읽고 쓰기 위해서는 서버에서 제공하는 Web API들을 이용해서 처리할 수 있게 되었다. 서버에서 제공하는 Web API를 통해서 서버에 있는 데이터를 읽어오거나 업테이트 할 수 있게 됨
- 현재는 Web API 뿐만 아니라 라이브러리나 프레임워크를 통해서 우리가 이용할 수 있는 클래스나 함수들을 API라 부른다. 이러한 외부에서 가져오는 라이브러리 뿐만 아니라 프로젝트 내부에서 쓰여지고 있는 클래스나 모듈이 있다면 Caculator에서 제공하는 add, multiply를 이용시 두가지의 함수, 두가지 인터페이스, 두가지 API를 이용해라는 말로 말할 수 있다. 이처럼 API는 다양한 부분에서 사용되어지는 단어로 쓰이고 있다.

---

## 용어 정리

- HTTP(s) [Hypertext Transfer Protocol] : 네트워크에서 기기들간에 의사소통 해나가는 규격사항
- SOAP(Simple Object Access Protocol) : Web API를 어떻게 디자인해서 만들 것 인지 정의하는 것, 모든 네트워크 요청과 반응을 HTML처럼 생긴 XML이라는 데이터 포맷에 저장해서 주고 받음
- REST(Reprensentational State Transfer) : 최근 보편적으로 사용되는 Web API를 어떻게 디자인해서 만들 것 인지 정의하는 것, get을 이용해서 유저에 대한 정보를 요청하면 서버로부터 유저에 대한 정보를 요청하면 서버로부터 유저에 대한 데이터를 JSON이라는 포맷을 통해서 받아 올 수 있다(response).
  - Post : create, 새로운 데이터 만들기
  - Get : Read, 읽기
  - Put : Update, 업데이트
  - Delete : delete, 삭제
- Open/Public API : 회사 내부에서 사용하는 Web API를 외부의 다른 개발자가 이용할 수 있도록 공개적으로 오픈한 것, 궁극적으로 회사, 서비스 커뮤니티에 많이 기여를 하기 때문에 많은 회사에서 이런 Open API를 만들어둔다.

---

## API 관련 사이트

- Public APIs(https://public-apis.xyz/) : 다양한 open API들을 종류별로 확인 가능한 사이트
- 깃허브 open/public api 종류별 정리 https://github.com/public-apis/public-apis : 간단한 설명과 함께 API 키 유무도 정리되어 있음, 즐겨찾기 해놓으면 좋음
- Giphy(https://developers.giphy.com/) : 재밌고 다양한 gif들을 이용해서 어플리케이션 만들고 싶다면 Giphy 개발툴에서 제공하는 SDK나 Open API 이용
- Spotify(https://developer.spotify.com/) : Spotify에서 제공하는 Web API를 이용해서 어플리케이션 만들기 가능, Spotify Developer Showcase에선 Spotify에서 제공하는 API를 이용해서 만든 다양한 어플리케이션을 볼 수 있다.
- EDAMAM(https://developer.edamam.com/): 요리관련, 영양가, 레시피, 다양한 음식에 관련된 데이터 베이스의 정보 가져올 수 있는 API 제공
- APIMeme(http://apimeme.com/?ref=apilist.fun) : 밈(MEME) 관련, 원하는 종류들을 선택해서 top과 bottom에 어떤 것을 입력할 건지 동기적으로 만들수 있는 API 이용 가능, URL을 통해서 원하는 종류와 그 밈에 top과 bottom에 각각 어떤 텍스트를 넣은 건지 설정해서 바로바로 출력할 수 있도록 만들어 볼 수 있다.
- 국내 증권사 API 활용도 괜찮 ex) 키움증권 open API
- 공공 데이터 https://www.data.go.kr/tcs/dss/selectDataSetList.do
- 카카오 https://developers.kakao.com/
