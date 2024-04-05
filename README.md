1.Purpose 
The people who will be using the History application are learners, students, teachers and History lovers, essentially any app that a user would engage with pertaining to history would, in a very simple and exciting way, be able to grant very wide and varied information about history, events, and timelines. It is, therefore, a very valuable learning tool since people can check through the periods, civilizations, and related topics of interest on human past that it offers. History apps belong to the mobile phone application domain and collect interactive features with multimedia resources to offer curate content. History apps offer services to groups of users from all over the world, such as students, educators, history lovers and each curious person who is interested in further investigating the history of mankind. The background and age groups, when complemented with formal education, quench personal curiosity, or simply enjoy the wealth that history apps bring in human experience, stand to gain from the knowledge and wisdom that are abundantly available in store for history apps. 


2.Design Considerations 
 
Figure 1 screenshot of Application interface
Intuitive design. 
My application is user friendly as it shows the heading of the application and what’s about. It has a clear navigation. Consistent design, Consistency should be very key in design elements such as colors, fonts, layout, among others, within the application. Consistency develops a solid user experience. Users will find the interface familiar and comfortable to use. Visual cues, Guide the user through the content with visual cues such as headings, subheadings, and use graphics or images where necessary. This includes clear and succinct headings and subheadings that allow the user to scan for and find specific information regarding the application


Content prioritization. 
I made sure that all the elements that are required have been included in my application. 


Legible text content. 
I’ve made my font-size large because some users have eye problems which it will be easier for them to navigate and find where to input the age, 6they which to research about. As you can see with the” EditText” that correspond with “AGE” is large for any user to see. The background color is lighter so that the text is be visible to see for every user. The ‘’AGE” font size is 34 which is reasonable for users to see it.
Make interface elements clearly visible. 
My interface has white space which means my variables are not crowded. 
Hand position controls 
Positioning for thumbs: The main placement of controls must be done in such a way that they remain easily reachable by the thumb. If anything, buttons and other interactive elements must be closer to the bottom of the screen, where the thumb can comfortably reach without much strain. 
Image







Emotional impact the latter part has the implication of how users could be emotional from the placement of images in the context of a history site with a human face. They can touch the human element, causing users to empathize with the people and events in history. Better learning, Research suggests that a visual may aid in learning and retention. By adding relevant images to the text, a user is better able to remember the main points presented and therefore better understands the historical content being viewed. Storytelling, Images can describe stories dramatically and much clearer. They can illustrate the narration, breathe life into the characters that have been historical, and point to moments that are crucial.
3.GitHub and GitHub actions 
This is the link to my History app https://github.com/ST10448181/MYHISTORYAPP1  
1. Create a New GitHub Repository:
Go to the GitHub website (https://github.com/) and sign in to your account.
Click on the “+” icon in the top right corner and select “New repository”
Give your repository a name add a description and choose public.
Click on the "Create repository" button.
2. Initialise the Repository with a README File:
After creating the repository, you'll see an option to "Initialize this repository with a README". Check this option to create a README file.
Click on the "Create repository" button to finalize the creation of the repository.
3. Commit and Push Your Project Files to the GitHub Repository:
In Android Studio, go to VCS (Version Control System) -> Import into Version Control -> Share Project on GitHub.
Log in to your GitHub account if prompted, and select the repository you created earlier.
Click on the "Share" button to push your project files to the GitHub repository.
4. Regularly Commit and Push Your Code as You Make Progress:
After the initial push, continue making changes to your project in Android Studio.
Whenever you make significant progress or changes, commit your changes locally in Android Studio using VCS -> Commit Changes.
Once committed, push your changes to the GitHub repository using VCS -> Git -> Push.

Testing and Automated Testing:
1. Conduct Manual Testing:
Manually test your app to ensure it functions seamlessly and offers an enjoyable educational experience for learners.
To test various features and user interactions do the following:
1. Create a New Test Class:
In your Android project, navigate to the tests directory (or create it if it doesn't exist).
Create a new Kotlin file for your test class. Name it appropriately to indicate what component or functionality you are testing.
2. Write Test Methods:

Inside the test class, write test methods like the example below.
3. Use assertions to verify the expected behaviour of your code.
4. Run the Tests:
Run the tests using the testing framework's tools provided by Android Studio or through the command line.
Sample of a test class using JUnit:

import org.junit.Assert.*
import org.junit.Test

class MyUnitTest {

    @Test
    fun testWhenStatement() {
        // Test case for a when statement
        val result = when (60) {
  60 -> "Diego Armando Maradona was an Argentine professional football player and manager. Widely regarded as one of the greatest players in the history of the sport, he was one of the two joint winners of the FIFA Player of the 20th Century award."
  95 ->  "Nelson Rolihlahla Mandela was a South African anti-apartheid activist, politician, and statesman who served as the first president of South Africa from 1994 to 1999. He was the country's first black head of state and the first elected in a fully representative democratic election."
   47 -> "Aaron Arthur Ferguson, professionally known as Shona Ferguson, was a Motswana actor based in South Africa, executive producer and co-founder of Ferguson Films."

  else -> "No one has Died at this specific age please try a different age"

        }
        
        assertEquals(“Diego Armando Maradona was an Argentine professional football player and manager. Widely regarded as one of the greatest players in the history of the sport, he was one of the two joint winners of the FIFA Player of the 20th Century award.:”,result)


      }

    }
2. GitHub Actions for Automated Testing:
Set up GitHub Actions to automatically run tests and build your code whenever changes are pushed to the repository.
Create a GitHub Actions workflow (.github/workflows/tests.yml) to run tests automatically on every push:
Create a .github/workflows directory in your project repository.
Inside this directory, create YAML files defining your GitHub Actions workflows for testing and building.
Sample GitHub Actions Workflow for Testing (tests.yml):
name: Run Tests

on: [push]

jobs:
  test:
    runs-on: ubuntu-latest

    steps:
      - name: Set up JDK
        uses: actions/setup-java@v2
        with:
          distribution: 'adopt'
          java-version: '11'

      - name: Check out code
        uses: actions/checkout@v2

      - name: Build and test
        run: ./gradlew test

Set Up Automated Build:
Create a GitHub Actions workflow (.github/workflows/build.yml) to build the APK automatically on every push.
Sample GitHub Actions Workflow for Building (build.yml):
name: Build APK

on: [push]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Set up JDK
        uses: actions/setup-java@v2
        with:
          distribution: 'adopt'
          java-version: '11'

      - name: Check out code
        uses: actions/checkout@v2

      - name: Build APK
        run: ./gradlew assembleDebug
Test your workflows by pushing changes to your repository and observing the actions running in the "Actions" tab on GitHub.

 4.Link to YouTube video 

https://youtu.be/co-AsCDy9SU?si=SHzEPZhVE9vS0U
