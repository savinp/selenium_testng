#!/bin/bash
whereis chromedriver
export projectLocation=/Testing

#/usr/bin/chromedriver

ls -lrth /usr/bin/chr*

ps -ef|grep chrome

#/usr/bin/chromedriver

#pkill -9 chromedriver

echo "here"

ps -ef|egrep chrome


#/usr/bin/chromedriver --whitelisted-ips=""

cd $projectLocation;export CLASSPATH=${projectLocation}/bin:${projectLocation}/lib/*;java org.testng.TestNG ${projectLocation}/testng.xml


echo "printing the results"

cat $projectLocation/test-output/testng-results.xml
