import React, { useState } from 'react';

function InputSample() {

    const [text, setText] = useState('');

    // 수정 이벤트 발생시 그 내용이 이벤트 객체(e)를 parameter로 받아와서 사용할 수 있게 함
    const onChange = (e) => {
        //console.log(e.target);//이벤트가 발생한 DOM(정보)를 가지고 있음
        //console.log(e.targat.value);//이벤트가 발생한 DOM(정보)의 값을 가지고 있음, 현재 input이 가지고 있는 값 

        // setText(e.target.value);

    };
    
    const onReset = () => {
        // setText('');
    };

    return (
        <div>
            
            {/*<input onChange={onChange} value={text}/>*/}{/*value값을 설정해줘야 나중에 초기화 버튼을 눌러 input을 바꿨을 때도 input에 있는 값이 비워지게 됨 */}
            <input placeholder="이름" />
            <input placeholder="닉네임" />

            <button onClick={onReset}>초기화</button>

            <div>
                <b>값: </b>
                {/* {text} */}
                이름(닉네임)
            </div>
        </div>

    
    )
}
export default InputSample;