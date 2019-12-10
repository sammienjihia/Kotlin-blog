Domain models are the classes that are mapped to the corresponding tables in the database 

We frequently create classes whose main purpose is to hold data. In such a class some standard functionality and utility functions are often mechanically derivable from the data. In Kotlin, this is called a data class and is marked as data:


A repository is an interface that is used to access data from a database. If your interface extends the 
JpaRepository interface, then all the CRUD methods on your model class entity shall be readily available

##Differences in CLI commands between Debian and Alpine linux distributions

Update package database

DEBIAN: apt-get update
ALPINE: apk update

Install packages

DEBIAN: apt-get install package1 package2
ALPINE: apk add package1 package2

Remove packages

DEBIAN: apt-get remove package1 package2
ALPINE: apk del package1 package2

Download packages

DEBIAN: apt-get install --download-only package1 package2
ALPINE: apk fetch package1 package2

Clean up downloaded packages

DEBIAN: apt-get clean
ALPINE: Alpine cleans up packages automatically.