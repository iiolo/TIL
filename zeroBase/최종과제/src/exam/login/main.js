
const inputBox = document.querySelector('.input-box');

function activateBtn() {
    const btn = document.querySelector('.btn-login'),
        userId = document.querySelector('.inputId').value,
        userPw = document.querySelector('.inputPw').value,
        checkId = /^\w[\w\-\.]*@\w+\.\w{2,}/;

    btn.disabled = !(checkId.test(userId) && (userPw.length > 5));
}

inputBox.addEventListener('keyup', activateBtn);