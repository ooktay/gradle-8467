# gradle-8467
Example project for https://github.com/gradle/gradle/pull/8467

On windows:> gradlew clean test
The test will complete but gradle will not exit until chromedriver.exe process is killed.

Notes:

First test has missing files for simplicity and fails.
Killing chrome.exe doesn't have any effect, but you need to kill it before running clean again).
