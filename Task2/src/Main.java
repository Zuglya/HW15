import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        String fio = new Scanner(System.in).nextLine().trim();

        convertFio(fio);


        }


    private static void convertFio(String fio) {
        final String CORRECT_CHARS = " абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ-";
        boolean isValid = true;
        int spaceCount = 0;

        for(int i = 0; i < fio.length(); i++) {
            if(fio.charAt(i) == ' ') {
                spaceCount++;
            }
            if(!CORRECT_CHARS.contains(String.valueOf(fio.charAt(i)))) {
                isValid = false;
                break;
            }
        }

        if(isValid && spaceCount == 2) {
            System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s", fio.substring(0, fio.indexOf(' ')),
                    fio.substring(fio.indexOf(' '), fio.lastIndexOf(' ')), fio.substring(fio.lastIndexOf(' ')));
        } else {
            System.out.println("Ввод не корректен");
        }

    }
}
