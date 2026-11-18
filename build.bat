@echo off
echo ===================================
echo   Building CrackMe APK Debug
echo ===================================

if defined JAVA_HOME (
    echo Using JAVA_HOME: %JAVA_HOME%
) else (
    if exist "C:\Users\Admin\.gradle\jdks\eclipse_adoptium-21-amd64-windows.2" (
        set "JAVA_HOME=C:\Users\Admin\.gradle\jdks\eclipse_adoptium-21-amd64-windows.2"
    )
)

call gradlew.bat assembleDebug

if %ERRORLEVEL% EQU 0 (
    echo.
    echo ===================================
    echo BUILD SUCCESSFUL!
    echo APK Output: app\build\outputs\apk\debug\app-debug.apk
    echo ===================================
) else (
    echo.
    echo BUILD FAILED!
)
