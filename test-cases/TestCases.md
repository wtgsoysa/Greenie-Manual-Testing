# Test Case Document

### Project Name: [Greenie]
### Module Name: [Computing Group Project]
### Version: [1.1]
### Created By: [Warushahannadige Soysa]
### Reviewed By: [ ]
### Date: [2025/03/25]

---

## 1. Introduction
- Brief introduction of the document’s purpose.
- Overview of the test cases to be executed for validation.

---

## 2. Test Environment
- **Operating System:** [ Windows 11 ]
- **Browser:** [ Chrome ]
- **API Tools:** [ Postman ]
- **Database:** [ MongoDB ]


## 3. Test Case :

## User Authentication & Profile Management

---


## Test Case ID: TC_001
**Test Case Title**: Verify user registration with valid credential.

**Scenario**: User registration process.

**Test Description**: Test to verify the register functionality for registered users.  

**Preconditions**:
- User must navigate to the register page
- User must enter the valid credential(Name, E-mail, Password)


### Test Steps:
1. Open the login page of the application.
2. Click the "Create Account"
3. Navigate to the "Create an Account" page.
4. Enter the valid Name for "Your Name" field.
5. Enter the valid E-mail for "E-mail Here" field.
6. Enter the valid Password for "Password" filed.
7. Click the "Create" Button


**Test Data**:
- Name: `Test User`
- E-mail: `testuser@example.com`
- Password: `password123`

**Expected Result**:
- The user should be redirected to the "Login" page.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---

## Test Case ID: TC_002
**Test Case Title**: Verify User registration with invalid credential.

**Scenario**: User registration process.

**Test Description**: Test to verify the login functionality for registered users.  

**Preconditions**:
- User must be registered in the system.
- The user must have valid credentials (Name, E-mail, Password).

### Test Steps:
1. Open the Register page of the application.
2. Enter the valid Name in the "Name" field.
3. Enter the invalid E-mail in the "E-mail" field.
4. Enter the valid Password in the "Password" filed.
5. Click the "Create" Button.

**Test Data**:
- Name: `Test User`
- E-mail: `testuser.com`
- Password: `password123`

**Expected Result**:
- Near the "E-mail" filed show the "Please include an `@` in the email address".`testuser.com` is missing an`@`.


**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---

## Test Case ID: TC_003
**Test Case Title**: Verify User login with valid credential

**Scenario**: User login process.

**Test Description**: Test to verify the login functionality for  users.  

**Preconditions**:
- User must be on "Login" page.
- User must have valid credential.(E-mail and Password).

### Test Steps:
1. Open the login page of the application.
2. Enter the valid E-mail in the E-mail field.
3. Enter the valid password in the password field.
4. Click the "Login" button.
5. Observe the system’s response after clicking the login button.

**Test Data**:
- E-mail: `testuser@example.com`
- Password: `password123`

**Expected Result**:
- The user should be redirected to the "Feed" page.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_004
**Test Case Title**: Verify User login with invalid credential.

**Scenario**: User login process.

**Test Description**: Test to verify the login functionality for login users.  

**Preconditions**:
- User must be on the "Login" page.
- User must enter the invalid credential

### Test Steps:
1. Open the login page of the application.
2. Enter the invalid E-mail for E-mail field.
3. Enter the invalid Password for Password field.
4. Click the "Login" Button.

**Test Data**:
- E-mail: `testuser123@example.com`
- Password: `password`

**Expected Result**:
- Under the "Welcome Back" title show "Invalid email or password" error message.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_005
**Test Case Title**: Verify JWT authentication and session management after login.


**Test Description**: Test to ensure the user session is maintained after login 

**Preconditions**:
- User must be logged in with valid credentials.

### Test Steps:
1. Log in to the application with valid credentials.
2. Observe if the system maintains the user session after login.
3. Navigate through different pages (e.g., Feed , Shop , Challenges).
4. Observe whether the user remains logged in throughout the session.

**Test Data**:
- E-mail: `testuser@example.com`
- Password: `password123`

**Expected Result**:
-  The user should remain logged in across different pages and the session should be maintained.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---

## Test Case ID: TC_006
**Test Case Title**: Verify the system invalidates the session after logout.

**Test Description**: Test to ensure the system logs out the user and expires the session. 

**Preconditions**:
- The user is logged into the system with valid credentials.
- The user has access to the feed or any authorized page.

