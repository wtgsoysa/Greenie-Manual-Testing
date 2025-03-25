# Test Scenarios

## 1. User Authentication & Profile Management
- **Scenario 1.1:** Verify user registration with valid and invalid credentials.
- **Scenario 1.2:** Verify user login with valid and invalid credentials.
- **Scenario 1.3:** Verify JWT authentication and session management for security.
- **Scenario 1.4:** Verify password reset and account recovery process (via email or OTP).
- **Scenario 1.5:** Verify user logout functionality and session expiration handling.
- **Scenario 1.6:** Verify user profile update (name, bio, profile picture).
- **Scenario 1.7:** Verify profile displays completed challenges, uploaded posts, total points, and order history.
- **Scenario 1.8:** Verify users can view their earned badges based on completed challenges and milestones.
- **Scenario 1.9:** Verify badges are awarded automatically when users reach specific challenge completion milestones.
- **Scenario 1.10:** Verify users can deactivate or delete their account.
- **Scenario 1.11:** Verify the leaderboard considers total points and earned badges when ranking users.
- **Scenario 1.12:** Verify admin can manage user accounts (delete, update roles).
- **Scenario 1.13:** Verify users cannot bypass authentication to access restricted pages (security check).

## 2. Challenge System & Proof Submission
- **Scenario 2.1:** Verify users can view and browse all system-approved challenges.
- **Scenario 2.2:** Verify users can create a new challenge with a title, description, no.Points and image.
- **Scenario 2.3:** Verify that when a user submits a new challenge, it remains in a "Pending Approval" state.
- **Scenario 2.4:** Verify the admin panel displays pending challenges for review.
- **Scenario 2.5:** Verify the admin can approve or reject a user-created challenge.
- **Scenario 2.6:** Verify that once approved, the challenge appears in the Challenges section for all users.
- **Scenario 2.7:** Verify that if rejected, the challenge does not appear in the Challenges section and the user is notified.
- **Scenario 2.8:** Verify users can join and accept approved challenges.
  - **Scenario 2.9:** Verify proof submission (image upload) and description for challenge completion.
- **Scenario 2.10:** Verify OpenRouter AI API validates the submitted proof accurately.
- **Scenario 2.11:** Verify the challenge status updates after submission (Pending → Approved/Rejected).
- **Scenario 2.12:** Verify users can share a post about their completed challenge without admin approval.
- **Scenario 2.13:** Verify admin can review and delete challenge-related shared posts if necessary.
- **Scenario 2.14:** Verify points allocation based on challenge difficulty and completion.
- **Scenario 2.16:** Verify leaderboard updates correctly when users complete challenges.
- **Scenario 2.17:** Verify challenge-related posts appear on the feed instantly after completion.
- **Scenario 2.18:** Verify challenge history is recorded in the user profile.
- **Scenario 2.19:** Verify challenges have an expiration date (if applicable).
- **Scenario 2.20:** Verify users cannot submit proof for an expired challenge.

## 3. Social Engagement (Posts, Likes, Comments)
- **Scenario 3.1:** Verify users can create posts with images and text.
- **Scenario 3.2:** Verify users can like and comment on posts.

## 4. Points & Rewards System
- **Scenario 4.1:** Verify that after a successful challenge completion, points are accurately awarded to the user.
- **Scenario 4.2:** Verify that navigating to the **Leaderboard Page** displays:
  - **Current Leaderboard Section**, showing the **Top 3 Users with the Highest Points**.
    - Each card displays:
      - **Rank, User Profile Image, Email, Points, and Challenges Completed**.
  - **Rising Members Section**, displaying leading members with:
    - **Rank, Member Name, Points, and Challenges Completed**.
  - **Your Score Details Section**, showing:
    - **Profile Picture, Username, Email, Current Rank, Challenges Completed Count, and Points Earned**.
  - **Achievement Section**, displaying all badges the user has earned.
