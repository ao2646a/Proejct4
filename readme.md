# Project 4
In this project, you will create a JavaFX Application to emulate a GPA calculator 

# Teams
You may partner with another student on this project to discuss code and strategies for completing the various parts of the assignment. You may share code with your partner, but you should still write much of your own code in your own repository. You should still update your repository (by pushing) incrementally as you make progress. It is up to teammates to ensure that their partner adheres to the <a href="https://www.american.edu/academics/integrity/code.cfm">American University Honor Code.</a> You may use [pair programming](https://en.wikipedia.org/wiki/Pair_programming), however, you must each take turns in the driver role on your own laptop. I should see commits and a submission on Github for each of you to get full credit for this assignment. If you decide to work with a partner, modify the statement below:

- [X] I worked with Amanda on this project.
- [ ] I worked on my own.

## Step 1 - Create the Repo for your Team.
1. **Both members** will clone the repository to your local machines (i.e., using `git clone <URL>`). You will then each have a local repository that is linked to the shared repository, and can work on the code together.
1. As a reference for how to use git, I suggest <a href='http://codingdomain.com/git/'>this site</a>, as it avoids some of the more complicated theory behind git and focuses on the bare minimum practicalities.

## Step 2 - Create an `CourseSchedule` class
The class should have the following **restricted** attributes:
1. `courseNames`
1. `CourseCreditHours`
1. `courseGrades`

## Step 3 - Commit and Push to Github
Remember, this is not like using Blackboard for submitting assignments. As you are working with your teammate, you will need to frequently push code to the Github repo. If you wait to the last minute, you could have conflicts that are difficult to resolve. It is much better to get into a rhythm with your partner early. To get full credit for your part in this, I need to see multiple commits from each team member.

## Step 4 - `getters & setters` 
Create **getters & setters** for the your `CourseSchedule` class's attributes

## Step 5 - `Constructors` 
Create a constructor:
Takes in 3 arguments:
1. Array of course names
1. Array of credit hours for each course
1. Array of grades received for each course

## Step 6 - Create a  `getGPA` method
Uses the `CourseCreditHours` and `courseGrades` attributes to calculate and return cumulative GPA

## Step 7 - Complete the `GpaCalculator` JavaFX application Class
The application should:
1. Display the `Text Fields` with the relevant `Labels` 
1. Have the `calcBtn` trigger the `calculateGPA()` method

## Step 8 - Complete the `calculateGPA()` method
The method:
1. Reads in the input in the relevant `Text Fields`
1. Creates an instance of the `CourseSchedule` class
1. Populates the relevant `Text Field` with the `Cumulative GPA`

## Step 10- Push to Github
Do not forget to push your final submission to Github before the deadline.

# Grading
Grading will be assigned according to the following categories. As described in the syllabus, each category can receive a  &#10003; (satisfactory); a &#10003;+ (above and beyond); a &#10003;- (incorrect, incomplete, or sloppy); or in the worst case an &#10005;, meaning it was incorrect in several ways. A category assigned an &#10005; can carry significant grade penalties for this assignment, but usually does not receive more than 50% of the possible credit for an task.

Missing components receive a score of zero, but it is better to be missing a component (or comment it out) instead of submitting code that does not compile. Code that does not compile will not be graded, and a zero will be assigned for the project. Submitted code that contains runtime errors will be graded at the instructor's discretion.

1. **10%** Multiple commits were made throughout the project as progress was made, not just one big upload at the end.
1. **10%** The code is easy to follow and understand. Good comments, meaningful variable names, and good indentation are all present.
1. **15%** `CourseSchedule` is created as per instructions
1. **25%** `GpaCalculator` class is created with the following used; `Pane`,`Text Fields`, `Labels`, `Button`, `Stage`, and `Scene`
1. **25%** `Event Handling` is used to calculate the GPA from the inputted data
1. **10%**  The JavaFX Application's pane looks visually appealing
1. **5%** The GPA is displayed clearly in the relevant `Text Field`

