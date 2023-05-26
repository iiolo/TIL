import java.io.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Scanner

fun main() {
    val menu = Menu()
    menu.running()
}

class Menu() {
    val sc = Scanner(System.`in`)
//    val exerciseList = mutableListOf<Exercise>()



    // 메뉴를 선택하는 기능
    fun running() {

        var inputNumber = 0

        // 미리 운동리스트에 운동 넣어두기
//        exerciseList.add(Exercise("헬스1", 30, 3, LocalDate.parse("2023-05-22", DateTimeFormatter.ISO_DATE)))
//        exerciseList.add(Exercise("헬스2", 15, 2, LocalDate.parse("2023-05-22", DateTimeFormatter.ISO_DATE)))
//        exerciseList.add(Exercise("수영1", 25, 1, LocalDate.parse("2023-05-23", DateTimeFormatter.ISO_DATE)))
//        exerciseList.add(Exercise("수영2", 30, 5, LocalDate.parse("2023-05-23", DateTimeFormatter.ISO_DATE)))
//        exerciseList.add(Exercise("자전거1", 10, 3, LocalDate.parse("2023-05-24", DateTimeFormatter.ISO_DATE)))
//        exerciseList.add(Exercise("자전거2", 12, 6, LocalDate.parse("2023-05-24", DateTimeFormatter.ISO_DATE)))

        while (true) {
            try {
                println("메뉴를 선택해주세요\n1. 오늘의 운동 기록\n2. 날짜 별 운동 기록 보기\n3. 종료")
                print("번호 입력 : ")
                inputNumber = sc.nextInt()
                println()
                when (inputNumber) {
                    1 -> todayExercise()
                    2 -> checkExercise()
                    3 -> break
                    else -> throw IllegalArgumentException()
                }



            } catch (e:Exception){
                println("잘못 입력하셨습니다. 다시 입력해주세요")
                println(e.message)
                println()
            }
        }

    }

    // 오늘의 운동을 입력 받는 기능
    fun todayExercise() {

        var today = LocalDate.now()

        print("운동 종류 : ")
        var type:String = sc.next() // 운동 종류

        print("운동 횟수 : ")
        var time = sc.nextInt()

        print("운동 세트 : ")
        var set = sc.nextInt()

        // 운동 객체 생성
        val exercise = Exercise(type, time, set, today)

        // 운동 객체 리스트에 만든 운동 객체 추가
//        exerciseList.add(exercise)

        // 파일 저장
        createFile(exercise)

        println()




    }

    // 운동 기록을 출력하는 기능
    fun printExercise(e:Exercise){
        println("운동 종류 : ${e.type}\n횟수 : ${e.time}\n세트 : ${e.set}")
        println()
    }

    // 날짜 별 운동 기록을 보는 기능
    fun checkExercise(){
        while(true){

            try {
                //날짜 리스트 생성(exercise 객체 리스트에서 날짜만 뽑아서 중복처리하고 오름차순 정렬해서 새로운 리스트로 생성)
                val dayList = File("C:\\myfile\\").listFiles().distinct().sorted()


                // 날짜 리스트 보여주기
                for(i in dayList.indices){
                    val temp = dayList[i].toString().split("\\")
                    println("${i+1} : ${temp[temp.size-1]}")
                }

                // 날짜 선택
                print("날짜를 선택해주세요(0.이전) : ")
                var inputDayNum = sc.nextInt()
                println()

                //0 입력 시 다시 메뉴 선택
                if(inputDayNum==0){
                    println()
                    running()
                }

                var temp2 = dayList[inputDayNum-1].toString().split("\\")

                // 날짜에 맞는 운동 기록 출력
                println("${temp2[temp2.size-1]}의 운동 기록 입니다.") // 사용자에게 보여준 날짜 번호 = 실제 리스트 번호+1

                val dayList2 = File(dayList[inputDayNum-1].toString()+"\\").listFiles()

                for(e in dayList2 ){
                    val eFilePath = e.toString()
//                    println(eFilePath)
                    File(eFilePath).forEachLine { println(it) }
                    println()
//                    readTextFile(eFilePath)
                }
                break
            } catch (e:Exception){
                println("잘못 입력하셨습니다. 다시 입력해주세요")
                println(e.message)
                println()
                continue


            }
        }



    }

    fun createFile(e:Exercise){
        val filePath = "/myfile/${e.today}"
        val dir = File(filePath)
        val formatter = DateTimeFormatter.ofPattern("yyMMddHHmmss")
        val date = LocalDateTime.now().format(formatter)
        val filename = "${date}.txt"
        val content = "운동 종류 : ${e.type}\n횟수 : ${e.time}\n세트 : ${e.set}"

        if(!dir.exists()){
            dir.mkdirs()
        }

        val writer = FileWriter("$filePath/$filename")
        val buffer = BufferedWriter(writer)

        buffer.write(content)
        buffer.close()
    }



}

data class Exercise(var type: String, var time: Int, var set: Int, var today: LocalDate){

}