- **Scenario 4.3:** Verify that badges are assigned based on milestones achieved and correctly displayed in the **Achievement Section**.
- **Scenario 4.4:** Verify that points calculation and redemption processes work accurately.

## 5. Greenie Shop (E-Commerce)
- **Scenario 5.1:** Verify users can browse all product cards displaying **Image, Title, Points, and Price**.
- **Scenario 5.2:** Verify users can filter products by **Most Popular, Lowest Price, Highest Price, and Newest**.
- **Scenario 5.3:** Verify users can see their **total available points** in the shop.
- **Scenario 5.4:** Verify the search bar allows users to search and find specific products.
- **Scenario 5.5:** Verify users can see a **Cart Button** and clicking it opens a **right-hand sliding Cart Page**.
- **Scenario 5.6:** Verify that if no products are added to the cart:
  - The cart shows **0 products**.
  - A message **"Your cart is empty"** is displayed.
  - The **Total Price is 0**.
  - Clicking **View Cart** navigates to the **Cart Page**.
  - Clicking **Checkout** shows a message **"Your cart is empty"** and redirects to the **Shop Main Page**.
- **Scenario 5.7:** Verify that clicking on a product card navigates to the **individual product preview page**, displaying:
  - **Full product details:** Title, Units, Price, Points, Description, and Quantity.
  - **"Add to Cart" and "Buy It Now" buttons**.
- **Scenario 5.8:** Verify that clicking **"Add to Cart"**:
  - Displays a message **"[Product Name] added to cart"**.
  - Automatically **opens the right-side Cart popup**.
- **Scenario 5.9:** Verify that adding **3 products** updates the cart correctly.
- **Scenario 5.10:** Verify that clicking **View Cart** in the popup navigates to the **Cart Page**, displaying:
  - **"Shopping Cart (Number of Products)"** heading.
  - A list of all added products.
  - Each product displayed as a **card** with:
    - **Image, Title, Quantity, Price, and Delete button**.
- **Scenario 5.11:** Verify that clicking the **Delete button** removes the product from the cart.
- **Scenario 5.12:** Verify that increasing the quantity of a product updates the cart total correctly.
- **Scenario 5.13:** Verify the **Redeem Points Section**, including:
  - **Redeem Points heading, Available Points Count, Enter Points field, Clear button, Apply Points button, and Use Max Points button**.
  - If the user enters more points than available, display **"You don't have enough points"** message.
- **Scenario 5.14:** Verify the **Order Summary Section**, displaying:
  - **Order Summary heading, Subtotal, Shipping, Total, and "Proceed to Checkout" button**.
- **Scenario 5.15:** Verify that clicking **Proceed to Checkout** navigates to the **Checkout Page**, displaying:
  - **Profile Details (Profile Picture, Username, Email)**.
  - **Shipping Details** auto-filled with Username and Email.
  - User must enter **Street Address, City, Zip Code, and Phone Number**.
- **Scenario 5.16:** Verify that the Checkout Page also includes the **Order Summary**, displaying:
  - **All products in the order, Subtotal, Total, and "Place Order" button**.
- **Scenario 5.17:** Verify that clicking **"Place Order"**:
  - Displays **"Successfully placed order, redirecting to the Shop Main Page"** message.
  - Redirects the user to the **Shop Main Page**.
- **Scenario 5.18:** Verify order history displays **all past purchases**.
- **Scenario 5.19:** Verify stock management and admin control over products.
- **Scenario 5.20:** Verify users receive confirmation notifications for purchases.

## 6. Greenie Admin

### 6.1 Dashboard
- **Scenario 6.1.1:** Verify clicking the Dashboard menu item navigates to the Dashboard Page successfully.
- **Scenario 6.1.2:** Verify the Dashboard displays the following key statistics:
  - Total Users
  - Total Posts
  - Total Challenges
  - Total Orders

### 6.2 User Management
- **Scenario 6.2.1:** Verify the User Management Section lists users with:
  - Name, Email, Points, Number of Challenges Completed, and Actions.
- **Scenario 6.2.2:** Verify clicking the Delete User button successfully removes a user from the system.

### 6.3 Challenges Management
#### Active & Pending Challenges
- **Scenario 6.3.1:** Verify the Challenges Section displays two tabs: Active Challenges and Pending Challenges.
- **Scenario 6.3.2:** Verify Active Challenges cards display:
  - Challenge Image, Title, Added By (User), Points, Number of Submissions.
- **Scenario 6.3.3:** Verify Pending Challenges cards display:
  - Challenge Image, Title, Added By (User), Points, and "Needs Review" text.

#### Adding a New Challenge
- **Scenario 6.3.4:** Verify clicking the "Add Challenge" button opens a popup with input fields:
  - Upload Image, Challenge Name, No. of Points, Challenge Description, Discard Button, Add Challenge Button.
- **Scenario 6.3.5:** Verify filling out the form and clicking "Add Challenge" successfully adds the challenge to Active Challenges.

#### Reviewing Pending Challenges
- **Scenario 6.3.6:** Verify clicking a Pending Challenge opens a review popup showing:
  - Challenge Image, Added By, Challenge Name, Number of Points, Challenge Description.
  - Delete and Approve Buttons.
- **Scenario 6.3.7:** Verify clicking the Delete Button removes the pending challenge from the system.
- **Scenario 6.3.8:** Verify clicking the Approve Button successfully moves the challenge to Active Challenges.

### 6.4 Proof Submission Management
- **Scenario 6.4.1:** Verify Proof Submission Section displays three categories:
  - Filter, Verified, With Issues.
- **Scenario 6.4.2:** Verify clicking the Filter button shows all verified and issue-related proof cards.
- **Scenario 6.4.3:** Verify clicking Verified shows only proof submissions that were successfully verified.
- **Scenario 6.4.4:** Verify clicking With Issues displays only proof submissions flagged with issues.

#### Reviewing Verified Proof
- **Scenario 6.4.5:** Verify clicking a Verified Proof Card opens a popup displaying:
  - Status (Verified), Challenge Name, Submitted By, User Feedback, AI Response.
  - Delete Post Button and View Post Button.
- **Scenario 6.4.6:** Verify clicking the Delete Post Button removes the proof submission.
- **Scenario 6.4.7:** Verify clicking the View Post Button navigates to the respective post.

#### Reviewing Proof with Issues
- **Scenario 6.4.8:** Verify clicking an Issue Proof Card opens a popup displaying:
  - Status (Issue), Challenge Name, Submitted By, User Feedback, AI Response.
  - Delete Post Button and View Post Button.
- **Scenario 6.4.9:** Verify clicking the Delete Post Button removes the issue proof submission.
- **Scenario 6.4.10:** Verify clicking the View Post Button navigates to the respective post.

### 6.5 Post Management
- **Scenario 6.5.1:** Verify the Post Management Section lists posts with:
  - Post ID, Content, Username, Likes, Publish Date.
- **Scenario 6.5.2:** Verify admin can delete a post from the list.

### 6.6 Badges Management
- **Scenario 6.6.1:** Verify the Badges Section allows the admin to assign and remove badges.
- **Scenario 6.6.2:** Verify new badges can be added with custom criteria.

### 6.7 Shop Management
#### Product Management
- **Scenario 6.7.1:** Verify admin can view all products in the Greenie Shop.
- **Scenario 6.7.2:** Verify admin can add a new product with details:
  - Image, Title, Description, Points, Price, Stock Availability.
- **Scenario 6.7.3:** Verify admin can edit product details successfully.
- **Scenario 6.7.4:** Verify admin can delete a product.

#### Order Management
- **Scenario 6.7.5:** Verify admin can view all user orders.
- **Scenario 6.7.6:** Verify admin can mark an order as Shipped or Completed.
- **Scenario 6.7.7:** Verify admin can cancel and refund an order.

