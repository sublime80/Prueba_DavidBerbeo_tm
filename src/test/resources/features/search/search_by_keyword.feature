@Override

Feature: Search by keyword


  Scenario: Searching amazon page
    Given User goes to main page
    When he looks up Mobile phones
    When selects  Motorola
    Then he should Add that mobile to cart

