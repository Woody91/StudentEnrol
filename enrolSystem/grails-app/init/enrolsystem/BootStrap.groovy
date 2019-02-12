package com.enrol

class BootStrap {

    def init = { servletContext ->

def computing=new
Course(
department:'computing',
courseCode:'CS123',
courseTitle:'BSc Hon Computing',
courseLeader:'Dr Michelle Murphy',
startDate:new Date('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents:55,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:"'This course will teach you the basics of most computing discplines.'").save()

def aerospace=new
Course(
department:'engineering',
courseCode:'AE123',
courseTitle:'BSc Hon Aerospace Engineering',
courseLeader:'Dr Xinjun Qui',
startDate:new Date('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents:50,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:"'Rocket Science. Most of you will drop out.'").save()

def education=new
Course(
department:'education',
courseCode:'ED123',
courseTitle:'BA Hon Education',
courseLeader:'Dr Mooner Looner',
startDate:new Date('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents:60,
studyMode:'Fulltime',
tuitionFees:9000.60,
description:"'This course will teach you that you are being taught wrong... great.'").save()

def adam=new
Student(
studentName: 'Adam Woodliffe',
studentID: '123456',
dob: new Date('02/02/2019'),
studentEmail:'adamwoodliffe@gmail.com',
studentUsername:'Woody',
studentPassword:'password',
isFundingAvailable:'true',
course:'computing'
).save()

def john=new
Student(
studentName: 'Spartan John',
studentID: '000117',
dob: new Date('10/010/2500'),
studentEmail:'eliterkiller69@gmail.com',
studentUsername:'Spartan',
studentPassword:'password',
isFundingAvailable:'true',
course:'computing'
).save()

def fenix=new
Student(
studentName: 'Marcus Fenix',
studentID: '1010101',
dob: new Date('08/011/2250'),
studentEmail:'gearschampion@gmail.com',
studentUsername:'CogBoss',
studentPassword:'password',
isFundingAvailable:'true',
course:'aerospace'
).save()


def ezio=new
Lecturer(
fullname:'Ezio Auditore Di Ferenze',
post:'Lecturer',
subject:'Computing',
lecturerEmail:'italianstallion@gmail.com',
office: 'C555',
bio:"' He'll stab you up with a hidden blade if he doesn't like you.'"
).save()

def shepard=new
Lecturer(
fullname:'Commander Shepard',
post:'Lecturer',
subject:'Aerospace Engineering',
lecturerEmail:'thetruereaper@gmail.com',
office: 'C554',
bio:"' I'm Commander Shepard and this is my favourite store on the Citadel'"
).save()

def geralt=new
Lecturer(
fullname:'Geralt of Rivia',
post:'Lecturer',
subject:'Education',
lecturerEmail:'magicman@gmail.com',
office: 'C556',
bio:"' Two swords, steel for humans, silver for monsters.'"
).save()


def computerbasics=new
Module(
module_title:'Computer Basics',
module_code:'CB12',
credits:20,
lecturer:'Commander Shepard',
course:'computing',
description:"'n/a'"
).save()

def computeradvanced=new
Module(
module_title:'Computer Advanced',
module_code:'CA12',
credits:20,
lecturer:'Ezio Auditore Di Firenze',
course:'computing',
description:"'n/a'"
).save()

def raisingaspirations=new
Module(
module_title:'Raising Aspirations',
module_code:'RA12',
credits:20,
lecturer:'Geralt',
course:'education',
description:"'n/a'"
).save()


}
    def destroy = {
    }
}
