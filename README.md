# ZLINE BUS TICKETING SERVICE :- ONLINE RESERVATION


###### PROBLEM STATEMENT <h6> 
Should develop a WebBased UI where you can do online reservations. (Any technology is fine). You have set of buses assume that its 20 buses each are having running one route to another route and date of travel.
User will login, select the bus starting point and destination point ( we don’t have intermediate stops).
Once he selects above, you will show the available seats and user select the seat.
It will show selected if no one has selected.
More than one user cannot select same seat.
  
  
##### Steps to run the code <H6>
  - Downlaod the repository.
  - Open Eclipes -> import existing Maven project and head to the diretory containing pom.xml
  - Change application.properties MySQL properties.
  - Open MySQL server and create database onlineReservationDB.
  - Now the application is ready to be used.
  

##### Steps to execute the code <H6>
  - Run as Spring Starter Project.
  - Redirect to browser and in url we need to type localhost:8080/



###### There are couples of validation, we need to provide in the above assignment <h6> 
- No user can select the same seat.
- All the bus should be make seats avaialble as per the dates.

  
##### Built information <h6>
- Spingboot , Rest services and hibernate was userd.
- Java Version Used:-JDK 1,JRE 11
- Database used: MySQL Server 8.0

  
##### MySQL table information <h6>
 1. USER TABLE 
 2. BUS TABLE
 3. BOOKING TABLE
  
##### Schema Used <h6>
  1. (USER table and BUS table)many to many -> one user can select multiple bus.
  
  2.(USER table and BOOKING table) many to many -> one user 
               
  
  
