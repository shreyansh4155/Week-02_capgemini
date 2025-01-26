package RideHailingApplication;

class VehicleGPS implements GPS {
    private String currentLocation;

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
