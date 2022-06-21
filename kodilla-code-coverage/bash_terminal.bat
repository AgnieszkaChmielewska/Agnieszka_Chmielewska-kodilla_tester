d:
cd java/kodilla-course/build/libs/
if exist *.jar del *.jar
if not exist *.jar cd ../..
call gradlew build
cd build/libs/
if NOT EXIST D:\java\kodilla-course\build\libs\*.jar echo Faild
if EXIST D:\java\kodilla-course\build\libs\*.jar mkdir projekt 
copy *.jar projekt)