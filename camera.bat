@echo off
c:
cd "Program Files (x86)\Java\jdk1.8.0_74\bin"
:loop
start java code.SimpleRead
timeout /t 30
taskkill /IM java.exe
goto loop