// 배열 안 항목들 합 구해주는 함수
function sumOf(numbers) {
    let sum = 0;
    
    // numbers에 있는 모든 원소들을 하나 하나씩 모두 합해주기
    for(let i = 0 ; i < numbers.length; i++) {
        sum += numbers[i]; //numbers 배열 안에 있는 값들을 주르륵 반복하게 되면서 sum에다가 i 순서의 값들을 더해지게 됨

    }
    return sum; // 15
}

const result = sumOf([1,2,3,4,5]);
console.log(result);