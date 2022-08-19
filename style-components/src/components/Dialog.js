import React, {useState, useEffect} from "react";
import styled, {keyframes, css} from "styled-components";
import Button from "./Button";

// 서서히 나타나는 효과
const fadeIn = keyframes`
    /* 시작 */
  from {
    opacity: 0
  }

  /* 끝 */
  to {
    opacity: 1
  }
`;

const fadeOut = keyframes`
    /* 시작 */
  from {
    opacity: 1
  }

  /* 끝 */
  to {
    opacity: 0
  }
`;

// 아래에서 위로 올라오는 효과
const slideUp = keyframes`
  from {
    transform: translateY(200px);
  }
  to {
    transform: translateY(0px);
  }
`;

const slideDown = keyframes`
  from {
    transform: translateY(0px);
  }
  to {
    transform: translateY(200px);
  }
`;

const DarkBackground = styled.div`
  position: fixed;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  background: rgba(0, 0, 0, 0.8);

  animation-duration: 0.25s;
  animation-timing-function:ease-out;
  animation-name:${fadeIn};
  animation-fill-mode:forwards;

  ${props => props.disappear && css`
    animation-name:${fadeOut};
  `}
`;


// 흰색박스
const DialogBlock = styled.div`
  width: 320px;
  padding: 1.5rem;
  background: white;
  border-radius: 2px;
  h3 {
    margin: 0;
    font-size: 1.5rem;
  }
  p {
    font-size: 1.125rem;
  }

  animation-duration: 0.25s;
  animation-timing-function:ease-out;
  animation-name:${slideUp};
  animation-fill-mode:forwards;

  ${props => props.disappear && css`
    animation-name:${slideDown};
  `}
`;

const ButtonGroup = styled.div`
/* 여백 및 정렬 */
  margin-top: 3rem;
  display: flex;
  justify-content: flex-end;
`;

// 우리가 만든 Button 컴포넌트 상속받음
const ShortMarginButton = styled(Button)`
  & + & {
    margin-top: 0rem;
    margin-left: 0.5rem;
  }
`;

function Dialog({
    title,
    children,
    confirmText,
    cancelText,
    visible,
    onConfirm,
    onCancel
}) {

    // animate : 현재 애니메이션 보여주는 중
    const[animate, setAnimate] = useState(false);

    // localVisible : dialog 자체적으로 관리하는 visible 값, true에서 false로 전환되는 시점만을 캐치하기위해 만든 것
    const [localVisible, setLocalVisible] = useState(visible);

    useEffect(() => {
        // visible 값이 true -> false 
        if (localVisible && !visible) {
          setAnimate(true);
          setTimeout(() => setAnimate(false), 250); // 0.25초 뒤에 animate 값을 false로 설정
        }
        setLocalVisible(visible);//실제 props로 받아온 visible 값이 바뀔 때마다 localVisible 값도 동기화
    }, [localVisible, visible]);
    
    if(!localVisible && !animate) return null;

    return (
        <DarkBackground disappear={!visible}>
          <DialogBlock disappear={!visible}>
            <h3>{title}</h3>
            <p>{children}</p>
            <ButtonGroup>
              <ShortMarginButton color="gray" onClick={onCancel}>{cancelText}</ShortMarginButton>
              <ShortMarginButton color="pink" onClick={onConfirm}>{confirmText}</ShortMarginButton>
            </ButtonGroup>
          </DialogBlock>
        </DarkBackground>
      );
}

Dialog.defaultProps = {
    confirmText: '확인',
    cancelText: '취소'
};

export default Dialog;