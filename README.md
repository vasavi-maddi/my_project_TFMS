# Project_TFMS
**P0 project**<br>
I am working on Batch usecase which consists of 2 foreign keys<br>
1)I have created ER diagram<br>
2)I have created Batch Table using DDL in sql workbench.<br>
I have cretaed one more table for User for Authentication<br>
3)In eclipse I created Maven project<br>
In pom.xml file i have added apache.maven puglin<br>
I have created POJO classes for both Batch and User<br>
In dao layer I created inferface which consistes of abstract methods<br>
-----getBatch<br>
-----addBatchDetails<br>
-----showBatchDetais<br>
-----deleteBatchDetails<br>
-----updateBatchDetails<br>
  All these methods are implemented in dao.impl layer<br>
In service layer there is an interface for user authentication
  and this is implemeented in service.impl<br>
I have also written menu driven application<br>
4)While implementing, to establish connection I used JDBC<br>
I have added mysql-connector-j dependency in my pom.xml file
and added database.propeties file<br>
I have established connection using singleton connection<br> 
5)For logging purpose I have added log4j dependency in pom.xml<br>
6)For testcases I have added junit dependency in pom.xml<br>
I have created testcases for<br>
----establishing connection<br>
----authentication user<br>
----addBatchDetails<br>
----ShowBatchDetails<br>
for all these 4 methods i have written testcases<br>
This is all about my project and the technologies used in my project<br>

<br>
<br>

**P1 project**<br>
I have Created JSp files and Servlets<br>
I have written 4 servlets<br>
----AddBatch which is executed when addBatch.jsp is submitted<br>
----UpdateBatch which is executed when editBatch.jsp is submitted<br>
----DeleteBatch which is executed when deleteBatch.jsp is submitted<br>
----ShowBatche which is executed and transfers the control to showBatches2.jsp when  showBathces.jsp is submitted<br>
