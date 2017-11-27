# DiscountsApparel
Simple Java Console Application to find out discounted price for apparels.

## How to use
Please follow below steps to use the application.
Step 1. Setup Git in your local machine.
Step 2. Open the git perspective in eclipse and use "clone a git repository" option clone the DiscountsApparel repository to your eclipse using the git url: "https://github.com/rosewinj/DiscountsApparel.git"
Step 3. Now import project from this repository to your workspace. (repository will show in git perspective but project will only come in java perspective once you have imported the project from the repository)
Step 4. Now switch back to Java perspective and application is ready to use.
Step 5. Now you just run as Java application and use the console to use the application.

## Brief Design
This application is a simple Java Console Application which makes use of important OOPS concepts along with properties file, making sure it is following coding standards. 

#### Properties file
We have used properties file in this application to load all the category names, brand names, and their respective discount values on application start and to make sure values can be edited outside of code, without the need of changing the code hence avoiding hardcoding values.

#### Inheritence and categories
We used Inheritence concept majorly to represent the categories and subcategories that are available to us as pojo classes. So for example if Jeans is a category of Trousers, then there will be 2 classes Jeans and Trousers where Jeans will extend the class Trousers or in other words inherit its properties. Similarly there are categories and subcategories mantainined.
Further example of a chain of categories/classes inheritences followed: Wear-->MensWear-->Trousers-->Casuals

#### Calculation of discount
Now in order to find out the highest discount available for an item, whether it is brand discount, category discount, immediate parent category discount or the ancester category discount, the super classes MensWear and WomensWear will have a comparison between their category discount and the brand discount and whichever is higher is stored as class member variable discount. But in subclasses like Shirts the discount of Shirts category and its previously stored discount value (this will have the result of previous comparison b/w category and brand) is compared and higher is taken granted. So this way we always get the highest discount available for the item amonst available discounts of different types as mentioned earlier.

***
