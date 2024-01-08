# About
Welcome to Turbo Mobile, your gateway to a world of cutting-edge mobile technology where innovation meets a seamless user experience. Explore our curated selection of smartphones, tablets, and accessories, designed to elevate your mobile journey.

<a href="https://showcase.onwavemaker.com/TurboMobiles/" target="_blank">Click Here</a> for more details on Turbo Mobiles app

## Customer Persona:
#### Mobile Purchase Experience:
-   Explore a curated selection of smartphones, tablets, and accessories.
-   Make informed decisions for a personalized mobile experience.
#### Network Plan Selection:
-   Easily select network plans tailored to individual preferences.
-   Transparent and flexible options for an optimized mobile experience.
#### Order Tracking and Management:
-   Effortlessly view and manage orders through a user-friendly interface.
-   Receive real-time updates on order status and delivery.
#### SIM Card Purchase:
-   Hassle-free purchase of SIM cards for seamless integration.
-   Align SIM card choices with selected network plans.
#### Account Customization:
-   Manage account details with ease for a personalized mobile journey.
-   Tailor settings to match changing preferences.
# Prefabs
## Phone List
The "Phone List" prefab is a collection of visual elements, often presented as cards, showcasing various phone models or brands. These cards highlight key details and features of each phone, facilitating easy comparison for users. This component simplifies the presentation of multiple phones, assisting users in making well-informed choices.

## Phone Details
The "Phone Details" prefab is utilized to access a detailed view of the selected phone. Users can explore different phone variants, features, prices, colors, and make informed decisions about their purchase. This prefab enhances the user experience by providing comprehensive information for selecting the most suitable phone.
#### UI Properties 
  - **Selectedproductid**: Product ID

##  Product Pictorial View
The "Product Pictorial View" prefab is a visually engaging representation that displays products or items in a graphical format. Leveraging images or icons, this component provides a quick and engaging overview for users. It enhances the visual appeal of product displays, allowing users to swiftly grasp information about different products at a glance.
#### UI Properties 
  - **Productcolorid**: Product Color ID

## Phone Order Summary
The "Phone Order Summary" prefab offers a concise overview of a mobile phone or related product order. It efficiently displays key details such as product name, price, quantity, total cost, and relevant information. This component ensures a clear and organized representation of order details, facilitating a seamless understanding for users.
#### UI Properties 
  - **Phonevarient** :  Selected Phone Variant Details
  -  **Priceplan**:  Selected Price Plan
  -  **Simtype**: Selected SIM Type
  -  **addons**: Selected Addons list

## Shop Broadband
The "Shop Broadband" prefab is a modular and reusable code segment designed to manage aspects related to broadband services within an application. Tailored for internet connectivity with higher bandwidth than traditional dial-up connections, this component ensures consistent and efficient handling of broadband services.
#### UI Properties 
  - **UserId** :  logged in userID

## Shop Phones
The “Shop Phone” prefab is a versatile and adaptable element created to elevate customer interaction and streamline operations within a store environment. This modular solution serves as a consistent approach to showcasing phones, aiding customers in their decision-making process, and enhancing overall operational efficiency.
#### UI Properties 
  - **Type**: Shop Phones / Bring Your Own Phone
  - **UserId** :  logged in userID
  -  **Add-Ons View**: Card / List

## Phone Price Plans
The "Phone Price Plans" prefab presents a comprehensive view of all available price plans, detailing the features of each plan. This enables customers to select a relevant plan based on their needs. The prefab simplifies the decision-making process, ensuring customers can easily understand and choose the most suitable price plan.
#### UI Properties 
  - **Prepopulatedplanid** :  Price Plan ID

## Orders List
The "Orders List" prefab displays all customer-placed orders, allowing users to track order times and follow activation instructions, such as SIM activation. This prefab streamlines the order management process, providing a user-friendly interface for customers to monitor and manage their orders efficiently.
#### UI Properties 
  - **UserId** :  logged in userID



# Information about Project Folder Structure and Files

## pom.xml
  Add any maven dependencies to this file. Dependencies declared in this file will be available on the classpath.

## lib
  Add custom jar files to this folder. Files added to this folder will be copied to WEB-INF/lib/ on the classpath.

## services
  All services should be added via studio. Once added, services can be edited via eclipse or other editors, including adding additional classes. 
  Classes in this folder will be compiled when the project is run or deployed.
  Files added to this folder will be copied to WEB-INF/classes/ on the classpath.
  Modifications to imported services can be lost upon re-import.

  To see external updates in studio, use the refresh button in the java editor.
 
## src/main/java
  Add your application sources such as java class files to this folder. 
  Files added to this folder will be copied to WEB-INF/classes/ on the classpath.
  
## src/main/resources
  Add your application resources such as properties and xml files to this folder. 
  Files added to this folder will be copied to WEB-INF/classes/ on the classpath.

## src/main/webapp
  Add web application sources to this folder.
  Files you need to know:
  - **app.css:** Application CSS
  - **index.html:** Can be edited directly to customize, such as including meta, script and other tags.
  - **app.js:** Contains any application owned component definitions and functions.
  - **app.variables.json:** Contains any application variable definition.

## src/test/java
  Add your unit tests specific to the application such as JUnit tests to this folder.

## src/test/resources
  Add your test resources such as properties and xml files to this folder.

## src/main/webapp/WEB-INF/data
  This data directory is for HSQLDB Databases.
  
  By default, it contains some sample databases.
  If your project does not use these sample database, you can delete these files and directory to reduce the size of your project.

  You can also add your own HSQLDB database or other data files to this directory. All HSQLDB databases must be in this directory.

## src/main/webapp/pages
  Each project page creates a folder by the name of the page, i.e Main. 
  All page files in the pages folder are studio managed. 
  Files you need to know:
  - **Page CSS (i.e. Main.css):** Contains custom css added in source, css or by applying custom styles to components.
  - **Page HTML (i.e. Main.html):** Contains any custom markup added in the source, markup editor. Can be edited with the project closed.
  - **Page JS (i.e. Main.js):** Can be edited via the file system. Use the refresh button in the source, script panel if you edit this file outside of studio.
  - **Page Variable (i.e. Main.variable.json):** Can be edited via the file system. Use the refresh button in the source, script panel if you edit this file outside of studio.

## src/main/webapp/services
  Contains service definition files used by studio. These files are not user editable. 

## src/main/webapp/resources
  Created upon first use of the resources panel in studio. These are the folders uses by the resources panel and resources in binding. 

## src/main/webapp/WEB-INF
  web.xml is the Web Application Deployment Descriptor in which you can add custom servlets,filters and listeners.

## src/main/webapp/WEB-INF/classes
  This folder is populated by studio. Do not edit or add any files to this folder. Changes will be lost. Use src/main/resources instead.

## src/main/webapp/WEB-INF/lib
  This folder is populated by studio. Do not edit or add any files to this folder. Changes will be lost. Add jars into lib directory of the project or add dependencies in the pom.xml instead.
## Build and Deploy
  The application contains set of Docker Files which can be used to build and deploy the application. Refer the below link for more information.
  https://docs.wavemaker.com/learn/app-development/deployment/build-with-docker
