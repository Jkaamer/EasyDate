# EasyDate
Maven plugin <br>
EasyDate contains methods for return date ,time or both them. <br>

## Usage
___

##### Easy way to install dependency

- Copy EasyDate-1.1 in C (Windows)<br>
- Open the Command Prompt and copy the below statement<br>
 ```
 mvn install:install-file -Dfile=C:\EasyDate-1.1.jar -DgroupId=org.jkaamer -DartifactId=EasyDate -Dpackaging=jar -Dversion=1.1
 ```
- Copy the below statements in pom.xml file
```
	<dependencies>
        <dependency>
            <groupId>org.jkaamer</groupId>
            <artifactId>EasyDate</artifactId>
            <version>1.1</version>
        </dependency>
    </dependencies>
```

<br>

Once done ,you just use EasyDate like these:
```
import com.jkaamer.easydate.EasyDate;

public class Main {
    public static void main(String[] args) {
    
      String date = EasyDate.getDate();
      // For example:Thu ,December 01
    
      String time = EasyDate.getTime();
      // For example:05:45 PM
        
      String dateTime = EasyDate.getDateTime();
      // For example:Thu ,Dec 01 2022 - 05:48:07-AM PST   
    }
}
```


## Copyright
Copyright (c) 2022 Jkaamer. All rights reserved. <br>
Author: <b>Mahdi Hosein Zade</b> 