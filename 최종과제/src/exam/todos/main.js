// 코드 구현
const containerBox = document.querySelector(".container"),
    contents = containerBox.querySelector(".todos"),
    list = contents.querySelector("#list"),
    inputList = document.querySelector(".inputtodo"),
    listForm = inputList.querySelector("#listForm"),
    input = listForm.querySelector("input");

const list_LS = "toDos";

let toDos = [];

function saveList(){
    localStorage.setItem(list_LS, JSON.stringify(toDos));
}

function deleteList(event){
    const btn = event.target;
    const li = btn.parentNode;
    list.removeChild(li);
    const cleanList = toDos.filter(function(toDo){
        return toDo.id !== parseInt(li.id);
    });
    toDos = cleanList;
    saveList();
}

function showingList(text){
    const li = document.createElement("li");
    const span = document.createElement("span");
    const input_text = document.createElement("input");
    const listNum = toDos.length+1;
    span.innerText = "x";
    span.addEventListener("click", deleteList);
    input_text.innerText = text;
    list.appendChild(li);
    li.appendChild(input_text);
    li.appendChild(span);

    li.id = listNum;
    const toDoObj = {
        text: text,
        id: listNum
    };
    toDos.push(toDoObj);
    saveList();
}

function handleSubmit(event){
    event.preventDefault();
    const currentValue = input.value;
    showingList(currentValue);
    input.value = "";
}

function loadList(){
    const loadedList = localStorage.getItem(list_LS);
    if(loadedList !== null){
        const parsedData = JSON.parse(loadedList);
        parsedData.forEach(function(toDo){
            showingList(toDo.text);
        });
    }
}

function init(){
    loadList();
    listForm.addEventListener("submit", handleSubmit);
}

init();