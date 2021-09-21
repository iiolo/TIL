// 표준 내장 객체라 정의하지 않아도 작동
console.log(Promise);

// 프로미스 객체 생성방법 1. 생성자로 생성
new Promise(/*executor 함수*/ (resolve, reject)=>{});// pending (대기) 상태

    // resolve 함수 사용시 - fulfilled 상태(실행된 상태)
    new Promise((resolve, reject)=>{
        //1. pending 상태 돌입
        //2. 비동기적인 상황 발생
        //3. 정상적으로 처리 완료
        resolve(); //4. resolve 함수 작성
        //5. fulfilled 상태 돌입
    });

        // p 라는 프로미스 객체는 1000ms 후에 fulfilled 됨
        new Promise((resolve, reject)=>{
            /* pending */
            setTimeout(() => {
                resolve(); /* 1초 후에 fulfilled 상태 */
            },1000); // 특정 ms 후에 나올 함수 설정 가능

        });

        // 프로미스 객체 사용(p라는 프로미스 객체가 fulfilled 되는 시점에 p.then 안에 설정한 callback 함수 실행)
        const p = new Promise((resolve, reject)=>{
            /* pending */
            setTimeout(() => {
                resolve(); /* 1초 후에 fulfilled 상태 */
            },1000); // 특정 ms 후에 나올 함수 설정 가능

        });
        
        p.then(()=>{
            /* callback */
            console.log('1000ms 후에 fulfilled 됩니다.');

        })

        // 프로미스 객체를 생성하면서 리턴하는 함수
        function p () { new Promise((resolve, reject)=>{
            /* pending */
            setTimeout(() => {
                resolve(); /* 1초 후에 fulfilled 상태 */
            },1000); // 특정 ms 후에 나올 함수 설정 가능

            });
        }

        p.then(()=>{
            /* callback */
            console.log('1000ms 후에 fulfilled 됩니다.');
        });


    // reject 함수 사용시 = rejected(거부) 상태
    new Promise((resolve, reject)=>{
        //1. pending 상태 돌입
        //2. 비동기적인 상황 발생
        //3. 정상적으로 처리 완료
        reject(); //4. resolve 함수 작성
        //5. rejected 상태 돌입
    });

        // 프로미스 객체 사용(p라는 프로미스 객체가 rejected 되는 시점에 p.catch 안에 설정한 callback 함수 실행)
        function p () { new Promise((resolve, reject)=>{
            /* pending */
            setTimeout(() => {
                reject(); /* 1초 후에 rejected 상태 */
            },1000); // 특정 ms 후에 나올 함수 설정 가능

            });
        }

        p.then(()=>{
            /* callback */
            console.log('1000ms 후에 fulfilled 됩니다.');
        })
        .catch(() => {
            console.log('1000ms 후에 rejected 됩니다.');
        });


    // executor의 resolve 함수를 실행할 때 인자를 넣어 실행하면, then의 callback 함수의 인자로 받을 수 있음
    function p () { new Promise((resolve, reject)=>{
        /* pending */
        setTimeout(() => {
            resolve('hello'); 
        },1000); // 특정 ms 후에 나올 함수 설정 가능

        });
    }

    p.then(message =>{
        /* callback */
        console.log('1000ms 후에 fulfilled 됩니다.', message);
    })
    .catch(() => {
        console.log('1000ms 후에 rejected 됩니다.');
    });

    // executor의 reject 함수를 실행할 때 인자를 넣어 실행하면, catch의 callback 함수의 인자로 받을 수 있음
    function p () { new Promise((resolve, reject)=>{
        /* pending */
        setTimeout(() => {
            // 문자열
            // reject('error');

            // error 객체 생성해서 넘김
            reject(new Error('bad'));
        },1000); // 특정 ms 후에 나올 함수 설정 가능

        });
    }

    p.then(message =>{
        /* callback */
        console.log('1000ms 후에 fulfilled 됩니다.', message);
    })
    .catch((/*reason*/ error) => {
        // 문자열
        // console.log('1000ms 후에 rejected 됩니다.', reason);

        // error 객체
        console.log('1000ms 후에 rejected 됩니다.', error);

    })
    .finally(() => {
        // 최종함수 실행
      console.log('end');  
    });


