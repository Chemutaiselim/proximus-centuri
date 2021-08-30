package com.pamela.notekeeper

class CourseInfo(val courseId: String, val title: String) {
    /**
     * Returns a string representation of the object.
     */
    override fun toString(): String {
        return title
    }
}

class NoteInfo(var course:CourseInfo,var title:String, var text:String)

