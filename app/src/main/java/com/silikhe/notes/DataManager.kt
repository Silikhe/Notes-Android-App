package com.silikhe.notes

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents", "Android Programming with intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamental: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamental : The core platform")
        courses.set(course.courseId, course)
    }
}