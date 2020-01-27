# GPAMS
Create an interactive menu driven GPAMS (Grade Point Average Management) system.

## Project Requirements
This project must be done under following environments:
* Programming language: Java ONLY

## Detail Description of the Project
### Initial Menu
When a GPAMS starts, it shows the following menu:
* (* GUI project should have your own creative user interface. Creative interface does not limit but it must consider easiness to use.)
command line sample of GPAMS menu (not GUI version)
![image](https://user-images.githubusercontent.com/48393773/73149971-8425fa00-4089-11ea-9299-0fedc4fea0bb.png)

## Overall Menu operation:
Each menu should provide convenient or acceptable movement from one menu selection to other menu selection.

## Menu 1
When number one from the menu is chosen, create a roster of a course such as:
number of student per sections, number of homework, number of exams, number of project, etc.
### sample of manual input of menu 1
![image](https://user-images.githubusercontent.com/48393773/73150033-cfd8a380-4089-11ea-9873-6dba6c9539e8.png)
Create a proper data structure.

### sample of default input of menu 1
![image](https://user-images.githubusercontent.com/48393773/73150058-f3035300-4089-11ea-99df-ca23cc979643.png)
Create a data structure from a data file (above manual example shows default values).

## Menu 2
When number one from the menu is chosen, it prompts the user to enter the data file:

### example of menu 2
Enter data file:
The GPAMS (GPA Management System) reads the following data from a given data file:

![image](https://user-images.githubusercontent.com/48393773/73150113-3958b200-408a-11ea-8e5a-221d3746baff.png)
![image](https://user-images.githubusercontent.com/48393773/73150122-47a6ce00-408a-11ea-9580-434af784a0fa.png)

Next, read the data from the file and make a list.
### Use an array implementation.
Menu 1 and 2 can be selected multiple times. Different class records can be appended separately. If default data is already built in, the next data file name should be different than default file name. Append the new data entries after the end of current list.

After manual data input, go back to main menu (or different in GUI implementation)

## Menu 3
sample of menu 3
![image](https://user-images.githubusercontent.com/48393773/73150165-89d00f80-408a-11ea-8b17-b2483a154c3a.png)

* If menu 3.1 is chosen, it shows the full data of people who have first name as the keyword. If there are more than one same first name, the result shows all of them, but they are sorted by the last name. If there are multiple same first and last names, then the result is sorted by Site number.
* Menu 3.2 follows the same rule as menu 3.1 but last name is the keyword to search.
* Menu 3.3 searches by student ID.
* Menu 3.4 creates a linked list and it needs two parameters and they are the position number with the forward or backward direction (+ or -).

* How to search from which class?  You can design your own way.
* If Peter and Peterson exist in a class, should search the shortest matching name. Thus if you search “Peter”, Peterson is not returned.
NOTE: GUI implementation project can have different manners to traveling. The below example shows command line implementation case.
![image](https://user-images.githubusercontent.com/48393773/73150222-dfa4b780-408a-11ea-8ab7-e100c4952aa7.png)
![image](https://user-images.githubusercontent.com/48393773/73150227-e9c6b600-408a-11ea-8697-f6cea7be1242.png)

If the reference reaches the end node or the head node before moving forwards or backwards to the designated position, output shows an error message like “Sorry, it’s beyond the scope.” and shows list up to the end (NULL for the last node, listData for the first node). You can have your own error message(s).
![image](https://user-images.githubusercontent.com/48393773/73150251-08c54800-408b-11ea-9666-f4eafa4725ae.png)
![image](https://user-images.githubusercontent.com/48393773/73150259-12e74680-408b-11ea-8c29-ecb7f8199529.png)
Menu 3.5 returns to the main menu.

## Menu 4
![image](https://user-images.githubusercontent.com/48393773/73150280-2eeae800-408b-11ea-8dcf-2c58adf70d71.png)
![image](https://user-images.githubusercontent.com/48393773/73150286-36aa8c80-408b-11ea-856d-1ef7aba8dbf0.png)

#### Menu 4.0 is a special case.
Menu 4.0 can be selected once. If weight factors of item enter once, all sub-menus of Menu 4 applies the same rule until menu 4.0 modifies new weights.
If total of weight (percentage) of inputs is not equal to 100%, then the system asks any extra item such as quiz or participation, or brings an exception case, etc. 
#### Here is an example:
![image](https://user-images.githubusercontent.com/48393773/73150321-76717400-408b-11ea-8e84-ca89ea515e3b.png)
* Menu 4.2, 4.3, and 4.4 are sorted in descending order by TS, HA (Homework Average), and Project scores, which mean that the highest score shows first. If there are multiple tie scores by the key, then the result will be sorted by ascending order of Site and last name.
* Menu 4.2 shows per class:
Last name, first name, Site, TS
* Menu 4.3 shows per class:
Last name, first name, Site, HA
* Menu 4.4 shows per class:
Last name, first name, Site, Project
* Menu 4.5 shows list per grade and per course if there are more than one course data.

## Menu 5
![image](https://user-images.githubusercontent.com/48393773/73150546-74f47b80-408c-11ea-8352-b2c38b65e919.png)
* Menu 5.1 adds a new student record to the list by manual user interaction.
* Menu 5 prompts the input for the following order:  HW1 .. HWn accepts homework scores.
![image](https://user-images.githubusercontent.com/48393773/73150563-8b023c00-408c-11ea-8d09-dd3b606deb7b.png)

##### The system interaction interface can be user defined. You can build your own nice interface to user.After inserting a student record, verifies the new record into the screen and returns to the main menu.
* Menu 5.2 deletes a person from the list. Finding a person by different keys is what you can define such as name, SID, or others.
* Menu 5.3 changes score(s) of a record(s).  It’s also a free design part.

## Menu 6
Exit the project.

## Default log
##### Record all interactions on the screen as a log file: log.txt
##### After exiting the program by choosing menu 7, a log file will be created and the log file should be readable by normal ASCII editor (e.g. notepad in MS Windows).
The format and information of the logs are your own free design. The logs are used for maintenance purpose.

