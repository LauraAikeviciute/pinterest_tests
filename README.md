# Maven + Java + Selenium demo project
## Setup
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
### Site used for testing
[Pinterest](https://www.pinterest.com/)

## check all pins element after search
1. input 'dog' and press enter
2. check search filter displayed
3. check search filter text

## correct name after successful login

1. click on avatar
2. check profile title text
3. check username text

## Try to change gender in settings

1. click on avatar
2. click on 'Edit Profile'
3. click 'Personal information' on the left side
4. let's find out if 'male' or 'female' are selected (element is 'checked')
5. fail test if both are checked
6. check 'Reset' button disabled
7. check 'Save' button disabled
8. if 'male' was checked – click 'female', otherwise – click 'male'
9. check 'Reset' button not disabled
10. check 'Save' button not disabled

## try to change manual filter in settings

1. click on avatar
2. click on 'Edit Profile'
3. click 'Social permissions' on the left side
4. check 'Blocked words' status
5. click 'Manual filter' checkbox
6. check 'Blocked words' status has changed

## home button after successful login

1. login flow
2. check 'Home' is displayed
3. check 'Home' text

## check top header elements

1. check logo displayed
2. check 'Log in' displayed
3. check 'Log in' text
4. check 'Sign up' displayed
5. check 'Sign up' text

## check login page elements

1. check 'welcome' displayed
2. check 'welcome' text
3. check 'close' button displayed
4. check 'with facebook' displayed
5. check 'with facebook' text
6. check 'with google' displayed

       