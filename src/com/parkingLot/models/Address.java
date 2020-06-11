package com.parkingLot.models;

//builder pattern
public class Address {
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String streetAddress;

    private Address(Builder builder) {
        country = builder.country;
        state = builder.state;
        city = builder.city;
        zipCode = builder.zipCode;
        streetAddress = builder.streetAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                '}';
    }

    public static final class Builder{

        private String country;
        private String state;
        private String city;
        private String zipCode;
        private String streetAddress;

        public Builder(){

        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

//        public Address createAddress() {
//            return new Address(country, state, city, zipCode, streetAddress);
//        }

        public Address build() {
            if(this.country == null)
                this.country = "India";
            return new Address(this);
        }
    }

}
