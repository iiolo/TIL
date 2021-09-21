// 표준 내장 객체라 정의하지 않아도 작동
console.log(Promise);

// 생성자로 생성
new Promise(/*executor 함수*/ (resolve, reject)=>{});// pending (대기) 상태

    // resolve 함수 사용시 - fullfilled 상태(실행된 상태)
    new Promise((resolve, reject)=>{
        //1. pending 상태 돌입
        //2. 비동기적인 상황 발생
        //3. 정상적으로 처리 완료
        resolve(); //4. resolve 함수 작성
        //5. fullfilled 상태 돌입
    });

        // p 라는 프로미스 객체는 1000ms 후에 fullfilled 됨
        new Promise((resolve, reject)=>{
            /* pending */
            setTimeout(() => {
                resolve() /* 1초 후에 fulfilled 상태 */
            },1000); // 특정 ms 후에 나올 함수 설정 가능

        });

        // 프로미스 객체 사용(p라는 프로미스 객체가 fulfilled 되는 시점에 p.then 안에 설정한 callback 함수 실행)
        const p = new Promise((resolve, reject)=>{
            /* pending */
            setTimeout(() => {
                resolve() /* 1초 후에 fulfilled 상태 */
            },1000); // 특정 ms 후에 나올 함수 설정 가능

        });
        
        p.then(()=>{
            /* callback */
        })


    // reject 함수 사용시 = rejected(거부) 상태
    new Promise((resolve, reject)=>{
        //1. pending 상태 돌입
        //2. 비동기적인 상황 발생
        //3. 정상적으로 처리 완료
        reject(); //4. resolve 함수 작성
        //5. rejected 상태 돌입
    });


