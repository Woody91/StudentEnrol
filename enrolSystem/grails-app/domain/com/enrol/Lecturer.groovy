package com.enrol

class Lecturer {
String fullname
String post
String subject
String lecturerEmail
String office
String bio
    static constraints = {
fullname blank:false, nullable:false
post blank:false, nullable:false
subject blank:false, nulable:false
lecturerEmail blank:false, nullable:false, email:true
office blank:false, nullable:false
bio blank:false, nullable:false, maxsize:5000, widget:'textarea'
    }
}
