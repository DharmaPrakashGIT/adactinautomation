Feature: Verifying Adactin Hotel details

  Scenario Outline: Verifying login page using right credentials
    Given User is on the adactin login page
    When User should perform login with "<username>" , "<password>"
    And User should perform search hotel with "<location>","<hotel>","<roomType>","<roomNos>","<checkIn>","<checkOut>","<adultsPerRoom>"and"<childPerRoom>"
    And User should perform select the hotel
    And User should perform book hotel with "<firstName>","<lastName>","<address>","<ccNo>","<ccType>","<exMonth>","<exYear>" and "<cvvNo>"
    Then Verify should after login Booking Confirmation

    Examples: 
      | username  | password | location    | hotel          | roomType     | roomNos   | checkIn    | checkOut   | adultsPerRoom | childPerRoom | firstName | lastName | address     | ccNo             | ccType | exMonth | exYear | cvvNo |
      | Kdprakash | RU97K8   | Melbourne   | Hotel Hervey   | Standard     | 4 - Four  | 03/07/2022 | 04/07/2022 | 2 - Two       | 2 - Two      | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | New York    | Hotel Sunshine | Super Deluxe | 3 - Three | 03/07/2022 | 04/07/2022 | 1 - One       | 1 - One      | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | Brisbane    | Hotel Hervey   | Deluxe       | 4 - Four  | 05/07/2022 | 06/07/2022 | 4 - Four      | 4 - Four     | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | London      | Hotel Hervey   | Standard     | 3 - Three | 03/07/2022 | 04/07/2022 | 2 - Two       | 2 - Two      | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | Los Angeles | Hotel Cornice  | Deluxe       | 4 - Four  | 06/07/2022 | 07/07/2022 | 3 - Three     | 3 - Three    | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | Los Angeles | Hotel Hervey   | Standard     | 4 - Four  | 03/07/2022 | 04/07/2022 | 2 - Two       | 2 - Two      | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | Paris       | Hotel Sunshine | Super Deluxe | 4 - Four  | 02/07/2022 | 03/07/2022 | 3 - Three     | 2 - Two      | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | Melbourne   | Hotel Hervey   | Double       | 3 - Three | 03/07/2022 | 04/07/2022 | 2 - Two       | 3 - Three    | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | Sydney      | Hotel Hervey   | Standard     | 6 - Six   | 08/07/2022 | 09/07/2022 | 2 - Two       | 2 - Two      | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
      | Kdprakash | RU97K8   | Adelaide    | Hotel Hervey   | Double       | 4 - Four  | 03/07/2022 | 04/07/2022 | 2 - Two       | 2 - Two      | Dharma    | Prakash  | OMR Chennai | 8766389879387331 | VISA   | October |   2022 |  1234 |
