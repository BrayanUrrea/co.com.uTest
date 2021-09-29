package co.com.utest.questions;

import co.com.utest.userinterface.UTestFormPageOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerEmail implements Question<Boolean> {
    private String question;

    public AnswerEmail(String question) {
        this.question = question;
    }

    public static AnswerEmail toThe(String question){
        return new AnswerEmail(question);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String email = Text.of(UTestFormPageOne.INPUT_EMAIL).viewedBy(actor).asString();
        if(question.equals(email)){
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}
