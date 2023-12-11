# CSU Global 23WA Term - CSS400: Data Structures and Algorithms - Module 2 Critical Thinking Assignment
In this module, students were asked to implement a class of objects based on the Java Bag ADT that helps to manage orders for an online food delivery services. This module is covering the work between the pre-planner in the Module 1 assignment and the coding done for the class in Module 2.

## Prompt and Requirements
The following was the prompt that was given for the Module 1 assignment.

> This assignment is a pre-planner for Program 1 due in Module 2. For this assignment, you will develop the planning necessary for constructing a class that implements a Bag ADT in Java. Your program will store corresponding items for an On-Line Food Delivery Service. Specifically, your program should consider an item's name and price and manage the customer's shopping cart.
> The following are example values your class will be using for data:
> * Customer Number = 1;
> * item_Name="Can of Soup";
> * Price = $4.00;
> 
> After selecting your values for data, what are the required operations that must be used to create the Bag Interface?
> 
>  Your deliverable will consist of the following:
> * Pseudocode for your proposed program
> * Flowchart of the operations of adding items to the shopping cart and removing items from the cart.

The following is the prompt supplied for the Module 2 component of the assignment.

> Demonstrate an understanding of working with bags in Java by implementing a class called ShoppingCart that implements the BagInterfaceMyType in Java. Your implementation should include the following:
>
> Fields:
> * MyType[] myBag;
> * int numberofProducts;
> * Default_Capacity;
>
> Methods:
> * Constructor(): initialize bag
> * add() - will be used to add a new entry.
> * toArray() - provides an array of the allocated bag.
> * isFull() - test whether the bag is at the maximum capacity.
> * Implement a BagDemo that tests your bag implementation class.
>
> Methods:
> * testAddl() - will add the contents to the Bag.
> * displayBag() - will display the contents of the Bag.
> 
> Your deliverables will consist of a zip file with the following:
> * The Java source code with all the required classes.
> * Screenshots of your program's execution and output.

Given these prompts, the following requirements for the program were defined as necessary for the implementation:
* :black_square_button::black_square_button: Design a class that uitlizes the the Java Bag ADT
* :black_square_button::black_square_button: The class that is designed is for an online food ordering sevice
* :black_square_button::black_square_button: The class you develop for the online food ordering service will need the following elements
    * :black_square_button::black_square_button: Constructors that help you build new objects based on the class
        * :white_check_mark::black_square_button: Sets the default of the shopping cart
        * :white_check_mark::black_square_button: Sets the custom size of the shopping cart
    * :black_square_button::black_square_button: Addition methods for the objects
        * :white_check_mark::black_square_button: ```add()``` method to add an item to the shopping cart
        * :black_square_button::black_square_button: ```testAddl()``` = ```combineCart()``` method to add cart to an other cart
    * :white_check_mark::black_square_button: Information methods for the objects
        * :white_check_mark::black_square_button: ```isFUll()``` method to see if the shopping cart is full
    * :white_check_mark::black_square_button: Output methods for the objects
        * :white_check_mark::black_square_button: ```displayBag()``` method to create a string that can then be output as necessary
        * :white_check_mark::black_square_button: ```toArray()``` method to send the shopping cart items to a traditional array
* :black_square_button::black_square_button: Implement a unit test for the class created

## Design of Class and Unit Test
The following are diagrams and psuedocode for the defined class and unit testing.

### ShoppingCart Class
Class provides a place to store the various items that are part of a shopping cart.
```
class ShoppingCart
    Private int maxSize
    Private int newIndex = 0
    Private CartItems cartBag

    Public ShoppingCart()
        maxSize = 10

    Public ShoppingCart(int size)
        if(size > 0)
            maxSize = size
        else
            throw error

    Public ShoppingCart(int size, CartItem firstCartItem)
    Public ShoppingCart(CartItem firstCartItem)

    Public void add(CartItem newItem)
        cartBag.add(newItem)

    Public boolean combineCart(ShoppingCart incomingCart)
        foreach CartItem in incomingCart
            cartBag += CartItem

    Public boolean isFull()
        if(cartBag.count >= maxSize)
            return true
        else
            return false

    Public String toString()
        String returnString = "Beginning of Cart Items:"
        foreach(item in cartBag)
            returnString += item.toString()
        return returnString

    Public CartItem[] toArray()
        CartItem[] tempArray = new CartItem[]
        int tempIndex = 0
        foreach(item in cartBag)
            tempArray += item
            tempIndex++
            
    Public CartItem[] toArray(CartItem[] destinationArray)
        int tempIndex = 0
        foreach(item in cartBag)
            destinationArray += item
            tempIndex++
```

### CartItem Class
Class provides the items that are being placed in a shopping cart
```
class CartItem
    int ItemNumber
    String Name
    String Description
    Float Price

    Public CartItem()
        ItemNumber = null
        Name = null
        Price = null
        Description = null

    Public CartItem(int itemNumber, String name, float price, String description)
        ItemNumber = itemNumber
        Name = name
        Price = price
        Description = description

    Public String toString()
        ItemNumber - Name - $Price - Description
```

### Module2 Class
```
class Module2
    Public static void main()

```