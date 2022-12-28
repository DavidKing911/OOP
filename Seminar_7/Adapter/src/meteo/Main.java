package Seminar_7.Adapter.src.meteo;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        SensorTemperature sensorTemperature = new ST500Info().getData();
        Adapter adapter = new Adapter(sensorTemperature);
        meteoDb.save(ms200_1);
        meteoDb.save(adapter);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
    }
}