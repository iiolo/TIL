// Q1. make a string out of an array 스트링으로 하나로 묶어내라
{
  const fruits = ['apple', 'banana', 'orange'];
  const result = fruits.join();
  console.log(result);
}



// Q2. make an array out of a string 주어진 string을 array로 변환
{
  const fruits = '🍎, 🥝, 🍌, 🍒';
  const result2 = fruits.split(',', 2);
  console.log(result2);
}

// Q3. make this array look like this: [5, 4, 3, 2, 1]
{
  const array = [1, 2, 3, 4, 5];
  const rever = array.reverse();
  console.log(rever);
}

// Q4. make new array without the first two elements  첫번째 두번째 요소를 제외한 나머지 세개만 들어있는 새로운 배열 만들기
{
  const array = [1, 2, 3, 4, 5];
  const s = array.slice(2,5);
  console.log(s);
}

class Student {
  constructor(name, age, enrolled, score) {
    this.name = name;
    this.age = age;
    this.enrolled = enrolled;
    this.score = score;
  }
}
const students = [
  new Student('A', 29, true, 45),
  new Student('B', 28, false, 80),
  new Student('C', 30, true, 90),
  new Student('D', 40, false, 66),
  new Student('E', 18, true, 88),
];

// Q5. find a student with the score 90
{
  const score90 = students.find( (student) => {
    // students 배열에 있는 아이템들이 순차적으로 호출되는데 아래 조건에 맞는 아이템이 나타나면 함수를 멈춤
    return student.score === 90;
  });
  console.log(score90);
}

// Q6. make an array of enrolled students
{
  const enroll = students.filter((student)=> student.enrolled);
  console.log(enroll);
}

// Q7. make an array containing only the students' scores 학생들의 점수만 들어있는 배열 만들기
// result should be: [45, 80, 90, 66, 88]
{
  const scoreArray = students.map((student)=>student.score);
  console.log(scoreArray);
}

// Q8. check if there is a student with the score lower than 50 
// 이 배열안에 학생들의 점수가 50점 보다 작은 학생이 있는지 없는지 확인
// 45점인 학생이 있으므로 결과가 true가 return되게 만들면 됨
{
  console.clear();
  const lower50 = students.some(student => student.score < 50);
  console.log(lower50);
}

console.clear();
// Q9. compute students' average score
{
  const average = students.reduce((prev, curr)=>  prev + curr.score, 0)
  console.log(average / students.length);
}

// Q10. make a string containing all the scores
// result should be: '45, 80, 90, 66, 88'
{
  const strArray = students
  .map(student => student.score)
  .join();
  console.log(strArray);
}

// Bonus! do Q10 sorted in ascending order
// result should be: '45, 66, 80, 88, 90'
{
  const list = students
  .map(student => student.score)
  .sort((a,b)=>a-b)
  .join()

  console.log(list);
}
