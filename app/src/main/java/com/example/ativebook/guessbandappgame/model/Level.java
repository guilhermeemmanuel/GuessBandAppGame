package com.example.ativebook.guessbandappgame.model;

import java.util.List;

/**
 * Created by ATIVE BOOK on 23/02/2016.
 */
public class Level {

    private String category;

    private List<Question> questions;


    public void Level (String category) {
        this.category = category;
    }


    public List<Question> getQuestions() {
        return questions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
