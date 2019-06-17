   Feature: Add items to cart
   Browse the catalog
   And add item to cart
   Search for another item
   Add the second item to cart
   Now validate the cart for presence of both items
   Then clear cart

   Scenario: Adding first item to cart
    Given the user browse the catalog "Electronics"
    When the user selects the Home Entertainment
    And adds the first item to cart
    When the user searches for another item "Dell Laptop"
    And the user selects the first item in the list
    And adds the second item to cart
    Then the user validates the cart
    And the user clears the cart
    Then the cart should be empty