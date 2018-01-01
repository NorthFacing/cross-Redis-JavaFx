# crossRedis-JavaFx

## Run with source code

as simple as run the `Main` method in `bob.crossRedis.CrossRedis`.

## Package to image
```
mvn clean package
```
the image file in the package: `target/native`

# Commit type
* [N] new feature
* [B] bug fix
* [R] refactor

# Libraries Used

* [JFoenix](https://github.com/jfoenixadmin/JFoenix) - JavaFX Material Design Library
* [FontawesomeFX](https://bitbucket.org/Jerady/fontawesomefx)- Icon library
* [lettuce](https://github.com/lettuce-io/lettuce-core) - Redis client for Java

# Reference
* [Oracle - jigsaw](http://openjdk.java.net/projects/jigsaw/quick-start#multimodulecompile)
* [Oracle - Packaging](https://docs.oracle.com/javase/9/deploy/packaging.htm#JSDPG665)
* [Oracle - JavaFX Ant Tasks](https://docs.oracle.com/javase/9/deploy/javafx-ant-tasks.htm)
* [Mac OS 开发 － 聊聊如何打包dmg文件](http://www.jianshu.com/p/c6cd257676bf)
* [:smile: - EMOJI CHEAT SHEET](https://www.webpagefx.com/tools/emoji-cheat-sheet/)

# TO BE DONE
##  Compile & Package issue
maven-jar-plugin does not work well for the java9 module system for now, so use shell script instead.
* [JPMS/Jigsaw Missing Main Class in Module](https://stackoverflow.com/questions/47878694/jpms-jigsaw-missing-main-class-in-module)
* [Allow setting of module main class](https://issues.apache.org/jira/browse/MJAR-238)


