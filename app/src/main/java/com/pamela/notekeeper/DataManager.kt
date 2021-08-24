package com.pamela.notekeeper

class DataManager {

    val courses= HashMap<String,CourseInfo>()
    /*
    hashMap is a generic Type
    They allow us to specify the type we want to use within the type
    hashMap accepts two type parameters
    Well be looking up courses using their courses using their courseId
    The second type is the type that will be stored
     */
    val notes= ArrayList<NoteInfo>()
/*
this variable will be used to hold our collection of notes
arrayList provides index based access to its members
 */
    init {
        initializeCourses()
    /*
    the code within the initialize courses will automatically run whenever
    whenever an instance of our Datamanager is created
    initializer blocks accept no parameters
    they run automatically upon instance creation
    but they can access the parameters of our primary constructor as wll as properties
     */

    }
    private fun initializeCourses(){
    var course =CourseInfo("android_intents","Android Programming with intents")
    courses.set(course.courseId, course)

    course=CourseInfo("android_async","Android Async Programming and Services")
    courses.set(course.courseId, course)

    course=CourseInfo("java_lang","Java Fundamentals: The Java Language")
    courses.set(course.courseId, course)

    course= CourseInfo("java_core","Java Fundamentals: The Java Platform")
    /*
    We'll be using the hashmap set method
    the first parameter is the value well use to look up the course , the courses courseid
     */
    }
}
