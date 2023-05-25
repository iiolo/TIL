import java.util.Scanner
import java.util.regex.Pattern

fun main() {
    var game = Game()
    game.boardInit()
    game.boardInput()

}

class Game {
    val rows = 3
    val cols = 3

    val board = Array(rows) { CharArray(cols) }

    // 보드 초기화
    fun boardInit(): Array<CharArray> {
        for (i in 0 until rows) {
            for (j in 0 until cols) {

                board[i][j] = ' '
            }
        }

        return board
    }

    // 보드 출력
    fun boardPrint() {
        print(" ")
        for (i in 0 until cols) {
            print(" ${i}")
        }
        println()

        for (i in 0 until rows) {
            print("${i} ")
            for (j in 0 until cols) {
                print("${board[i][j]}")
                if(j!=cols-1) print("|")
            }
            if (i != rows - 1) {
                println()
                println("  -+-+-")
            } else {
                println()
            }
        }
    }

    fun boardInput(){
        var count = 1 // 몇 번째 판인지
        var p =1; // 플레이어 번호

        var sc = Scanner(System.`in`)


        while(true){
            println("${count}번째 판")
            boardPrint()
            print("Player${p} 입력(줄,칸): ")
            var playerInput = sc.next()

            // 문자열 패턴 체크 숫자(0-2),숫자(0-2
            val regex = "^\\s*(0|1|2)(,|\\)|\\s)*(0|1|2)\\s*$";
            val pp = Pattern.compile(regex);
            val r = pp.matcher(playerInput);

            if(!r.matches()){
                println("지정된 패턴이 아닙니다. 다시 입력해주세요")
                println()
                continue
            }

            // ,을 기준으로 나누기
            var numList = playerInput.split(",")
            var x = numList[0].toInt()
            var y = numList[1].toInt()

            if(board[x][y]==(' ')){
                if(p==1){
                    board[x][y]='O'
                }else{
                    board[x][y]='X'
                }
            }else{
                println("이미 존재합니다. 다시 입력해주세요.")
                continue
            }

            p++

            if(p>2) {
                count++
                p=1
                println()
                continue
            }


        }

    }

    fun checkWin(){
        var i = 0;

        for(j in 0..cols){
            var pl = board[i][j]

        }
    }




}

