# PWA(Progressive Web App)

: 새롭고 강력한 소프트웨어 앱을 만드는 방식

- 모바일 폰에서도 설치해서 실행할 수 있고 desktop에서도 어플리케이션처럼 실행할 수 있다.

## native apps와 브라우저 웹앱

- 안드로이드나 아이폰처럼 특정한 플랫폼에서 동작하는 native apps는 플랫폼에서 제공하는 다양한 API를 이용해서 사용자에게 다양한 기능을 제공하는 역량이 크지만 앱스토어를 이용해서 설치해야 하고 그 플랫폼에서만 사용할 수 있다는 단점이 있다.
- 브라우저에서 동작하는 웹앱은 플랫폼에 상관없이 브라우저만 있으면 사용가능하므로 사람들이 쉽게 접근해서 사용할 수 있는 장점이 있지만 native app처럼 플랫폼 자체의 API를 사용할 수 없다는 단점 이 있다.

## 개념

- html, css, js를 이용해서 만든 웹앱을모던한 웹브라우저 APIs와 결합해서 크로스 플랫폼에서 동작하는 어플리케이션을 손쉽게 만들수 있음. 즉 이미 만든 웹사이트나 웹 어플리케이션이 있다면 몇가지만 추가하면 손쉽게 데스크탑에서 동작하는 모바일에서도 동작할 수 있는 어플리케이션을 만들 수 있다.
- 접근성이 높은 웹앱의 장점과 플랫폼 API를 사용할 수 있는 native app의 장점들이 결합되어 있음

## 출시 배경

- 2007[스티븐스-아이폰] :웹 코드로 어플리케이션을 만들면 별도의 SDK가 필요하지 않고 다음 버전의 어플리케이션을 재배포할 때도 복잡한 절차를 거치지 않아도 되고 한번 웹코드를 작성하기만 하면 다양한 플랫폼에 동시에 출시할 수 있다로 스티븐 잡스가 아이폰에 도입할 것이라 했지만 돈을 더 많이 벌 수 있는 애플스토어를 택하면서 개발이 무산됨
- 2015[Alex Russell, Frances Berriman] : PWA 단어가 처음 나옴
  - PWA 사용 조건
    - responsive web design : 컨텐츠가 유동적으로 반응할 수 있는 웹 UI요소가 보여지는 기기별로 반응적으로 표기가 되도록 할 것
    - service workers : service worker를 이용할 것
    - app manifest : app manifest를 사용
    - push notification : push notification을 사용할 수 있을 것
    - native app-like capabilities : 사용자들이 native app을 사용하는 것처럼 느낄 수 있도록 다양한 브라우저 API를 이용해서 구현하도록 할 것
    - 핵심 : 사용자의 디바이스에 설치가 가능하도록 만들 것
- 2021 : 더 많고 강력한 플랫폼 API 제공되고 있다.
  - google, microsoft, intel에서 함께 진행하고 있는 project fugu는 web capability project로 어떻게 하면 브라우저 API를 통해서 플랫폼에서 필요한 파일접근, 카메라 제어, 클립보드 접근, 연락처, 자동으로 런칭하는 등 다양한 기능을 할 수 있도록 할 건지 활발하게 개발하는 중이다.
  - google에서도 다양한 개발자들에게 적극적으로 접근해서 PWA를 홍보하고 있으며, PWA를 적용하기 필요한 API가 무엇이 있는지 활발하게 물어보고 의논하고 있다.
  - Hybrid App : 기존의 cordova나 electron을 이용해 만들었던 Hybrid App 개발에 있었던 여러가지 제약사항들에 대해서 더 나은 다양한 solution들을 제공하고 있다.

## PWA 한계점

- 새롭게 추가되는 브라우저 API들은 특정 브라우저나 예전 브라우저에서는 사용할 수 없다.
- mozilla사의 firefox는 desktop용 브라우저에서는 PWA는 지원하지 않고 안드로이드에서만 제공됨
- 애플의 경우는 수입 관련된 문제때문에 PWA 거부 중이다. 하지만 safari를 통해 PWA를 설치할 수 있다.
- native app처럼 모든 플랫폼의 API를 사용할 수 없어서 완전히 native app처럼 만들기에는 많은 제약사항이 존재한다.

## 유용한 tool

- PWA Builder : microsoft사에서 만든 오픈소스 프로젝트로 웹사이트를 PWA로 전환할 때 어떤지 검토해주고 빠진 부분들을 자동으로 채워주면서 PWA를 심플하게 만들 수 있게 도와줌
- Workbox : 구글이 만든 다양한 PWA를 위한 service worker를 자동으로 만들어주는 라이브러리
- Maskable.app : 더 나은 PWA 사용성을 위한 adaptive icon을 디자인 할 수 있는 tool

## PWA 조건

