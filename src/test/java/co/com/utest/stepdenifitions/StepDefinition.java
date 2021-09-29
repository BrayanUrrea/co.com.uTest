package co.com.utest.stepdenifitions;

import co.com.utest.model.UTestData;
import co.com.utest.questions.AnswerEmail;
import co.com.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class StepDefinition {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Brandon wants to register at the uTest form One$")
    public void thatBrandonWantsToRegisterAtTheUTestFormOne(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUpOne.thepage(), (FirstPage.
                onThePage(uTestData.get(0).getStrFirstName(), uTestData.get(0).getStrLastName(),
                        uTestData.get(0).getStrEmail(), uTestData.get(0).getStrBirthMonth(),
                        uTestData.get(0).getStrBirthDay(), uTestData.get(0).getStrBirthYear())));
    }

    @When("^he enter the email (.*)$")
    public void heEnterTheEmail(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchEmail.the(uTestData.get(0).getStrEmail()));
    }

    @Then("^he finds the email (.*)$")
    public void heFindsTheEmail(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerEmail.toThe(uTestData.get(0).getStrEmail())));
    }


    @Given("^that Brandon wants to register at the uTest form Two$")
    public void thatBrandonWantsToRegisterAtTheUTestFormTwo(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUpOne.thepage(), (SecondPage.
                onThePage(uTestData.get(0).getStrCity(), uTestData.get(0).getStrPotalCode(), uTestData.get(0).getStrCountry())));
    }

    @Given("^that Brandon wants to register at the uTest form Three$")
    public void thatBrandonWantsToRegisterAtTheUTestFormThree (List < UTestData > uTestData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUpOne.thepage(), (ThirdPage.
                onThePage(uTestData.get(0).getStrComputer(),uTestData.get(0).getStrVersion(), uTestData.get(0).getStrLanguage(),
                        uTestData.get(0).getStrMobile(), uTestData.get(0).getStrModel(), uTestData.get(0).getStrOperatingSystem())));
    }

    @Given("^that Brandon wants to register at the uTest form Four$")
    public void thatBrandonWantsToRegisterAtTheUTestFormFour (List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUpOne.thepage(), (FourthPage.
                onThePage(uTestData.get(0).getStrPassword(), uTestData.get(0).getStrConfirmPassword(), uTestData.get(0).getStrConduct(), uTestData.get(0).getStrPolicy())));
    }


    }
