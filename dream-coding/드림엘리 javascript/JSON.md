# JSON(Javascript Object Notation)

## HTTP(HYpertext Transfer Protocal)

- hypertext : 웹사이트에서 이용되어지고 있는 hyper links만 이야기하는 것이 아니라 전반적으로 쓰여지고 있는 resource들, 문서나 이미지 파일들 등을 다 포함해서 말한다.
- 어떻게 hypertext를 서로 주고 받을 수 있는지를 규약한 protocal의 하나
- 브라우저에서 동작하고 있는 웹사이트나 웹 어플리케이션과 같은 client들이 어떻게 Server와 통신할 수 있는지를 정의한 것
- client가 server에게 data를 request(요청) 할 수 있고 server는 client가 요청한 것에 따라서 그에 맞는 response(응답)을 client에게 보내주는 방식으로 진행되는 것을 의미

## AJAX(Asychronous Javascript And XML)

- http를 이용해서 server에게 data를 요청해서 받아올 수 있는 방법 중 하나
- 웹페이지에서 동적으로 server에게 data를 주고 받을 수 있는 기술을 의미한다.
- 대표적인 예로는 XHR(XML Http Request)라는 object가 있다.
  - 브라우저 API에서 제공하는 object 중의 하나
  - 이 object 이용시 간단하게 sever에게 data를 요청하고 받아올 수 있다.

## XML

- markup 언어 중 하나로 태그들을 이용해서 data들을 나타냄
- html과 마찬가지로 data를 표현할 수 있는 방법 중 하나이다.
- XML 이라는 이름이 지어진 이유 : AJAX와 XHR이 활발히 개발되고 있을 당시 microsoft 사에 있는 outlook을 개발하고 있는 팀이 활발히 참여해서 만들게 되었는데 이때 outlook은 sever와 client 간에 data 전송을 할 때 xml을 사용했다. 그래서 XML을 Http Request 앞에 붙여서 개발을 하게 되었다.
- XML 사용시 불필요한 태그들이 너무 많이 들어가서 파일의 사이즈도 커질 뿐만 아니라 가독성도 좋지 않기 때문에 XML은 최근에는 많이 사용되고 있지 않다. XML 대신에 JSON을 많이 사용한다.

## 최근 동향

- data를 주고 받을 때는 XML 뿐만 아니라 굉장히 다양한 파일 포맷(타입의 데이터)을 전달 받을 수 있다. 그 중 JSON을 많이 쓰고 있는 추세이다.
- 최근 브라우저 API에 추가된 fetch() API를 이용하면 간편하게 data를 주고 받을 수 있다. (internet explorer 지원x)
- 브라우저에서 server와 통신을 할 때는 새로 추가된 fetch() api를 쓸 수도 있고 요즘도 흔하게 많이 쓰이는 XMLHttpRequest라는 object를 이용해서 server와 통신을 할 수도 있다.

## JSON 개념

- 총 두가지 api 존재 : parse() ,stringify()
  - overloading 오버로딩
    - 함수 이름은 동일하지만 어떤 parameter을 전달하냐, 몇 개의 parameter을 전달하냐에 따라 각각 다른 방식으로 호출이 가능하다.
    - stringify의 경우 JSON에서 동일한 이름의 함수(api)가 두개가 있고 전달되는 매개 변수가 약간 차이가 있음
- 1999년도 ECMAScript 3번째 버전에 쓰여지는 object에서 큰 영감을 받아서 만들어진 data format이다.
- javascript에서 object를 보면 key : value 로 이루어져 있는 데 json 또한 key : value로 이루어져 있다.
- 브라우저 뿐만 아니라 모바일에서 서버와 데이터를 주고 받을 때 또는 서버와 통신을 하지 않아도 object를 파일 시스템에 저장할 때도 JSON data type을 많이 이용하고 있다.

## JSON 정의

- simplest data interchange format : data를 주고 받을 때 쓸 수 있는 가장 간단한 언어
- lightweight text-based structure : text를 기반으로 한 가장 가볍다.
- easy to read : 사람 눈으로도 읽기 편하다.
- key-value pairs : key와 value로 이루어져 있는 파일 포맷
- used for serialization and transmission of data between the network the network connection : data를 보통은 server와 주고 받을 때 serialization(직렬화하다)하고 data를 전송할 때 쓴다
- **independent programming language and platform**
  - prgramming language나 platform에 상관없이 쓸 수 있다.
  - C, C++,C#, JAVA, Python, PHP, Kotlin, Go 등 이런 언어에 상관없다.
  - 모든 언어와 그 언어가 쓰여지고 있는 platform에 상관없이 거의 대부분의 언어들이 JSON이 serialization된 object를 다시 그 언어의 특징에 맞게 object를 변환하고 object를 다시 JSON으로 sealization을 하는 것을 지원해주거나 많이 쓰여지고 있는 외부 라이브러리를 통해서 이런 것들이 가능하게 됨
