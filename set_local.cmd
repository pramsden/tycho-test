echo off
rem setup environment for local terminal
rem needs jdk 8

set java_home=C:\Program Files\Java\jdk-18.0.1.1

set path=%java_home%\bin;%path%

java -version