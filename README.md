# w1d2Homework
•	What is Android?
o	Android is a mobile operating system developed by Google, based on the Linux kernel and designed primarily for touchscreen mobile devices such as smartphones and tablets. 
•	How do you track memory leaks?
o	When you're monitoring memory usage in Android Studio you can, at the same time, initiate garbage collection and dump the Java heap to a heap snapshot in an Android-specific HPROF binary format file. The HPROF viewer displays classes, instances of each class, and a reference tree to help you track memory usage and find memory leaks.
•	What are the ways you use to debug a program?
o	Android Studio provides a number of improvements to assist you in debugging and improving the performance of your code, including an improved virtual device management, inline debugging, and performance analysis tools.
o	The Android logging system provides a mechanism for collecting and viewing system debug output. logcat Monitor displays messages that you added to your app by using the Log class.
o	Android Studio includes a debugging tool called the Dalvik Debug Monitor Server (DDMS), which provides port-forwarding services, screen capture on the device, thread and heap information on the device, logcat, process, and radio state information, incoming call and SMS spoofing, location data spoofing, and more. This page provides a modest discussion of DDMS features; it is not an exhaustive exploration of all the features and capabilities.
•	What is Android's architecture?
o	Linux Kernel
o	Android’s native libraries. It is this layer that enables the device to handle different types of data.
o	Android Runtime consists of a Dalvik Virtual machine (replaced by ART) and Core Java libraries.
o	Application Framework are the blocks that our applications directly interacts with. (Acitvity manager, view system, content providers, etc.)
Applications are the top layer in the Android architecture. Several standard applications comes pre-installed with every device, such as: 

•	SMS client app
•	Dialer
•	Web browser
•	Contact manager

•	What is the difference between Dalvik and ART?
o	Dalvik: It is a type of JVM used in android devices to run apps and is optimized for low processing power and low memory environments.
o	ART: Google has introduced a new virtual machine known as ART (Android Runtime) in their newer releases of Android. In Lollipop, the Dalvik Virtual Machine is completely replaced by ART. ART has many advantages over Dalvik VM such as AOT (Ahead Of Time) compilation and improved garbage collection which boost the performance of apps significantly.
•	What are 9-patch images?
o	A NinePatchDrawable graphic is a stretchable bitmap image, which Android will automatically resize to accommodate the contents of the View in which you have placed it as the background. An example use of a NinePatch is the backgrounds used by standard Android buttons — buttons must stretch to accommodate strings of various lengths. A NinePatch drawable is a standard PNG image that includes an extra 1-pixel-wide border. It must be saved with the extension .9.png, and saved into the res/drawable/ directory of your project.
•	How do you support phones and tablets?
o	Build your activity designs based on fragments that you can reuse in different combinations—in multi-pane layouts on tablets and single-pane layouts on handsets.
o	Use the action bar, but follow best practices and ensure your design is flexible enough for the system to adjust the action bar layout based on the screen size.
o	Implement flexible layouts, as discussed in the Best Practices for supporting multiple screens and the blog post, Thinking Like a Web Designer.
•	How do you support multiple languages?
o	It’s always a good practice to extract UI strings from your app code and keep them in an external file. Android makes this easy with a resources directory in each Android project.
o	To add support for more languages, create additional values directories inside res/ that include a hyphen and the ISO language code at the end of the directory name. For example, values-es/ is the directory containing simple resources for the Locales with the language code "es". 
o	At runtime, the Android system uses the appropriate set of string resources based on the locale currently set for the user's device.


What is the assets folder for?
Assets provide a way to include arbitrary files like text, xml, fonts, music, and video in your application. 
If you try to include these files as "resources", Android will process them into its resource system and you will not be able to get the raw data. 
If you want to access data untouched, Assets are one way to do it.
Assets added to your project will show up just like a file system that can read from by your application using Asset Manager.
Android has a dedicated folder in its project organization that stores all these files.
