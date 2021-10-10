import React from "react";
import styled/*, {css}*/ , {ThemeProvider} from "styled-components";
import Button from "./components/Button";

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
  return (
    // <Circle color="blue" huge />
    <ThemeProvider
      theme = {{
        palette
      }}>
      <AppBlock>
         <ButtonGroup>
          <Button color = 'pink' size = 'large'>BUTTON</Button>
          <Button>BUTTON</Button>
          <Button size = 'small'color = 'gray'>BUTTON</Button>
        </ButtonGroup>

        <ButtonGroup>
          <Button color = 'pink' size = 'large' outline>BUTTON</Button>
          <Button outline>BUTTON</Button>
          <Button size = 'small'color = 'gray' outline>BUTTON</Button>
        </ButtonGroup>

        <ButtonGroup>
          <Button size = 'large' fullWidth>BUTTON</Button>
          <Button size = 'large' color = 'gray' fullWidth>BUTTON</Button>
          <Button color = 'pink' size = 'large' fullWidth>BUTTON</Button>
        </ButtonGroup>
      </AppBlock>
    </ThemeProvider>
  );
}

export default App;
