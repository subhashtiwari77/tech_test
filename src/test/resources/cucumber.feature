Feature: Test

@runThis
Scenario: Navigate to QA job requirements page and verify that total no. of responsibilities, requirements are as expected
Given user navigates to News page of the website
When user click on the QA Lead job requirement page
Then the number of Key Responsibilities is equal to "7"
   And the number of Requirements is equal to "4"
   