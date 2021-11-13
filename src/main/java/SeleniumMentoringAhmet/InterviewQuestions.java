package SeleniumMentoringAhmet;

public class InterviewQuestions {

/*//    2) What types of testing can you automate with selenium?*/
/*    *Smoke Test
*     *Regression Test
*     * Functional Test (positive-negative UI)
*
*     3) What are the test types we do not automate with selenium?
*      *Performance Testing
*      * Manual testing (ad hoc - monkey testing)
*       * load testing
*      *Stress testing
*
*     4) What is locator and what are the locator keys? ********
*
*        Locator is a way of finding the web element in the Dom,Locator types are:
*        *Xpath
*        *ID
*        *Tagname
*        *Classname
*        *LinkText
*        * PartialLInlText
*        *CSS
*        * Name
*
*    5) How do you handle dynamic elements?
*
*   * IN my course i faced many dynamic elements and i used different ways to handle with
*
*   * I used parent-child-siblings(XPATH) to locate the elements *******
*   * I went with different Attribute to locate the elements *******
*
*   6) Difference Between close () and quit ()
* Close: it specifically closes the window that you are currently working on
* Quit: it specifically closes the whole browser. It means it closes all of the windows
*
*  7) Difference Between navigate to() and get()
*     Navigate to: it doesnt wait web elements(page) to be loaded
*           *It has some methods (forward, back, refresh)
*     get to: it waits the web elements (page) to be loaded
*           *it doesnt have methods
*
*  8) What is Xpath?
*      *Xpath is used to find the location of the elements on a webPage using HTML structure
*      *There are 2 types of Xpath:
*       -Absolute XPATH: it goes from parent to child
*       -Relative XPATH: goes directly to the element location.
*
*  9)Whats is the difference between Absolute and Relative Xpath?
*            -Absolute XPATH: it goes from parent to child
*            -Absolute XPATH: it has / (single slash) before XPATH structure
*
*            -Relative XPATH: goes directly to the element location.
*             Relative XPATH: it has // (double slash) before XPATH structure
*
* 10) How to handle static drop down menus?
*   I would definitely check the tag of the location
*   *If the tag is select --> i use select CLASS. Select select = new Select(webelement)
*   *If the tag is not select --> i use locators to locate the elements
*   * I can also use ACTION CLASS to handle the drop downs. **** (moveToElement)
*
* 11) What are the methods of select?    Practice with cars.com web page
*   Select class is really usefull to locate the elements
*   *I can locate the elements with:
*     -SelectByVisiableText
*     -SelectByIndex
*     -SelectByValue
*
* 12) What kind of exceptions did you face in Selenium?
*    *NoSuchElementExceptions   ***
*    *StaleElementReference Exceptions   ***
*    *NoSuchWindow Exceptions
*    *NoSuchFrameException
*
* 13) In what condition do you get StaleElementReference Exception?
*   *Once the element is not there anymore
*   *Navigate to another page
*
* I can handle with (refreshing the website or reinitializing the driver)
*
*
*
*
*
*
*
* */

}
