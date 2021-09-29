// 함수 increaseAndPrint를 setTimeout, callback으로 구현한 비동기적 처리
    // function increaseAndPrint(n, callback) {
    //     setTimeout(() => {
    //         const increased = n + 1;
    //         console.log(increased);
    //         if (callback) {
    //             callback(increased)
    //         }
    //     }, 1000)
    // }

    // callback 지옥
        // increaseAndPrint(0, n => {
        //     increaseAndPrint(n, n => {
        //         increaseAndPrint(n, n => {
        //             increaseAndPrint(n, n => {
        //                 increaseAndPrint(n, n => {
        //                     console.log('작업 끝!');
        //                 })
        //             })
        //         })
        //     });
        // });

// Promise
    // const myPromise = new Promise((resolve, reject) => {
    //     setTimeout(() => {
    //         // resolve('')
    //         reject(new Error());
    //     },1000);
    // })

    // myPromise.then(result => {
    //     console.log(result);
    // }).catch (e => {
    //     console.log(e);
    // })

    // 함수 increaseAndPrint를 Promise로 구현
    function increaseAndPrint(n) {
        return new Promise((resolve, reject) => {
            setTimeout(() => {
                const value = n + 1;
                if (value === 5) {
                    const error = new Error();
                    error.name = 'ValueIsError';
                    reject(error);
                    return;
                }
    
                // 성공시
                console.log(value);
                resolve(value);
                
            }, 1000);
        
        });
           
    }

    // increaseAndPrint(0).then(n => {
    //     return increaseAndPrint(n);
    // }).then(n => {
    //     return increaseAndPrint(n);
    // }).then(n => {
    //     return increaseAndPrint(n);
    // }).then(n => {
    //     return increaseAndPrint(n);
    // }).then(n => {
    //     return increaseAndPrint(n);
    // }).catch(e => {
    //     console.error(e);
    // })

    // 위코드를 간략하게 표현
    increaseAndPrint(0).then(increaseAndPrint)
    .then(increaseAndPrint)
    .then(increaseAndPrint)
    .then(increaseAndPrint)
    .then(increaseAndPrint)
    .catch(e => {
        console.error(e);
    })