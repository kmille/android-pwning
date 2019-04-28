# Using Frida for Android hooking
## Installation
virtualenv -p python3 venv
source venv/bin/activate
pip install frida-tools

wget https://github.com/frida/frida/releases/download/12.4.8/frida-server-12.4.8-android-arm.xz
unzx frida-server-12.4.8-android-arm.xz
mv frida-server-12.4.8-android-arm frida-server

adb root 
adb push frida-server /data/local/tmp/ 
adb shell "chmod 755 /data/local/tmp/frida-server"
adb shell 
    cd /data/local/tmp/
    setenforce permissive
    ./frida-server

## How to use it
frida-ps -U
frida-trace -i open  -U de.eplus.mappecc.client.android.alditalk


# Reference
https://www.frida.re/docs/android/
https://github.com/frida/frida/
