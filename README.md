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
```
implementation 'com.shopmakers.reductionspriveesdk:advertisementviews:[LAST_VERSION]'
```

## Load an ad

### Banner Ad View

Instanciate the **com.shopmakers.advertisementviews.banner.view.AdvertisementBanner** in your **activity xml** file.

You can specify the following parameters:
- tagId: will be provided by our support team
- timeout: banner load timeout delay in seconds

```
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

**banner ad view example**
![Kotlin banner image example](/images/banner_kotlin_example.png)

### Overlay Ad View

Overlay lifecycle is managed from the activity code, after importing the view you will need to instanciate it programmatically.

**Import the view**
```
import com.shopmakers.advertisementviews.overlay.view.AdvertisementOverlay;
```

**Call for an overlay**

```
AdvertisementOverlay.Companion.newInstance(this, "5", 5)
```

**overlay ad view example**
![Kotlin overlay image example](/images/overlay_kotlin_example.png)

### Ad view handlers

The following handlers will be available in the next version of the sdk:
- ad loading completed
- ad loading failed
- ad clicked
- ad closed
