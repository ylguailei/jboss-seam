@echo off
@if not "%ECHO%" == ""  echo %ECHO%
@if "%OS%" == "Windows_NT"  setlocal

set DIRNAME=.\

if "%OS%" == "Windows_NT" set DIRNAME=%~dp0%
set PROGNAME=seam.bat
if "%OS%" == "Windows_NT" set PROGNAME=%~nx0%

set SEAMGENDIR="%DIRNAME%\seam-gen"

set SEAMTASK=%1%
set ARGS=%ARGS% %*

if [%1] == [] (goto usage)

if %SEAMTASK% == help (goto help)

java -cp "%JAVA_HOME%\lib\tools.jar;%DIRNAME%\build\lib\ant-launcher.jar;%DIRNAME%\build\lib\ant-nodeps.jar;%DIRNAME%\build\lib\ant.jar" -Dant.home="%DIRNAME%\lib" org.apache.tools.ant.launch.Launcher -buildfile "%SEAMGENDIR%\build.xml" %ARGS%

goto END_NO_PAUSE

:usage
more %SEAMGENDIR%\USAGE
goto END_NO_PAUSE

:help
more %SEAMGENDIR%\README
goto END_NO_PAUSE

:END_NO_PAUSE
