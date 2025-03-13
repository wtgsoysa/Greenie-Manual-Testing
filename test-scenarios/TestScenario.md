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
- **Scenario 2.9:** Verify proof submission (image upload) for challenge completion.
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
