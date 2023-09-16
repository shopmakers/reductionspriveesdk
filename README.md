# RÉDUCTIONSPRIVÉES Android SDK

## Sample Quick Start

### Download our sample app

Download ou sample app from our gitlab repository

```
git clone https://github.com/shopmakers/reductionspriveesdk-sample.git
```

### Run the sample app

Run the project by clicking on run button in Android Studio or Maj + F10

## Installation

### Install dependencies

### Step 1: Generate a Personal Access Token for GitHub

- Inside you GitHub account:
    - Settings -> Developer Settings -> Personal Access Tokens -> Generate new token
    - Make sure you select the following scopes ("read:packages") and Generate a token
    - After Generating make sure to copy your new personal access token. You won’t be able to see it
      again!

### Step 2: Store your GitHub - Personal Access Token details

- Create a **github.properties** file within your root Android project
- In case of a public repository make sure you add this file to .gitignore for keep the token
  private
    - Add properties **gpr.user**=*GITHUB_USERID* and **gpr.key**=*PERSONAL_ACCESS_TOKEN*
    - Replace GITHUB_USERID with personal / organisation Github User ID and PERSONAL_ACCESS_TOKEN
      with the token generated in **#Step 1**

### Step 3 : Update build.gradle inside the application module

- Add the following code to **build.gradle** inside the application module that will be using the
  library published on GitHub Packages Repository

```gradle
def githubProperties = new Properties()
githubProperties.load(new FileInputStream(rootProject.file("github.properties")))  
```

```gradle
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/shopmakers/reductionspriveesdk")

            credentials {
                username = githubProperties['gpr.user'] 
                password = githubProperties['gpr.key'] 
            }
        }
    }
```

- inside dependencies of the build.gradle of app module, use the following code

```gradle
dependencies {
    implementation 'com.shopmakers.reductionspriveesdk:advertisementviews:<version>'
	...
}
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

Instanciate the **com.shopmakers.advertisementviews.banner.view.AdvertisementBanner** in your *
*activity xml**/**fragment xml** file.

You can specify the following parameters:

- tagId: will be provided by our support team
- timeout: banner load timeout delay in seconds

```xml

<com.shopmakers.advertisementviews.banner.view.AdvertisementBanner
    android:id="@+id/advertisementBanner" android:layout_width="0dp" android:layout_height="150dp"
    android:layout_marginTop="16dp" app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toBottomOf="@id/imgExample" app:tagId="4" app:timeout="5" />
```

You can add listener(AdvertisementListener) for handle events. For example:

```kotlin
findViewById<AdvertisementBanner>(R.id.webView).setAdvertisementListener(object :
    AdvertisementListener {
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

Overlay lifecycle is managed from the activity code, after importing the view you will need to
instanciate it programmatically.

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
