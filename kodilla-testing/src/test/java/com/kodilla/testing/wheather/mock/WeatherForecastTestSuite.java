package com.kodilla.testing.wheather.mock;

import com.kodilla.testing.wheater.stub.Temperatures;
import com.kodilla.testing.wheater.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class WeatherForecastTestSuite {
    @Test
        // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);               // [10]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }
}
