package Arrow;

public class Comparing {
    //Обойдёмся без явного конструктора и блока параметров, все параметры передаём из Main напрямую в метод

    public int countArrows(String arrow, String inputString) {
        //Проверяем, что длина переданной строки больше, чем длина стрелки
        int inputStringLength = inputString.length();
        int arrowLenght = arrow.length();
        int count = 0;
        int idx = 0;

        while (idx <= inputStringLength - arrowLenght) {
            idx = inputString.indexOf(arrow, idx);
            if (idx == -1) {
                break;
            }
            count++;
            idx += 1;
        }

        return count;
        }
    }
