# 🛒 Amazon Test Automation Framework  

![Java] 
![Selenium]  
![TestNG]  
![Log4j]
![Maven]

## 📢 **Overview**  
This is a robust **Test Automation Framework** designed for **Amazon-like eCommerce applications**. It follows the **Page Object Model (POM)** pattern and is built using **Java, Selenium WebDriver, TestNG, WebDriver Factory, and Log4j**.  

🚀 **Key Features:**  
✅ **Page Object Model (POM)** for better maintainability  
✅ **WebDriver Factory** for browser management  
✅ **Data-Driven Testing** using Excel (Apache POI)  
✅ **Logging with Log4j** for detailed test logs  
✅ **TestNG for Test Execution & Reporting**  
✅ **Configurable Properties File** for flexible test configurations  

---

## 📂 **Project Structure**  
amazon/ │── src/main/java │ ├── base/ │ │ ├── BaseTest.java │ │ ├── DriverFactory.java │ ├── pages/ │ │ ├── LoginPage.java │ │ ├── HomePage.java │ ├── utils/ │ │ ├── ConfigReader.java │ │ ├── LogUtils.java │ │ ├── ExcelReader.java │── src/test/java │ ├── testcases/ │ │ ├── LoginTest.java │ │ ├── HomePageTest.java │── src/test/resources │ ├── config.properties │ ├── log4j.properties │── pom.xml │── testng.xml │── README.md │── .gitignore
