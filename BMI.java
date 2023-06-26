class BMI {
    public static void main(String args[]) {
        //height = meters, weight = Kg
        double height = 1.64;
        double weight = 66;
        //Formula
        double bmi = weight / Math.pow(height, 2);

        if(bmi < 18.5){
            System.out.printf("BMI = %,.1f - Underweight", bmi);
        } else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.printf("BMI = %,.1f - Normal weight", bmi);
        } else if(bmi >= 25 && bmi <= 29.9){
            System.out.printf("BMI = %,.1f - Overweight", bmi);
        } else {
            System.out.printf("BMI = %,.1f - Obesity", bmi);
        }
    }
}