package za.co.benita.communityhelpfinder;

public class Service {
        private String name;
        private String category;
        private String location;
        private String phoneNumber;
        private String email;


        public Service(String name, String category, String location, String phoneNumber, String email) {
            this.name = name;
            this.category = category;
            this.location = location;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getName(){
            return name;
        }

        public String getCategory(){
            return category;
        }

        public String getLocation(){
            return location;
        }
        public String getPhoneNumber(){
            return phoneNumber;
        }

        public String getEmail(){
            return email;
        }


        @Override

        public String toString(){
            return "Name: " + name +
                    ", Category: " + category +
                    ", Location: " + location +
                    ", Cellphone Number: " + phoneNumber +
                    ", Email: " + email;
        }
}
