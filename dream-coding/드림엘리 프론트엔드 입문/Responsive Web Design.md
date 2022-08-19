# 반응형 웹디자인

- 1990 중반은 데스크탑 위주 브라우저
- 최근에는 태블렛과 핸드폰에서 이용하는 경우가 많아 반응형 웹디자인으로 만들어야 공간 활용을 잘 할 수 있다.
- 브라우저 컨테이너 사이즈에 따라 컨텐츠가 유동적으로 변화
- 컨텐츠를 물같이 유동적으로 어떤 컨테이너에 담기든 그것에 맞게 만들어라
- 웹사이트를 만들 때 고정된 사이즈 보단 유동적으로 레이아웃을 만드는 것이 중요하다.
- px이 아닌 flex grid, flex box, %, vw, vh 등을 이용해 사이즈를 구성한다.

## media queries

- 컨테이너 사이즈에 따라 레이아웃 재배치 : css의 media Queries 이용
- 데스크탑, 태블릿, 모바일 각각 사이즈 범위 지정해서 그것에 맞게 웹사이트 변화
- 요즘에는 기준이 되는 사이즈는 없지만 굳이 나누자면
  - mobile: 320-480px
  - tablet : 768-1024px
  - desktop : 1024px-
- 미디어 유형

  - all
  - screen
  - print
  - speech

- 논리 연산자
  - and
  - not
  - only
  - ,
- 작성법 예시

```css
@media screen and (min-width: 800px) {
  //screen이 최소의 너비가 800이면 적용할 css 문법
}
```

- max-width면 0부터 설정된 px까지 적용
- 참고 : https://developer.mozilla.org/ko/docs/Web/CSS/Media_Queries/Using_media_queries

## 반응형으로 잘 만들어진 웹사이트

- github
- klienBoost
- magic leap
