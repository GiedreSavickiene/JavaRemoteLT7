package Advanced.classes.nested_classes;

public class Bicycle {

        private int maxSpeed;
        public Bicycle(int maxSpeed){
            this.maxSpeed = maxSpeed;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        //Nested class
    public static class Mechanic {
            private Bicycle bicycle;

            public void upgrade(Bicycle bicycle) {
                this.bicycle = bicycle;
                bicycle.maxSpeed *= 2;

            }
        }
}
