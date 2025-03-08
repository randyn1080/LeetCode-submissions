class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius+273.15;
        double fahrenheit = celsius*1.8+32.00;
        double[] retArr = {kelvin, fahrenheit};
        return retArr;
    }
}