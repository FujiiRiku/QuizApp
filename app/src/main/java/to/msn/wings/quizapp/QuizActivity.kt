package to.msn.wings.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizActivity : AppCompatActivity() {
    private var mCurrentPosition:Int = 1
    private var mQuestionList:ArrayList<Question>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mUserName:String? = null
    private var mCorrectAnswer:Int = 0

    private var progressBar:ProgressBar? = null
    private var tvProgress:TextView? = null
    private var tvQuestion:TextView? = null
    private var ivImage:ImageView? = null
    private var tvOptionOne:TextView? = null
    private var tvOptionTwo:TextView? = null
    private var tvOptionThree:TextView? = null
    private var tvOptionFour:TextView? = null
    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        progressBar = findViewById<ProgressBar>(R.id.progressBar)
        tvProgress = findViewById<TextView>(R.id.tvProgress)
        tvQuestion = findViewById<TextView>(R.id.tvQuestion)
        ivImage = findViewById<ImageView>(R.id.ivImage)
        tvOptionOne = findViewById<TextView>(R.id.tvOptionOne)
        tvOptionTwo = findViewById<TextView>(R.id.tvOptionTwo)
        tvOptionThree = findViewById<TextView>(R.id.tvOptionThree)
        tvOptionFour = findViewById<TextView>(R.id.tvOptionFour)
        btnSubmit = findViewById<Button>(R.id.btnSubmit)

        mQuestionList = Constants.getQuestions()
        progressBar?.max = mQuestionList!!.size
        SetQuestion()
    }

    private fun SetQuestion(){
        val question:Question = mQuestionList!![mCurrentPosition - 1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "${mCurrentPosition}/${mQuestionList?.size}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        if(mCurrentPosition == mQuestionList?.size){
            btnSubmit?.text = "終了"
        }else{
            btnSubmit?.text = "次の問題へ"
        }
    }
}