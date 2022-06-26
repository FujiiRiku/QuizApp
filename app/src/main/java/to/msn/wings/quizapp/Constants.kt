package to.msn.wings.quizapp

object Constants {
    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //問題1
        val que1 = Question(
            1,"この橋の名前を答えなさい",
            R.drawable.rainbow_bridge,
            "明石海峡大橋","レインボーブリッジ",
            "来間大橋","横浜ベイブリッジ",
            2
        )
        questionList.add(que1)

        return questionList
    }
}