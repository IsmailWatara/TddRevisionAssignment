/**
 * League.java
 * WorkerClass
 * @author Ismail Watara(219018790)
 * 05 February 2022
 */




    public class League {
        private String name1;
        private String name2;


        public League(){
        }

        public String getName1(){
            return name1;
        }

        public String getName2(){
            return name2;
        }

        public void setName1(String name1){
            this.name1 = name1;
        }

        public void setName2(String name2){
            this.name2 = name2;
        }

        @Override
        public String toString(){
            return "League("+ "name1=" +name1+",name2="+name2 +')';
        }




    }


