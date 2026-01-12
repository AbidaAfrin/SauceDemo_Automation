<!-- N.B: I have done this project using playwright with java.Although the assignment instructed to use Playwright with JavaScript, I completed the automation using Playwright with Java, which I am currently more proficient in.
Due to the limited timeframe, writing a robust and well-structured test suite was more efficient in Java.
I am always open to learning Playwright with JavaScript and can adapt quickly whenever required.
For this assignment, choosing Java ensured a reliable and well-structured solution delivered on time.-->


## Public demo website SwagLabs Automation
This project automates a given scenario on the demo website https://www.saucedemo.com/

## Automation Step
This project covers the following automation steps where a user
- logs in with valid credentials
- adds one product to the cart
- verifies the product name in the cart
- logs out.


## 💻Technology Used
- Playwright
- Java
- JDK 11
- Page Object Model (POM) design
- IntelliJ IDEA

## 📋Steps to Implement the Test Suite:
1. Clone the repository
2. Open the project in an IDE (Intellij, Eclipse etc.)
3. Use Maven for dependency management and project structure: Add the playwright, TestNG, junit dependencies to your pom.xml.
4. Run the tests

## 📂 Project Structure
```
src
 └── test
     ├── java
         ├── pages
         │  │  ├── LoginPage.java
         │  │  ├── ProductPage.java
         │  │  ├── CartPage.java
         │  │  └── MenuOption.java
         │  │
         │  │  
         │  └─ utilities
         │       └─ Browsersetup.java
         └── tests
               └── SauceDemoTest.java

```


