public class Headphones {

        public String name;
        public int cost;
        public String color;
        public String specification;
  
          public Headphones (String name, int cost, String color, String specification) {
          this.name = name;
          this.cost = cost;
          this.color = color;
          this.specification = specification;
        }
  
        public String getName(){
          return name; 
        }
        public int getPrice(){
          return cost;
        }
        public String getColor(){
          return color;
        }
        public String getSpecification(){
          return specification;
        }
  
        public String message () {
            return ("\n\nYou have " + this.getName() + " and their cost is " + this.getPrice() + "." + " The color is " + this.getColor() + " " + "and something specific about these headphones is that they are " + this.getSpecification());
        }
  
    public static void main (String[] args) {
            Headphones Bose = new Headphones ("Bose QuietComfort 35 headphones", 299, "black", "wireless");
            System.out.println(Bose.message());
          }
  }