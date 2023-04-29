# Logs Manager

📄📃 A simple Android Library for tracking entry and exit of functions in the project. 📄📃

## Description

With the help of this library, the log printing function can be called within functions of the project and thus
follow the logic and the activity of the functions within the application in a more convenient way

<p align="center">
  <img src="https://github.com/TKamar/LogsManager/blob/master/app/src/main/res/raw/screenshot1.png?raw=true">
</p>

<p align="center">
  <img src="https://github.com/TKamar/LogsManager/blob/master/app/src/main/res/raw/screenshot2.png?raw=true">
</p>

## How to Use

1. Add it in your root build.gradle at the end of repositories:
   allprojects {
   repositories {
   ...
   maven { url 'https://jitpack.io' }
     }
   }

2. Add the dependency:
   dependencies {
   implementation 'com.github.TKamar:LogsManager:Tag'
   }
3. In your project, create a variable of type LogsManager.
4. Start using the library in your project by calling the library function --> LogsManager.logEntry || LogsManager.logExit
5. Enjoy 😄.


