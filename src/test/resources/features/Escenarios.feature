Feature: Buy something in my Store

 Scenario Outline: Add products to my shopping car
   Given the store to the custom
   When  Client add two items into the shooping car
     | <product name>  |  <cantidad agregar>  |
   Then  Continues searching products

   Examples:

   | product name  |  cantidad agregar  |
   | iPhone        |  12                |

 Scenario: Show the shopping car to the client
    Given shopping car list to client
    When  Client have finished to shopping
    Then  She or he wants to see the shooping car