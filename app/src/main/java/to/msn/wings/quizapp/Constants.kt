package to.msn.wings.quizapp

object Constants {
    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //問題1
        val que1 = Question(
            1,"兵庫県の県庁所在地はどこ",
            R.drawable.hyogokencho,
            "兵庫市","神戸市",
            "神戸府","三宮",
            2
        )
        questionList.add(que1)

        //問題2
        val que2 = Question(
            1,"兵庫県にある日本三古湯にも数えられる温泉はどれか",
            R.drawable.arimaonsen,
            "道後温泉","白浜温泉",
            "草津温泉","有馬温泉",
            4
        )
        questionList.add(que2)

        return questionList
    }
}