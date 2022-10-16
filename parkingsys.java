class ParkingSystem {
    HashMap <Integer, Integer> parkingSize;
    
    public ParkingSystem(int big, int medium, int small) {
        
        parkingSize = new HashMap<>();
        
        parkingSize.put(1, big);
        parkingSize.put(2, medium);
        parkingSize.put(3, small);
        
    }
    
    public boolean addCar(int carType) {
        int temp = parkingSize.get(carType); 
        if( temp != 0){
            parkingSize.put(carType, temp-1);
            return true;
            
        }
        return false;
    }
}
