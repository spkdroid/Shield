# Shield
<h1 align="center" style="text-align: center; padding-bottom: 20px;">
<img src="https://github.com/spkdroid/Shield/blob/master/shield-ok-icon.png" alt="Bike Index" width="220"/>
</h1>

This document highlights the best practices that developers should implement to enforce the security of the Android application.

### Root/Developer mode

The developer must ensure that the application should not run on the Rooted Android device or device with developer mode enabled.

### SSL Pinning

The developer should pin any network calls from the application with your SSL certificate.

### Certificate Pinning

The developer should validate the hash of the developer certificate. If the certificate is not pinned, the hacker could use this to resigning from the APK.

### Code Obfuscation

Enforce proguard or any 3rd party code obfuscation techniques.

### Encrypt all the local data

All the local and confidential data saved on the device needs to be encrypted by your application.
