package Arrow;

public class Comparing {
    //Обойдёмся без явного конструктора и блока параметров, все параметры передаём из Main напрямую в метод

    public int countArrows(String arrow, String inputString) {
        int inputStringLength = inputString.length();
        int arrowLenght = arrow.length();
        int count = 0;
        int idx = 0;

        //Считаем, что одна стрелка может быть частью другой стрелки
        while (idx <= inputStringLength - arrowLenght) { //Пока индекс меньше, чем длина строки стрелки
            idx = inputString.indexOf(arrow, idx); //Ищем вхождение
            if (idx == -1) {//Если вхождения нет
                break; //Завершаем цикл
            }
            count++; //Добавляем единицу в счётчик вхождений
            idx++; //Свдигаемся на 1 символ вправо
        }

        return count;
        }
    }
