# RÉDUCTIONSPRIVÉES Android SDK

## Sample Quick Start

### Download our sample app

Download ou sample app from our gitlab repository
```
git clone https://git.shop-makers.com/reductionsprivees/mobile/android-sdk-sample.git
```

### Run the sample app
Run the project by clicking on run button in Android Studio or Maj + F10

## Installation

### Install dependencies
Add the SDK to your **build.gradle**
```groovy
implementation 'com.shopmakers.reductionspriveesdk:advertisementviews:[LAST_VERSION]'
```

## Load an ad

### Listener

AdvertisementListener is an interface for handle the main actions of the views lifecycle

```kotlin
interface AdvertisementListener {
    fun adLoadingCompleted(tagID: Int)
    fun adLoadingFailedWithError(tagID: Int, error: Error?)
    fun adURLClicked(tagID: Int, uri: Uri?)
    fun adWasClosed(tagID: Int)
}
```

### Banner Ad View

Instanciate the **com.shopmakers.advertisementviews.banner.view.AdvertisementBanner** in your **activity xml**/**fragment xml** file.

You can specify the following parameters:
- tagId: will be provided by our support team
- timeout: banner load timeout delay in seconds

```xml
<com.shopmakers.advertisementviews.banner.view.AdvertisementBanner
        android:id="@+id/advertisementBanner"
        android:layout_width="0dp"
        android:layout_height="150dp"
        android:layout_marginTop="16dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/imgExample"
        app:tagId="4"
        app:timeout="5" />
```

You can add listener(AdvertisementListener) for handle events. For example:

```kotlin
findViewById<AdvertisementBanner>(R.id.webView).setAdvertisementListener(object : AdvertisementListener {
                   override fun adLoadingCompleted(tagID: Int) {
                       TODO("Not yet implemented")
                   }
                   
                   override fun adLoadingFailedWithError(tagID: Int, error: Error?) {
                       TODO("Not yet implemented")
                   }
                   
                   override fun adURLClicked(tagID: Int, uri: Uri) {
                       TODO("Not yet implemented")
                   }
                   
                   override fun adWasClosed(tagID: Int) {
                       TODO("Not yet implemented")
                   }                                                                   
})
```

**banner ad view example**
![Kotlin banner image example](/images/banner_kotlin_example.png)

### Overlay Ad View

Overlay lifecycle is managed from the activity code, after importing the view you will need to instanciate it programmatically.

**Import the view**
```java
import com.shopmakers.advertisementviews.overlay.view.AdvertisementOverlay;
```

**Call for an overlay**

Note: you can implement AdvertisementListener for class

```kotlin
AdvertisementOverlay.Companion.newInstance(this, "5", 5, listener = this)
```

**overlay ad view example**
![Kotlin overlay image example](/images/overlay_kotlin_example.png)

### Last version
Version: 0.0.6
