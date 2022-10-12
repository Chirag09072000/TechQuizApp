/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class QuestionStore {
    ArrayList<Question> quesList;
    public QuestionStore()
    {
     quesList=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "QuestionStore{" + "quesList=" + quesList + '}';
    }

    
    public void addQuestion(Question q)
    {
        quesList.add(q);
    }
    public Question getQuestionByQno(int qno)
    {
        for(Question quest:quesList)
        {
            if(quest.getQno()==qno)
                return quest;
        }
        return null;
    }
    public Question getQuestion(int pos)
    {
        return quesList.get(pos);
    }
    public void removeQuestion(int pos)
    {
        quesList.remove(pos);
    }
    public void setQuestion(int pos,Question q)
    {
        quesList.add(pos,q);
    }
    public ArrayList<Question> getAllQuestions()
    {
        return quesList;
    }
    public int getCount()
    {
        return quesList.size();
    }
}