1. 웹코드 : 웹코드 로 만든 웹사이트나 웹 어플리케이션이어야 함
1. HTTPs : PWA에서 보안은 굉장히 중요한 issue이므로 HTTPs를 이용해서 서비스가 제공되어야 함
1. Application Manifest: Application Manifest가 있어야 한다. JSON 포맷으로 된 텍스트 파일이다. 웹 어플리케이션에 대한 여러가지 정보가 담겨있는 파일들이 있어야 함, 다양한 기기들에 어플리케이션을 설치할 수 있도록 도와줌
1. Service Worker : javascript로 작성할 수 있는 script로 어플리케이션에서 서버와 데이터를 주고 받을 때 중간에서 그 모든 요청들을 통제하고 관리 할 수 있다. 어떤 특정 네트워크과의 반응에 한해서 이부분은 따로 저장해놨다가 오프라인 상태일 때 저장한 데이터를 보여주기나 최신 뉴스들은 미리미리 fetching을 해와서 저장을 미리 해두면 사용자가 어플리케이션을 키자마자 데이터를 보여줄 수 있는 성능이 좋은 어플리케이션을 만들기 위해서 사용할 수 있다.

## 좋은 PWA를 만들기 위한 원칙

- 제일 중요한 것은 사용자에게 얼마나 좋은 user experience를 제공하는 가
- Responsive : responsive하게 컨텐츠를 신경써서 만들기
- Connectivity independent : 오프라인 일때도 오프라인이라고만 말하는 것이 아닌 사용자가 온라인인지 오프라인인지 상관하지 않고 어플리케이션을 잘 쓸수 있게 만들어야 함
- App-like Interactions : 사용자가 웹앱인지 native app인지 모를정도로 native app 처럼 만들 것
- Fresh : 사용자에게 필요한 데이터를 먼저 다운로드 받을 수 있게 하기
- 그외의 원칙들 : Safe, Discoverable, Re-engageable, Installable, Linkable

## PWA 사용 단계

1. 웹 url 만들기
   - github, netlify 배포 툴 사용
   - ngrok : 로컬에서 동작하고 있는 로컬 host url을 외부에서 접근이 가능하도록 url 만들수 있음(https로 만들 수도 있음)
1. PWA Builder로 어떤 부분이 빠져있는지 점수 확인 후 필요한 부분을 메꿔서 채워넣고 다시 PWA Builder로 PWA에 적합한지 확인
1. Maskable을 통해 PWA을 위한 icon 만들기
1. index html 라이브 서버로 구동 후 : 뒤에 있는 port번호 확인
1. html을 구현한 vscode terminal에서 ngrok http port번호 입력
1. 외부에서 접근 가능한 두가지 url이 forwarding으로 나옴
1. 보안이 더 추가된 https url 선택
1. 그 url로 사이트 확인 후 url을 pwa builder에 입력해 점수 확인
1. pwa builder - Manifest Options에서 웹 어플리케이션에 대한 정보 추가

   - https://web.dev/install-criteria/ 에서 manifest에는 어떤 내용이 들어가야하는 지 정리 잘되어 있음

1. pwa builder - Service worker Options

   - offline Page : 오프라인 페이지 일때 사용자에게 어떤 것을 보여줄지, 미리 데이터를 잘 캐시해두었다면 오프라인이더라도 동일한 데이터 보여줄 수 있음

1. 다했으면 next 누른 후 pwa zip download -> generate 눌러 다운 받기
1. 다운 받은 폴더에서 manifest 파일, imges 폴더, pwa builder-sw 폴더에서의 pwabuilder-sw.js 파일 프로젝트 폴더에 옮겨주고 아래 코드 html에 붙여 넣기(https://github.com/pwa-builder/pwabuilder-web/blob/V2/src/assets/next-steps.md 이거 보고 따라하면 됨)

```html
<link rel="manifest" href="manifest.json" />
<script type="module">
  import 'https://cdn.jsdelivr.net/npm/@pwabuilder/pwaupdate';
  const el = document.createElement('pwa-update');
  document.body.appendChild(el);
</script>
```

13. pwabuilder-sw.js 파일에서 offlineFallbackPage에서 오프라인일경우 어디 페이지로 갈 것인지 설정하고 저장
1. pwa builder 홈페이지에서 test updated app 버튼 클릭해서 업데이트 된 페이지 다시 평가
1. next 버튼 누르면 window, android, samsung에서 앱스토어 배포할 수 있는 어플리케이션이 있다.
1. ngrok에서 얻은 url로 다시 접속하면 오른쪽 하단에 ready to use Offline 이라는 오프라인 일때도 사용가능하다는 문구가 뜨고 오른쪽 상단 url 끝 쪽에 보면 다운로드 할 수 있는 아이콘이 나오고 그걸 누르면 내 desktop에 설치할 수 있다.
