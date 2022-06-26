package to.msn.wings.quizapp

object Constants {
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