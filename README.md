# IDUang
A simple currency converter Android libs. It's very difficult when you don't know how to convert your money value into currency format.
So this is a simple libs for making your jobs more efficient. But in this version still for Indonesian format.
<br><br>*Sebuah library Android sederhana untuk konversi mata uang. Sangat sulit ketika kamu tidak tahu bagaimana caranya mengkonversi nilai
uangmu kedalam format mata uang. Inilah sebuah library sederhana untuk membuat pekerjaanmu lebih efisien. Tetapi dalam versi ini hanya
untuk format mata uang Indonesia.*

## Support 
Support from Android 4.0 Ice Cream Sandwich / Minimum API 14
<br>*Dukungan mulai Android versi 4.0 Ice Cream Sandwich / Minimal API 14*

## Installing 
Add repository in build.gradle
<br>*Tambahkan repository di build.gradle*
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
And add dependencies
<br>*Dan tambahkan dependencies*
```gradle
dependencies {
    implementation 'com.github.pahlevikun:iduang:0.0.1'
}
```

## Sample Code 
For result = Rp. 12.000
<br>*Untuk hasil = Rp. 12000*
```java
String hasil = IDUang.parsingRupiah(12000);
```
For result = IDR 12K
<br>*Untuk hasil = IDR 12K*
```java
String hasil = IDUang.parsingIDR(12000);
```
