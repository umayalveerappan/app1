# app1
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/activity_quiz"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="comq.example.priya.quizactivity.MainActivity"
    android:background="@drawable/hogwartslogo"
    android:paddingBottom="16dp"
    android:paddingLeft="16dp"
    android:paddingTop="16dp"
    android:paddingRight="16dp"
    android:orientation="vertical"
    android:weightSum="1">
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        android:padding="8dp"
        android:layout_marginBottom="40dp"


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Score"
            android:textSize="20sp"
            android:layout_alignParentLeft="true"
            />

        <TextView
            android:id="@+id/score"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentRight="true"
            android:text="0"
            android:textSize="20sp" />
    </RelativeLayout>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="70dp"
        android:text="Which of the Hogwarts founders created the Chamber of Secrets"
        android:textSize="20sp"
        android:padding="8dp"
        android:layout_marginBottom="40dp"
        android:id="@+id/question"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Neville Longbottom"
        android:background="#0091EA"
        android:textColor="#fff"
        android:padding="8dp"
        android:layout_marginBottom="24dp"
        android:id="@+id/choice1"/>

    <Button
        android:id="@+id/choice2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="24dp"
        android:background="#0091EA"
        android:padding="8dp"
        android:text="Zacharias Smith"
        android:textColor="#ffff" />

    <Button
        android:id="@+id/choice3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginBottom="24dp"
        android:background="#0091EA"
        android:padding="8dp"
        android:text="Salazar Slytherin"
        android:textColor="#fff" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="quit"
        android:background="#B71C1C"
        android:textColor="#fff"
        android:padding="8dp"
        android:layout_marginBottom="24dp"
        android:id="@+id/quit"/>


</LinearLayout>

