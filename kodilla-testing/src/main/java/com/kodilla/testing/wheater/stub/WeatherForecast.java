package com.kodilla.testing.wheater.stub;

import java.util.*;

public class WeatherForecast {
        private Temperatures temperatures;

        public WeatherForecast(Temperatures temperatures) {
            this.temperatures = temperatures;
        }

        public Map<String, Double> calculateForecast() {
            Map<String, Double> resultMap = new HashMap<>();

            for (Map.Entry<String, Double> temperature :
                    temperatures.getTemperatures().entrySet()) {

                // adding 1 celsius degree to current value
                // as a temporary weather forecast
                resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
            }
            return resultMap;
        }
        public double calculateAverageTemperature() {
            Map<String, Double> temperaturesMap = temperatures.getTemperatures();
            double sum = 0;
            int count = 0;

            for (Double Temperature : temperaturesMap.values()) {
                sum += Temperature;
                count++;
            }
            if (count == 0) {
                return 0.0;
            } else {
                return sum / count;
            }
        }
        public double calculateMedianaTemperature() {
            List<Double> temperaturesList = new ArrayList<>(temperatures.getTemperatures().values());

            Collections.sort(temperaturesList);

            int size = temperaturesList.size();

            if (size % 2 == 0) {
                return 0.0;
            }
            if (size % 2 == 1) {
                return temperaturesList.get(size / 2);
            } else {
                int middleIndex = (size / 2) - 1;
                int middleIndex1 = size /2;

                double middle = temperaturesList.get(middleIndex);
                double middle1 = temperaturesList.get(middleIndex1);

                return (middle + middle1) / 2.0;
            }


        }
    }

