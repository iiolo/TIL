# Flex

## flex item 속성
### 1.order : flex item의 순서 결정
- 각각의 item의 순서 설정
- item에 순서를 지정하고 숫자가 클수록 순서가 밀림
- 음수가 허용(더 작을수록 순서가 앞으로 오게 됨)
- html 구조와 상관없이 순서 변경 가능해서 css만으로 순서 변경시 유용
- order 값 같을 시 html 구조(먼저 작성된 순서대로)대로 나열 됨 
- 숫자 : 기본값은 0으로 item 순서 결정

### 2. flex : flex-grow, flex-shrink, flex-basis의 단축속성

### 3. flex-grow : flex-item(container 안에 들어있는 아이템)의 증가 너비 비율 설정
- container의 너비가 늘어나거나 줄어들 때 얼마만큼의 비율을 가질 것인가 설정
- flex grow를 다 더한 다음 각각의 item의 flex grow/총 개수가 각 item 당 전체 container 너비에서 가져가는 비율이 된다. (ex) flex-grow을 가지고 있는 세 아이템이 1:2:1이라면 각각 전체너비의 1/4, 2/4, 1/4 너비을 갖게 된다)
- 숫자가 클수록 더 많은 너비를 가짐
- 1:0:0일경우 flex-grow가 1인 item이 0을 갖고 있는 item들의 제공된 width를 제외하곤 나머지 container 넓이를 다 차지하게 된다.
- flex-grow을 지정해줌으로써 iterm 각각이 container에서 가지는 비율을 지정해줄 수 있다.
- 기본 가로 세로너비 지정돼 있는 경우 비율이 완벽히 맞지 않다.
- 가변하는 부분에는 flex-grow를 1로 설정해서 container 너비에 맞게 움직이도록 설정, 가변하지 않는 부분에는 고정된 가로 세로값 지정해주는 형태로 만들 수 도 있다
- 숫자: 기본 값은 0으로 item의 증가 너비 비율을 설정

### 4. flex-shrink : flex-item의 감소 너비 비율 설정
- container의 너비가 감소할 때 item의 너비가 감소하는 비율 설정
- 숫자가 크면 item이 줄어드는 비율이 다른 item들이 줄어드는 비율보다 더 많이 감소한다.
- flex-basis*flex-shrink : flex-basis*flex-shrink 이렇게 해서 비율 계산 후 그 총비율을 활용해서flex-basis-(container 너비가 줄어든 크기*(item의 비율/총비율)=줄어든 너비를 제외한 item의 각 너비
- item이 가변 너비가 아니거나 값이 0일경우 효과 없음
- 다루기 어려움 : 단순히 감소되는 비율만 설정하는 것이 아니라 item이 가지고 있는 flex-basis, 고정된 width, height 설정시 감소되는 비율을 계산하는 것이 까다로워짐
- flex-basis와 고정된 width값에 영향을 받음
- 숫자: 기본값은 1이고 item의 갑소너비 비율 설정

### 5. flex-basis: flex-item의 (공간 배분 전) 기본 너비 설정
- width는 고정너비로 다른 개념이다.
- 기본값인 auto 경우 width, height 등의 속성으로 item 너비 설정 가능 
- 단위 값 주어질 경우 설정 할 수 없음
- flex grow 증가너비에 상관없이 요소가 가지고 있을 기본 너비 설정해주는 속성
- flex grow 비율대로 딱딱 설정하고 싶으면 flex basis를 0으로 하기
- auto : 기본값으로 가변 item과 같은 너비, 요소 너비 설정하는 개념
- 단위 : px, em, cm 등 단위로 지정, 단위로 준 기본 너비가 있는 나머지 영역만 가지고 증가너비가 영향을 준다.

### 6. align-self: 교차 축(cross-axis)에서 item의 정렬 방법 설정
- item 하나에만 일시적 부여
