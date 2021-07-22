# Shield
<h1 align="center" style="text-align: center; padding-bottom: 20px;">
<img src="https://github.com/spkdroid/Shield/blob/master/shield-ok-icon.png" alt="Bike Index" width="220"/>
</h1>

This document highlights the best practices that should be implemented to enforce the security of the Android application.

### Root/Developer mode

Please ensure your application does not run on the rooted Android device or if the developer option has been enabled on the Android device. The release apk should not run on the Emulator.

### SSL Pinning

Any network calls from your application should be pinned with your SSL certificate.

### Certificate Pinning

The hash of the developer certificate should be validated, this could be used to resigning of the APK

### Code Obfuscation

Enforce proguard or any 3rd party code obfucation techniques.

### Encrypt all the local data 

All the local and confidential data saved on the device needs to be encrypeted by your application.

