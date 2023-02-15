# Project_TFMS
###I am working on Batch usecase which consists of 2 foreign keys<br>
<sup>1)I have created ER diagram</sup><br>
<sup>2)I have created Batch Table using DDL in sql workbench.</sup><br>
<sub>I have cretaed one more table for User for Authentication</sub><br>
<sup>3)In eclipse I created Maven project</sup><br>
<sub>In pom.xml file i have added apache.maven puglin<br>
I have created POJO classes for both Batch and User<br>
In dao layer I created inferface which consistes of abstract methods<br>
<sub>-----getBatch<br>
-----addBatchDetails<br>
-----showBatchDetais<br>
-----deleteBatchDetails<br>
-----updateBatchDetails</sub><br>
All these methods are implemented in dao.impl layer
In service layer there is an interface for user authentication
and this is implemeented in service.impl
I have also written menu driven application</sub>
<sup>4)While implementing, to establish connection I used JDBC
I have added mysql-connector-j dependency in my pom.xml file
and added database.propeties file</sup>
<sub>I have established connection using singleton connection</sub> 
<sup>5)For logging purpose I have added log4j dependency in pom.xml</sup
6)For testcases I have added junit dependency in pom.xml
I have created testcases for
----establishing connection
----authentication user
----addBatchDetails
----ShowBatchDetails
for all these 4 methods i have written testcases

This is all about my project and the technologies used in my project
