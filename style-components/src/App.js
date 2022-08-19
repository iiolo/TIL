import React, {useState} from "react";
import styled/*, {css}*/ , {ThemeProvider} from "styled-components";
import Button from "./components/Button";
import Dialog from "./components/Dialog";

// Circle이라는 styled-component 생성
// const Circle = styled.div`
//   width : 5rem;
//   height : 5rem;
//   background : ${props => props.color};
//   border-radius : 50%;
//   ${props => props.huge && css`
//     width : 10rem;
//     height : 10rem;
//   `}
// `;

const AppBlock = styled.div`
  width:512px;
  margin : 0 auto;
  margin-top: 4rem;
  border : 1px solid black;
  padding : 1rem;

`;

const ButtonGroup = styled.div`
  & + &{
    margin-top:1rem;
  }
  
  
`;

const palette = {
  blue : '#228be6',
  gray: '#496057',
  pink : '#f06595'
}
function App() {
  const[dialog, setDialog] =useState(false);
  const onClick = () => {
    setDialog(true);
  };

  const onConfirm = () => {
    setDialog(false);
  };

  const onCancel = () => {
    setDialog(false);
  }

  return (
    // <Circle color="blue" huge />
    <ThemeProvider
      theme = {{
        palette
      }}>
        {/* ThemeProvider 내부에는 하나의 컴포넌트만 있어야 함 그래서 fragment 생성*/}
        <>
          <AppBlock>
            <Button color='pink' size='large' onClick={onClick}>삭제</Button>
          </AppBlock>

          <Dialog
            title="정말로 삭제하시겠습니까?"
            confirmText="삭제"
            cancelText="취소"
            onConfirm={onConfirm}
            onCancel={onCancel}
            visible = {dialog}
          >
            데이터를 정말로 삭제하시겠습니까?
          </Dialog>
            
          
      </>
    </ThemeProvider>
  );
}

export default App;
