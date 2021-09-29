// Id로 찾기
const number = document.getElementById('number');
// const increase = document.getElementById('increase');
// const decrease = document.getElementById('decrease');

// 태그 이름으로 찾기
const buttons = document.querySelectorAll('button');
const [increase, decrease] = buttons; // buttons에서 increase와 decrease로 추출 



increase.onclick = () => {
    const current = parseInt(number.innerText, 10); 
    number.innerText= current + 1;
}

decrease.onclick = () => {
    const current = parseInt(number.innerText, 10); 
    number.innerText= current - 1;
}