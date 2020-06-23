#!/bin/sh
#Hassan Nisar 216392136 

#give the list of course names with the total number of students registered in each course.
creg () {
    for i in ${found_files}
    do
    course_name=`cat ${i} | grep 'course name'`
    num_stu=`cat ${i} | wc -l`
    echo "In "${course_name}", ${num_stu} students register."
    done
}

#gives the name of all course names in which the student with id is registered in.
stc () {
    echo "hello"
}

#gives the GPA of the student defined with id using the formula (course_1*credit_1 + . . . + 
#course_n*credit_n) /(credit_1+ . . . + credit_n).
gpa () {
    echo "hi"
}

#help function that displays the supported commands.
h () {
    echo "Here are the defined commands:"
    echo "creg: give the list of course names with the total number of students"
    echo "registered in each course."
    echo "stc ######: gives the name of all course names in which the student with"
    echo "###### id registered in."
    echo "gpa ######: gives the GPA of the student defined with id ###### using the"
    echo "following formula: (course_1*credit_1 +   . . . + course_n*credit_n) /"
    echo "(credit_1+ . . . + credit_n)"
    echo "h: prints the current message."
	exit 0
}

#displaying the output for no two inputs (direcotry, and command).
if [ $# -eq 0 ]
then 
	echo "You should enter the path name for course files and at least one command."
    echo "Use: lab3.sh path command [arg1 arg2 ...]"
    echo "For the list of all commands use:"
    echo "Example1: lab3.sh . h"
    echo "For the list of number of registered students in each course use:"
    echo "Example2: lab3.sh . cerg"
    exit 1

#displaying the output for no command input.
else [ $# -eq 1 ]
	echo "You should enter the path name for course files and at least one command."
    echo "Use: lab3.sh path command [arg1 arg2 ...]"
    echo "For the list of all commands use:"
    echo "Example1: lab3.sh . h"
    echo "For the list of number of registered students in each course use:"
    echo "Example2: lab3.sh . cerg"
    exit 1
fi

#setting 'DIR' as varibale to be the directory input.
DIR=$1
#setting 'COMMAND' as variable to be the command input.
COMMAND=$2

#check to see if there are any matched files found.
found_files='find ${DIR} -type f -name '*.rec' -readable'

if [ "X${found_files}" = "X" ]
then 
    echo "There is no readible *.rec file in the specified path or its subdirectories."
    exit 1
fi


case ${COMMAND} in 
#calls the help function if COMMAND matches.
    h) h;;
#calls the creg function if COMMAND matches.
    creg) creg;;
#calls the stc function if COMMAND matches. Check if id entered is 6 numbers long.
    stc) 
        stuId=$3
        matchNum=`echo ${stuId} | wc -c`
        if [ ${matchNum} -ne 7 ]
        then
            echo "The student id should be 6 numbers."
            exit 1
        else 
            stc
        fi;;
#outputs 'Unrecognised Command' if anyother input is given.
    *) 
        echo "Unrecognised Command."
        exit 1;;
esac
exit 0



    

        

