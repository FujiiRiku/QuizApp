package to.msn.wings.quizapp

/*問題のテンプレートを管理するデータクラス*/
data class Question(
    val id:Int,
    val question:String,
    val image:Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer:Int
)