// callback의 연속(Promise 없었을 때)-callback을 활용한 비동기 작업
function c(callback) { 
    /* pending */
    setTimeout(() => {
        callback();
    },1000); // 특정 ms 후에 나올 함수 설정 가능

}
    // 한번의 비동기 작업 후 callback
    // c 라는 함수를 호출하면서 c가 끝나면 실행할 어떤 함수를 넣어줌
    c(()=> {
        console.log('1000ms 후에 callback 됩니다.');
    });

    c(()=> {
        c(()=> {
            c(()=> {
                console.log('3000ms 후에 callback 됩니다.');
            });
        });
    });

// Promise을 활용한 비동기 작업
function p () { 
    return new Promise((resolve, reject)=>{
        setTimeout(() => {
            resolve();
        },1000); 

    });
}

    
    p().then(() => {
        // 1초 후에 될 작업 callback 함수로 넣어주기
        return p(); //then 실행되면 이후에 다시 p함수가 실행된 프로미스객체로 return됨
    })
    .then(() => p())//2초 후
    .then(p)// 3초 후 p함수 바로 실행 후 다시 프로미스 객체 또 만들어서 넘김
    .then(() => {
        console.log('4000ms 후에 fulfilled 됩니다.');
    }) // 4초 후

// 프로미스 객체 생성방법 2. Promise.resolve(value) 
Promise.resolve(/*value*/);


    // value 부분에 프로미스 객체 넣기
    Promise.resolve(new Promise((resolve,reject)=>{

        // 1초뒤에 실행되는 fulfilled되는 비동기 프로미스 객체
        setTimeout(()=>{
            resolve('foo');
        }, 1000)
    })).then((data/*data라고 하는 인자로 foo를 받아옴*/)=>{
        console.log('프로미스 객체인 경우, resolve가 된 결과를 받아서 then이 실행됩니다.', 
        data,
        );
    });

    // value 부분에 일반 값 넣기
        // resolve 할게 없어서 바로 then으로 넘어감
    Promise.resolve('bar').then(data =>{
        console.log('then 메서드가 없는 경우, fulfilled 됩니다.', data);
    })

// 프로미스 객체 생성방법 3. Promise.reject(error)
Promise.reject(/*value*/);


    // value 부분에 error 객체 넣기
    Promise.resolve(new Error('reason')).then(error => {

    }).catch(error => {
        console.log(error);
    });

    // value 부분에 일반 값 넣기
        // resolve 할게 없어서 바로 then으로 넘어감
    Promise.resolve('bar').then(data =>{
        console.log('then 메서드가 없는 경우, fulfilled 됩니다.', data);
    })

// 프로미스 객체 생성 방법 - 4. Promise.all
function p(ms) {
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            resolve();
            
        },ms);//인자로 받은 ms 이후에 실행
        
    });
}
    // p 함수로 만들어낸 객체 호출
    // 각 p 함수 객체들이 fulfilled된 후 then이 불림
    Promise.all([p(1000), p(2000), p(3000)]).then(messages=>{
        console.log('모두 fulfilled 된 이후에 실행됩니다.',messages/*[l000, 2000, 3000]*/);
    });


// 프로미스 객체 생성 방법 - 5. Promise.race
function p(ms) {
    return new Promise((resolve, reject)=>{

        setTimeout(()=>{
            resolve();
            
        },ms);//인자로 받은 ms 이후에 실행
        
    });
}
    // p 함수로 만들어낸 객체 호출
    // 가장 먼저 fulfilled된 객체 후에 then 실행 
    Promise.race([p(1000), p(2000), p(3000)]).then(message=>{
        console.log('가장 빠른 하나가 fulfilled 된 이후에 실행됩니다.',message/*[l000, 2000, 3000]*/);
    });

