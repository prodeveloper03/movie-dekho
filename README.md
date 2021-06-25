# movie-dekho

For the code move to the master->> branch
---------------------------------------------------
                                               ABOUT THE APP
---------------------------------------------------             
MovieDekho🎬is an movie flex application which showace the movie in order of popularity on basis of 
the movie ratings⭐️

----------------------------------------------------
                                              APP SCREENSHOTS
----------------------------------------------------                   
<img width="424" alt="Screenshot 2021-06-25 at 12 59 40 PM" src="https://user-images.githubusercontent.com/62813305/123387933-ebfdae80-d5b5-11eb-855e-8f9c0e7a3704.png"> <img width="434" alt="Screenshot 2021-06-25 at 12 59 53 PM" src="https://user-images.githubusercontent.com/62813305/123387942-edc77200-d5b5-11eb-814c-3631d8b2d643.png">

<img width="426" alt="Screenshot 2021-06-25 at 1 00 21 PM" src="https://user-images.githubusercontent.com/62813305/123387944-eef89f00-d5b5-11eb-95e4-10dc503d8a05.png">

----------------------------------------------------
                                             FEATURES
----------------------------------------------------     


- Popular movies are showcased on top based on their ratings
- Clicking on any movie cell should launch a details screen, the screen should just show the movie poster in full screen
- The user can be able to delete any cell (either add a delete button on the cell or use swipe to delete action).
- The images fetched from the url must be cached locally so the movies load faster the next time the app is run.
-  For unpopular movies, a poster image, the movie title, and overview is listed. 



----------------------------------------------------
                                            TECH STACK
----------------------------------------------------   
-Kotlin
-MVVM Architecture (Model -View - ViewModel)
-LiveData - notify domain layer data to views.
-Lifecycle - dispose observing data when lifecycle state changes.
-ViewModel - UI related data holder, lifecycle aware.
-Retrofit2 & Gson - constructing the REST API
-OkHttp - implementing interceptor, logging and mocking web server
-RecyclerView - implementing adapters and viewHolders
-RxJava2 - For a seamless user experience
-Glide - loading images
-DataBinding


----------------------------------------------------
                                              DEPENDENCIES
----------------------------------------------------     


viewModel and LiveData


    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'

Recyclerview



    implementation 'androidx.recyclerview:recyclerview:1.1.0'
    implementation 'androidx.cardview:cardview:1.0.0'


Retrofit


    implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"
    implementation "com.squareup.retrofit2:converter-gson:$retrofitVersion"
    implementation "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"

Rx



    implementation "io.reactivex.rxjava2:rxjava:$rxJavaVersion"
    implementation "io.reactivex.rxjava2:rxandroid:$rxJavaVersion"


Glide



    implementation 'com.github.bumptech.glide:glide:4.8.0'


Gson



    implementation 'com.google.code.gson:gson:2.8.6'


Pading


    implementation 'androidx.paging:paging-runtime:2.1.2'
    implementation 'androidx.navigation:navigation-fragment-ktx:2.3.0'
    implementation 'androidx.navigation:navigation-ui-ktx:2.3.0'

Navigation



    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"               
