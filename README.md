

## Running Examples in Local
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one).
- Open Command Prompt and Change directory (cd) to folder containing pom.xml(enter below mvn command)
- mvn clean test -Ptest
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the right project
- Right Click ui.xml file and Run as Java TestNG to Run UI Test
- Right Click api.xml file and Run as Java TestNG to Run API Test


## Running Examples using MVN command

- mvn clean test -Papi -Dcount=6 (no of times API need to be tested) 


- mvn clean test -Pui -Dcount=3 (no of times UI need to be tested)







