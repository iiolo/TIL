// Toggle 버튼을 클릭할 때마다 요소에 hide라는 클래스가 부여되거나 삭제되는 기능 만들기

const el= document.querySelector('div');
const btn = document.querySelector('button');
btn.addEventListener('click', function() {
  if (el.classList.contains('hide')) {
    el.classList.remove('hide');
  } else {
    el.classList.add('hide');
  }
});
