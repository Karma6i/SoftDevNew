public enum UnitType {
        Meters(1, "m"),
        Inches(0.0254, "in"),
        Centimeters(0.01, "cm"),
        Yard(0.9144, "yd"),
        Miles(1609.34, "mi"),
        AU(1.69789e-13, "AU"),
        LightYears(2.68478e-18, "ly");
    
        private final double metersToConversionFactor;
        private final String abbreviation;
    
        UnitType(double metersToConversionFactor, String abbreviation){
            this.metersToConversionFactor = metersToConversionFactor;
            this.abbreviation = abbreviation;
        }
    
        public double getConversionFactor(){
            return metersToConversionFactor;
        }
    
        public String getAbbreviation(){
            return abbreviation;
        }
    }