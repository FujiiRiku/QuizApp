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
            2,"兵庫県にある日本三古湯にも数えられる温泉はどれか",
            R.drawable.arimaonsen,
            "道後温泉","白浜温泉",
            "草津温泉","有馬温泉",
            4
        )
        questionList.add(que2)

        //問題3
        val que3 = Question(
            3,
            "兵庫県の定番のお土産として「御座候」というお菓子が有名ですが、" +
                    "「御座候」の正しい読み方はどれか",
            R.drawable.gozasourou,
            "ぎょざこう","おろしざそうろう",
            "ござそうろう","ぎょざそうろう",
            3
        )
        questionList.add(que3)

        //問題4
        val que4 = Question(
            4,
            "お笑いタレントダウンタウンの2人はどちらも兵庫県出身です。" +
                    "ダウンタウンの出身地は次のうちどれでしょう",
            R.drawable.owarai,
            "尼崎市","西宮市",
            "豊岡市","宝塚市",
            1
        )
        questionList.add(que4)

        //問題5
        val que5 = Question(
            5,
            "兵庫県明石市でよく食べられるダシを利かせたたこ焼きに似た食べ物を「明石焼き」と言います。" +
                    "「明石焼き」は別名何と呼ばれているでしょう",
            R.drawable.akasiyaki,
            "だしやき","たこボール",
            "だしたこやき","たまごやき",
            4
        )
        questionList.add(que5)

        //問題6
        val que6 = Question(
            6,
            "バレンタインデーにチョコを贈るという文化は兵庫県神戸市発祥の企業が考え出したと" +
                    "言われています。それは次のうちどれでしょう",
            R.drawable.chocorate,
            "ゴディバ","モロゾフ",
            "不二家","明治",
            2
        )
        questionList.add(que6)

        //問題7
        val que7 = Question(
            7,
            "兵庫県神戸市垂水区と淡路島を結ぶ橋の名前はどれか",
            R.drawable.akasikaikyooohasi,
            "大鳴門橋","来間大橋",
            "レインボーブリッジ","明石海峡大橋",
            4
        )
        questionList.add(que7)

        //問題8
        val que8 = Question(
            8,
            "兵庫県明石市には日本標準時子午線が通っていますが、その子午線は東経何度の位置にあるでしょうか",
            R.drawable.tenmonkagakukan,
            "東経100度","東経120度",
            "東経155度","東経135度",
            4
        )
        questionList.add(que8)


        return questionList
    }
}