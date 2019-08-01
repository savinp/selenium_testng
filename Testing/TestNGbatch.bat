set projectLocation=D:\Users\Savin\Documents\workspace-sts-3.9.6.RELEASE\FinalTest
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause