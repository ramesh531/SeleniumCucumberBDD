# TASK3: Create tests from the acceptance criteria

#  Navigate to the AWRS UI(https://www.tax.service.gov.uk/check-the-awrs-register)
#  Search for a URN XXAW 000 0044 5456
#  Not found page is returned
#  search for XXAA 000 0044 5444
#  Invalid page is returned

@test3
Feature: Feature to validate AWRS URN Functionality

#Background: Enter the url
#Given I go to url 'https://www.tax.service.gov.uk/check-the-awrs-register'

Scenario: Validate Invalid URN gives Not found Page



Given I go to url 'https://www.tax.service.gov.uk/check-the-awrs-register'
When Search for a URN 'XXAW 000 0044 5456'
Then Not found page is returned

Scenario: Validate Invalid URN gives Invalid Page

Given I go to url 'https://www.tax.service.gov.uk/check-the-awrs-register'
When Search for a URN 'XXAA 000 0044 5444'
Then Invalid page is returned