### Test Steps:
1. Log in to the application using valid user credentials.
2. Navigate to the feed.
3. Click the "Profile" Icon.
4.  Click on the Logout button.
5. Attempt to access the Feed or any authorized URL using the previous session (e.g., using the browser's back button or a direct URL).
6. Observe the system's response.



**Test Data**:
- E-mail: `testuser@example.com`
- Password: `password123`

**Expected Result**:
- The user should be redirected to the login page after clicking Logout.


**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Critical  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_007
**Test Case Title**: Verify the system invalidates the session after logout.

**Test Description**: Test to verify the system invalidates the session after logout.

**Preconditions**:
- User must be registered in the system.
- The user must have valid credentials (username and password).

### Test Steps:
1. Log in to the application using valid credentials.
2. Navigate to a secured page (e.g., feed).
3. Click on the Logout button.
4. Attempt to access the secured page again using the browser’s back button or by entering the URL directly.
5. Observe the system behavior.

**Test Data**:
- E-mail: `testuser@example.com`
- Password: `password123`

**Expected Result**:
- The user should be redirected to the Login page after clicking Logout.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_008
**Test Case Title**: Verify the system sends a password reset link or OTP to the registered email.

**Test Description**: Test to verify the password reset link with registered email.  

**Preconditions**:
- User is registered with a valid email address.
- The application has an active email service configured.
- The user knows their registered email address.

### Test Steps:
1. Open the application’s Login page.
2. Click on the Forgot Password?.
3. Enter the registered email address in the provided field.
4. Click on the Submit or Send Reset Link button.
5. Check the registered email inbox for the password reset link or OTP.


**Test Data**:
- E-mail: `testuser@example.com`
- Password: `password123`

**Expected Result**:
- The system should display a confirmation message stating that a password reset link or OTP has been sent to the registered email.
- The user should receive an email with a valid password reset link or OTP.
- The email should contain appropriate instructions for resetting the password.
- No email should be sent if the entered email address is not registered.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_009
**Test Case Title**: Verify User Logout and Session Expiration

**Test Description**: Test to verify the logout functionality for login users.  

**Preconditions**:
- User must be logged into the application.
- Active session must exist for the logged-in user.
- The application must have a logout option available.

### Test Steps:
1. Log in to the application using valid credentials.
2. Navigate to the dashboard or any other authorized section.
3. Click on the "Sign Out" button or link.
4. Verify that the user is redirected to the Login or Home page.
5. Attempt to access any protected page or endpoint (e.g., feed) using the previous session URL.
6. Verify the system prompts the user to log in again.

**Test Data**:
- E-mail: `testuser@example.com`
- Password: `password123`

**Expected Result**:
- The user should be redirected to the feed page.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_010
**Test Case Title**: Verify User can update their profile.

**Test Description**: Test to verify user can update thier profile (Name , Username , E-mail , Bio)  

**Preconditions**:
- User must log into to the System.
- User must navigate to the "Edit your profile" page.

### Test Steps:
1. User logged into the system with valid credential.
2. Click the "Profile" icon to Navigate to the "Profile" page.
3. Click the "Edit Profile" Button.
4. Navigate to the "Edit your profile"
5. Click the "Edite image" icon with add Profile image.
6. Enter the First and Last Name in "Your name" field.
7. Enter the valid username in "Username" field.
8. Show the Current Email Address in "Email address" field.
9. Enter the bio in "Bio" filed.
10. Click the "Save" button

**Test Data**:
- First Name: `Test`
- Last Name: `User`
- Username: `@testuser`
- Email: `testuser@example.com`
- Bio: `This is the testing.`

**Expected Result**:
- The user should be redirected to the Profile page.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_011
**Test Case Title**: Verify the update profile details.

**Test Description**: Test to verify the update profile details display correctly.

**Preconditions**:
- User must update the "Edit your profile" details
- User must on the "Profile Page".

### Test Steps:
1. Navigate to the "Profile Page"
2. Display the User Image , Name , Username.

**Test Data**:
- Name: `Test User`
- Username: `@testuser`

**Expected Result**:
- The user display the valid (Profile image, Name, Username)

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_012
**Test Case Title**: Verify the About section.

**Test Description**: Test to verify the About section with (Earn Badge , About , Email , Earn Points). 

**Preconditions**:
- User must be registered in the system.
- User must complete the Challenges.
- The user must have valid credentials (username and password).

### Test Steps:
1. Navigate to the "Profile Page".
2. Click the "About".
3. Display the (Earn Badge , About , Email , Earn Points).

**Test Data**:
- About: `This is the testing`
- Email: `testuser@example.com`
- Points: `Some integer with percentage`

**Expected Result**:
- About section display (Earn Badge , About , Email , Earn Points).

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_013 (Not Complete)
**Test Case Title**: Verify User display the Complete Challenges

**Test Description**: Test to verify the all complete challenges by User 

**Preconditions**:
- User must be registered in the system.
- User must complete the Challenges.

### Test Steps:
1.
2. 


**Test Data**:
- 

**Expected Result**:
- 

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_014 (Not Completed)
**Test Case Title**: Verify User Display the Order History.

**Test Description**: Test to verify the User Display the Order History User purchased.  

**Preconditions**:
- User must be registered in the system.
- User need to purchased product in the shop.

### Test Steps:
1. 
2. 


**Test Data**:
- 

**Expected Result**:
- 

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---


## Test Case ID: TC_015
**Test Case Title**: Verify User posted post display under the "Post" section under the profile page.

**Test Description**: Test to verify the User posted post display under "Post" section.

**Preconditions**:
- User must be log into the system.
- User must successfully navigate to the Profile section.
- User already posted post/s.

### Test Steps:
1. Navigate to the "Profile" section.
2. Feed section show under profile section.
3. User can scroll the feed section.
4. One Post show the (Profile image, Name , Username , Post Description , Post Image , Like Count , Comments)

**Test Data**:
- Name: `Test User`
- Username: `@testuser`
- Post Description: `This is testing post`
- Like Count: `99`
- Comments: `[testing , QA , Automation]`

**Expected Result**:
- The user display the valid post/s posted by user.

**Actual Result**:
- [Fill in after execution]

**Status**: Pass/Fail  
**Severity**: Major  
**Priority**: High  
**Assigned To**: [Tester Name]  
**Test Execution Date**: [YYYY-MM-DD]  
**Comments**: [Any additional notes or observations]

---



























## 4. Test Execution Summary
- **Total Test Cases:** [Total Number ]
- **Passed:** [Number of Passed Cases]
- **Failed:** [ Number of Failed Cases]
- **Blocked:** [ Number of Blocked Cases ]
- **Test Completion Percentage:** [ (Passed/Total) * 100% ]