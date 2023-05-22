Feature: Login action and add to cart
@cab
Scenario Outline: Login with valid credentials
Given user is in the homepage
When user navigates to the login page
And User enters "<username>" and "<password>"
Then Verify if Welcome message displayed
Examples:
				| username | password |
				| j2ee | j2ee |

Scenario: Add a fish to the cart
Given user is in the homepage 
Then User clicks on category 
					| Fish |
And User clicks on fish 
					| FI-SW-01	|
And User clicks on add to cart for fish 
					| EST-1|
Then User clicks on proceed to checkout
And User enters the shipping and billing details and clicks continue
And User verifies the shipping details and clicks confirm	
Then Verify if the order has been submitted successfully


Scenario: Add a Bird to the cart
Given user is in the homepage 
Then User clicks on category 
					| Birds |
And User clicks on fish 
					| AV-CB-01	|
And User clicks on add to cart for fish 
					| EST-18|
Then User clicks on proceed to checkout
And User enters the shipping and billing details and clicks continue
And User verifies the shipping details and clicks confirm	
Then Verify if the order has been submitted successfully

