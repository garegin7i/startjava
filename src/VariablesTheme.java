import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    private static final double BYTES_TO_MB = 1_000_000.0;
    private static final double NANOS_TO_SECONDS = 1_000_000_000.0;

    public static void main(String[] args) {
        final LocalTime startTime = LocalTime.now();
        final double startTestTime = System.nanoTime();

        System.out.println("1. ВЫВОД ASCII-ГРАФИКИ");

        String strJoinJava = String.join(" ", "                      /\\\n",
                "   J    a  v     v  /  \\\n",
                "   J   a a  v   v  /_( )\\\n",
                "J  J  aaaaa  V V  /      \\\n",
                " JJ  a     a  V  /___/\\___\\\n");

        System.out.println(strJoinJava + "\n");

        String textBlock = """
                  /\\
            J    /  \\  v     v  a
            J   /_( )\\  v   v  a a
         J  J  /      \\  V V  aaaaa
          JJ  /___/\\___\\  V  a     a""";

        System.out.println(textBlock + "\n");

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");

        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discount = 0.11f;
        float sumPrice = penPrice + bookPrice;
        float sumDisc = sumPrice * discount;
        float sumDiscPrice = (1 - discount) * sumPrice;

        System.out.println("Стоимость товаров без скидки = " + sumPrice);
        System.out.println("Сумма скидки = " + sumDisc);
        System.out.println("Стоимость товаров со скидкой = " + sumDiscPrice + "\n");

        BigDecimal penPriceBd = new BigDecimal("105.5");
        BigDecimal bookPriceBd = new BigDecimal("235.23");
        BigDecimal discountBd = new BigDecimal("0.11");
        BigDecimal sumPriceBd = penPriceBd.add(bookPriceBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal sumDiscBd = sumPriceBd.multiply(discountBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal sumDiscPriceBd = sumPriceBd.subtract(sumDiscBd).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Стоимость товаров без скидки = " + sumPriceBd);
        System.out.println("Сумма скидки = " + sumDiscBd);
        System.out.println("Стоимость товаров со скидкой = " + sumDiscPriceBd + "\n");

        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");

        int num1 = 5;
        int num2 = 2;
        System.out.println("A1 = " + num1 + ", " + "B1 = " + num2 + "\n");

        int num3 = num1;
        num1 = num2;
        num2 = num3;
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

        char charCode1 = 1055;
        char charCode2 = 1088;
        char charCode3 = 1080;
        char charCode4 = 1074;
        char charCode5 = 1077;
        char charCode6 = 1090;

        System.out.printf("%-4s%2s%7s%n", "Код", "|", "Символ");
        System.out.printf("%-4s%2s%2s%n", code1, "|", charCode1);
        System.out.printf("%-4s%2s%2s%n", code2, "|", charCode2);
        System.out.printf("%-4s%2s%2s%n", code3, "|", charCode3);
        System.out.printf("%-4s%2s%2s%n", code4, "|", charCode4);
        System.out.printf("%-4s%2s%2s%n", code5, "|", charCode5);
        System.out.printf("%-4s%2s%2s%n\n", code6, "|", charCode6);

        System.out.println("5. АНАЛИЗ КОДА ТОВАРА");

        int goodId = 756;
        int categoryId = goodId / 100;
        int subCategoryId = (goodId / 10) % 70;
        int typeId = goodId % 10;
        int digitsSum = categoryId + subCategoryId + typeId;
        int digitsMulti = categoryId * subCategoryId * typeId;

        System.out.printf("%1s%1d%n", "Код товара: ", goodId);
        System.out.printf("%25s%1d%n", "категория товара - ", categoryId);
        System.out.printf("%21s%1d%n", "подкатегория - ", subCategoryId);
        System.out.printf("%21s%1d%n", "тип упаковки - ", typeId);
        System.out.printf("%1s%1d%n", "Контрольная сумма = ", digitsSum);
        System.out.printf("%1s%1d%n\n", "Проверочный код = ", digitsMulti);

        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        char maxChar = Character.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.printf("%1s%n", "[Температура, °C]:");
        System.out.printf("%11s%4d%n", "Исходное:", maxByte);
        System.out.printf("%5s%5d%n", "+1:", ++maxByte);
        System.out.printf("%5s%4d%n\n", "-1:", --maxByte);

        System.out.printf("%1s%n", "[Давление, Па]:");
        System.out.printf("%11s%4d%n", "Исходное:", maxShort);
        System.out.printf("%5s%7d%n", "+1:", ++maxShort);
        System.out.printf("%5s%6d%n\n", "-1:", --maxShort);

        System.out.printf("%1s%n", "[Код состояния системы]:");
        System.out.printf("%11s%6d%n", "Исходное:", (int) maxChar);
        System.out.printf("%5s%2d%n", "+1:", (int) ++maxChar);
        System.out.printf("%5s%6d%n\n", "-1:", (int) --maxChar);

        System.out.printf("%1s%n", "[Пройденное расстояние, м]:");
        System.out.printf("%11s%11d%n", "Исходное:", maxInt);
        System.out.printf("%5s%12d%n", "+1:", ++maxInt);
        System.out.printf("%5s%11d%n\n", "-1:", --maxInt);

        System.out.printf("%1s%n", "[Время с момента старта, с]:");
        System.out.printf("%11s%20d%n", "Исходное:", maxLong);
        System.out.printf("%5s%21d%n", "+1:", ++maxLong);
        System.out.printf("%5s%20d%n\n", "-1:", --maxLong);

        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");

        Runtime rt = Runtime.getRuntime();
        
        int availableCores = rt.availableProcessors();
        double totalMemory = rt.totalMemory() / BYTES_TO_MB;
        double freeMemory = rt.freeMemory() / BYTES_TO_MB;
        double usedMemory = (rt.totalMemory() - rt.freeMemory()) / BYTES_TO_MB;
        double maxMemory = rt.maxMemory() / BYTES_TO_MB;

        String systemDisk = System.getProperty("user.home");
        String osVersion = System.getProperty("os.version");
        String javaVersion = System.getProperty("java.version");
        String separator = System.getProperty("file.separator");

        System.out.printf("%40s%n", "Характеристики JVM");
        System.out.printf("%1s%n", "-----------------------------------------------------------------");
        System.out.printf("%1s%37s%9s%2s%9s%n", "Описание", "|", "Значение", "|", "Ед. изм.");
        System.out.printf("%1s%n", "-----------------------------------------------------------------");
        System.out.printf("%1s%25s%3d%8s%3s%n", "Доступное число ядер", "|", availableCores, "|", "шт");
        System.out.printf("%1s%28s%6.1f%5s%3s%n", "Выделенная память", "|", totalMemory, "|", "МБ");
        System.out.printf("%1s%29s%6.1f%5s%3s%n", "Свободная память", "|", freeMemory, "|", "МБ");
        System.out.printf("%1s%26s%4.1f%7s%3s%n", "Используемая память", "|", usedMemory, "|", "МБ");
        System.out.printf("%1s%3s%7.1f%4s%3s%n\n",
                "Максимально доступная для выделения память", "|", maxMemory, "|", "МБ");

        System.out.printf("%28s%n", "Параметры ОС");
        System.out.printf("%1s%n", "----------------------------------------");
        System.out.printf("%1s%17s%9s%n", "Описание", "|", "Значение");
        System.out.printf("%1s%n", "----------------------------------------");
        System.out.printf("%1s%11s%15s%n", "Системный диск", "|", systemDisk);
        System.out.printf("%1s%16s%5s%n", "Версия ОС", "|", osVersion);
        System.out.printf("%1s%14s%7s%n", "Версия Java", "|", javaVersion);
        System.out.printf("%1s%3s%2s%n\n", "Символ разделения пути", "|", separator);

        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        
        double finishTestTime = System.nanoTime();
        LocalTime endTime = LocalTime.now();

        double endTest = (finishTestTime - startTestTime) / NANOS_TO_SECONDS;

        System.out.println("""
                | Cтарт проверки | %s |
                + -------------- + ------------ +
                | Финиш проверки | %s |
                + -------------- + ------------ +
                | Время работы   | %.3f %8s
                """.formatted(formater.format(startTime), formater.format(endTime), endTest, "|"));
    }
}
