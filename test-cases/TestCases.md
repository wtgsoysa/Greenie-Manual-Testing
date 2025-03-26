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


## 3. Test Case Documentation

# 1. User Authentication & Profile Management

[//]: # (## **Test Case: User Registration with Valid and Invalid Credentials**)

### **Module:** User Authentication
### **Priority:** High
### **Test Type:** Functional

### **Preconditions:**
- The application should be running.
- The user registration page should be accessible.


| Test Case ID | Test Scenario                                                  | Test Steps                                              | Test Data                                                                                        | Expected Result                                                                                                                                | Actual Result  | Status (Pass/Fail) | Remarks |
|--------------|----------------------------------------------------------------|---------------------------------------------------------|--------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------|----------------|--------------------|---------|
| Test_001     | 1.1 Verify user registration with valid & invalid creadentials | 1. Navigate to the registration page                    |                                                                                                  | 	The registration page should load successfully.                                                                                               |                |                    |         |
|              |                                                                | 2. Enter valid credentials (username, email, password). | **Full Name** : Akila Lakshitha <br> **E-mail** : admin@akila.dev <br> **password** : akila123   | 	User should be registered successfully and redirected to the login page.                                                                      |                |                    |         |
|              |                                                                | 3. Enter an already registered email and submit.        | **Email**: existing@akila.com                                                                    | 	The system should display an error message: "Email already exists.                                                                            |                |                    |         |
|              |                                                                | 4. Enter an invalid email format and submit.            | **Email**: invalid-com                                                                           | 	The system should display an error message: "Invalid email format.                                                                            |                |                    |         |
|              |                                                                | 6. Leave mandatory fields empty and submit.	            |                                                                                                  | The system should display an error message: "Password must be at least 8 characters long and include letters, numbers, and special characters. |                |                    |         |
| Test_002     | 1.2 Verify user login with valid and invalid credentials.      | 1. Leave mandatory fields empty and submit.	            |                                                                                                  |                                                                                                                                                |                |                    |         |




























## 4. Test Execution Summary
- **Total Test Cases:** [Total Number ]
- **Passed:** [Number of Passed Cases]
- **Failed:** [ Number of Failed Cases]
- **Blocked:** [ Number of Blocked Cases ]
- **Test Completion Percentage:** [ (Passed/Total) * 100% ]