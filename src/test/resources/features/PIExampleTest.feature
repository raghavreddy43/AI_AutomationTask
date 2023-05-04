Feature:  As a user I aam able to launch and navigate to Ao Home page Successfully, and complete rest of the user journey

  @Automated @Smoke
  Scenario Outline: 1. user able to navigate Home page
    Given user navigate to RestfulBookerPlatform Home page
    When I click on admin panel link
    When I enter Username as "<username>" and Password as "<password>"
    Then click on logout button
    Examples:
      | username | password |
      | admin    | password |

  @Automated @Smoke
  Scenario Outline: 2. user able to navigate Home page and login unsuccessfully
    Given user navigate to RestfulBookerPlatform Home page
    When I click on admin panel link
    When I enter Username as "<username>" and Password as "<password>"
    And I click on login button
    Then login should be unsuccessful
    Examples:
      | username  | password  |
      | admin     | incorrect |
      | incorrect | password  |
      | incorrect | incorrect |

  @Automated @Smoke @Test
  Scenario Outline: 3. user able to create a B&B booking
    Given user navigate to RestfulBookerPlatform Home page
    When I click on admin panel link
    When I enter Username as "<username>" and Password as "<password>"
    When I enter booking details "<Room>", "<Type>", "<Accessible>", "<Price>", "<RoomDetails>"
    Then click create button
    Examples:
      | username | password | Room | Type   | Accessible | Price |
      | admin    | password | 101  | Twin   | false      | 100   |