- 예시
  1. 웹 어플리케이션(client)에 토끼라는 object가 있다면 토끼 object를 서버에 전달할 때는 토끼라는 object를 key와 value의 string type({key :value})으로 변환해서 server에 전송
  1. server에서 다시 토끼를 받아올 때도 key와 value의 string type({key :value})으로 토끼를 전송 받아와서 다시 토끼라는 object로 변환해서 브라우저에 표기

## 공부 포인트

- object to JSON : object를 어떻게 serialize(직렬화)해서 JSON으로 변환할지
- Serialize(직렬화)된 JSON을 다시 어떻게 deserialize해서 object로 변환할 것인지

## object to JSON(object를 JSON으로 변환)

- JSON.stringify(obj, replacer?);
- stringify(value: any, replacer?: (this: any, key: string, value: any) => any, space?: string | number): string;
- stringify(value: any, replacer?: (number | string)[] | null, space?: string | number): string;
- any type의 object를 받아와서 바로 string type으로 변환해줌
- replacer
  - callback 함수
  - object를 string으로 만들 때 조금 더 세밀하게 통제하고 싶을 때 사용
  - 함수 형태로 전달 혹은 array 배열 형태로 전달해도 됨
  - 함수 형태
    - (key, value) => {key와 value에 따른 다양한 활동}
    - 해당 object의 모든 key와 value 전달됨
    - 제일 처음 전달되는 key와 value는 해당 object를 싸고 있는 제일 최상위 것이 전달 후에 그 object 안 key와 value 전달
  - object의 특정 property들만 json으로 변환하고 싶을 때
    - 배열형태 : ['key1','key2'...]
- JSON으로 변환되지 않는 경우
  - 함수의 경우 object에 있는 data가 아니기 때문에 JSON으로 변환되지 않은다
  - javascript에서 자체로 들어있는 symbol 등의 javascript에만 있는 특별한 data도 JSON에 포함되지 않는다(변환되지 않는다.)

## JSON to object(JSON를 object로 변환)

- JSON.parse(json, reviver?)
- parse(text: string, reviver?: (this: any, key: string, value: any) => any): any;
- JSON의 string data를 넣으면 any type의 object로 변환이 됨
- reviver

  - (key, value) => {}
  - 전달해도 되고 안해도 되는 optional type의 callback 함수
  - callback 함수 인데 결과 값을 무언가 변형한다
  - string을 object로 변환할 때 이 object가 만들어지는 과정을 조금 더 세밀하게 조정하고 싶다면 이 함수 이용
  - 사용하는 이유

    - serialize 과정에서 함수는 json 변환에서 제외되므로 serialize가 된, 즉 string으로 만들어진 json으로부터 다시 object를 만들 때 해당 함수가 들어있지 않다.
    - new Date로 만든 Date object의 경우에도 serialize 과정에서 string으로 변환되어서 다시 object화 했을 때도 string type을 유지하며 할당되므로 getDate등의 Date 안 존재하는 api들이 사용 불가하다.

      - 해결 방법

        ```js
        const obj = JSON.parse(json, (key, value) => {
          return key === 'keyName' ? new Date(value) : value;
        });
        ```

    - 위와 같은 data들을 다시 세밀하게 변환하고 싶을 때 사용

- string으로 만들어진 json을 다시 object로 변환

## 유용한 사이트

- JSON Diff(http://www.jsondiff.com/)
  - 왼쪽 : server에서 요청했을 때 첫번째로 받아온 data
  - 오른쪽 : server에서 요청했을 때 두번째로 받아온 data
  - server에서 요청했을 때 첫번째로 받아온 data와 두번째로 받아온 data가 어떤 게 다른지 잘 모를 때 비교해 볼 수 있는 사이트
  - 문제를 debugging 할 때 유용하게 사용 가능
- JSON Beautifier(https://jsonbeautifier.org/)
  - 가끔 server에서 받아온 data를 복사해서 붙여넣으면 format이 망가지는 경우 visual studio 파일에서 JSON을 만들어서 복사 붙여넣어서 format해도 되지만 이렇게 간단하게 그 과정을 웹사이트에서 할 수 있다.
  - 왼쪽에 해당 data를 붙여넣은 다음에 가운데 beautify>> 버튼을 누르면 format을 만들 수 있다.
- JSON Parser(https://jsonparser.org/)
  - json type을 object type으로 확인해보고 싶을 때 사용
  - 왼쪽에 json 붙인 후 json parser 누르면 json으로부터 object가 어떻게 표기되어지는 지 눈으로 쉽게 확인 가능
- JSON Validator(https://tools.learningcontainer.com/json-validator/)
  - json을 붙여 넣어서 validate를 누르면 유효한 json 데이터인지 확인할 수 있다.
  - json이 이상할 때 확인해 볼 수 있는 사이트
- json data 자체가 너무 큰 경우 property name들을 다시 minify하거나 compress를 하거나 다양한 방식을 이용해서 최대한 server와 주고 받는 data의 양을 줄여서 하는 trick들도 있다.
