# Pre-Interview Exercise

## Overview
Create code to allow a user to add products to a shopping cart, and then calculate the total price and tax amounts for the items contained in the cart. 

## Requirement
###Step 1: Add products to the shopping cart.
Given:
- An empty shopping cart
- And a product, Dove Soap with a unit price of 39.99
When:
- The user adds 5 Dove Soaps to the shopping cart
Then:
- The shopping cart should contain 5 Dove Soaps each with a unit price of 39.99
- And the shopping cart’s total price should equal 199.95


###Step 2: Add additional products of the same type to the shopping cart.
Given:
- An empty shopping cart
- And a product, Dove Soap with a unit price of 39.99
When:
- The user adds 5 Dove Soaps to the shopping cart
- And then adds another 3 Dove Soaps to the shopping cart
Then:
- The shopping cart should contain 8 Dove Soaps each with a unit price of 39.99
- And the shopping cart’s total price should equal 319.92
- Archive this as a separate .zip file named step2.zip then continue on to step three.

###Step 3: Calculate the tax rate of the shopping cart with multiple items
Given:
- An empty shopping cart
- And a product, Dove Soap with a unit price of 39.99
- And another product, Axe Deo with a unit price of 99.99
- And a tax rate of 12.5%
When:
- The user adds 2 Dove Soaps to the shopping cart
- And then adds 2 Axe Deo’s to the shopping cart
Then:
- The shopping cart should contain 2 Dove Soaps each with a unit price of 39.99
- And the shopping cart should contain 2 Axe Deo’s each with a unit price of 99.99
- And the total tax amount should equal 35.00
- And the shopping cart’s total price should equal 314.96

## Prerequisites
- Java 8
- Gradle 4.9 (latest)

## Clean
`gradle clean`

## Build
`gradle build`

## Test
`gradle test`

version number 741e2021841b2ee9dfe6da974bbeb934b579947f