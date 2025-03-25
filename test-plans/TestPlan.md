# Test Plan for Greenie

## Version Information
**Version 1.0**: Initial test plan documented on 2025/01/22.  
**Author**: Thanuga Soysa

## Table of Contents
1. [Introduction](#1-introduction)
   - [Purpose](#11-purpose)
   - [Scope](#12-scope)
   - [Objectives](#13-objectives)
   - [Testing Approach](#14-testing-approach)
   - [Test Environment](#15-test-environment)
2. [Test Strategy](#2-test-strategy)
   - [Functional Testing](#21-functional-testing)
   - [UI Testing](#22-ui-testing)
   - [Security Testing](#23-security-testing)
   - [Performance Testing](#24-performance-testing)
3. [Test Scenarios & Cases](#3-test-scenarios--cases)
   - [User Authentication & Profile Management](#31-user-authentication--profile-management)
   - [Challenge System & Proof Submission](#32-challenge-system--proof-submission)
   - [Social Engagement](#33-social-engagement-posts-likes-comments)
   - [Points & Rewards System](#34-points--rewards-system)
   - [Greenie Shop (E-Commerce)](#35-greenie-shop-e-commerce)
   - [Greenie Admin Panel](#36-greenie-admin-panel)
4. [Test Execution](#4-test-execution)
   - [Entry Criteria](#41-entry-criteria)
   - [Exit Criteria](#42-exit-criteria)
   - [Test Reporting](#43-test-reporting)
5. [Test Deliverables](#5-test-deliverables)
6. [Risks & Mitigation](#6-risks--mitigation)
7. [Conclusion](#7-conclusion)

---

## **1. Introduction**

### **1.1 Purpose**
This test plan outlines the strategy, objectives, scope, and approach for testing the Greenie application. The testing process ensures functionality, security, usability, and performance of the platform built using **Spring Boot (Backend), React (Frontend), and MongoDB (Database)**.

### **1.2 Scope**
Greenie is a challenge-based social platform integrating gamification and e-commerce elements. Testing will cover **user authentication, challenge system, social engagement, points and rewards, e-commerce shop, and admin functionalities**.

### **1.3 Objectives**
- Ensure core functionalities work as expected.
- Verify authentication and security mechanisms.
- Validate proper data storage and retrieval from MongoDB.
- Confirm smooth user experience.
- Identify and mitigate vulnerabilities.
- Ensure efficient database interactions and API responses.

### **1.4 Testing Approach**
- **Manual Testing:** Functional, UI, and exploratory testing.
- **Automation Testing:** Selenium (UI), JUnit/TestNG (Backend APIs), Postman (API Testing).
- **Performance Testing:** JMeter.
- **Security Testing:** OWASP ZAP, Burp Suite.

### **1.5 Test Environment**
- **Frontend:** React
- **Backend:** Spring Boot
- **Database:** MongoDB
- **OS:** Windows/Linux
- **Browsers:** Chrome, Firefox, Edge
- **Tools:** Postman, Selenium, JMeter, OWASP ZAP, Burp Suite

---

## **2. Test Strategy**

### **2.1 Functional Testing**
Functional testing ensures that each feature works as intended according to the requirements. It is divided into three key aspects:

- **Functional Positive Testing**
   - Verifying expected functionality with valid inputs.
   - Ensuring core features behave correctly under normal conditions.

- **Functional Alternative Testing**
   - Testing edge cases and alternative user flows.
   - Ensuring that optional paths and user interactions still work correctly.

- **Functional Negative Testing**
   - Providing invalid inputs to check system robustness.
   - Ensuring appropriate error handling, validation, and security measures.

### **2.2 UI Testing**
- Validate UI consistency, responsiveness, and accessibility.

### **2.3 Security Testing**
- Check for authentication/authorization loopholes.
- Identify potential vulnerabilities (SQL injection, XSS, CSRF).

### **2.4 Performance Testing**
- Measure system response under load.
- Check database query efficiency and API performance.

---

## **3. Test Scenarios & Cases**

## 3.1: User Authentication & Profile Management

### Scenario 3.1.1: Verify user registration with valid and invalid credentials.
- **Test Case 3.1.1.1**: Ensure the system allows registration with valid credentials.
- **Test Case 3.1.1.2**: Ensure the system rejects invalid credentials (e.g., missing fields, invalid email format).

### Scenario 3.1.2: Verify user login with valid and invalid credentials.
- **Test Case 3.1.2.1**: Ensure the system allows login with correct credentials.
- **Test Case 3.1.2.2**: Ensure the system rejects login with incorrect credentials.

### Scenario 3.1.3: Verify JWT authentication and session management for security.
- **Test Case 3.1.3.1**: Ensure the user session is maintained after login.
- **Test Case 3.1.3.2**: Ensure the system invalidates the session after logout.

### Scenario 3.1.4: Verify password reset and account recovery process (via email or OTP).
- **Test Case 3.1.4.1**: Ensure the system sends a password reset link or OTP to the registered email.

### Scenario 3.1.5: Verify user logout functionality and session expiration handling.
- **Test Case 3.1.5.1**: Ensure the system logs out the user and expires the session.

### Scenario 3.1.6: Verify user profile update (name, bio, profile picture).
- **Test Case 3.1.6.1**: Ensure users can update their profile details.
- **Test Case 3.1.6.2**: Verify the profile updates display correctly.

### Scenario 3.1.7: Verify profile displays completed challenges, uploaded posts, total points, and order history.
- **Test Case 3.1.7.1**: Ensure completed challenges appear in the profile.
- **Test Case 3.1.7.2**: Verify the correct display of posts, points, and order history.

### Scenario 3.1.8: Verify users can view their earned badges based on completed challenges and milestones.
- **Test Case 3.1.8.1**: Ensure the profile displays badges earned from challenges.

### Scenario 3.1.9: Verify badges are awarded automatically when users reach specific challenge completion milestones.
- **Test Case 3.1.9.1**: Verify badges are awarded automatically when milestones are reached.

### Scenario 3.1.10: Verify users can deactivate or delete their account.
- **Test Case 3.1.10.1**: Ensure users can deactivate their accounts.
- **Test Case 3.1.10.2**: Ensure users can delete their accounts.

### Scenario 3.1.11: Verify the leaderboard considers total points and earned badges when ranking users.
- **Test Case 3.1.11.1**: Ensure the leaderboard is updated based on points and badges.

### Scenario 3.1.12: Verify admin can manage user accounts (delete, update roles).
- **Test Case 3.1.12.1**: Ensure the admin can delete a user account.
- **Test Case 3.1.12.2**: Verify the admin can update user roles.

### Scenario 3.1.13: Verify users cannot bypass authentication to access restricted pages (security check).
- **Test Case 3.1.13.1**: Ensure users are redirected to the login page when attempting to access restricted pages.

---

## 3.2: Challenge System & Proof Submission

### Scenario 3.2.1: Verify users can view and browse all system-approved challenges.
- **Test Case 3.2.1.1**: Ensure the challenge list page displays all approved challenges.

### Scenario 3.2.2: Verify users can create a new challenge with a title, description, points, and image.
- **Test Case 3.2.2.1**: Ensure the user can successfully create a new challenge.

### Scenario 3.2.3: Verify that when a user submits a new challenge, it remains in a "Pending Approval" state.
- **Test Case 3.2.3.1**: Ensure the newly created challenge is in a "Pending Approval" state.

### Scenario 3.2.4: Verify the admin panel displays pending challenges for review.
- **Test Case 3.2.4.1**: Ensure the admin can view all pending challenges.

### Scenario 3.2.5: Verify the admin can approve or reject a user-created challenge.
- **Test Case 3.2.5.1**: Ensure the admin can approve or reject challenges.

### Scenario 3.2.6: Verify that once approved, the challenge appears in the Challenges section for all users.
- **Test Case 3.2.6.1**: Ensure approved challenges appear for all users.

### Scenario 3.2.7: Verify that if rejected, the challenge does not appear in the Challenges section and the user is notified.
- **Test Case 3.2.7.1**: Ensure rejected challenges do not appear in the challenges list and the user is notified.

### Scenario 3.2.8: Verify users can join and accept approved challenges.
- **Test Case 3.2.5.1**: Ensure the User can join approved challenges.

### Scenario 3.2.9: Verify proof submission (image upload) & description  for challenge completion.
- **Test Case 3.2.5.1**: Ensure the User can submit the proof (image & description)

### Scenario 3.2.10: Verify OpenRouter AI API validates the submitted proof accurately.
- **Test Case 3.2.5.1**:  Ensure the OpenRouter AI API processes and evaluates the submitted proof (image and description) accurately, providing appropriate feedback on the challenge's authenticity.

### Scenario 3.2.11: Verify the challenge status updates after submission (Pending → Approved/Rejected).
- **Test Case 3.2.5.1**:Ensure that the challenge status changes from  "Approved" to "Rejected" after successful proof submission and validation by the OpenRouter AI API.

### Scenario 3.2.12:  Verify users can share a post about their completed challenge without admin approval
- **Test Case 3.2.5.1**:Ensure users can share a post about their completed challenge directly to their profile or activity feed without requiring admin approval if the proof submission is approved.

### Scenario 3.2.13: Verify proof submission (image upload) for challenge completion.
- **Test Case 3.2.5.1**:Ensure the User can successfully upload an image as proof of challenge completion, with validations for supported image formats (e.g., JPG, PNG) and file size limits.

---

## 3.3: Social Engagement (Posts, Likes, Comments)

### Scenario 3.3.1: Verify users can create posts with images and text.
- **Test Case 3.3.1.1**: Ensure users can create posts with text and images.

### Scenario 3.3.2: Verify users can like and comment on posts.
- **Test Case 3.3.2.1**: Ensure users can like and comment on posts.

---

## 3.4: Points & Rewards System

### Scenario 3.4.1: Verify that after a successful challenge completion, points are accurately awarded to the user.
- **Test Case 3.4.1.1**: Ensure points are awarded correctly after completing a challenge.

### Scenario 3.4.2: Verify that navigating to the Leaderboard Page displays:
- **Test Case 3.4.2.1**: Ensure the leaderboard and sections display the correct data.
    - Current Leaderboard Section, showing the Top 3 Users with the Highest Points.
        - Each card displays: Rank, User Profile Image, Email, Points, and Challenges Completed.
    - Rising Members Section, displaying leading members with: Rank, Member Name, Points, and Challenges Completed.
    - Your Score Details Section, showing: Profile Picture, Username, Email, Current Rank, Challenges Completed Count, and Points Earned.
    - Achievement Section, displaying all badges the user has earned.

### Scenario 3.4.3: Verify that badges are assigned based on milestones achieved and correctly displayed in the Achievement Section.
- **Test Case 3.4.3.1**: Ensure badges are assigned correctly and displayed in the Achievement Section.

---

## 3.5: Greenie Shop (E-Commerce)

### Scenario 3.5.1: Verify users can browse all product cards displaying Image, Title, Points, and Price.
- **Test Case 3.5.1.1**: Navigate to the shop page and verify that each product card displays an image, title, points, and price.

### Scenario 3.5.2: Verify users can filter products by Most Popular, Lowest Price, Highest Price, and Newest.
- **Test Case 3.5.2.1**: Apply each filter option and verify the products are correctly sorted according to the selected criteria.

### Scenario 3.5.3: Verify users can see their total available points in the shop.
- **Test Case 3.5.3.1**: Ensure that the user's available points are displayed in a visible location in the shop.

### Scenario 3.5.4: Verify the search bar allows users to search and find specific products.
- **Test Case 3.5.4.1**: Use the search bar to enter product names and verify the correct products appear in the search results.

### Scenario 3.5.5: Verify users can see a Cart Button and clicking it opens a right-hand sliding Cart Page.
- **Test Case 3.5.5.1**: Click the cart button and confirm the cart page slides in from the right.

### Scenario 3.5.6: Verify that if no products are added to the cart:
- **Test Case 3.5.6.1**: Ensure the cart shows 0 products, displays the message "Your cart is empty", and the Total Price is 0. Ensure that clicking View Cart or Checkout redirects correctly.

### Scenario 3.5.7: Verify that clicking on a product card navigates to the individual product preview page, displaying:
- **Test Case 3.5.7.1**: Verify that all relevant details (Title, Units, Price, Points, Description, Quantity) are displayed, along with the Add to Cart and Buy Now buttons.

### Scenario 3.5.8: Verify that clicking "Add to Cart":
- **Test Case 3.5.8.1**: Ensure a message "[Product Name] added to cart" appears and that the cart popup is displayed automatically.

### Scenario 3.5.9: Verify that adding 3 products updates the cart correctly.
- **Test Case 3.5.9.1**: Add 3 products and verify that the cart updates the quantity and price accordingly.

### Scenario 3.5.10: Verify that clicking View Cart in the popup navigates to the Cart Page, displaying:
- **Test Case 3.5.10.1**: Ensure the cart page shows the "Shopping Cart (Number of Products)" heading and all products as cards with Image, Title, Quantity, Price, and Delete button.

### Scenario 3.5.11: Verify that clicking the Delete button removes the product from the cart.
- **Test Case 3.5.11.1**: Click the Delete button on any cart item and ensure it is removed from the cart.

### Scenario 3.5.12: Verify that increasing the quantity of a product updates the cart total correctly.
- **Test Case 3.5.12.1**: Change the quantity of a product and verify that the total price updates accordingly.

### Scenario 3.5.13: Verify the Redeem Points Section, including:
- **Test Case 3.5.13.1**: Ensure the Redeem Points section has all the fields (Enter Points, Clear, Apply Points, Use Max Points). Enter invalid points and ensure the correct message is displayed ("You don't have enough points").

### Scenario 3.5.14: Verify the Order Summary Section, displaying:
- **Test Case 3.5.14.1**:Verify the Order Summary includes Subtotal, Shipping, Total, and "Proceed to Checkout" button.

### Scenario 3.5.15: Verify that clicking the Checkout button navigates to the payment page with shipping details.
- **Test Case 3.5.15.1**: Verify the user is redirected to the payment page after clicking "Proceed to Checkout".

### Scenario 3.5.16: Verify the Order Confirmation Page, displaying:
- **Test Case 3.5.16.1**: Ensure the confirmation page displays the Order Number, Order Date, Total Price, Shipping Address, and purchased products.

### Scenario 3.5.17: Verify that once an order is confirmed, the order details appear in the user profile.
- **Test Case 3.5.17.1**: Ensure that confirmed orders appear under the "Order History" section of the user profile.

---

## 3.6: Admin Panel

### 3.6.1 Dashboard
### Scenario 3.6.1.1: Verify clicking the Dashboard menu item navigates to the Dashboard Page successfully.
- **Test Case 3.6.1.1.1**: Ensure clicking the Dashboard menu item navigates to the Dashboard Page without errors.

### Scenario 3.6.1.2: Verify the Dashboard displays the following key statistics:
- **Test Case 3.6.1.2.1**: Ensure the Dashboard shows the correct Total Users.
- **Test Case 3.6.1.2.2**: Ensure the Dashboard shows the correct Total Posts.
- **Test Case 3.6.1.2.3**: Ensure the Dashboard shows the correct Total Challenges.
- **Test Case 3.6.1.2.4**: Ensure the Dashboard shows the correct Total Orders.

### 3.6.2 User Management
### Scenario 3.6.2.1: Verify the User Management Section lists users with:
- **Test Case 3.6.2.1.1**: Ensure users are displayed with Name, Email, Points, Number of Challenges Completed, and Actions.

### Scenario 3.6.2.2: Verify clicking the Delete User button successfully removes a user from the system.
- **Test Case 3.6.2.2.1**: Ensure clicking the Delete User button removes the user from the User Management list and the system.

### 3.6.3 Challenges Management
## Active & Pending Challenges
### Scenario 3.6.3.1: Verify the Challenges Section displays two tabs: Active Challenges and Pending Challenges.
- **Test Case 3.6.3.1.1**: Ensure the Challenges Section displays both Active and Pending Challenges tabs.

### Scenario 3.6.3.2: Verify Active Challenges cards display:
- **Test Case 3.6.3.2.1**: Ensure Active Challenges cards display Challenge Image, Title, Added By (User), Points, and Number of Submissions.

### Scenario 3.6.3.3: Verify Pending Challenges cards display:
- **Test Case 3.6.3.3.1**: Ensure Pending Challenges cards display Challenge Image, Title, Added By (User), Points, and the text "Needs Review."

### 3.6.4 Adding a New Challenge
### Scenario 3.6.4.1: Verify clicking the "Add Challenge" button opens a popup with input fields:
- **Test Case 3.6.4.4.1**: Ensure clicking "Add Challenge" opens a popup with fields: Upload Image, Challenge Name, No. of Points, Challenge Description, Discard Button, Add Challenge Button.

### Scenario 3.6.5.1: Verify filling out the form and clicking "Add Challenge" successfully adds the challenge to Active Challenges.
- **Test Case 3.6.5.1.1**: Ensure filling out the form and clicking "Add Challenge" successfully adds the challenge to the Active Challenges list.

## 3.6.5 Reviewing Pending Challenges
### Scenario 3.6.5.1: Verify clicking a Pending Challenge opens a review popup showing:
- **Test Case 3.6.5.1.1**: Ensure clicking a Pending Challenge opens a review popup showing Challenge Image, Added By, Challenge Name, Number of Points, Challenge Description, and buttons for Delete and Approve.

### Scenario 3.6.5.2: Verify clicking the Delete Button removes the pending challenge from the system.
- **Test Case 3.6.5.2.1**: Ensure clicking Delete removes the pending challenge from the system.

### Scenario 3.6.5.3: Verify clicking the Approve Button successfully moves the challenge to Active Challenges.
- **Test Case 3.6.5.3.1**: Ensure clicking Approve moves the challenge to Active Challenges.

### 3.6.6 Proof Submission Management
### Scenario 3.6.6.1: Verify Proof Submission Section displays three categories:
- **Test Case 3.6.6.1.1**: Ensure the Proof Submission Section shows three categories: Filter, Verified, With Issues.

### Scenario 3.6.6.2: Verify clicking the Filter button shows all verified and issue-related proof cards.
- **Test Case 3.6.6.2.1**: Ensure clicking Filter shows all verified and issue-related proof cards.

### Scenario 3.6.6.3: Verify clicking Verified shows only proof submissions that were successfully verified.
- **Test Case 3.6.6.3.1**: Ensure clicking Verified shows only verified proof submissions.

### Scenario 3.6.4.4: Verify clicking With Issues displays only proof submissions flagged with issues.
- **Test Case 3.6.6.4.1**: Ensure clicking With Issues displays only proof submissions flagged with issues.

### 3.6.7 Reviewing Verified Proof
### Scenario 3.6.7.1: Verify clicking a Verified Proof Card opens a popup displaying:
- **Test Case 3.6.7.1.1**: Ensure clicking a Verified Proof Card opens a popup with Status (Verified), Challenge Name, Submitted By, User Feedback, AI Response, and buttons for Delete Post and View Post.

### Scenario 3.6.7.2: Verify clicking the Delete Post Button removes the proof submission.
- **Test Case 3.6.7.2.1**: Ensure clicking the Delete Post Button removes the proof submission.

### Scenario 3.6.7.3: Verify clicking the View Post Button navigates to the respective post.
- **Test Case 3.6.7.3.1**: Ensure clicking the View Post Button navigates to the respective post.

### 3.6.8 Reviewing Proof with Issues
### Scenario 3.6.8.1: Verify clicking an Issue Proof Card opens a popup displaying:
- **Test Case 3.6.8.1.1**: Ensure clicking an Issue Proof Card opens a popup with Status (Issue), Challenge Name, Submitted By, User Feedback, AI Response, and buttons for Delete Post and View Post.

### Scenario 3.6.8.2: Verify clicking the Delete Post Button removes the issue proof submission.
- **Test Case 3.6.8.1.1**: Ensure clicking the Delete Post Button removes the issue proof submission.

### Scenario 3.6.8.3: Verify clicking the View Post Button navigates to the respective post.
- **Test Case 3.6.8.1.1**: Ensure clicking the View Post Button navigates to the respective post.

### 3.6.9 Post Management
### Scenario 3.6.9.1: Verify the Post Management Section lists posts with:
- **Test Case 3.6.9.1.1**: Ensure the Post Management Section displays Post ID, Content, Username, Likes, and Publish Date.

### Scenario 3.6.9.2: Verify admin can delete a post from the list.
- **Test Case 3.6.9.2.1**: Ensure the admin can delete posts from the list.

### 3.6.10 Badges Management
### Scenario 3.6.10.1: Verify the Badges Section allows the admin to assign and remove badges.
- **Test Case 3.6.10.1.1**: Ensure the admin can assign and remove badges from users.

### Scenario 3.6.10.2: Verify new badges can be added with custom criteria.
- **Test Case 3.6.10.1.1**: Ensure the admin can add new badges with custom criteria.

### 3.6.11 Shop Management
### Product Management
### Scenario 3.6.11.1: Verify admin can view all products in the Greenie Shop.
- **Test Case 3.6.11.1.1**: Ensure the admin can view all products in the Greenie Shop.

### Scenario 3.6.11 2: Verify admin can add a new product with details:
- **Test Case 3.6.11.2.1**: Ensure the admin can add a new product with details: Image, Title, Description, Points, Price, and Stock Availability.

### Scenario 3.6.11.3: Verify admin can edit product details successfully.
- **Test Case 3.6.11.3.1**: Ensure the admin can edit product details.

### Scenario 3.6.11.4: Verify admin can delete a product.
- **Test Case 3.6.11.4.1**: Ensure the admin can delete a product.

### Order Management
### Scenario 3.6.11.5: Verify admin can view all user orders.
- **Test Case 3.6.11.5.1**: Ensure the admin can view all user orders.

### Scenario 3.6.11.6: Verify admin can mark an order as Shipped or Completed.
- **Test Case 3.6.11.6.1**: Ensure the admin can mark an order as Shipped or Completed.

### Scenario 3.6.11.7: Verify admin can cancel and refund an order.
- **Test Case 3.6.11.7.1**: Ensure the admin can cancel and refund an order.


---


## **4. Test Execution**

### **4.1 Entry Criteria**
- All application modules are developed and deployed.
- Test environment is set up.
- Required test data is prepared.

### **4.2 Exit Criteria**
- All test cases executed and defects logged.
- No high-priority defects remain open.
- Test results documented and reviewed.

### **4.3 Test Reporting**
- Daily and weekly test execution reports.
- Defect tracking using Jira/Trello.
- Performance analysis and security audit reports.

---

## **5. Test Deliverables**
- Test Plan Document
- Test Cases & Test Data
- Test Execution Reports
- Defect Reports
- Automation Scripts 
- Final Test Summary Report

---

## **6. Risks & Mitigation**

| **Risk** | **Mitigation** |
|----------|--------------|
| Backend API failures | Implement robust API testing & monitoring |
| Performance bottlenecks | Conduct thorough load testing & optimize queries |
| Security vulnerabilities | Regular security scans & code reviews |
| UI inconsistencies | Automated UI testing & cross-browser testing |

---

## **7. Conclusion**
This test plan serves as a comprehensive guide to ensuring the quality and reliability of Greenie. By following this structured approach, we aim to deliver a **secure, high-performing, and user-friendly application**.
