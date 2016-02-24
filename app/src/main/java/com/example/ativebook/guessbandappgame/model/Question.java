package com.example.ativebook.guessbandappgame.model;

/**
 * Created by ATIVE BOOK on 23/02/2016.
 */
public class Question {

    private String image;

    private String answer;


    public Question (String image, String answer) {
        this.image = image;
        this.answer = answer;
    }


    public String getAnswer() {
        return answer;
    }

    public String getImage() {
        return image;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
