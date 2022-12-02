
public class Main {
    public static void main(String[] args) {

        // Задача №1

        byte variableByte = 7;
        short variableShort = 5;
        int variableInteger = 11;
        long variableLong = 592527;
        float variableFloat = 4.6f;
        double variableDouble = 12.806;
        System.out.println("Значение переменной variableByte типом byte равно " + variableByte);
        System.out.println("Значение переменной variableShort типом short равно " + variableShort);
        System.out.println("Значение переменной variableInteger типом int равно " + variableInteger);
        System.out.println("Значение переменной variableLong типом long равно " + variableLong);
        System.out.println("Значение переменной variableFloat типом float равно " + variableFloat);
        System.out.println("Значение переменной variableDouble типом double равно " + variableDouble);

        // Задача №2

        float firstValue = 27.12F;
        long secondValue = 987678965549L;
        double thirdValue = 2.786;
        boolean fourthValue = false;
        short fifthValue = 569;
        short sixthValue = -159;
        int seventhValue = 27879;
        byte eighthValue = 67;

        System.out.println("Первая переменная float " + firstValue);
        System.out.println("Вторая переменная long " + secondValue);
        System.out.println("Третья переменная double " + thirdValue);
        System.out.println("Четвертая переменная boolean " + fourthValue);
        System.out.println("Пятая переменная short " + fifthValue);
        System.out.println("Шестая переменная short " + sixthValue);
        System.out.println("Седьмая переменная int " + seventhValue);
        System.out.println("Восьмая переменная byte " + eighthValue);

        // Задача №3

        int studentsOfTheFirstTeacher = 23;
        int studentsOfTheSecondTeacher = 27;
        int studentsOfTheThirdTeacher = 30;
        int totalPaperLists = 480;

        int totalStudents = studentsOfTheFirstTeacher + studentsOfTheSecondTeacher + studentsOfTheThirdTeacher;

        int paperLists = totalPaperLists / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperLists + " листов бумаги.");


    }

}