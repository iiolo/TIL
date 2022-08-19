import React,{useState} from 'react';

function Counter() {
    const [number, setNumber /*number를 바꿔주는 원소*/] = useState(0); 

    const onIncrease = () => {
        setNumber(preNumber => preNumber+1)//number에 설정해 주고싶은 값 혹은 함수
    }

    const onDecrease = () => {
        setNumber(preNumber => preNumber-1)
    }

    return (
        <div>
            <h1>{number}</h1>
            <button onClick={onIncrease}>+1</button>
            <button onClick={onDecrease} >-1</button>
        </div>
    )
    
}

export default Counter;