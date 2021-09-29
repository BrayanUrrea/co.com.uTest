# Autor: Brayan

@stories
Feature: Community uTest
  As a user, I want to register at the uTest
  @scenario1
  Scenario Outline: Fill out the registration form One
    Given that Brandon wants to register at the uTest form One
      | strFirstName | strLastName | strEmail | strDateMonth | strDateDay | strDate |
      | <strFirstName> | <strLastName> | <strEmail> | <strDateMonth> | <strDateDay> | <strDate> |
    When he enter the email
      | strEmail  |
      | <strEmail |
    Then he finds the email
      | strEmail  |
      | <strEmail |
    Examples:
      | strFirstName | strLastName | strEmail | strDateMonth | strDateDay | strDate |
      | Brandon | Urrea | ub@gmail.com | March | 20 | 1997 |

  @scenario2
  Scenario Outline: Fill out the registration form Two
  Given that Brandon wants to register at the uTest form Two
    | strCity | strPostalCode | strCountry |
    | <strCity> | <strPostalCode> | <strCountry> |
  When he select the fields
  Then past the next page
    Examples:
      | strCity | strPostalCode | strCountry |
      | Medellín | 054448 | Colombia |

  @scenario3
  Scenario Outline: Fill out the registration form Three
  Given that Brandon wants to register at the uTest form Three
    | strComputer | strVersion | strLanguage | strMobile | strModel | strOS |
    | <strComputer> | <strVersion> | <strLanguage> | <strMobile> | <strModel> | <strOS> |
  When he select the fields
  Then past the next page
    Examples:
      | strComputer | strVersion | strLanguage | strMobile | strModel | strOS |
      | Windows | 10 | Spanish | Samsung | Galaxy A50 | Android 1.0 |

  @scenario4
  Scenario Outline: Fill out the registration form Four
  Given that Brandon wants to register at the uTest form Four
    | strPassword | strConfirmPassword | strPolicy | strConduct |
    | <strPasword> | <strConfirmPassWord> | <strPolicy> | <strConduct> |
  When he select the fields
  Then past the next page
    Examples:
      | strPassword | strConfirmPassword | strPolicy | strConduct |
      | abcd1234YZ*_ | abcd1234YZ*_ | true | true |




