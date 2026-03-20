Walgreens Selenium Maven Project

This is a minimal Selenium + Maven project (JUnit 5) with a sample test that opens walgreens.com in headless Chrome.

Prerequisites:
- Java 11+ installed and JAVA_HOME set
- Maven installed (mvn on PATH)

How to run the sample test:

Open a terminal (cmd.exe) and run:

mvn -f "C:\\Sivaram API Testing\\APITesting\\walgreens\\pom.xml" test

Notes:
- The project uses WebDriverManager to automatically download the ChromeDriver binary.
- Tests run Chrome in headless mode by default so they can run on machines without an X display.
