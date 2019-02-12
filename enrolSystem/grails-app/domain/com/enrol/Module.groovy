package com.enrol

class Module {
String module_title
String module_code
int credits
String lecturer
String course
String description
    static constraints = {
module_title blank:false, nullable:false
module_code blank:false, nullable:false
credits blank:false, nullable:false, min:20, max:120
lecturer blank:false, nullable:false
course blank:false, nullable:false
description blank:false, nullable:false, maxsize:5000,
widget:'textarea'
    }
}
