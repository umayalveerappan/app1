public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    private QuestionLibrary mQuestionLibrary=new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonnext;

    private String mAnswer;
    private int  mScore=0;
    private int mQuestionNumber=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mScoreView=(TextView)findViewById(R.id.score);
        mQuestionView=(TextView)findViewById(R.id.question);
        mButtonChoice1=(Button)findViewById(R.id.choice1);
        mButtonChoice2=(Button)findViewById(R.id.choice2);
        mButtonChoice3=(Button)findViewById(R.id.choice3);

        updateQuestion();




        //start of button listener for button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mButtonChoice1.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    //toast msg
                    Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mButtonChoice2.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    //toast msg
                    Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mButtonChoice3.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    updateQuestion();
                    //toast msg
                    Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });






        //end of button listener for  button1
    }

    private void updateQuestion()
    {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mAnswer=mQuestionLibrary.mCorrectAnswers(mQuestionNumber  );
        mQuestionNumber++;

    }
    private void updateScore(int point)
    {
        mScoreView.setText(""+ mScore);
        if(mScore>3)
        {
            second();
        }
    }


    public void second() {
        final boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, second.class);
                startActivity(homeIntent);
                finish();

            }

            private void finish() {
            }
        }, SPLASH_TIME_OUT);
    }






}

