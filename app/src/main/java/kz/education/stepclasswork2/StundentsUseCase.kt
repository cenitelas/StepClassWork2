package kz.education.stepclasswork2

class StundentsUseCase {
    private  var students: ArrayList<String>? = null

    constructor(){
        students = arrayListOf(
            "Alexandr",
            "Pavel",
            "Kostantin",
            "Engeniy",
            "Ivan",
            "Nikolay",
            "Sergey",
            "Petr",
            "Vasiliy",
            "Maxim",
            "Vladimir",
            "Semen",
            "Anatoliy",
            "Uriy",
            "Stepan"
        )
    }

    fun getStudents(): ArrayList<String>? {
        return this.students;
    }

    fun sortSudents(): ArrayList<String>? {
        this.students?.sort();
        return this.students;
    }

    fun randomSudents(): ArrayList<String>? {
        this.students?.shuffle();
        return this.students;
    }
}