Feature: US_001 My Personal Information Page


  @UI @inovTeamHomepage @inov
  Scenario: TC001 Le candidat doit pouvoir postuler avec succes
    Given acceder la page Dashboard
    When cliquer sur le bouton Rejoindre la Team
    Then selectionner Longlet Testeur fonctionnel et automatise
    Then cliquer sur le bouton postuler
    Then saisir les informations necassaire
    And cliquer le bouton Envoyer


  @UI @MyShopHomepage
  Scenario: TC002 User should be able to change the login password
    Given user goes to the homepage
    When user clicks SignIn
    Then valid email address is entered
    Then valid password is entered
    Then click the SignIn button
    Then user clicks on the My Personal Information button
    Then user enters old password
    Then user enters new password
    Then user confirms old passport
    Then click on save button
    And The text Your personal information has been successfully updated should appear








