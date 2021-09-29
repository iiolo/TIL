function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
    
}

const getDog = async() => {
    await sleep(1000);
    return '멍멍이';
}

const getRabbit = async() => {
    await sleep(500);
    return '토끼';
}
const getTurtle = async() => {
    await sleep(3000);
    return '거북이';
}

async function process() {
    // Promise.all
    // getDog(), getRabbit(), getTurtle() 이 모든 Promise 들이 시작하고 나서 모두 끝나면 results변수 안에 Promise들 각각 끝난 값이 배열로 반환된다.
    const [dog, rabbit, turtle] = await Promise.all([getDog(), getRabbit(), getTurtle()]);

    console.log(dog);
    console.log(rabbit);
    console.log(turtle);

    // Promise.race
    const first = await Promise.race([getDog(), getRabbit(), getTurtle()]);
    console.log(first);
}

process();