package Arrow;

public class Comparing {
    //Обойдёмся без явного конструктора и блока параметров, все параметры передаём из Main напрямую в метод

    public int countArrows(String arrow, String inputString) {
        int inputStringLength = inputString.length();
        int arrowLenght = arrow.length();
        int count = 0;
        int idx = 0;

        //Считаем, что одна стрелка может быть частью другой стрелки
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
