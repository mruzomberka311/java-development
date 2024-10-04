package com.pluralsight;

public class CellPhone {

        private int serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;

        public CellPhone() {
            serialNumber = 0;
            model = "";
            carrier = "";
            phoneNumber = "";
            owner = "";
        }

    public CellPhone(String model, int serialNumber, String carrier, String phoneNumber, String owner) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getCarrier() {
            return carrier;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public int getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
        }

        public void dial(String phoneNumber) {
            System.out.println(owner + "'s phone is calling" + phoneNumber);
        }
       public void dial(CellPhone phone){
           System.out.println(owner + "'s phone is calling " + .getphoneNumber);
       }

    }



