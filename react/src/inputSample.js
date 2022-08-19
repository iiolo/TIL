import React, { useRef, useState } from 'react';

function InputSample() {

    const [inputs, setInputs] = useState({
        name: '',
        nickname: ''
      });

    //   useRef(함수형 컴포넌트에 특정 DOM 지정)
      const nameInput = useRef();//nameInput 이라는 객체 만들어짐


      const { name, nickname } = inputs; // 비구조화 할당을 통해 값 추출


    // 수정 이벤트 발생시 그 내용이 이벤트 객체(e)를 parameter로 받아와서 사용할 수 있게 함
    const onChange = (e) => {
        //console.log(e.target);//이벤트가 발생한 DOM(정보)를 가지고 있음
        //console.log(e.targat.value);//이벤트가 발생한 DOM(정보)의 값을 가지고 있음, 현재 input이 가지고 있는 값 

        // setText(e.target.value);

        const { value, name } = e.target; // 우선 e.target 에서 name 과 value 를 추출
        setInputs({
        ...inputs, // 기존의 input 객체를 복사한 뒤
        [name]: value // name 키를 가진 값을 value 로 설정
        });

    };
    
    const onReset = () => {
        // setText('');
        setInputs({
            name: '',
            nickname: '',
          })

        //   useRef()값을 가진 객체 생성 후 선택하고 싶은 DOM에다가 ref={객체이름}으로 지정 후 객체이름.current 해줄 시 그 current가  DOM을 가리키게 됨
        // 그 다음에 객체이름.current.사용하려는 DOM API 설정; 
          nameInput.current.focus(); //focus를 name으로 옮김
    };

    return (
        <div>
            
            {/*<input onChange={onChange} value={text}/>*/}{/*value값을 설정해줘야 나중에 초기화 버튼을 눌러 input을 바꿨을 때도 input에 있는 값이 비워지게 됨 */}
            <input 
            name="name" 
            placeholder="이름" 
            onChange={onChange} 
            value={name}
            ref={nameInput} //선택하고 싶은 DOM에다가 useRef()값을 가진 객체를 넣어줌 -> DOM에 직접적으로 접근할 수 있게 됨
            />

            <input
            name="nickname"
            placeholder="닉네임"
            onChange={onChange} 
            value={nickname}
            />

            <button onClick={onReset}>초기화</button>

            <div>
                <b>값: </b>
                {/* {text} */}
                {/* 불변성을 지킨다. :  객체 상태를 업데이트 할 경우 꼭 기존 상태를 한번 복사하고나서 거기다가 특정 값을 덮어씌우고 그것을 새로운 상태로 설정해줘야 한다 */}
                {name} ({nickname})
            </div>
        </div>

    
    )
}
export default InputSample;