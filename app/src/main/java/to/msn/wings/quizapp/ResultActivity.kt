package to.msn.wings.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/*クイズ結果を表示するクラス*/
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val userName = findViewById<TextView>(R.id.user_name)
        val userScore = findViewById<TextView>(R.id.user_score)
        val btnFinish = findViewById<Button>(R.id.btn_finish)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        userName.text = intent.getStringExtra(Constants.USER_NAME)
        userScore.text = "あなたの得点　${correctAnswers}/${totalQuestions}"

        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}