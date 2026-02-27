import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    private static final double BYTES_IN_MB = 1_000_000.0;
    private static final double NANOS_TO_SECONDS = 1_000_000_000.0;

    @SuppressWarnings("checkstyle:Indentation")
    public static void main(String[] args) {
        final LocalTime startTime = LocalTime.now();
        final double startTestTime = System.nanoTime();

        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");

        System.out.println(String.join(" ",
                "                      /\\\n",
                "   J    a  v     v  /  \\\n",
                "   J   a a  v   v  /_( )\\\n",
                "J  J  aaaaa  V V  /      \\\n",
                " JJ  a     a  V  /___/\\___\\\n"));

        System.out.println("""
                          /\\
                    J    /  \\  v     v  a
                    J   /_( )\\  v   v  a a
                 J  J  /      \\  V V  aaaaa
                  JJ  /___/\\___\\  V  a     a""");

        System.out.println();

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");

        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discount = 0.11f;
        float basePrice = penPrice + bookPrice;
        float discountSum = basePrice * discount;
        float discountPrice = (1 - discount) * basePrice;

        System.out.println("Стоимость товаров без скидки = " + basePrice);
        System.out.println("Сумма скидки = " + discountSum);
        System.out.println("Стоимость товаров со скидкой = " + discountPrice + "\n");

        BigDecimal penPriceBd = new BigDecimal("105.5");
        BigDecimal bookPriceBd = new BigDecimal("235.23");
        BigDecimal discountBd = new BigDecimal("0.11");
        BigDecimal basePriceBd = penPriceBd.add(bookPriceBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountSumBd = basePriceBd.multiply(discountBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountPriceBd = basePriceBd.subtract(discountSumBd).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Стоимость товаров без скидки = " + basePriceBd);
        System.out.println("Сумма скидки = " + discountSumBd);
        System.out.println("Стоимость товаров со скидкой = " + discountPriceBd + "\n");

        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");

        int num1 = 5;
        int num2 = 2;
        System.out.println("A1 = " + num1 + ", " + "B1 = " + num2 + "\n");

        int swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("Метод: третья переменная" + "\n" +
                "Результат: A1 = " + num1 + ", B1 = " + num2 + "\n");

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Метод: арифметические операции" + "\n" +
                "Результат: A1 = " + num1 + ", B1 = " + num2 + "\n");

        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Метод: побитовые операции" + "\n" +
                "Результат: A1 = " + num1 + ", B1 = " + num2 + "\n");

        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");

        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;

        System.out.printf("%-4s%2s%7s%n", "Код", "|", "Символ");
        System.out.printf("%-4s%2s%2c%n", code1, "|", code1);
        System.out.printf("%-4s%2s%2c%n", code2, "|", code2);
        System.out.printf("%-4s%2s%2c%n", code3, "|", code3);
        System.out.printf("%-4s%2s%2c%n", code4, "|", code4);
        System.out.printf("%-4s%2s%2c%n", code5, "|", code5);
        System.out.printf("%-4s%2s%2c%n", code6, "|", code6);
        System.out.println();

        System.out.println("5. АНАЛИЗ КОДА ТОВАРА");

        int goodId = 756;
        int categoryId = goodId / 100;
        int subCategoryId = (goodId / 10) % 70;
        int typeId = goodId % 10;
        int checkSum = categoryId + subCategoryId + typeId;
        int verificationCode = categoryId * subCategoryId * typeId;

        System.out.printf("""
                Код товара: %d
                  категория товара - %d
                  подкатегория - %d
                  тип упаковки - %d
                Контрольная сумма = %d
                Проверочный код = %d%n%n""", goodId, categoryId, subCategoryId, typeId,
                checkSum, verificationCode);

        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        
        byte temperatureDeg = Byte.MAX_VALUE;
        System.out.printf("""
                [Температура, °C]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n%n""", temperatureDeg, ++temperatureDeg, --temperatureDeg);

        short pressurePa = Short.MAX_VALUE;
        System.out.printf("""
                [Давление, Па]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n%n""", pressurePa, ++pressurePa, --pressurePa);

        char sysStatusCode = Character.MAX_VALUE;
        System.out.printf("""
                [Код состояния системы]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n%n""", (int) sysStatusCode, (int) ++sysStatusCode, (int) --sysStatusCode);

        int travelDistanceMet = Integer.MAX_VALUE;
        System.out.printf("""
                [Пройденное расстояние, м]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n%n""", travelDistanceMet, ++travelDistanceMet, --travelDistanceMet);

        long launchSinceTimeSec = Long.MAX_VALUE;
        System.out.printf("""
                [Время с момента старта, с]:
                  Исходное: %d
                  +1: %d
                  -1: %d%n%n""", launchSinceTimeSec, ++launchSinceTimeSec, --launchSinceTimeSec);

        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");

        Runtime rt = Runtime.getRuntime();
        
        int availableCores = rt.availableProcessors();
        double totalMemory = rt.totalMemory() / BYTES_IN_MB;
        double freeMemory = rt.freeMemory() / BYTES_IN_MB;
        double usedMemory = totalMemory - freeMemory;
        double maxMemory = rt.maxMemory() / BYTES_IN_MB;

        System.out.printf("""
                                       Характеристики JVM
                ------------------------------------------------------------------
                                 Описание                  | Ед. изм. | Значение
                ------------------------------------------------------------------
                Доступное число ядер                       | МБ       | %d
                Выделенная память                          | МБ       | %.1f
                Свободная память                           | МБ       | %.1f
                Используемая память                        | МБ       | %.1f
                Максимально доступная для выделения память | МБ       | %.1f%n%n""",
                availableCores, totalMemory, freeMemory, usedMemory, maxMemory);

        String systemDisk = System.getProperty("user.home");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String separator = System.getProperty("file.separator");

        System.out.printf("""
                                Параметры ОС
                ----------------------------------------
                Описание                | Значение
                ----------------------------------------
                Системный диск          | %s
                Версия ОС               | %s
                Версия Java             | %s
                Символ разделения пути  | %s%n%n""", systemDisk, osVersion, javaVersion, separator);

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        
        double finishTestTime = System.nanoTime();
        LocalTime endTime = LocalTime.now();

        double endTest = (finishTestTime - startTestTime) / NANOS_TO_SECONDS;

        System.out.printf("""
                | Старт проверки | %s |
                + -------------- + ------------ +
                | Финиш проверки | %s |
                + -------------- + ------------ +
                | Время работы   | %.3f %8s
                %n""", formater.format(startTime), formater.format(endTime), endTest, "|");
    }
}
