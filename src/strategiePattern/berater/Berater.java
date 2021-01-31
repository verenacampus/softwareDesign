package strategiePattern.berater;

public class Berater {

        private String name;
        private double stundensatz;
        private double tagsatz;

        public Berater(String name, double stundensatz, double tagessatz) {
            this.name = name;
            this.stundensatz = stundensatz;
            this.tagsatz = tagessatz;
        }


        public String getName() {
            return name;
        }

        public double getStundensatz() {
            return stundensatz;
        }

        public double getTagsatz() {
            return tagsatz;
        }




    }
