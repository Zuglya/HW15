public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static final String RUSSIAN_CHARS= "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static void main(String[] args) {
        //todo код писать тут
        for(int i = 0; i < RUSSIAN_CHARS.length(); i++) {
            System.out.printf("%s-%d\n", RUSSIAN_CHARS.charAt(i), (int)RUSSIAN_CHARS.charAt(i));
        }
    }
}