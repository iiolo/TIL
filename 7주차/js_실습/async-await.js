// Promise 객체를 리턴하는 함수
function p(ms) {
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            resolve();
            
        },ms);    
    });
}

// Promise 객체를 이용해서 비동기 로직을 수행할 때
p(1000).then((ms)=>{
    console.log(`${ms} ms 후에 실행된다.`);
});

// Promise 객체를 리턴하는 함수를 await로 호출하는 방법
const ms = await p(1000);
console.log(`${ms} ms 후에 실행된다.`);// 전역공간에 있어 async function으로 감싸져 있지 않아 에러 뜸

// Promise 객체를 new로 생성해서 리턴하는 형태의 async 함수 사용시
    // await를 사용하는 경우, 항상 async 함수 안에서 사용되어야 한다.
    function p(ms) {
        return new Promise((resolve, reject)=>{

            setTimeout(()=>{
                resolve();
                
            },ms);    
        });
    }

    (async function main() {
        const ms = await p(1000);
        console.log(`${ms} ms 후에 실행된다.`);
    })();


    // Promise 객체가 rejected된 경우의 처리를 위해 try catch 이용
    function p(ms) {
        return new Promise((resolve, reject)=>{

            setTimeout(()=>{
                reject(/*Error 객체*/ new Error('reason'));
                
            },ms);    
        });
    }

    (async function main() {
        try {
            const ms = await p(1000);

            // 정상적으로 resolve 되었을 때 출력할 것 작성

        } catch(error /*new Error('reason')로 만들어진 객체*/){
            console.log(error);

        }
        
    })();

// async function 자체를 사용할 수 있는 방법   
function p(ms) {
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            // resolve(ms);
            reject(/*Error 객체*/ new Error('reason'));
            
        },ms);    
    });
}

async function asyncP(){
    const ms = await p(1000); // p를 먼저 해결되고서 다음 줄로 넘어감
    return 'Mark: ' + ms;
}

    // main 함수에 asyncP를 불러서 asyncP의 제일 첫번 째 줄 p 함수를 처리하기 위해 p 함수 선언된 부분에 가서 resolve/reject 처리해서 다시 받은 인자를 문자열과 합해서 return
    (async function main() {
        // error의 전파
        try {
            // Promise.resolve를 통해서 resolve 됨, 값이 들어오면 바로 그값이 resolve 됨 그게 name으로 await를 통해서 나오고 그걸 출력
            const name = await asyncP();//main에서 asyncP라고 하는 비동기함수를 호출하면서 밑에서 일어나는 모든 일들을 전부다 main 안에 있는 try catch로 error 해결하는 방식

            // 정상적으로 resolve 되었을 때 출력할 것 작성
            console.log(name);

        } catch(error /*new Error('reason')로 만들어진 객체*/){
            console.log(error);

        }
        
    })();

// finally
function p(ms) {
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            resolve(ms);
            // reject(/*Error 객체*/ new Error('reason'));
            
        },ms);    
    });
}

async function asyncP(){
    const ms = await p(1000);
    return 'Mark: ' + ms;
}

    (async function main() {
        try {
            const name = await asyncP();
            console.log(name);

        } catch(error){
            console.log(error);

        } finally {
            console.log('end');
        }
        
    })();

// Promise와 async await 연속처리 비교
function p(ms) {
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            resolve(ms);
        },ms);    
    });
}
    // Promise
        p(1000).then(()=>p(1000)); //체이닝 처리된 것처럼

        //p(1000)처리후 p(1000)처리 되면 다시 resolve해서 p(1000) 처리 그래서 3초 걸림 그리고 나서 console 출력
        p(1000).then(()=>p(1000)).then(()=>p(1000)).then(()=> {
            console.log('3000 ms 후에 실행');
        });

    // async await
        (async function main() {
            await p(1000);
            await p(1000);
            await p(1000);
            console.log('3000 ms 후에 실행');

        })();


// async function에서의 Promise.all 처리와 Promise.race 처리
function p(ms) {
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            resolve(ms);
        },ms);    
    });
}
    // Promise.all
    // (async function main() {
    //     const results = await Promise.all([p(1000), p(2000), p(3000)]);
    //     console.log(results);

    // })();

    // Promise.race
    (async function main() {
        const result = await Promise.race([p(1000), p(2000), p(3000)]);
        console.log(result);

    })();




