public class Animal {

        private String color;
        private int numberOfPaws;
        private boolean hasFur;

        public Animal (String color, int numberOfPaws, boolean hasFur) {
            this.color = color;
            this.numberOfPaws = numberOfPaws;
            this.hasFur = hasFur;
        }

        public String getDescription() {
            String furStatus = hasFur ? "a" : "no";
            String pawWord = numberOfPaws == 1 ? "paw" : "paws";
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " and " + furStatus + " fur.";
        }

    public static void main(String[] args) {
        Animal animal = new Animal("red", 1, false);
        System.out.println(animal.getDescription());
    }
}
// Task 1
// Work with class Animal.
// Provide it with 3 private fields - color(String), numberOfPaws(int), hasFur(boolean).
// Add constructor with full parameters. Save the parameter order as it is listed in a second paragraph.
// Add a methods getDescription(), witch would use class fields and return a string with such
// pattern "This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."
// (Optional) In the method getDescription() change the word 'paw' depending on the numberOfPaws: number of paws is 1
// -> 'paw', number of paws is different from 1 -> 'paws'.


