
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

        // Задача №4

        int powerMachineInTwoMinutes = 16;

        int powerMachineInOneMinutes = powerMachineInTwoMinutes / 2;
        int powerMachineInTwentyMinutes = powerMachineInOneMinutes * 20;
        int powerMachineInDay = powerMachineInOneMinutes * 1440;
        int powerMachineInThreeDays = powerMachineInDay * 3;
        int powerMachineInThirtyDays = (powerMachineInThreeDays * 10);

        System.out.println("За 20 минут работы машины она произвла бутылок " + powerMachineInTwentyMinutes + " штук" );
        System.out.println("За 1 сутки работы машины она произвла бутылок " + powerMachineInDay + " штук" );
        System.out.println("За 3 дня работы машины она произвла бутылок " + powerMachineInThreeDays + " штук" );
        System.out.println("За месяц работы машины она произвла бутылок " + powerMachineInThirtyDays + " штук" );

        //Задача  №5

        int totalPaintOfSchool = 120;
        int whitePaintForOneClass = 2;
        int brownPaintForOneClass = 4;

        int totalPaintOfOneClass = whitePaintForOneClass + brownPaintForOneClass;
        int totalClassesInSchool = totalPaintOfSchool / totalPaintOfOneClass;
        int totalWhitePaint = totalClassesInSchool * whitePaintForOneClass;
        int totalBrownPaint = totalClassesInSchool * brownPaintForOneClass;

        System.out.println("В школе, где " + totalClassesInSchool + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        // Задача №6

        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;

        int weightOneBananaGrams = 80;
        int weightOneMilkGrams = 105;
        int weightOneIceCreamGrams = 100;
        int weightOneEggGrams = 70;

        int totalWeightBananasGrams = bananas * weightOneBananaGrams;
        int totalWeightMilkGrams = milk * weightOneMilkGrams;
        int totalWeightIceCreamGrams = iceCream * weightOneIceCreamGrams;
        int totalWeightEggsGrams = eggs * weightOneEggGrams;

        int totalWeightRecipeGrams = totalWeightBananasGrams +totalWeightMilkGrams + totalWeightIceCreamGrams + totalWeightEggsGrams;

        double totalWeightRecipeKG = (double) totalWeightRecipeGrams / 1000;
        System.out.println("Общий вес рецепта " + totalWeightRecipeKG + " килограмм.");

        // Задача №7

        float overWeightKG = 7.0F;
        float minWeightGramsOfDay = 250F;
        float maxWeightGramsOfDay = 500F;

        float overWeightGrams = overWeightKG * 1000;
        float maxDays = overWeightGrams / minWeightGramsOfDay;
        float minDays = overWeightGrams / maxWeightGramsOfDay;

        float modDays;
        modDays = minDays % maxDays;

        float middleDays = modDays / 2 + minDays;

        System.out.println("Спортсмен на похудение потратит в среднем " + middleDays + " день.");






    }
}