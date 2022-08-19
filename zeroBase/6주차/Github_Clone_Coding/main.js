// js 전역 더럽히지 않기 위해 즉시 실행 함수 추가
(function (window, document) {
    // 엄격한 js 문법 사용
    'use strict';
    
    // toggle 이라는 클래스를 가지고 있는 요소(선택자들로 찾는 개념)들을 전부 찾아냄
    const $toggles = document.querySelectorAll('.toggle'); //배열 데이터x, 유사배열로 NodeList

    // toggle-btn 이라는 아이디 선택자 찾기
    const $toggleBtn = document.getElementById('toggle-btn');

    // 토글 버튼 클릭 이벤트 감지되면 function 적용
    $toggleBtn.addEventListener('click', function(){
        toggleElements();
    });
    
    // window(브라우저)에 resize 이벤트 발생할 때마다 특정 함수 실행
    window.addEventListener('resize', function() {
        // 콘솔에 Resized 로그 작성
        // console.log('Resized');

        // 조절된 브라우저의 크기가 1024보다 클때
        if(window.innerWidth > 1024) {
            // off toggle element 
            offElements();
        }   
    });

    function toggleElements(){
        // 유사배열을 배열로 바꾼 후 반복
        [].forEach.call($toggles, function(toggle) {
            // toggles의 하나의 toggle를 찾아서 그 toggle의 classList를 통해서 toggle 기능 실행
            // toggle이라는 클래스를 가지고 있는 요소에다가 on이라는 클래스 선택자를 함수 toggleElements가 실행 될 때마다 toggle 하겠다
            toggle.classList.toggle('on');
        });
    }

    // 요소의 화면에 보이는 개념을 끄는 함수
    function offElements () {
        [].forEach.call($toggles, function (toggle) {

            // 모든 toggle 요소에 들어있는 on 클래스 제거
            toggle.classList.remove('on');
        });
    }
}) (window, document);