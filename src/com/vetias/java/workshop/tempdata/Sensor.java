package com.vetias.java.workshop.tempdata;

public class Sensor {
    
        private int sensorNumber;
        private String sensorName;
        private Temperature data;

        public Temperature getData() {
            return data;
        }

        public void setData(Temperature data) {
            this.data = data;
        }

        public int getSensorNumber() {
            return sensorNumber;
        }

        public String getSensorName() {
            return sensorName;
        }
        
    }

class Temperature {
    // Define fields and methods for Temperature as needed
}

